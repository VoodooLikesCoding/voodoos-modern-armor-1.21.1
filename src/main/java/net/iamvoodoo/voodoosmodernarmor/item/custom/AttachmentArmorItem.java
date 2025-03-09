package net.iamvoodoo.voodoosmodernarmor.item.custom;

import com.vicmatskiv.pointblank.Nameable;
import com.vicmatskiv.pointblank.attachment.Attachment;
import com.vicmatskiv.pointblank.attachment.AttachmentCategory;
import com.vicmatskiv.pointblank.attachment.AttachmentHost;
import com.vicmatskiv.pointblank.feature.Feature;
import com.vicmatskiv.pointblank.item.ItemExtra;
import net.fabricmc.fabric.api.item.v1.EnchantingContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Collection;
import java.util.List;

public class AttachmentArmorItem extends ArmorItem implements AttachmentHost, Nameable, ItemExtra {
    private String name;

    public AttachmentArmorItem(RegistryEntry<ArmorMaterial> material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Collection<Attachment> getCompatibleAttachments() {
        return List.of();
    }

    @Override
    public Collection<Feature> getFeatures() {
        return List.of();
    }
}
