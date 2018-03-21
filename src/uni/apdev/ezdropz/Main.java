package uni.apdev.ezdropz;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new EventClass(this), this);

		
		
		FileConfiguration config = this.getConfig();
		
		
		config.addDefault("ezXP", true);
		config.addDefault("ezDropz", true);
	    config.options().copyDefaults(true);
	    saveConfig();

	}

}
