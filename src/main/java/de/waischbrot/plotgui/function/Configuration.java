package de.waischbrot.plotgui.function;

import de.leonhard.storage.Yaml;
import de.waischbrot.plotgui.Main;
import org.jetbrains.annotations.NotNull;

public class Configuration {

    private final Main plugin;

    private Yaml messages;

    public Configuration(final @NotNull Main plugin) {
        this.plugin = plugin;
    }
}
