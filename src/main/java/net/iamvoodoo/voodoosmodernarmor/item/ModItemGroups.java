package net.iamvoodoo.voodoosmodernarmor.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.iamvoodoo.voodoosmodernarmor.VoodoosModernArmor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup VOODOOS_MODERN_ARMOR_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(VoodoosModernArmor.MOD_ID, "voodoos_modern_armor_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.NETHERITE_CHESTPLATE))
                    .displayName(Text.translatable("itemgroup.voodoos-modern-armor.voodoos_modern_armor_items"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.DUMMY_ITEM);
                        entries.add(ModItems.DUMMY_ARMOR_HELMET);
                    })
                    .build()
            );

    public static void registerModItemGroups() {
        VoodoosModernArmor.LOGGER.info("Registering Item Groups");
    }
}
