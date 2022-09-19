package de.waischbrot.plotgui.gui;

import com.plotsquared.core.player.PlotPlayer;
import com.plotsquared.core.plot.Plot;
import de.waischbrot.libraries.invlib.basic.Button;
import de.waischbrot.libraries.invlib.basic.RubyInventory;
import de.waischbrot.libraries.invlib.basic.SlotPosition;
import de.waischbrot.libraries.itembuilder.ItemBuilder;
import de.waischbrot.libraries.messages.StringUtil;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.jetbrains.annotations.NotNull;

public class MainMenu extends RubyInventory {

    public MainMenu(final @NotNull Player player) {
        super(player, "main", StringUtil.color("&8Hauptmenü"), 5);
    }

    @Override
    public void handleInventoryOpenEvent(final InventoryOpenEvent event) {

        fillBorders(new Button(new ItemBuilder(Material.BLACK_STAINED_GLASS_PANE)
                .setDisplayName(StringUtil.color("&8"))
                .build()));

        addButton(SlotPosition.of(2, 4), new Button(new ItemBuilder(Material.PLAYER_HEAD)
                .getSkullBase("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTJkN2E3NTFlYjA3MWUwOGRiYmM5NWJjNWQ5ZDY2ZTVmNTFkYzY3MTI2NDBhZDJkZmEwM2RlZmJiNjhhN2YzYSJ9fX0=")
                .setDisplayName(StringUtil.color("&b" + player.getName()))
                .build()));
    }
}
