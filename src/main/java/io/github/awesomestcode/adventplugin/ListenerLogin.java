
package io.github.awesomestcode.adventplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

public class ListenerLogin implements Listener {
    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) { //this listener is not yet finished
        short claimStreak = getStreak();
        boolean hasClaimed = false;
        //noinspection ConstantConditions
        if(!hasClaimed) {
            event.getPlayer().sendMessage(ChatColor.AQUA + "You haven't claimed your daily advent gift! You have a current claim streak of " + claimStreak + (claimStreak == 1 ? "days" : "day") + ". The higher your streak, the better your reward!");
            Bukkit.getLogger().info("Nagged user " + event.getPlayer().getName() + " to claim their advent gift.");
        }
    }

    //these are just dummy functions for prototyping stuff, will be removed in final build
    private short getStreak() { //I highly doubt it will go beyond the max value of a short... the server will probably not run for that many days.
        return 0;
    }
}