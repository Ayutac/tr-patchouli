package org.abos.fabricmc.trpatchouli;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import techreborn.TechReborn;

public class TRPatchouli implements ModInitializer {

	public static final String MOD_ID = "tr-patchouli";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final GuideBook guide = new GuideBook(new FabricItemSettings().group(TechReborn.ITEMGROUP));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"guide"), guide);
		LOGGER.info("%s has been initialized!".formatted(MOD_ID));
	}
}
