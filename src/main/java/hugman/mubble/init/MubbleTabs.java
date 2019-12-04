package hugman.mubble.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MubbleTabs 
{
    public static final ItemGroup COSTUMES = new ItemGroup("costumes")
    {
    	@Override
    	public ItemStack createIcon()
    	{
    		return new ItemStack(MubbleCostumes.CAPPY);
    	}
    };
    
    public static final ItemGroup INSTRUMENTS = new ItemGroup("instruments")
    {
    	@Override
    	public ItemStack createIcon()
    	{
    		return new ItemStack(MubbleItems.JINGLE_BELLS);
    	}
    };
}