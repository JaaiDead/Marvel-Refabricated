package org.arcticquests.dev.world.inventory;

import com.terraformersmc.modmenu.ModMenu;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlag;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import org.arcticquests.dev.MarvelSuperHeroes;

public class MarvelMenuTypes {
    //TODO: Fix this stuff gosh is mod is hugeee after turn is a rabbit hole to be uncovered.
    public static final ScreenHandlerType<SuitUpgradingMenu> SUIT_UPGRADING = register("suit_upgrading", new ScreenHandlerType<>(SuitUpgradingMenu::new, FeatureFlags.VANILLA_FEATURES));
    public static final ScreenHandlerType<SuitVariantMenu> SUIT_VARIANT = register("suit_variant", new ScreenHandlerType<>(SuitVariantMenu::new, FeatureFlags.VANILLA_FEATURES));
    public static final ScreenHandlerType<SuitRepairingMenu> SUIT_REPAIRING = register("suit_repairing", new ScreenHandlerType<>(SuitRepairingMenu::new, FeatureFlags.VANILLA_FEATURES));
    public static final ScreenHandlerType<SuitChargerMenu> SUIT_CHARGER = register("suit_charger",new ScreenHandlerType<>(SuitChargerMenu::new, FeatureFlags.VANILLA_FEATURES));
    public static double targetMouseX = -1;
    public static double targetMouseY = -1;

    private static <T extends ScreenHandler> ScreenHandlerType<T> register(String id, ScreenHandlerType.Factory<T> factory, FeatureFlag... requiredFeatures) {
        return Registry.register(Registries.SCREEN_HANDLER, id, new ScreenHandlerType<>(factory, FeatureFlags.FEATURE_MANAGER.featureSetOf(requiredFeatures)));
    }

    public static void registerMarvelScreen() {
        MarvelSuperHeroes.LOGGER.info("Registering Marvel Screens for " + MarvelSuperHeroes.MOD_ID);
    }

   /*
    public static void register(IEventBus bus) {
        REGISTER.register(bus);
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerClient(RegisterMenuScreensEvent event) {
        event.register(SUIT_UPGRADING.get(), SuitUpgradingScreen::new);
        event.register(SUIT_VARIANT.get(), SuitVariantScreen::new);
        event.register(SUIT_REPAIRING.get(), SuitRepairingScreen::new);
        event.register(SUIT_CHARGER.get(), SuitChargerScreen::new);
    }*/ //TODO: Debug this neoforge code.
}
