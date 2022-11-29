package ubiniti.betterbanv2.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import ubiniti.betterbanv2.guis.betterBanGui;

public class betterBanGUIListener implements Listener {

    @EventHandler
    public void onBetterBanGuiClick(InventoryClickEvent e) {

        Player p = null;
        if (e.getWhoClicked() instanceof Player) {
            p = (Player) e.getWhoClicked();
        }

        if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName()) {

            if (e.getView().getTitle().equals(ChatColor.LIGHT_PURPLE + "Ban Manager Plugin")) {

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Manage Bans")) {
                    betterBanGui.openBansList(p);
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "View Template")) {
                    betterBanGui.openTemplate(p);
                }

                e.setCancelled(true);

            }

            if (e.getView().getTitle().equals(ChatColor.RED + "List of bans")) {

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Go Back")) {
                    betterBanGui.openStartMenu(p);
                }
                e.setCancelled(true);

            }

        }

    }

}
