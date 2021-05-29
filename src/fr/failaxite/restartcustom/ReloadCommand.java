package fr.failaxite.restartcustom;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReloadCommand implements CommandExecutor {
  private Main main;
  
  public ReloadCommand(Main main) {
    this.main = main;
  }
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    CommandSender s = sender;
    if (args.length == 0)
      if (s.hasPermission("redem.reload")) {
        this.main.reloadConfig();
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', String.valueOf(this.main.getConfig().getString("messages.reload"))));
      } else {
    	  sender.sendMessage(ChatColor.translateAlternateColorCodes('&', String.valueOf(this.main.getConfig().getString("messages.no-permission"))));
      }  
    return true;
  }
}
