package r2;

import java.util.UUID;
import k4.n0;
import q2.b;

/* compiled from: FrameworkCryptoConfig */
public final class h0 implements b {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f22060d;

    /* renamed from: a  reason: collision with root package name */
    public final UUID f22061a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f22062b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f22063c;

    static {
        boolean z10;
        if ("Amazon".equals(n0.f19740c)) {
            String str = n0.f19741d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f22060d = z10;
            }
        }
        z10 = false;
        f22060d = z10;
    }

    public h0(UUID uuid, byte[] bArr, boolean z10) {
        this.f22061a = uuid;
        this.f22062b = bArr;
        this.f22063c = z10;
    }
}
