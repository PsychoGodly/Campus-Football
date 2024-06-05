package l4;

import android.os.Bundle;
import java.util.Arrays;
import k4.n0;
import n2.h;

/* compiled from: ColorInfo */
public final class c implements h {

    /* renamed from: g  reason: collision with root package name */
    public static final c f19899g = new c(1, 2, 3, (byte[]) null);

    /* renamed from: h  reason: collision with root package name */
    private static final String f19900h = n0.r0(0);

    /* renamed from: i  reason: collision with root package name */
    private static final String f19901i = n0.r0(1);

    /* renamed from: j  reason: collision with root package name */
    private static final String f19902j = n0.r0(2);

    /* renamed from: k  reason: collision with root package name */
    private static final String f19903k = n0.r0(3);

    /* renamed from: l  reason: collision with root package name */
    public static final h.a<c> f19904l = b.f36059a;

    /* renamed from: a  reason: collision with root package name */
    public final int f19905a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19906b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19907c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f19908d;

    /* renamed from: f  reason: collision with root package name */
    private int f19909f;

    public c(int i10, int i11, int i12, byte[] bArr) {
        this.f19905a = i10;
        this.f19906b = i11;
        this.f19907c = i12;
        this.f19908d = bArr;
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ c d(Bundle bundle) {
        return new c(bundle.getInt(f19900h, -1), bundle.getInt(f19901i, -1), bundle.getInt(f19902j, -1), bundle.getByteArray(f19903k));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f19905a == cVar.f19905a && this.f19906b == cVar.f19906b && this.f19907c == cVar.f19907c && Arrays.equals(this.f19908d, cVar.f19908d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f19909f == 0) {
            this.f19909f = ((((((527 + this.f19905a) * 31) + this.f19906b) * 31) + this.f19907c) * 31) + Arrays.hashCode(this.f19908d);
        }
        return this.f19909f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(this.f19905a);
        sb2.append(", ");
        sb2.append(this.f19906b);
        sb2.append(", ");
        sb2.append(this.f19907c);
        sb2.append(", ");
        sb2.append(this.f19908d != null);
        sb2.append(")");
        return sb2.toString();
    }
}
