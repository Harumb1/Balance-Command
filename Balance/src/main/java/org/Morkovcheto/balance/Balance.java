package org.Morkovcheto.balance;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;


public final class Balance extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.getCommand("balance").setExecutor(new BalanceCommand());
        getServer().getPluginManager().registerEvents(this, this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onPlayerBreakBlockEvent(BlockBreakEvent e) {
        balance++;
    }

    @EventHandler
    public void onPlayerPlaceBlockEvent(BlockPlaceEvent e) {
        balance++;
    }

    static int balance = 0;

    static int getBlocksBroken() {
        return balance;
    }

}