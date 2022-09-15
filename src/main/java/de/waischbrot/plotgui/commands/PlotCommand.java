package de.waischbrot.plotgui.commands;

import de.waischbrot.plotgui.Main;
import de.waischbrot.plotgui.gui.MainMenu;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public record PlotCommand(Main plugin) implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof final Player player)) {
            return true;
        }

        if (args.length == 0) {
            new MainMenu(player).open();
        }

        return false;
    }
}
