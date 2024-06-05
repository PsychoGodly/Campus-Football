package com.applovin.impl;

import java.nio.ByteBuffer;
import java.util.UUID;

public abstract class fi {

    private static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final UUID f7799a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final int f7800b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f7801c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f7799a = uuid;
            this.f7800b = i10;
            this.f7801c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return a(uuid, (UUID[]) null, bArr);
    }

    private static a b(byte[] bArr) {
        yg ygVar = new yg(bArr);
        if (ygVar.e() < 32) {
            return null;
        }
        ygVar.f(0);
        if (ygVar.j() != ygVar.a() + 4 || ygVar.j() != 1886614376) {
            return null;
        }
        int c10 = i1.c(ygVar.j());
        if (c10 > 1) {
            kc.d("PsshAtomUtil", "Unsupported pssh version: " + c10);
            return null;
        }
        UUID uuid = new UUID(ygVar.s(), ygVar.s());
        if (c10 == 1) {
            ygVar.g(ygVar.A() * 16);
        }
        int A = ygVar.A();
        if (A != ygVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[A];
        ygVar.a(bArr2, 0, A);
        return new a(uuid, c10, bArr2);
    }

    public static UUID c(byte[] bArr) {
        a b10 = b(bArr);
        if (b10 == null) {
            return null;
        }
        return b10.f7799a;
    }

    public static int d(byte[] bArr) {
        a b10 = b(bArr);
        if (b10 == null) {
            return -1;
        }
        return b10.f7800b;
    }

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || bArr.length == 0)) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean a(byte[] bArr) {
        return b(bArr) != null;
    }

    public static byte[] a(byte[] bArr, UUID uuid) {
        a b10 = b(bArr);
        if (b10 == null) {
            return null;
        }
        if (uuid.equals(b10.f7799a)) {
            return b10.f7801c;
        }
        kc.d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + b10.f7799a + ".");
        return null;
    }
}
