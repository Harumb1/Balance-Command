package org.Morkovcheto.balance;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.sql.rowset.spi.SyncFactoryException;
import java.util.List;

import static javax.sql.rowset.spi.SyncFactory.getLogger;

public class BalanceCommand implements CommandExecutor, TabExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] strings) {
        if(!(commandSender instanceof Player)){
            commandSender.sendMessage("Only players can use this command!");
        }
        int balance = 0;
        commandSender.sendMessage(String.valueOf(balance));
        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] strings) {
        return List.of();
    }
}
