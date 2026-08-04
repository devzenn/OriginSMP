package hu.originsmp.mod;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.resources.ResourceLocation;
import org.lwjgl.glfw.GLFW;

public class AbilityKeybinds {

    public static KeyBinding ability1;
    public static KeyBinding ability2;

    public static void register() {

        ability1 = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.originsmp.ability1",
                GLFW.GLFW_KEY_K,
                "category.originsmp"
        ));

        ability2 = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.originsmp.ability2",
                GLFW.GLFW_KEY_G,
                "category.originsmp"
        ));

    }
}
