package de.waischbrot.plotgui.gui;

import de.waischbrot.libraries.invlib.basic.RubyInventory;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class OnlineMenu extends RubyInventory {
    public OnlineMenu(@NotNull Player player, @NotNull String id, String title, int rows) {
        super(player, id, title, rows);
    }
}
