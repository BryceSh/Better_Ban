package ubiniti.betterbanv2;

import org.bukkit.plugin.java.JavaPlugin;
import ubiniti.betterbanv2.listeners.onPlayerJoin;

public final class Betterbanv2 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        loadConfig();

        getServer().getPluginManager().registerEvents(new onPlayerJoin(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

}
