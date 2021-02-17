package net.cfxt.main;

import java.awt.geom.Arc2D.Double;
import java.util.Properties;
import java.util.UUID;
import java.util.Vector;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.ProtocolLibrary;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityToggleGlideEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.plugin.java.JavaPlugin;
import com.comphenix.*;
import com.comphenix.net.bytebuddy.build.Plugin;
import com.comphenix.protocol.*;
import net.Indyuce.mmocore.api.player.PlayerData;
import net.md_5.bungee.api.ChatColor;




public class Main extends JavaPlugin implements Listener {
	UUID uuid;
	
	
	 @Override
	    public void onEnable() {
		 		 
		 getServer().getPluginManager().registerEvents(this, this);
		
	 }
	   
	 
	 
	 @Override
	   public void onDisable() {
	    
	    
	 }
	 
	 @EventHandler
	 public void PlayerJoinEvent​(Player playerJoined, String joinMessage)
	 {
		 try (InputStream input = new FileInputStream("properties")) {

	            Properties prop = new Properties();

	            // load a properties file
	            prop.load(input);

	            // get the property value and print it out
	            System.out.println(prop.getProperty("whois"));
	            System.out.println(prop.getProperty("re"));
	            System.out.println(prop.getProperty("startmessage"));

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }

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
	    		  
	    		  v = player.getLocation().getDirection();
	    		  
	    		  v = v.multiply(3.0);

	    		  
	    		  
	    		  
	    		 /* 
	    		  
	    		  if (player.getLocat	ion().getX() != 0)
	    		  {
	    			  v.setX(-5);
	    		  }
	    		  
	    		  if (player.getLocation().getY() != 0)
	    		  {
	    			    v.setY(-5);
	    		  
	    		  }
	    		  
	    		  if (player.getLocation().getY() != -0)
	    		  {
	    			    v.setY(5);
	    		  
	    		  }
	    		  
	    		  if (player.getLocation().getX() != -0)
	    		  {
	    			  v.setX(5);
	    		  }
	    		  */
	    		  
	    		

	    		  
	    		 
	    		  
	    		  if (PlayerData.get(player.getUniqueId()).getStamina() > 10.0)
	    		  {
	    			  
	    			  UUID uuid = player.getUniqueId();
	    			  double setvalue = PlayerData.get(player.getUniqueId()).getStamina() - 25.0;
		    		  
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















