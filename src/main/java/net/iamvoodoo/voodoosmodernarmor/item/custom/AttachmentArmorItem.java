package net.iamvoodoo.voodoosmodernarmor.item.custom;

import com.vicmatskiv.pointblank.attachment.Attachment;
import com.vicmatskiv.pointblank.attachment.AttachmentHost;
import com.vicmatskiv.pointblank.feature.Feature;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.registry.entry.RegistryEntry;

import java.util.Collection;
import java.util.List;

public class AttachmentArmorItem extends ArmorItem implements AttachmentHost {
    private String name;

    public AttachmentArmorItem(RegistryEntry<ArmorMaterial> material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public Collection<Attachment> getCompatibleAttachments() {
        return List.of();
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Collection<Feature> getFeatures() {
        return List.of();
    }
}
