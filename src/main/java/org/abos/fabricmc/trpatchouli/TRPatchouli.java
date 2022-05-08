package org.abos.fabricmc.trpatchouli;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TRPatchouli implements ModInitializer {

	public static final String MOD_ID = "tr-patchouli";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("%s has been initialized!".formatted(MOD_ID));
	}
}
