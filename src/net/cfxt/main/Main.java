package net.cfxt.main;

import java.awt.geom.Arc2D.Double;
import java.util.Vector;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
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

import net.Indyuce.mmocore.api.player.PlayerData;
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
	    		  
	    		  if (player.getLocation().getX() != 0)
	    		  {
	    			  v.setX(6);
	    		  }
	    		  
	    		  if (player.getLocation().getY() != 0)
	    		  {
	    			    v.setY(6);
	    		  
	    		  }
	    		  
	    		  if (player.getLocation().getY() != -0)
	    		  {
	    			    v.setY(-6);
	    		  
	    		  }
	    		  
	    		  if (player.getLocation().getX() != -0)
	    		  {
	    			  v.setX(-6);
	    		  }
	    		  
	    		  if (PlayerData.get(player.getUniqueId()).getStamina() > 10.0)
	    		  {
	    			  
	    			  double setvalue = PlayerData.get(player.getUniqueId()).getStamina() - 10.0;
		    		  
		    		  PlayerData.get(player.getUniqueId()).setStamina(setvalue);
		    		 // player.sendMessage("DEV:" + setvalue);
		    		  //player.sendMessage("DEV:" +  PlayerData.get(player.getUniqueId()).getStamina());
		    		  
		    		  player.setVelocity(v);
		    		  
		    		  player.playSound(player.getLocation(), Sound.ENTITY_ENDER_DRAGON_FLAP, 1f, 1f);
	    			  
	    			 return;		 
	    			  
	    		  }
	    		  
	    		  
	    		  player.sendMessage(ChatColor.RED + "You Dont have enough Stamina to buy this!");
	    		  
	    		
	    		  
	    	  }
	    	  
	    	  
	    	  }
	      
	      }
	 
}















