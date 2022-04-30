package io.github.flashbtw.util;

import io.github.flashbtw.enums.ConfigActions;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public abstract class ConfigUtility {

    private Plugin plugin;

    public ConfigUtility(Plugin plugin) {
        this.plugin = plugin;
    }

    public <T_configReturnType> T_configReturnType action(@NotNull ConfigActions action, @NotNull String path, @NotNull Class<T_configReturnType> clazz) {
        try {

            switch (action) {
                case GET_VALUE:
                    return this.plugin.getConfig().getObject(path, clazz);
                default:
                    return null;
            }

        } catch (NullPointerException npe) {
            npe.printStackTrace();
            return null;
        }
    }
}
