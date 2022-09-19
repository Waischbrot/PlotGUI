package de.waischbrot.plotgui.function;

import de.waischbrot.libraries.configuration.YamlFile;
import de.waischbrot.plotgui.Main;
import org.jetbrains.annotations.NotNull;

public class Configuration {

    private final Main plugin;

    private final YamlFile messages;
    private final YamlFile config;

    public Configuration(final @NotNull Main plugin) {
        this.plugin = plugin;

        config = new YamlFile(plugin, "config.yml");
        messages = new YamlFile(plugin, "messages.yml");
    }
}
