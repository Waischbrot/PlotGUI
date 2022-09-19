package de.waischbrot.plotgui.gui;

import de.waischbrot.libraries.invlib.basic.RubyInventory;
import de.waischbrot.libraries.messages.StringUtil;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.jetbrains.annotations.NotNull;

public class MainMenu extends RubyInventory {

    public MainMenu(final @NotNull Player player) {
        super(player, "main", StringUtil.color("&8Hauptmenü"), 5);
    }

    @Override
    public void handleInventoryOpenEvent(final InventoryOpenEvent event) {



    }
}
