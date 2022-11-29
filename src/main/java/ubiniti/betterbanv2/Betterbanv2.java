package ubiniti.betterbanv2;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import ubiniti.betterbanv2.commands.betterBanCommand;
import ubiniti.betterbanv2.commands.punishCommand;
import ubiniti.betterbanv2.listeners.betterBanGUIListener;
import ubiniti.betterbanv2.listeners.onPlayerJoin;

public final class Betterbanv2 extends JavaPlugin {

    public static final String ChatPrefix = ChatColor.DARK_AQUA + "[" + ChatColor.GREEN + "Better Ban" + ChatColor.DARK_AQUA + "] " + ChatColor.RESET;

    @Override
    public void onEnable() {
        // Plugin startup logic

        loadConfig();

        getCommand("betterban").setExecutor(new betterBanCommand());
        getCommand("punish").setExecutor(new punishCommand());

        getServer().getPluginManager().registerEvents(new betterBanGUIListener(), this);
        getServer().getPluginManager().registerEvents(new onPlayerJoin(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

}
