package net.cfxt.main;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;

public class TestingCommands implements CommandExecutor {

	   @Override
	   public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
	        
	        if (sender instanceof Player) {
	            Player player = (Player) sender;
	            player.sendMessage(ChatColor.RED + "Who Actually Types this in!");
	            player.sendMessage(ChatColor.BLUE  + "Here is somme diamond armor");
	            
	            ItemStack reward = new ItemStack(Material.DIAMOND_CHESTPLATE);
	            
	            player.getInventory().addItem(reward);
	            
	        }
	        
	        return false;
	 }
	
}
