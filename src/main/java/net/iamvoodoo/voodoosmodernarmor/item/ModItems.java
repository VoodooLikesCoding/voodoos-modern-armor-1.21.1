package net.iamvoodoo.voodoosmodernarmor.item;

import net.iamvoodoo.voodoosmodernarmor.VoodoosModernArmor;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item DUMMY_ITEM = registerItem("dummy_item", new Item(new Item.Settings()));

    public static final Item DUMMY_ARMOR_HELMET = registerItem("dummy_armor_helmet",
            new ArmorItem(ModArmorMaterials.DUMMY_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VoodoosModernArmor.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VoodoosModernArmor.LOGGER.info("Registering Mod Items!");
    }
}
