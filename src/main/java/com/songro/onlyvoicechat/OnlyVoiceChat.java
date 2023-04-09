package com.songro.onlyvoicechat;

import com.songro.onlyvoicechat.event.onChat;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class OnlyVoiceChat extends JavaPlugin {

    Logger log = Bukkit.getLogger();

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "OnlyVoiceChat"+ ChatColor.GREEN + " v1.0");
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "Made by. notSongro_");
        try {
            getServer().getPluginManager().registerEvents(new onChat(), this);
        } catch (Exception e) {
            log.severe("오류가 발생했습니다.");
            log.severe("오류 로그: " + e);
        }
    }

    @Override
    public void onDisable() {
        log.info("Shutting down...");
    }
}
