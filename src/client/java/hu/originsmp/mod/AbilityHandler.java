package hu.originsmp.mod;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class AbilityHandler {

    public static void register() {

        ClientTickEvents.END_CLIENT_TICK.register(client -> {

            while (AbilityKeybinds.ability1.wasPressed()) {

                if (client.player != null) {
                    client.getNetworkHandler().sendChatCommand("ability1");
                }

            }

            while (AbilityKeybinds.ability2.wasPressed()) {

                if (client.player != null) {
                    client.getNetworkHandler().sendChatCommand("ability2");
                }

            }

        });

    }
}
