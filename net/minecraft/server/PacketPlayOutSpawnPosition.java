package net.minecraft.server;

public class PacketPlayOutSpawnPosition extends Packet {

    private int x;
    private int y;
    private int z;

    public PacketPlayOutSpawnPosition() {}

    public PacketPlayOutSpawnPosition(int i, int j, int k) {
        this.x = i;
        this.y = j;
        this.z = k;
    }

    public void a(PacketDataSerializer packetdataserializer) {
        this.x = packetdataserializer.readInt();
        this.y = packetdataserializer.readInt();
        this.z = packetdataserializer.readInt();
    }

    public void b(PacketDataSerializer packetdataserializer) {
        packetdataserializer.writeInt(this.x);
        packetdataserializer.writeInt(this.y);
        packetdataserializer.writeInt(this.z);
    }

    public void a(PacketPlayOutListener packetplayoutlistener) {
        packetplayoutlistener.a(this);
    }

    public boolean a() {
        return false;
    }

    public String b() {
        return String.format("x=%d, y=%d, z=%d", new Object[] { Integer.valueOf(this.x), Integer.valueOf(this.y), Integer.valueOf(this.z)});
    }
}
