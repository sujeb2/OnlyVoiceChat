package com.songro.onlyvoicechat.event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.util.Arrays;

public class onCommandUsage implements Listener {

    static String[] blockedCommands = {
      "/help",
      "/w",
      "/say",
    };

    static String[] blockedStart = {
            "/bukkit:",
            "/minecraft:",
    };

    @EventHandler
    public static void onCommand(PlayerCommandPreprocessEvent e) {
        String msg = e.getMessage();
        String[] args = msg.split(" ");
        Player p = e.getPlayer();

        boolean blocked = false;
        if(Arrays.asList(blockedCommands).contains(args[0].toLowerCase())) {
            blocked = true;
        }

        for(String st : blockedStart) {
            if(args[0].toLowerCase().startsWith(st)) {
                blocked = true;
            }
        }

        if(blocked || !p.isOp()) {
            e.setCancelled(true);
        }
    }

}
