package org.Morkovcheto.balance;

import org.bukkit.plugin.java.JavaPlugin;

public final class Balance extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static JavaPlugin getInstance() {
        return getPlugin(Balance.class);
    }

}
