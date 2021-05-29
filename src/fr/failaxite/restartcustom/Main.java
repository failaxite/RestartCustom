 package fr.failaxite.restartcustom;
import org.bukkit.command.CommandExecutor;
 
 import org.bukkit.plugin.java.JavaPlugin;
 
 public class Main
   extends JavaPlugin
 {
   public void onEnable() {
	        saveDefaultConfig();
	        this.getConfig();
	        getCommand("redemreload").setExecutor((CommandExecutor)new ReloadCommand(this));
            getCommand("redem").setExecutor(new Restartcmd(this));
   }
   
   public void onDisable() {}
 }