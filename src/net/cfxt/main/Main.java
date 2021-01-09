package net.cfxt.main;

import java.util.Vector;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;



public class Main extends JavaPlugin implements Listener {
	
	 @Override
	    public void onEnable() {
	 
		 getServer().getPluginManager().registerEvents(this, this);
		 
	 }
	    
	 
	 @Override
	    public void onDisable() {
	    
	    
	 }
	 
	 public Boolean glideing;
	 public String sneakin;
	 
	 @EventHandler
	 public EntityToggleGlideEvent glide(
			 LivingEntity who,
			 boolean isGliding)
	 {
		 
		 
			
		
		 
		 
		return null; 
	 }
	 
	 @EventHandler
	 public void onPlayerToggleSneakEvent(PlayerToggleSneakEvent event) {
	      Player player = event.getPlayer();
	      if(player.isSneaking()) {
	    	  
	    	 
	    	  
	    	  if(player.isGliding()) {
	    		  
	    		  org.bukkit.util.Vector v = player.getVelocity();
	    		  
	    		  v.setX(10);
	    		  v.setY(10);
	    		  v.setZ(10);
	    		  
	    		  player.setVelocity(v);
	    		  
	    		  player.getWorld().createExplosion(player.getLocation(), 0);
	    		  
	    		  Firework fw = player.getWorld().spawn(player.getLocation(), Firework.class);
	    		  
	    		  event.getPlayer().sendTitle(ChatColor.GREEN + "Boost" , ChatColor.RED + "-10 Stamina", 13, 0, 13);
	    		  
	    		
	    		  
	    	  }
	    	  
	    	  
	    	  }
	      
	      }
	 
}
