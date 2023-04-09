package com.songro.onlyvoicechat.event;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import java.util.logging.Logger;

public class onTextBlockPlace implements Listener {
    @EventHandler
    public void onPlace(BlockPlaceEvent e) {
        Block block = e.getBlock();
        BlockState state = block.getState();
        Sign playerPlaceSign = (Sign)state;
        Logger log = Bukkit.getLogger();

        if(block.equals(playerPlaceSign)) {
            log.info("sign location:");
            log.info("x: " + block.getX() + "y: " + block.getY() + "z: " + block.getZ());
        }
    }

}
