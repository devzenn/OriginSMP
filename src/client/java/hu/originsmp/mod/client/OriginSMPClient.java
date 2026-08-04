package hu.originsmp.mod.client;

import net.fabricmc.api.ClientModInitializer;
import hu.originsmp.mod.AbilityKeybinds;
import hu.originsmp.mod.AbilityHandler;

public class OriginSMPClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        AbilityKeybinds.register();
        AbilityHandler.register();

    }
}
