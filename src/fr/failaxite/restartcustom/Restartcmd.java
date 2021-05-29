 package fr.failaxite.restartcustom;
 
 import java.util.concurrent.TimeUnit;

 import org.bukkit.Bukkit;
 import org.bukkit.command.Command;
 import org.bukkit.command.CommandExecutor;
 import org.bukkit.command.CommandSender;
 import org.bukkit.entity.Player;
 
 public class Restartcmd
   implements CommandExecutor
 {
   private Main main;
            public Restartcmd(Main restartcmd) {
            	this.main = restartcmd;
            	
            }
 
   
   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
     if (!(sender instanceof Player)) {
       return false;
     }
     Player p = (Player)sender;
     if (label.equalsIgnoreCase("redem")) {
       if (p.hasPermission("redem.use"));
        Bukkit.broadcastMessage(main.getConfig().getString("messages.1").replace("&", "§"));
       try {
         TimeUnit.SECONDS.sleep(1L);
       } catch (InterruptedException e) {
         e.printStackTrace();
       } 
        Bukkit.broadcastMessage(main.getConfig().getString("messages.2").replace("&", "§"));
       try {
         TimeUnit.SECONDS.sleep(1L);
       } catch (InterruptedException e) {
         e.printStackTrace();
       } 
        Bukkit.broadcastMessage(main.getConfig().getString("messages.3").replace("&", "§"));
       try {
         TimeUnit.SECONDS.sleep(1L);
       } catch (InterruptedException e) {
        e.printStackTrace();
       } 
        Bukkit.broadcastMessage(main.getConfig().getString("messages.4").replace("&", "§"));
       try {
         TimeUnit.SECONDS.sleep(1L);
       } catch (InterruptedException e) {
         e.printStackTrace();
       } 
        Bukkit.broadcastMessage(main.getConfig().getString("messages.5").replace("&", "§"));
       try {
         TimeUnit.SECONDS.sleep(1L);
       } catch (InterruptedException e) {
         e.printStackTrace();
       } 
        Bukkit.broadcastMessage(main.getConfig().getString("messages.6").replace("&", "§"));
       try {
         TimeUnit.SECONDS.sleep(1L);
       } catch (InterruptedException e) {
         e.printStackTrace();
       } 
        Bukkit.broadcastMessage(main.getConfig().getString("messages.7").replace("&", "§"));
       try {
         TimeUnit.SECONDS.sleep(1L);
       } catch (InterruptedException e) {
         e.printStackTrace();
       } 
        Bukkit.broadcastMessage(main.getConfig().getString("messages.8").replace("&", "§"));
       try {
         TimeUnit.SECONDS.sleep(1L);
       } catch (InterruptedException e) {
         e.printStackTrace();
       } 
        Bukkit.broadcastMessage(main.getConfig().getString("messages.9").replace("&", "§"));
       try {
         TimeUnit.SECONDS.sleep(1L);
       } catch (InterruptedException e) {
        e.printStackTrace();
       } 
        Bukkit.broadcastMessage(main.getConfig().getString("messages.10").replace("&", "§"));
       try {
         TimeUnit.SECONDS.sleep(1L);
       } catch (InterruptedException e) {
         e.printStackTrace();
       } 
        Bukkit.broadcastMessage(main.getConfig().getString("messages.11").replace("&", "§"));
       try {
         TimeUnit.SECONDS.sleep(1L);
       } catch (InterruptedException e) {
         e.printStackTrace();
       } 
       Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "restart ");
     } 
               
 


     
     return false;
   }
 }