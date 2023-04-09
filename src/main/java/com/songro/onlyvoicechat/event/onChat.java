package com.songro.onlyvoicechat.event;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class onChat implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e) {
        CommandSender cs = Bukkit.getConsoleSender();
        if(e.getPlayer() == cs) {
            e.setCancelled(false);
        } else {
            e.setCancelled(true);
        }
    }

}
