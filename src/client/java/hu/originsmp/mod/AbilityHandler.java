package hu.originsmp.mod;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class AbilityHandler {

    public static void register() {

        ClientTickEvents.END_CLIENT_TICK.register(client -> {

            while (AbilityKeybinds.ability1.consumeClick()) {

                if (client.player != null) {
                    client.player.connection.sendCommand("ability1");
                }

            }

            while (AbilityKeybinds.ability2.consumeClick()) {

                if (client.player != null) {
                    client.player.connection.sendCommand("ability2");
                }

            }

        });

    }
}
