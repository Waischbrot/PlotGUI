package de.waischbrot.plotgui;

import de.waischbrot.libraries.invlib.basic.RubyInventoryAPI;
import de.waischbrot.plotgui.commands.PlotCommand;
import de.waischbrot.plotgui.function.Configuration;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private Economy economy;
    private RubyInventoryAPI api;

    @Override
    public void onEnable() {

        if (!loadVault()) {
            Bukkit.getConsoleSender().sendMessage("Plugin shutting down due to not finding a valid Vault-Based Economy!");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        PluginCommand command = getCommand("plotgui");
        if (command == null) {
            Bukkit.getConsoleSender().sendMessage("There was a problem with reloading the commands.");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        command.setExecutor(new PlotCommand(this));

        api = new RubyInventoryAPI(this);
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
