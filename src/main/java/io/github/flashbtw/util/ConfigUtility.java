package io.github.flashbtw.util;

import io.github.flashbtw.enums.ConfigActions;

public abstract class ConfigUtility {
     <T_configReturnType> T_configReturnType action(ConfigActions action, Class<T_configReturnType> clazz) {
        switch (action) {
            case GET_CONFIG: return clazz.cast("config");
            case GET_SECTION: return clazz.cast("section");
            default: return clazz.cast("hi");
        }
     }
}
