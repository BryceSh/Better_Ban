package ubiniti.betterbanv2.guis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class betterBanGui {

    public static void openStartMenu(Player p) {

        Inventory menu = Bukkit.createInventory(p, 45, ChatColor.LIGHT_PURPLE + "Ban Manager Plugin");

        ItemStack manageBans = new ItemStack(Material.BARRIER);
        ItemMeta managerBansM = manageBans.getItemMeta();
        assert managerBansM != null;
        managerBansM.setDisplayName(ChatColor.RED + "Manage Bans");
        managerBansM.setLore(Arrays.asList("", ChatColor.GREEN + "Click to view a list of", ChatColor.GREEN + "banned players."));
        manageBans.setItemMeta(managerBansM);

        ItemStack template = new ItemStack(Material.CRAFTING_TABLE);
        ItemMeta templateM = template.getItemMeta();
        assert templateM != null;
        templateM.setDisplayName(ChatColor.GOLD + "View Template");
        template.setItemMeta(templateM);

        menu.setItem(20, manageBans);
        menu.setItem(44, template);

        p.openInventory(menu);

    }

    public static void openBansList(Player p) {

        Inventory menu = Bukkit.createInventory(p, 45, ChatColor.RED + "List of bans");

        ItemStack back = new ItemStack(Material.ARROW);
        ItemMeta backM = back.getItemMeta();
        assert backM != null;
        backM.setDisplayName(ChatColor.GREEN + "Go Back");
        back.setItemMeta(backM);

        ItemStack previousPage = new ItemStack(Material.RED_WOOL);
        ItemMeta previousPageM = previousPage.getItemMeta();
        assert previousPageM != null;
        previousPageM.setDisplayName(ChatColor.YELLOW + "Previous Page");
        previousPageM.setLore(Arrays.asList("", ChatColor.GRAY + "Back page: #"));
        previousPage.setItemMeta(previousPageM);

        ItemStack nextPage = new ItemStack(Material.GREEN_WOOL);
        ItemMeta nextPageM = nextPage.getItemMeta();
        assert nextPageM != null;
        nextPageM.setDisplayName(ChatColor.YELLOW + "Next Page");
        nextPageM.setLore(Arrays.asList("", ChatColor.GRAY + "Next Page: #"));
        nextPage.setItemMeta(nextPageM);

        for (int i = 10; i<17; i++) {
            ItemStack head = new ItemStack(Material.PLAYER_HEAD);
            menu.setItem(i, head);
        }
        for (int i = 19; i<27; i++) {
            ItemStack head = new ItemStack(Material.PLAYER_HEAD);
            menu.setItem(i, head);
        }
        for (int i = 28; i<35; i++) {
            ItemStack head = new ItemStack(Material.PLAYER_HEAD);
            menu.setItem(i, head);
        }


        menu.setItem(18, previousPage);
        menu.setItem(26, nextPage);
        menu.setItem(36, back);

        p.openInventory(menu);

    }

    public static void openTemplate(Player p) {

        Inventory menu = Bukkit.createInventory(p, 45, "Template");

        for (int i = 0; i<45; i++) {
            ItemStack item = new ItemStack(Material.SNOWBALL);
            ItemMeta itemM = item.getItemMeta();
            itemM.setDisplayName("" + ChatColor.RED + i);
            item.setItemMeta(itemM);
            menu.setItem(i, item);
        }

        p.openInventory(menu);

    }

}
