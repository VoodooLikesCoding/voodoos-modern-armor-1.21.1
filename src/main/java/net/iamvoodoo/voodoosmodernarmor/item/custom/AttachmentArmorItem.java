package net.iamvoodoo.voodoosmodernarmor.item.custom;

import com.vicmatskiv.pointblank.Nameable;
import com.vicmatskiv.pointblank.attachment.Attachment;
import com.vicmatskiv.pointblank.attachment.AttachmentHost;
import com.vicmatskiv.pointblank.feature.Feature;
import com.vicmatskiv.pointblank.item.ItemExtra;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.registry.entry.RegistryEntry;

import java.util.Collection;
import java.util.List;

public class AttachmentArmorItem extends ArmorItem implements AttachmentHost, Nameable, ItemExtra {
    private String name;

    public AttachmentArmorItem(RegistryEntry<ArmorMaterial> material, Type type, Settings settings) {
        super(material, type, settings);
    }


    @Override
    public String getNameableName() {
        return "";
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
