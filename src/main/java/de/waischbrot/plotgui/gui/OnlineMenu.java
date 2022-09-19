package de.waischbrot.plotgui.gui;

import de.waischbrot.libraries.invlib.basic.Button;
import de.waischbrot.libraries.invlib.basic.RubyInventory;
import de.waischbrot.libraries.invlib.pagemenu.PageHandler;
import de.waischbrot.libraries.itembuilder.ItemBuilder;
import de.waischbrot.libraries.messages.StringUtil;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OnlineMenu extends RubyInventory {

    private final PageHandler pagination;
    private Collection<? extends Player> players;

    public OnlineMenu(@NotNull Player player, @NotNull String id, String title, int rows) {
        super(player, id, title, 5);

        pagination = new PageHandler(this);
        pagination.registerPageSlotsBetween(10, 16);
        pagination.registerPageSlotsBetween(19, 25);
        pagination.registerPageSlotsBetween(28, 34);
    }

    @Override
    public void handleInventoryOpenEvent(final InventoryOpenEvent event) {

        fillBorders(new Button(new ItemBuilder(Material.BLACK_STAINED_GLASS_PANE)
                .setDisplayName(StringUtil.color("&8"))
                .build()));

        runUpdateScheduler(1L, 200L, e -> {
            final var newPlayers = Bukkit.getOnlinePlayers();
            if (!newPlayers.equals(players)) {
                pagination.getButtons().clear();
                List<String> lore = new ArrayList<>();
                for (final Player newPlayer : newPlayers) {
                    lore.add(StringUtil.color("&8"));
                    pagination.addButton(new Button(new ItemBuilder(Material.PLAYER_HEAD)
                            .setDisplayName(StringUtil.color("&b" + newPlayer.getName()))
                            .setLore(lore)
                            .setHead(newPlayer)
                            .build()));
                    lore.clear();
                }
                pagination.update();
                players = newPlayers;
            }
        });
    }
}
