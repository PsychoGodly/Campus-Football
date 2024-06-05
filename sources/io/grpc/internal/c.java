package io.grpc.internal;

/* compiled from: AbstractReadableBuffer */
public abstract class c implements v1 {
    public void c0() {
    }

    public void close() {
    }

    /* access modifiers changed from: protected */
    public final void h(int i10) {
        if (d() < i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean markSupported() {
        return false;
    }

    public final int readInt() {
        h(4);
        return (readUnsignedByte() << 24) | (readUnsignedByte() << 16) | (readUnsignedByte() << 8) | readUnsignedByte();
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }
}
