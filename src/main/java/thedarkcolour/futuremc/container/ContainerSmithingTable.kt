package thedarkcolour.futuremc.container

import net.minecraft.client.gui.inventory.GuiContainer
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.entity.player.InventoryPlayer
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import thedarkcolour.core.gui.ContainerBase
import thedarkcolour.futuremc.client.gui.GuiSmithingTable
import thedarkcolour.futuremc.registry.FBlocks

class ContainerSmithingTable(
    private val playerInv: InventoryPlayer,
    private val world: World,
    private val pos: BlockPos
) : ContainerBase() {
    override fun getGuiContainer(): GuiContainer {
        return GuiSmithingTable(ContainerSmithingTable(playerInv, world, pos))
    }

    override fun canInteractWith(playerIn: EntityPlayer): Boolean {
        return isBlockInRange(FBlocks.SMITHING_TABLE, world, pos, playerIn)
    }
}