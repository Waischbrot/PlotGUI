package de.waischbrot.plotgui;

import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private Economy economy;

    @Override
    public void onEnable() {

        if (!loadVault()) {
            Bukkit.getConsoleSender().sendMessage("Plugin shutting down due to not finding a valid Vault-Based Economy!");
            getServer().getPluginManager().disablePlugin(this);
        }

    }

    private boolean loadVault() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        economy = rsp.getProvider();
        return true;
    }

    public Economy getEconomy() {
        return economy;
    }
}
