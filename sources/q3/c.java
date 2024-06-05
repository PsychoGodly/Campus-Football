package q3;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import k4.n0;
import n2.h;

/* compiled from: AdPlaybackState */
public final class c implements h {

    /* renamed from: h  reason: collision with root package name */
    public static final c f21784h = new c((Object) null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: i  reason: collision with root package name */
    private static final a f21785i = new a(0).i(0);

    /* renamed from: j  reason: collision with root package name */
    private static final String f21786j = n0.r0(1);

    /* renamed from: k  reason: collision with root package name */
    private static final String f21787k = n0.r0(2);

    /* renamed from: l  reason: collision with root package name */
    private static final String f21788l = n0.r0(3);

    /* renamed from: m  reason: collision with root package name */
    private static final String f21789m = n0.r0(4);

    /* renamed from: n  reason: collision with root package name */
    public static final h.a<c> f21790n = a.f37474a;

    /* renamed from: a  reason: collision with root package name */
    public final Object f21791a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21792b;

    /* renamed from: c  reason: collision with root package name */
    public final long f21793c;

    /* renamed from: d  reason: collision with root package name */
    public final long f21794d;

    /* renamed from: f  reason: collision with root package name */
    public final int f21795f;

    /* renamed from: g  reason: collision with root package name */
    private final a[] f21796g;

    /* compiled from: AdPlaybackState */
    public static final class a implements h {

        /* renamed from: j  reason: collision with root package name */
        private static final String f21797j = n0.r0(0);

        /* renamed from: k  reason: collision with root package name */
        private static final String f21798k = n0.r0(1);

        /* renamed from: l  reason: collision with root package name */
        private static final String f21799l = n0.r0(2);

        /* renamed from: m  reason: collision with root package name */
        private static final String f21800m = n0.r0(3);

        /* renamed from: n  reason: collision with root package name */
        private static final String f21801n = n0.r0(4);

        /* renamed from: o  reason: collision with root package name */
        private static final String f21802o = n0.r0(5);

        /* renamed from: p  reason: collision with root package name */
        private static final String f21803p = n0.r0(6);

        /* renamed from: q  reason: collision with root package name */
        private static final String f21804q = n0.r0(7);

        /* renamed from: r  reason: collision with root package name */
        public static final h.a<a> f21805r = b.f37475a;

        /* renamed from: a  reason: collision with root package name */
        public final long f21806a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21807b;

        /* renamed from: c  reason: collision with root package name */
        public final int f21808c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri[] f21809d;

        /* renamed from: f  reason: collision with root package name */
        public final int[] f21810f;

        /* renamed from: g  reason: collision with root package name */
        public final long[] f21811g;

        /* renamed from: h  reason: collision with root package name */
        public final long f21812h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f21813i;

        public a(long j10) {
            this(j10, -1, -1, new int[0], new Uri[0], new long[0], 0, false);
        }

        private static long[] b(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        private static int[] c(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* access modifiers changed from: private */
        public static a d(Bundle bundle) {
            Uri[] uriArr;
            long j10 = bundle.getLong(f21797j);
            int i10 = bundle.getInt(f21798k);
            int i11 = bundle.getInt(f21804q);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f21799l);
            int[] intArray = bundle.getIntArray(f21800m);
            long[] longArray = bundle.getLongArray(f21801n);
            long j11 = bundle.getLong(f21802o);
            boolean z10 = bundle.getBoolean(f21803p);
            if (intArray == null) {
                intArray = new int[0];
            }
            int[] iArr = intArray;
            if (parcelableArrayList == null) {
                uriArr = new Uri[0];
            } else {
                uriArr = (Uri[]) parcelableArrayList.toArray(new Uri[0]);
            }
            return new a(j10, i10, i11, iArr, uriArr, longArray == null ? new long[0] : longArray, j11, z10);
        }

        public int e() {
            return f(-1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f21806a == aVar.f21806a && this.f21807b == aVar.f21807b && this.f21808c == aVar.f21808c && Arrays.equals(this.f21809d, aVar.f21809d) && Arrays.equals(this.f21810f, aVar.f21810f) && Arrays.equals(this.f21811g, aVar.f21811g) && this.f21812h == aVar.f21812h && this.f21813i == aVar.f21813i) {
                return true;
            }
            return false;
        }

        public int f(int i10) {
            int i11 = i10 + 1;
            while (true) {
                int[] iArr = this.f21810f;
                if (i11 >= iArr.length || this.f21813i || iArr[i11] == 0 || iArr[i11] == 1) {
                    return i11;
                }
                i11++;
            }
            return i11;
        }

        public boolean g() {
            if (this.f21807b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f21807b; i10++) {
                int[] iArr = this.f21810f;
                if (iArr[i10] == 0 || iArr[i10] == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean h() {
            return this.f21807b == -1 || e() < this.f21807b;
        }

        public int hashCode() {
            long j10 = this.f21806a;
            long j11 = this.f21812h;
            return (((((((((((((this.f21807b * 31) + this.f21808c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f21809d)) * 31) + Arrays.hashCode(this.f21810f)) * 31) + Arrays.hashCode(this.f21811g)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f21813i ? 1 : 0);
        }

        public a i(int i10) {
            int[] c10 = c(this.f21810f, i10);
            long[] b10 = b(this.f21811g, i10);
            return new a(this.f21806a, i10, this.f21808c, c10, (Uri[]) Arrays.copyOf(this.f21809d, i10), b10, this.f21812h, this.f21813i);
        }

        private a(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            k4.a.a(iArr.length == uriArr.length);
            this.f21806a = j10;
            this.f21807b = i10;
            this.f21808c = i11;
            this.f21810f = iArr;
            this.f21809d = uriArr;
            this.f21811g = jArr;
            this.f21812h = j11;
            this.f21813i = z10;
        }
    }

    private c(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f21791a = obj;
        this.f21793c = j10;
        this.f21794d = j11;
        this.f21792b = aVarArr.length + i10;
        this.f21796g = aVarArr;
        this.f21795f = i10;
    }

    /* access modifiers changed from: private */
    public static c b(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f21786j);
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                aVarArr2[i10] = a.f21805r.a((Bundle) parcelableArrayList.get(i10));
            }
            aVarArr = aVarArr2;
        }
        String str = f21787k;
        c cVar = f21784h;
        return new c((Object) null, aVarArr, bundle.getLong(str, cVar.f21793c), bundle.getLong(f21788l, cVar.f21794d), bundle.getInt(f21789m, cVar.f21795f));
    }

    private boolean f(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = c(i10).f21806a;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || j10 < j11 : j10 < j12;
    }

    public a c(int i10) {
        int i11 = this.f21795f;
        if (i10 < i11) {
            return f21785i;
        }
        return this.f21796g[i10 - i11];
    }

    public int d(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return -1;
        }
        int i10 = this.f21795f;
        while (i10 < this.f21792b && ((c(i10).f21806a != Long.MIN_VALUE && c(i10).f21806a <= j10) || !c(i10).h())) {
            i10++;
        }
        if (i10 < this.f21792b) {
            return i10;
        }
        return -1;
    }

    public int e(long j10, long j11) {
        int i10 = this.f21792b - 1;
        while (i10 >= 0 && f(j10, j11, i10)) {
            i10--;
        }
        if (i10 < 0 || !c(i10).g()) {
            return -1;
        }
        return i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (n0.c(this.f21791a, cVar.f21791a) && this.f21792b == cVar.f21792b && this.f21793c == cVar.f21793c && this.f21794d == cVar.f21794d && this.f21795f == cVar.f21795f && Arrays.equals(this.f21796g, cVar.f21796g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f21792b * 31;
        Object obj = this.f21791a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f21793c)) * 31) + ((int) this.f21794d)) * 31) + this.f21795f) * 31) + Arrays.hashCode(this.f21796g);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f21791a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f21793c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f21796g.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f21796g[i10].f21806a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f21796g[i10].f21810f.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f21796g[i10].f21810f[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f21796g[i10].f21811g[i11]);
                sb2.append(')');
                if (i11 < this.f21796g[i10].f21810f.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f21796g.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
