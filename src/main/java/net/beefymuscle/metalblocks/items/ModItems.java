package net.beefymuscle.metalblocks.items;

import net.beefymuscle.metalblocks.BeefsMetalBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;




public class ModItems {



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BeefsMetalBlocks.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BeefsMetalBlocks.LOGGER.info("Registering Mod Items for " + BeefsMetalBlocks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

        });
    }
}
