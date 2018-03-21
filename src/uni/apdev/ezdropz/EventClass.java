package uni.apdev.ezdropz;



import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;



public class EventClass implements Listener {
Main plugin;
	
public EventClass(Main instance){
	plugin = instance;
}
	
	
	
	
	@EventHandler
	public void EntityDeathEvent(EntityDeathEvent event) {

		Boolean xpConfig = plugin.getConfig().getBoolean("ezXP");
		Boolean dropzConfig = plugin.getConfig().getBoolean("ezDropz");
		LivingEntity mob = event.getEntity();
		Player player = mob.getKiller();
		
		if(player instanceof Player) {
		
		 
		if(xpConfig = true) {
			int xp = event.getDroppedExp();
			player.giveExp(xp);
			event.setDroppedExp(0);
		}
		
		
		if(dropzConfig = true) {
		    for(ItemStack stack : event.getDrops()){
		        player.getInventory().addItem(stack);
		    }
		    event.getDrops().clear();
		}

		}
		
	}
	
  }