package com.terraformersmc.cinderscapes.data;

import com.terraformersmc.cinderscapes.init.CinderscapesBlocks;
import com.terraformersmc.cinderscapes.init.CinderscapesItems;
import com.terraformersmc.cinderscapes.tag.CinderscapesItemTags;
import net.devtech.arrp.json.tags.JTag;
import net.minecraft.item.Items;
import net.minecraft.tag.ItemTags;

import static com.terraformersmc.cinderscapes.data.CinderscapesDatagen.RUNTIME_RESOURCE_PACK;

public class CinderscapesItemTagProvider {

	public static void init() {
		// local item tags
		RUNTIME_RESOURCE_PACK.addTag(CinderscapesItemTags.ROSE_QUARTZ_CONVERTIBLES.id(), JTag.tag()
			.add(CinderscapesBlocks.CHISELED_ROSE_QUARTZ_BLOCK.asItem().getRegistryName())
			.add(CinderscapesBlocks.ROSE_QUARTZ_BLOCK.asItem().getRegistryName())
			.add(CinderscapesBlocks.ROSE_QUARTZ_PILLAR.asItem().getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(CinderscapesItemTags.SCORCHED_STEMS.id(), JTag.tag()
			.add(CinderscapesBlocks.SCORCHED_HYPHAE.asItem().getRegistryName())
			.add(CinderscapesBlocks.SCORCHED_STEM.asItem().getRegistryName())
			.add(CinderscapesBlocks.STRIPPED_SCORCHED_HYPHAE.asItem().getRegistryName())
			.add(CinderscapesBlocks.STRIPPED_SCORCHED_STEM.asItem().getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(CinderscapesItemTags.SMOKY_QUARTZ_CONVERTIBLES.id(), JTag.tag()
			.add(CinderscapesBlocks.CHISELED_SMOKY_QUARTZ_BLOCK.asItem().getRegistryName())
			.add(CinderscapesBlocks.SMOKY_QUARTZ_BLOCK.asItem().getRegistryName())
			.add(CinderscapesBlocks.SMOKY_QUARTZ_PILLAR.asItem().getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(CinderscapesItemTags.SULFUR_QUARTZ_CONVERTIBLES.id(), JTag.tag()
			.add(CinderscapesBlocks.CHISELED_SULFUR_QUARTZ_BLOCK.asItem().getRegistryName())
			.add(CinderscapesBlocks.SULFUR_QUARTZ_BLOCK.asItem().getRegistryName())
			.add(CinderscapesBlocks.SULFUR_QUARTZ_PILLAR.asItem().getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(CinderscapesItemTags.UMBRAL_STEMS.id(), JTag.tag()
			.add(CinderscapesBlocks.UMBRAL_HYPHAE.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_STEM.asItem().getRegistryName())
			.add(CinderscapesBlocks.STRIPPED_UMBRAL_HYPHAE.asItem().getRegistryName())
			.add(CinderscapesBlocks.STRIPPED_UMBRAL_STEM.asItem().getRegistryName()));


		// common item tags
		RUNTIME_RESOURCE_PACK.addTag(CinderscapesItemTags.DARK_ASHES_DUSTS.id(), JTag.tag()
			.add(CinderscapesItems.ASH_PILE.getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(CinderscapesItemTags.QUARTZ.id(), JTag.tag()
			.add(Items.QUARTZ.getRegistryName())
			.add(CinderscapesItems.ROSE_QUARTZ.getRegistryName())
			.add(CinderscapesItems.SMOKY_QUARTZ.getRegistryName())
			.add(CinderscapesItems.SULFUR_QUARTZ.getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(CinderscapesItemTags.QUARTZ_BLOCKS.id(), JTag.tag()
			.add(CinderscapesBlocks.CHISELED_ROSE_QUARTZ_BLOCK.asItem().getRegistryName())
			.add(CinderscapesBlocks.CHISELED_SMOKY_QUARTZ_BLOCK.asItem().getRegistryName())
			.add(CinderscapesBlocks.CHISELED_SULFUR_QUARTZ_BLOCK.asItem().getRegistryName())
			.add(CinderscapesBlocks.ROSE_QUARTZ_BLOCK.asItem().getRegistryName())
			.add(CinderscapesBlocks.ROSE_QUARTZ_BRICKS.asItem().getRegistryName())
			.add(CinderscapesBlocks.ROSE_QUARTZ_PILLAR.asItem().getRegistryName())
			.add(CinderscapesBlocks.SMOKY_QUARTZ_BLOCK.asItem().getRegistryName())
			.add(CinderscapesBlocks.SMOKY_QUARTZ_BRICKS.asItem().getRegistryName())
			.add(CinderscapesBlocks.SMOKY_QUARTZ_PILLAR.asItem().getRegistryName())
			.add(CinderscapesBlocks.SMOOTH_ROSE_QUARTZ.asItem().getRegistryName())
			.add(CinderscapesBlocks.SMOOTH_SMOKY_QUARTZ.asItem().getRegistryName())
			.add(CinderscapesBlocks.SMOOTH_SULFUR_QUARTZ.asItem().getRegistryName())
			.add(CinderscapesBlocks.SULFUR_QUARTZ_BLOCK.asItem().getRegistryName())
			.add(CinderscapesBlocks.SULFUR_QUARTZ_BRICKS.asItem().getRegistryName())
			.add(CinderscapesBlocks.SULFUR_QUARTZ_PILLAR.asItem().getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(CinderscapesItemTags.QUARTZ_ORES.id(), JTag.tag()
			.add(CinderscapesBlocks.ROSE_QUARTZ_ORE.asItem().getRegistryName())
			.add(CinderscapesBlocks.SMOKY_QUARTZ_ORE.asItem().getRegistryName())
			.add(CinderscapesBlocks.SULFUR_QUARTZ_ORE.asItem().getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(CinderscapesItemTags.SULFUR_ORES.id(), JTag.tag()
			.add(CinderscapesBlocks.SULFUR_ORE.asItem().getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(CinderscapesItemTags.SULFURS.id(), JTag.tag()
			.add(CinderscapesItems.SULFUR.getRegistryName()));


		// vanilla item tags
		RUNTIME_RESOURCE_PACK.addTag(ItemTags.LOGS.id(), JTag.tag()
			.tag(CinderscapesItemTags.SCORCHED_STEMS.id())
			.tag(CinderscapesItemTags.UMBRAL_STEMS.id()));

		RUNTIME_RESOURCE_PACK.addTag(ItemTags.NON_FLAMMABLE_WOOD.id(), JTag.tag()
			.add(CinderscapesBlocks.SCORCHED_BUTTON.asItem().getRegistryName())
			.add(CinderscapesBlocks.SCORCHED_DOOR.asItem().getRegistryName())
			.add(CinderscapesBlocks.SCORCHED_FENCE.asItem().getRegistryName())
			.add(CinderscapesBlocks.SCORCHED_FENCE_GATE.asItem().getRegistryName())
			.add(CinderscapesBlocks.SCORCHED_HYPHAE.asItem().getRegistryName())
			.add(CinderscapesBlocks.SCORCHED_PLANKS.asItem().getRegistryName())
			.add(CinderscapesBlocks.SCORCHED_PRESSURE_PLATE.asItem().getRegistryName())
			.add(CinderscapesBlocks.SCORCHED_SIGN.asItem().getRegistryName())
			.add(CinderscapesBlocks.SCORCHED_SLAB.asItem().getRegistryName())
			.add(CinderscapesBlocks.SCORCHED_STAIRS.asItem().getRegistryName())
			.add(CinderscapesBlocks.SCORCHED_STEM.asItem().getRegistryName())
			.add(CinderscapesBlocks.SCORCHED_TRAPDOOR.asItem().getRegistryName())
			.add(CinderscapesBlocks.SCORCHED_WALL_SIGN.asItem().getRegistryName())
			.add(CinderscapesBlocks.STRIPPED_SCORCHED_HYPHAE.asItem().getRegistryName())
			.add(CinderscapesBlocks.STRIPPED_SCORCHED_STEM.asItem().getRegistryName())
			.add(CinderscapesBlocks.STRIPPED_UMBRAL_HYPHAE.asItem().getRegistryName())
			.add(CinderscapesBlocks.STRIPPED_UMBRAL_STEM.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_BUTTON.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_DOOR.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_FENCE.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_FENCE_GATE.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_HYPHAE.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_PLANKS.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_PRESSURE_PLATE.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_SIGN.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_SLAB.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_STAIRS.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_STEM.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_TRAPDOOR.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_WALL_SIGN.asItem().getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(ItemTags.PLANKS.id(), JTag.tag()
			.add(CinderscapesBlocks.SCORCHED_PLANKS.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_PLANKS.asItem().getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(ItemTags.SIGNS.id(), JTag.tag()
			.add(CinderscapesBlocks.SCORCHED_SIGN.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_SIGN.asItem().getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(ItemTags.SLABS.id(), JTag.tag()
			.add(CinderscapesBlocks.ROSE_QUARTZ_SLAB.asItem().getRegistryName())
			.add(CinderscapesBlocks.SMOKY_QUARTZ_SLAB.asItem().getRegistryName())
			.add(CinderscapesBlocks.SMOOTH_ROSE_QUARTZ_SLAB.asItem().getRegistryName())
			.add(CinderscapesBlocks.SMOOTH_SMOKY_QUARTZ_SLAB.asItem().getRegistryName())
			.add(CinderscapesBlocks.SMOOTH_SULFUR_QUARTZ_SLAB.asItem().getRegistryName())
			.add(CinderscapesBlocks.SULFUR_QUARTZ_SLAB.asItem().getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(ItemTags.SMALL_FLOWERS.id(), JTag.tag()
			.add(CinderscapesBlocks.CRYSTINIUM.asItem().getRegistryName())
			.add(CinderscapesBlocks.PYRACINTH.asItem().getRegistryName())
			.add(CinderscapesBlocks.SCORCHED_TENDRILS.asItem().getRegistryName())
			.add(CinderscapesBlocks.TWILIGHT_TENDRILS.asItem().getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(ItemTags.STAIRS.id(), JTag.tag()
			.add(CinderscapesBlocks.ROSE_QUARTZ_STAIRS.asItem().getRegistryName())
			.add(CinderscapesBlocks.SMOKY_QUARTZ_STAIRS.asItem().getRegistryName())
			.add(CinderscapesBlocks.SMOOTH_ROSE_QUARTZ_STAIRS.asItem().getRegistryName())
			.add(CinderscapesBlocks.SMOOTH_SMOKY_QUARTZ_STAIRS.asItem().getRegistryName())
			.add(CinderscapesBlocks.SMOOTH_SULFUR_QUARTZ_STAIRS.asItem().getRegistryName())
			.add(CinderscapesBlocks.SULFUR_QUARTZ_STAIRS.asItem().getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(ItemTags.WOODEN_BUTTONS.id(), JTag.tag()
			.add(CinderscapesBlocks.SCORCHED_BUTTON.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_BUTTON.asItem().getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(ItemTags.WOODEN_DOORS.id(), JTag.tag()
			.add(CinderscapesBlocks.SCORCHED_DOOR.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_DOOR.asItem().getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(ItemTags.WOODEN_FENCES.id(), JTag.tag()
			.add(CinderscapesBlocks.SCORCHED_FENCE.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_FENCE.asItem().getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(ItemTags.WOODEN_PRESSURE_PLATES.id(), JTag.tag()
			.add(CinderscapesBlocks.SCORCHED_PRESSURE_PLATE.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_PRESSURE_PLATE.asItem().getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(ItemTags.WOODEN_SLABS.id(), JTag.tag()
			.add(CinderscapesBlocks.SCORCHED_SLAB.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_SLAB.asItem().getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(ItemTags.WOODEN_STAIRS.id(), JTag.tag()
			.add(CinderscapesBlocks.SCORCHED_STAIRS.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_STAIRS.asItem().getRegistryName()));

		RUNTIME_RESOURCE_PACK.addTag(ItemTags.WOODEN_TRAPDOORS.id(), JTag.tag()
			.add(CinderscapesBlocks.SCORCHED_TRAPDOOR.asItem().getRegistryName())
			.add(CinderscapesBlocks.UMBRAL_TRAPDOOR.asItem().getRegistryName()));
	}
}
