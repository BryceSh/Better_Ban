package ubiniti.betterbanv2.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ubiniti.betterbanv2.Betterbanv2;

public class punishCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.isOp()) {

                if (args.length == 1) {
                    player.sendMessage(Betterbanv2.ChatPrefix + ChatColor.GREEN + "Success!");
                } else {
                    player.sendMessage(Betterbanv2.ChatPrefix + ChatColor.RED + "Invalid Command Arguments.");
                }

            } else {
                player.sendMessage(Betterbanv2.ChatPrefix + ChatColor.RED + "Invalid Permissions");
            }
        }

        return true;
    }
}
