package de.waischbrot.plotgui.function;

import de.leonhard.storage.Config;
import de.waischbrot.plotgui.Main;
import org.jetbrains.annotations.NotNull;

public class Configuration {

    private final Main plugin;

    private Config messages;
    private Config config;

    public Configuration(final @NotNull Main plugin) {
        this.plugin = plugin;

        config = new Config("config", plugin.getDataFolder().getPath(), plugin.getResource("config.yml"));
    }
}
