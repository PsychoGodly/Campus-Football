package x7;

import android.util.Base64;
import com.google.protobuf.i;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: BloomFilter */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final int f31075a;

    /* renamed from: b  reason: collision with root package name */
    private final i f31076b;

    /* renamed from: c  reason: collision with root package name */
    private final int f31077c;

    /* renamed from: d  reason: collision with root package name */
    private final MessageDigest f31078d;

    /* compiled from: BloomFilter */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public m(i iVar, int i10, int i11) {
        if (i10 < 0 || i10 >= 8) {
            throw new IllegalArgumentException("Invalid padding: " + i10);
        } else if (i11 < 0) {
            throw new IllegalArgumentException("Invalid hash count: " + i11);
        } else if (iVar.size() > 0 && i11 == 0) {
            throw new IllegalArgumentException("Invalid hash count: " + i11);
        } else if (iVar.size() != 0 || i10 == 0) {
            this.f31076b = iVar;
            this.f31077c = i11;
            this.f31075a = (iVar.size() * 8) - i10;
            this.f31078d = b();
        } else {
            throw new IllegalArgumentException("Expected padding of 0 when bitmap length is 0, but got " + i10);
        }
    }

    public static m a(i iVar, int i10, int i11) throws a {
        if (i10 < 0 || i10 >= 8) {
            throw new a("Invalid padding: " + i10);
        } else if (i11 < 0) {
            throw new a("Invalid hash count: " + i11);
        } else if (iVar.size() > 0 && i11 == 0) {
            throw new a("Invalid hash count: " + i11);
        } else if (iVar.size() != 0 || i10 == 0) {
            return new m(iVar, i10, i11);
        } else {
            throw new a("Expected padding of 0 when bitmap length is 0, but got " + i10);
        }
    }

    private static MessageDigest b() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException("Missing MD5 MessageDigest provider: ", e10);
        }
    }

    private int d(long j10, long j11, int i10) {
        return (int) i(j10 + (j11 * ((long) i10)), (long) this.f31075a);
    }

    private static long e(byte[] bArr, int i10) {
        long j10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            j10 |= (((long) bArr[i10 + i11]) & 255) << (i11 * 8);
        }
        return j10;
    }

    private boolean f(int i10) {
        return ((1 << (i10 % 8)) & this.f31076b.f(i10 / 8)) != 0;
    }

    private byte[] g(String str) {
        return this.f31078d.digest(str.getBytes(StandardCharsets.UTF_8));
    }

    private static long i(long j10, long j11) {
        long j12 = j10 - ((((j10 >>> 1) / j11) << 1) * j11);
        if (j12 < j11) {
            j11 = 0;
        }
        return j12 - j11;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f31075a;
    }

    public boolean h(String str) {
        if (this.f31075a == 0) {
            return false;
        }
        byte[] g10 = g(str);
        if (g10.length == 16) {
            long e10 = e(g10, 0);
            long e11 = e(g10, 8);
            for (int i10 = 0; i10 < this.f31077c; i10++) {
                if (!f(d(e10, e11, i10))) {
                    return false;
                }
            }
            return true;
        }
        throw new RuntimeException("Invalid md5 hash array length: " + g10.length + " (expected 16)");
    }

    public String toString() {
        return "BloomFilter{hashCount=" + this.f31077c + ", size=" + this.f31075a + ", bitmap=\"" + Base64.encodeToString(this.f31076b.J(), 2) + "\"}";
    }
}
