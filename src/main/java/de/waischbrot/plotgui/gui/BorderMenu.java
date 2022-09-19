package de.waischbrot.plotgui.gui;

import de.waischbrot.libraries.invlib.basic.Button;
import de.waischbrot.libraries.invlib.basic.RubyInventory;
import de.waischbrot.libraries.itembuilder.ItemBuilder;
import de.waischbrot.libraries.messages.StringUtil;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.jetbrains.annotations.NotNull;

public class BorderMenu extends RubyInventory {

    public BorderMenu(@NotNull Player player, @NotNull String id, String title, int rows) {
        super(player, id, title, rows);
    }

    @Override
    public void handleInventoryOpenEvent(final InventoryOpenEvent event) {
        fillBorders(new Button(new ItemBuilder(Material.BLACK_STAINED_GLASS_PANE)
                .setDisplayName(StringUtil.color("&8"))
                .build()));
    }
}
