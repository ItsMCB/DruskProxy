package org.libregalaxy.druskproxy;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;

@Plugin(
        id = "druskproxy",
        name = "DruskProxy",
        version = BuildConstants.VERSION,
        description = "Additions to Drusk for Velocity proxies",
        url = "https://github.com/ItsMCB/DruskProxy",
        authors = {"ItsMCB"}
)
public class DruskProxy {

    @Inject
    private Logger logger;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        System.out.println("DruskProxy has been enabled!");
        // TODO
        // Register a plugin channel message to listen for "wdl:init" and block it to prevent world downloads.
        // /live start [stream url] - Create boss bar indicating that player is livestreaming
        // /live list - List livestreamers on the server rn
    }
}
