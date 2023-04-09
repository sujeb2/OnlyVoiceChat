package com.songro.onlyvoicechat;

import com.songro.onlyvoicechat.event.onChat;
import com.songro.onlyvoicechat.event.onCommandUsage;
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
            try {
                getServer().getPluginManager().registerEvents(new onChat(), this);
            } catch (Exception e) {
                log.severe("채팅 이벤트를 등록중에 오류가 발생했습니다.");
            }
            try {
                getServer().getPluginManager().registerEvents(new onCommandUsage(), this);
            } catch (Exception e) {
                log.severe("명령어 실행 이벤트를 등록중에 오류가 발생했습니다.");
            }
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
