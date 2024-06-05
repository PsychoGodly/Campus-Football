package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.m2;
import java.util.ArrayList;
import java.util.Arrays;

public final class u implements m2 {

    /* renamed from: h  reason: collision with root package name */
    public static final u f12457h = new u((Object) null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: i  reason: collision with root package name */
    private static final a f12458i = new a(0).c(0);

    /* renamed from: j  reason: collision with root package name */
    public static final m2.a f12459j = v50.f12708a;

    /* renamed from: a  reason: collision with root package name */
    public final Object f12460a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12461b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12462c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12463d;

    /* renamed from: f  reason: collision with root package name */
    public final int f12464f;

    /* renamed from: g  reason: collision with root package name */
    private final a[] f12465g;

    public static final class a implements m2 {

        /* renamed from: i  reason: collision with root package name */
        public static final m2.a f12466i = w50.f13007a;

        /* renamed from: a  reason: collision with root package name */
        public final long f12467a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12468b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri[] f12469c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f12470d;

        /* renamed from: f  reason: collision with root package name */
        public final long[] f12471f;

        /* renamed from: g  reason: collision with root package name */
        public final long f12472g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f12473h;

        public a(long j10) {
            this(j10, -1, new int[0], new Uri[0], new long[0], 0, false);
        }

        private static long[] a(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        public boolean b() {
            if (this.f12468b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f12468b; i10++) {
                int i11 = this.f12470d[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean c() {
            return this.f12468b == -1 || a() < this.f12468b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f12467a == aVar.f12467a && this.f12468b == aVar.f12468b && Arrays.equals(this.f12469c, aVar.f12469c) && Arrays.equals(this.f12470d, aVar.f12470d) && Arrays.equals(this.f12471f, aVar.f12471f) && this.f12472g == aVar.f12472g && this.f12473h == aVar.f12473h) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f12467a;
            long j11 = this.f12472g;
            return (((((((((((this.f12468b * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f12469c)) * 31) + Arrays.hashCode(this.f12470d)) * 31) + Arrays.hashCode(this.f12471f)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f12473h ? 1 : 0);
        }

        private a(long j10, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            a1.a(iArr.length == uriArr.length);
            this.f12467a = j10;
            this.f12468b = i10;
            this.f12470d = iArr;
            this.f12469c = uriArr;
            this.f12471f = jArr;
            this.f12472g = j11;
            this.f12473h = z10;
        }

        public a c(int i10) {
            int[] a10 = a(this.f12470d, i10);
            long[] a11 = a(this.f12471f, i10);
            return new a(this.f12467a, i10, a10, (Uri[]) Arrays.copyOf(this.f12469c, i10), a11, this.f12472g, this.f12473h);
        }

        private static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        private static int[] a(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* access modifiers changed from: private */
        public static a a(Bundle bundle) {
            Uri[] uriArr;
            long j10 = bundle.getLong(b(0));
            int i10 = bundle.getInt(b(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(b(2));
            int[] intArray = bundle.getIntArray(b(3));
            long[] longArray = bundle.getLongArray(b(4));
            long j11 = bundle.getLong(b(5));
            boolean z10 = bundle.getBoolean(b(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            int[] iArr = intArray;
            if (parcelableArrayList == null) {
                uriArr = new Uri[0];
            } else {
                uriArr = (Uri[]) parcelableArrayList.toArray(new Uri[0]);
            }
            return new a(j10, i10, iArr, uriArr, longArray == null ? new long[0] : longArray, j11, z10);
        }

        public int a() {
            return a(-1);
        }

        public int a(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f12470d;
                if (i12 >= iArr.length || this.f12473h || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    return i12;
                }
                i12++;
            }
            return i12;
        }
    }

    private u(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f12460a = obj;
        this.f12462c = j10;
        this.f12463d = j11;
        this.f12461b = aVarArr.length + i10;
        this.f12465g = aVarArr;
        this.f12464f = i10;
    }

    /* access modifiers changed from: private */
    public static u a(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(b(1));
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                aVarArr2[i10] = (a) a.f12466i.a((Bundle) parcelableArrayList.get(i10));
            }
            aVarArr = aVarArr2;
        }
        return new u((Object) null, aVarArr, bundle.getLong(b(2), 0), bundle.getLong(b(3), -9223372036854775807L), bundle.getInt(b(4)));
    }

    public int b(long j10, long j11) {
        int i10 = this.f12461b - 1;
        while (i10 >= 0 && a(j10, j11, i10)) {
            i10--;
        }
        if (i10 < 0 || !a(i10).b()) {
            return -1;
        }
        return i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (yp.a(this.f12460a, uVar.f12460a) && this.f12461b == uVar.f12461b && this.f12462c == uVar.f12462c && this.f12463d == uVar.f12463d && this.f12464f == uVar.f12464f && Arrays.equals(this.f12465g, uVar.f12465g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f12461b * 31;
        Object obj = this.f12460a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f12462c)) * 31) + ((int) this.f12463d)) * 31) + this.f12464f) * 31) + Arrays.hashCode(this.f12465g);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f12460a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f12462c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f12465g.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f12465g[i10].f12467a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f12465g[i10].f12470d.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f12465g[i10].f12470d[i11];
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
                sb2.append(this.f12465g[i10].f12471f[i11]);
                sb2.append(')');
                if (i11 < this.f12465g[i10].f12470d.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f12465g.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public a a(int i10) {
        int i11 = this.f12464f;
        if (i10 < i11) {
            return f12458i;
        }
        return this.f12465g[i10 - i11];
    }

    public int a(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return -1;
        }
        int i10 = this.f12464f;
        while (i10 < this.f12461b && ((a(i10).f12467a != Long.MIN_VALUE && a(i10).f12467a <= j10) || !a(i10).c())) {
            i10++;
        }
        if (i10 < this.f12461b) {
            return i10;
        }
        return -1;
    }

    private boolean a(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = a(i10).f12467a;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || j10 < j11 : j10 < j12;
    }
}
