package natsupotato.cropalooza;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cropalooza implements ModInitializer {

	public static final String MOD_ID = "cropalooza";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");

		ModCrop.init();
		ModFood.init();
	}
}