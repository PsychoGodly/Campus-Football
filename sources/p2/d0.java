package p2;

import java.math.RoundingMode;
import k4.n0;
import p2.c0;
import u6.b;
import v6.e;

/* compiled from: DefaultAudioTrackBufferSizeProvider */
public class d0 implements c0.e {

    /* renamed from: b  reason: collision with root package name */
    protected final int f21222b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f21223c;

    /* renamed from: d  reason: collision with root package name */
    protected final int f21224d;

    /* renamed from: e  reason: collision with root package name */
    protected final int f21225e;

    /* renamed from: f  reason: collision with root package name */
    protected final int f21226f;

    /* renamed from: g  reason: collision with root package name */
    public final int f21227g;

    /* compiled from: DefaultAudioTrackBufferSizeProvider */
    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f21228a = 250000;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f21229b = 750000;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f21230c = 4;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f21231d = 250000;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f21232e = 50000000;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f21233f = 2;

        public d0 g() {
            return new d0(this);
        }
    }

    protected d0(a aVar) {
        this.f21222b = aVar.f21228a;
        this.f21223c = aVar.f21229b;
        this.f21224d = aVar.f21230c;
        this.f21225e = aVar.f21231d;
        this.f21226f = aVar.f21232e;
        this.f21227g = aVar.f21233f;
    }

    protected static int b(int i10, int i11, int i12) {
        return e.d(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    protected static int d(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
            default:
                throw new IllegalArgumentException();
        }
    }

    public int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10) {
        return (((Math.max(i10, (int) (((double) c(i10, i11, i12, i13, i14, i15)) * d10)) + i13) - 1) / i13) * i13;
    }

    /* access modifiers changed from: protected */
    public int c(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 0) {
            return g(i10, i14, i13);
        }
        if (i12 == 1) {
            return e(i11);
        }
        if (i12 == 2) {
            return f(i11, i15);
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    public int e(int i10) {
        return e.d((((long) this.f21226f) * ((long) d(i10))) / 1000000);
    }

    /* access modifiers changed from: protected */
    public int f(int i10, int i11) {
        int i12;
        int i13 = this.f21225e;
        if (i10 == 5) {
            i13 *= this.f21227g;
        }
        if (i11 != -1) {
            i12 = b.a(i11, 8, RoundingMode.CEILING);
        } else {
            i12 = d(i10);
        }
        return e.d((((long) i13) * ((long) i12)) / 1000000);
    }

    /* access modifiers changed from: protected */
    public int g(int i10, int i11, int i12) {
        return n0.q(i10 * this.f21224d, b(this.f21222b, i11, i12), b(this.f21223c, i11, i12));
    }
}
