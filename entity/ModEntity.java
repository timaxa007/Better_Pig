package timaxa007.entity;

import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod (modid = ModEntity.MODID, name = ModEntity.MODNAME, version = ModEntity.VERSION)
@NetworkMod (clientSideRequired = true, serverSideRequired = true, versionBounds = ModEntity.VERSION)

public class ModEntity {

	public static final String
	MODID = "mod_entity",
	MODNAME = "Mod Entity",
	VERSION = "0.1"
	;

	@Mod.Instance(ModEntity.MODID) public static ModEntity instance;

	@SidedProxy(clientSide = "timaxa007.entity.ProxyClient", serverSide = "timaxa007.entity.ProxyServer")
	public static ProxyCommon proxy;

	public static Item item_tse;
	public static int item_tse_id;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();

		item_tse_id = config.getItem("item_tse", 6000).getInt();

		config.save();

		proxy.preInit();

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

		item_tse = new ItemSpawn(item_tse_id);

		EntityRegistry.registerModEntity(EntityBetterPig.class, "EntityBetterPig", 0, instance, 20, 1, true);

		proxy.init();

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

		proxy.postInit();

	}

}
