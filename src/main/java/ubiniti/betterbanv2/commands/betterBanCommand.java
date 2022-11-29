package ubiniti.betterbanv2.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ubiniti.betterbanv2.Betterbanv2;
import ubiniti.betterbanv2.guis.betterBanGui;

public class betterBanCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.isOp()) {
                if (args.length == 0) {
                    betterBanGui.openStartMenu(player);
                }  else player.sendMessage(Betterbanv2.ChatPrefix + ChatColor.RED + "Invalid Command. Please use "+ChatColor.GREEN+"/punish {user}"+ChatColor.RED+" to manage players");

            } else {
                player.sendMessage(Betterbanv2.ChatPrefix + ChatColor.RED + "Invalid permissions");
            }
        }
        return true;
    }
}
