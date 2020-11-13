package io.github.awesomestcode.adventplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class CommandClaim implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
          sender.sendMessage(ChatColor.RED + "Error: You must be a player to execute this command.");
          return true;
        }
        sender.sendMessage(ChatColor.AQUA + "This functionality has not yet been implemented.");
        return true;
    }
}
