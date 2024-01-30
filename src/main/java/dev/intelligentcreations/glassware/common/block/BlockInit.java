package dev.intelligentcreations.glassware.common.block;

import dev.intelligentcreations.glassware.common.block.base.GlassSlabBlock;
import dev.intelligentcreations.glassware.common.block.base.GlassStairBlock;
import dev.intelligentcreations.glassware.common.block.base.StainedGlassSlabBlock;
import dev.intelligentcreations.glassware.common.block.base.StainedGlassStairsBlock;
import dev.intelligentcreations.glassware.common.creativeTab.GroupInit;
import dev.intelligentcreations.glassware.common.util.RegistryHandler;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("DuplicatedCode")
public class BlockInit {
    //names
    public static final String SST = "_stained_glass_stairs";
    public static final String SSL = "_stained_glass_slab";
    public static final String WHITE = "white";
    public static final String ORANGE = "orange";
    public static final String MAGENTA = "magenta";
    public static final String L_BLUE = "light_blue";
    public static final String YELLOW = "yellow";
    public static final String LIME = "lime";
    public static final String PINK = "pink";
    public static final String GRAY = "gray";
    public static final String L_GRAY = "light_gray";
    public static final String CYAN = "cyan";
    public static final String PURPLE = "purple";
    public static final String BLUE = "blue";
    public static final String BROWN = "brown";
    public static final String GREEN = "green";
    public static final String RED = "red";
    public static final String BLACK = "black";

    //blocks
    public static RegistryObject<Block> GLASS_SLAB;
    public static RegistryObject<Block> GLASS_STAIRS;

    //slabs
    public static RegistryObject<Block> WHITE_STAINED_GLASS_SLAB;
    public static RegistryObject<Block> ORANGE_STAINED_GLASS_SLAB;
    public static RegistryObject<Block> MAGENTA_STAINED_GLASS_SLAB;
    public static RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_SLAB;
    public static RegistryObject<Block> YELLOW_STAINED_GLASS_SLAB;
    public static RegistryObject<Block> LIME_STAINED_GLASS_SLAB;
    public static RegistryObject<Block> PINK_STAINED_GLASS_SLAB;
    public static RegistryObject<Block> GRAY_STAINED_GLASS_SLAB;
    public static RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_SLAB;
    public static RegistryObject<Block> CYAN_STAINED_GLASS_SLAB;
    public static RegistryObject<Block> PURPLE_STAINED_GLASS_SLAB;
    public static RegistryObject<Block> BLUE_STAINED_GLASS_SLAB;
    public static RegistryObject<Block> BROWN_STAINED_GLASS_SLAB;
    public static RegistryObject<Block> GREEN_STAINED_GLASS_SLAB;
    public static RegistryObject<Block> RED_STAINED_GLASS_SLAB;
    public static RegistryObject<Block> BLACK_STAINED_GLASS_SLAB;

    //stairs
    public static RegistryObject<Block> WHITE_STAINED_GLASS_STAIRS;
    public static RegistryObject<Block> ORANGE_STAINED_GLASS_STAIRS;
    public static RegistryObject<Block> MAGENTA_STAINED_GLASS_STAIRS;
    public static RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_STAIRS;
    public static RegistryObject<Block> YELLOW_STAINED_GLASS_STAIRS;
    public static RegistryObject<Block> LIME_STAINED_GLASS_STAIRS;
    public static RegistryObject<Block> PINK_STAINED_GLASS_STAIRS;
    public static RegistryObject<Block> GRAY_STAINED_GLASS_STAIRS;
    public static RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_STAIRS;
    public static RegistryObject<Block> CYAN_STAINED_GLASS_STAIRS;
    public static RegistryObject<Block> PURPLE_STAINED_GLASS_STAIRS;
    public static RegistryObject<Block> BLUE_STAINED_GLASS_STAIRS;
    public static RegistryObject<Block> BROWN_STAINED_GLASS_STAIRS;
    public static RegistryObject<Block> GREEN_STAINED_GLASS_STAIRS;
    public static RegistryObject<Block> RED_STAINED_GLASS_STAIRS;
    public static RegistryObject<Block> BLACK_STAINED_GLASS_STAIRS;


