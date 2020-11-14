package io.github.awesomestcode.adventplugin;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class SpigotPlugin extends JavaPlugin {
    private FileConfiguration customConfig;

    @Override
    public void onEnable() {
        getCommand("claim").setExecutor(new CommandClaim());
        getServer().getPluginManager().registerEvents(new ListenerLogin(), this);
    }
    public FileConfiguration getCustomConfig() {
        return this.customConfig;
    }
    private void createCustomConfig() {
        File customConfigFile = new File(getDataFolder(), "data.yml");
        if (!customConfigFile.exists()) {
            //IntelliJ is acting up again.
            //noinspection ResultOfMethodCallIgnored
            customConfigFile.getParentFile().mkdirs();
            saveResource("data.yml", false);
        }

        customConfig= new YamlConfiguration();
        try {
            customConfig.load(customConfigFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
}
