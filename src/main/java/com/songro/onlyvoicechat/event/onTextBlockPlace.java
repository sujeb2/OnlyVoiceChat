package com.songro.onlyvoicechat.event;

import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class onTextBlockPlace implements Listener {
    @EventHandler
    public void onPlace(BlockPlaceEvent e) {
        Block block = e.getBlock();
        BlockState state = block.getState();
        Sign playerPlaceSign = (Sign)state;

        if(!block.equals(playerPlaceSign)) {
            return;
        } else {
            playerPlaceSign.setLine(0, "");
            playerPlaceSign.update();
        }
    }

}
