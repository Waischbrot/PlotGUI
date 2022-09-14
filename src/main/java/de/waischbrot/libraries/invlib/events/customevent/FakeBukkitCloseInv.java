package de.waischbrot.libraries.invlib.events.customevent;

import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.InventoryView;

public class FakeBukkitCloseInv extends InventoryCloseEvent {

    public FakeBukkitCloseInv(InventoryView transaction) {
        super(transaction);
    }
}