    //blocks
    public static void register() {
        GLASS_SLAB = RegistryHandler.BLOCKS.register("glass_slab", GlassSlabBlock::new);
        GLASS_STAIRS = RegistryHandler.BLOCKS.register("glass_stairs", GlassStairBlock::new);

        WHITE_STAINED_GLASS_SLAB = initStainedGlassBlock(WHITE, DyeColor.WHITE, false);
        ORANGE_STAINED_GLASS_SLAB = initStainedGlassBlock(ORANGE, DyeColor.ORANGE, false);
        MAGENTA_STAINED_GLASS_SLAB = initStainedGlassBlock(MAGENTA, DyeColor.MAGENTA, false);
        LIGHT_BLUE_STAINED_GLASS_SLAB = initStainedGlassBlock(L_BLUE, DyeColor.LIGHT_BLUE, false);
        YELLOW_STAINED_GLASS_SLAB = initStainedGlassBlock(YELLOW, DyeColor.YELLOW, false);
        LIME_STAINED_GLASS_SLAB = initStainedGlassBlock(LIME, DyeColor.LIME, false);
        PINK_STAINED_GLASS_SLAB = initStainedGlassBlock(PINK, DyeColor.PINK, false);
        GRAY_STAINED_GLASS_SLAB = initStainedGlassBlock(GRAY, DyeColor.GRAY, false);
        LIGHT_GRAY_STAINED_GLASS_SLAB = initStainedGlassBlock(L_GRAY, DyeColor.LIGHT_GRAY, false);
        CYAN_STAINED_GLASS_SLAB = initStainedGlassBlock(CYAN, DyeColor.CYAN, false);
        PURPLE_STAINED_GLASS_SLAB = initStainedGlassBlock(PURPLE, DyeColor.PURPLE, false);
        BLUE_STAINED_GLASS_SLAB = initStainedGlassBlock(BLUE, DyeColor.BLUE, false);
        BROWN_STAINED_GLASS_SLAB = initStainedGlassBlock(BROWN, DyeColor.BROWN, false);
        GREEN_STAINED_GLASS_SLAB = initStainedGlassBlock(GREEN, DyeColor.GREEN, false);
        RED_STAINED_GLASS_SLAB = initStainedGlassBlock(RED, DyeColor.RED, false);
        BLACK_STAINED_GLASS_SLAB = initStainedGlassBlock(BLACK, DyeColor.BLACK, false);

        WHITE_STAINED_GLASS_STAIRS = initStainedGlassBlock(WHITE, DyeColor.WHITE, true);
        ORANGE_STAINED_GLASS_STAIRS = initStainedGlassBlock(ORANGE, DyeColor.ORANGE, true);
        MAGENTA_STAINED_GLASS_STAIRS = initStainedGlassBlock(MAGENTA, DyeColor.MAGENTA, true);
        LIGHT_BLUE_STAINED_GLASS_STAIRS = initStainedGlassBlock(L_BLUE, DyeColor.LIGHT_BLUE, true);
        YELLOW_STAINED_GLASS_STAIRS = initStainedGlassBlock(YELLOW, DyeColor.YELLOW, true);
        LIME_STAINED_GLASS_STAIRS = initStainedGlassBlock(LIME, DyeColor.LIME, true);
        PINK_STAINED_GLASS_STAIRS = initStainedGlassBlock(PINK, DyeColor.PINK, true);
        GRAY_STAINED_GLASS_STAIRS = initStainedGlassBlock(GRAY, DyeColor.GRAY, true);
        LIGHT_GRAY_STAINED_GLASS_STAIRS = initStainedGlassBlock(L_GRAY, DyeColor.LIGHT_GRAY, true);
        CYAN_STAINED_GLASS_STAIRS = initStainedGlassBlock(CYAN, DyeColor.CYAN, true);
        PURPLE_STAINED_GLASS_STAIRS = initStainedGlassBlock(PURPLE, DyeColor.PURPLE, true);
        BLUE_STAINED_GLASS_STAIRS = initStainedGlassBlock(BLUE, DyeColor.BLUE, true);
        BROWN_STAINED_GLASS_STAIRS = initStainedGlassBlock(BROWN, DyeColor.BROWN, true);
        GREEN_STAINED_GLASS_STAIRS = initStainedGlassBlock(GREEN, DyeColor.GREEN, true);
        RED_STAINED_GLASS_STAIRS = initStainedGlassBlock(RED, DyeColor.RED, true);
        BLACK_STAINED_GLASS_STAIRS = initStainedGlassBlock(BLACK, DyeColor.BLACK, true);


        RegistryHandler.ITEMS.register("glass_slab", () -> new BlockItem(GLASS_SLAB.get(), new Item.Properties().tab(GroupInit.glasswareMain)));
        initBlockItem(WHITE, WHITE_STAINED_GLASS_SLAB, false);
        initBlockItem(ORANGE, ORANGE_STAINED_GLASS_SLAB, false);
        initBlockItem(MAGENTA, MAGENTA_STAINED_GLASS_SLAB, false);
        initBlockItem(L_BLUE, LIGHT_BLUE_STAINED_GLASS_SLAB, false);
        initBlockItem(YELLOW, YELLOW_STAINED_GLASS_SLAB, false);
        initBlockItem(LIME, LIME_STAINED_GLASS_SLAB, false);
        initBlockItem(PINK, PINK_STAINED_GLASS_SLAB, false);
        initBlockItem(GRAY, GRAY_STAINED_GLASS_SLAB, false);
        initBlockItem(L_GRAY, LIGHT_GRAY_STAINED_GLASS_SLAB, false);
        initBlockItem(CYAN, CYAN_STAINED_GLASS_SLAB, false);
        initBlockItem(PURPLE, PURPLE_STAINED_GLASS_SLAB, false);
        initBlockItem(BLUE, BLUE_STAINED_GLASS_SLAB, false);
        initBlockItem(BROWN, BROWN_STAINED_GLASS_SLAB, false);
        initBlockItem(GREEN, GREEN_STAINED_GLASS_SLAB, false);
        initBlockItem(RED, RED_STAINED_GLASS_SLAB, false);
        initBlockItem(BLACK, BLACK_STAINED_GLASS_SLAB, false);

        RegistryHandler.ITEMS.register("glass_stairs", () -> new BlockItem(GLASS_STAIRS.get(), new Item.Properties().tab(GroupInit.glasswareMain)));
        initBlockItem(WHITE, WHITE_STAINED_GLASS_STAIRS, true);
        initBlockItem(ORANGE, ORANGE_STAINED_GLASS_STAIRS, true);
        initBlockItem(MAGENTA, MAGENTA_STAINED_GLASS_STAIRS, true);
        initBlockItem(L_BLUE, LIGHT_BLUE_STAINED_GLASS_STAIRS, true);
        initBlockItem(YELLOW, YELLOW_STAINED_GLASS_STAIRS, true);
        initBlockItem(LIME, LIME_STAINED_GLASS_STAIRS, true);
        initBlockItem(PINK, PINK_STAINED_GLASS_STAIRS, true);
        initBlockItem(GRAY, GRAY_STAINED_GLASS_STAIRS, true);
        initBlockItem(L_GRAY, LIGHT_GRAY_STAINED_GLASS_STAIRS, true);
        initBlockItem(CYAN, CYAN_STAINED_GLASS_STAIRS, true);
        initBlockItem(PURPLE, PURPLE_STAINED_GLASS_STAIRS, true);
        initBlockItem(BLUE, BLUE_STAINED_GLASS_STAIRS, true);
        initBlockItem(BROWN, BROWN_STAINED_GLASS_STAIRS, true);
        initBlockItem(GREEN, GREEN_STAINED_GLASS_STAIRS, true);
        initBlockItem(RED, RED_STAINED_GLASS_STAIRS, true);
        initBlockItem(BLACK, BLACK_STAINED_GLASS_STAIRS, true);
    }

    public static RegistryObject<Block> initStainedGlassBlock(String color, DyeColor dyeColor, boolean isStairs) {
        if (isStairs) {
            return RegistryHandler.BLOCKS.register(color + SST, () -> new StainedGlassStairsBlock(dyeColor));
        } else {
            return RegistryHandler.BLOCKS.register(color + SSL, () -> new StainedGlassSlabBlock(dyeColor));
        }
    }

    public static void initBlockItem(String color, RegistryObject<Block> block, boolean isStairs) {
        String blockType = isStairs ? SST : SSL;
        RegistryHandler.ITEMS.register(color + blockType, () -> new BlockItem(block.get(), new Item.Properties().tab(GroupInit.glasswareMain)));
    }
}