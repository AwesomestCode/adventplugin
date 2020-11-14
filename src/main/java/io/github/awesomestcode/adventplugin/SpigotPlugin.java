package io.github.awesomestcode.adventplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class SpigotPlugin extends JavaPlugin {

  @Override
  public void onEnable() {
    getCommand("claim").setExecutor(new CommandClaim());
    getServer().getPluginManager().registerEvents(new ListenerLogin(), this);
  }
}
