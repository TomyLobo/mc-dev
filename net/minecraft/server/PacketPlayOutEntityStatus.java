package net.minecraft.server;

public class PacketPlayOutEntityStatus extends Packet {

    private int a;
    private byte b;

    public PacketPlayOutEntityStatus() {}

    public PacketPlayOutEntityStatus(Entity entity, byte b0) {
        this.a = entity.getId();
        this.b = b0;
    }

    public void a(PacketDataSerializer packetdataserializer) {
        this.a = packetdataserializer.readInt();
        this.b = packetdataserializer.readByte();
    }

    public void b(PacketDataSerializer packetdataserializer) {
        packetdataserializer.writeInt(this.a);
        packetdataserializer.writeByte(this.b);
    }

    public void a(PacketPlayOutListener packetplayoutlistener) {
        packetplayoutlistener.a(this);
    }
}
