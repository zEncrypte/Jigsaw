package net.minecraft.network.datasync;

import java.io.IOException;

import net.minecraft.network.PacketBuffer;

public interface DataSerializer<T>
{
    void write(PacketBuffer buf, T value);

    T read(PacketBuffer buf) throws IOException;

    DataParameter<T> createKey(int id);

    T func_192717_a(T p_192717_1_);
}
