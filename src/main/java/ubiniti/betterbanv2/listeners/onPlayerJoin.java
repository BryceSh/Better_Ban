package ubiniti.betterbanv2.listeners;

import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.plugin.Plugin;
import ubiniti.betterbanv2.Betterbanv2;

import java.util.Date;
import java.util.Objects;

public class onPlayerJoin implements Listener {

    Plugin plugin = Betterbanv2.getPlugin(Betterbanv2.class);

    @EventHandler
    public void onPrePlayer(AsyncPlayerPreLoginEvent e) {

        if (Bukkit.getBanList(BanList.Type.NAME).isBanned(String.valueOf(e.getUniqueId()))) {

            String reason = Objects.requireNonNull(Bukkit.getBanList(BanList.Type.NAME).getBanEntry(String.valueOf(e.getUniqueId()))).getReason();
            Date raw_length = Objects.requireNonNull(Bukkit.getBanList(BanList.Type.NAME).getBanEntry(String.valueOf(e.getUniqueId()))).getExpiration();
            String length = "";
            if (raw_length == null) {
                length = "Forever";
            } else {
                length = String.valueOf(raw_length);
            }
            if (plugin.getConfig().getBoolean("useCustomForeverColor")) {
                length = "" + plugin.getConfig().getString("customForeverColor") + length + ChatColor.RESET;
            }
            String source = Objects.requireNonNull(Bukkit.getBanList(BanList.Type.NAME).getBanEntry(String.valueOf(e.getUniqueId()))).getSource();
            Date created = Objects.requireNonNull(Bukkit.getBanList(BanList.Type.NAME).getBanEntry(String.valueOf(e.getUniqueId()))).getCreated();
            String banMessage = "" + plugin.getConfig().getString("banMessage");
            banMessage = banMessage.replaceAll("%uuid%", String.valueOf(e.getUniqueId()));
            banMessage = banMessage.replaceAll("%username%", e.getName());
            banMessage = banMessage.replaceAll("%created%", String.valueOf(created));
            banMessage = banMessage.replaceAll("%source%", source);
            banMessage = banMessage.replaceAll("%expires%", length);
            banMessage = banMessage.replaceAll("%reason%", reason);

            e.disallow(AsyncPlayerPreLoginEvent.Result.KICK_BANNED, banMessage);
        }

    }
}
