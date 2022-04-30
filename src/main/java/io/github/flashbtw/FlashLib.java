package io.github.flashbtw;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class FlashLib extends JavaPlugin {

    private static Logger log;
    @Override
    public void onEnable() {
        // Plugin startup logic
        log = getLogger();
        log.info("Loading FlashLib");
        log.info("Loaded FlashLib");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
