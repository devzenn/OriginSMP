package hu.originsmp.mod;

import net.fabricmc.api.ClientModInitializer;

public class OriginSMPClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        AbilityKeybinds.register();

        OriginSMP.LOGGER.info("OriginSMP Client elindult!");
    }
}