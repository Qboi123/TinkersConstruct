package slimeknights.tconstruct.world.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import slimeknights.tconstruct.library.TinkerRegistry;

public class BlockCopperOre extends Block {
    public BlockCopperOre(Material materialIn) {
        super(materialIn);
        this.setCreativeTab(TinkerRegistry.tabWorld);
        this.setHardness(2.6f);
    }
}
