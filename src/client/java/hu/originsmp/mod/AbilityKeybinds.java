package hu.originsmp.mod;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;
import com.mojang.blaze3d.platform.InputConstants;
import org.lwjgl.glfw.GLFW;

public class AbilityKeybinds {

public static KeyMapping ability1;
public static KeyMapping ability2;

    public static void register() {

ability1 = KeyBindingHelper.registerKeyBinding(new KeyMapping(
        "key.originsmp.ability1",
        InputConstants.Type.KEYSYM,
        GLFW.GLFW_KEY_K,
        "category.originsmp"
));

ability2 = KeyBindingHelper.registerKeyBinding(new KeyMapping(
        "key.originsmp.ability2",
        InputConstants.Type.KEYSYM,
        GLFW.GLFW_KEY_G,
        "category.originsmp"
));

    }
}
