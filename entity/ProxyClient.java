package timaxa007.entity;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ProxyClient extends ProxyCommon {

	public void preInit() {
		super.preInit();

	}

	@Override
	public void init() {
		super.init();

		RenderingRegistry.registerEntityRenderingHandler(EntityBetterPig.class, new RenderEntityBetterPig());

	}

	public void postInit() {
		super.postInit();

	}

}
