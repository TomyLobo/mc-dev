package net.minecraft.server;

final class DispenseBehaviorFireworks extends DispenseBehaviorItem {

    DispenseBehaviorFireworks() {}

    public ItemStack b(ISourceBlock isourceblock, ItemStack itemstack) {
        EnumFacing enumfacing = BlockDispenser.b(isourceblock.h());
        double d0 = isourceblock.getX() + (double) enumfacing.c();
        double d1 = (double) ((float) isourceblock.getBlockY() + 0.2F);
        double d2 = isourceblock.getZ() + (double) enumfacing.e();
        EntityFireworks entityfireworks = new EntityFireworks(isourceblock.k(), d0, d1, d2, itemstack);

        isourceblock.k().addEntity(entityfireworks);
        itemstack.a(1);
        return itemstack;
    }

    protected void a(ISourceBlock isourceblock) {
        isourceblock.k().triggerEffect(1002, isourceblock.getBlockX(), isourceblock.getBlockY(), isourceblock.getBlockZ(), 0);
    }
}
