package io.github.clemensu42.the_between.common.entities;

import io.github.clemensu42.the_between.common.TheBetween;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EntityTypes {

    public static final EntityType<PortalEntity> PORTAL_ENTITY_ENTITY_TYPE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(TheBetween.MODID, "portal"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, PortalEntity::new).dimensions(EntityDimensions.fixed(3F, 3F)).build()
    );
}
