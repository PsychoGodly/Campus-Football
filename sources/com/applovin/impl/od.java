package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.m2;
import com.applovin.mediation.MaxReward;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class od implements m2 {

    /* renamed from: g  reason: collision with root package name */
    public static final od f10102g = new c().a();

    /* renamed from: h  reason: collision with root package name */
    public static final m2.a f10103h = i00.f8402a;

    /* renamed from: a  reason: collision with root package name */
    public final String f10104a;

    /* renamed from: b  reason: collision with root package name */
    public final g f10105b;

    /* renamed from: c  reason: collision with root package name */
    public final f f10106c;

    /* renamed from: d  reason: collision with root package name */
    public final qd f10107d;

    /* renamed from: f  reason: collision with root package name */
    public final d f10108f;

    public static final class b {
    }

    public static final class d implements m2 {

        /* renamed from: g  reason: collision with root package name */
        public static final m2.a f10124g = j00.f8634a;

        /* renamed from: a  reason: collision with root package name */
        public final long f10125a;

        /* renamed from: b  reason: collision with root package name */
        public final long f10126b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f10127c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f10128d;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f10129f;

        private d(long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f10125a = j10;
            this.f10126b = j11;
            this.f10127c = z10;
            this.f10128d = z11;
            this.f10129f = z12;
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f10125a == dVar.f10125a && this.f10126b == dVar.f10126b && this.f10127c == dVar.f10127c && this.f10128d == dVar.f10128d && this.f10129f == dVar.f10129f) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f10125a;
            long j11 = this.f10126b;
            return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f10127c ? 1 : 0)) * 31) + (this.f10128d ? 1 : 0)) * 31) + (this.f10129f ? 1 : 0);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ d a(Bundle bundle) {
            return new d(bundle.getLong(a(0), 0), bundle.getLong(a(1), Long.MIN_VALUE), bundle.getBoolean(a(2), false), bundle.getBoolean(a(3), false), bundle.getBoolean(a(4), false));
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f10130a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f10131b;

        /* renamed from: c  reason: collision with root package name */
        public final cb f10132c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f10133d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f10134e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f10135f;

        /* renamed from: g  reason: collision with root package name */
        public final ab f10136g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public final byte[] f10137h;

        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public UUID f10138a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public Uri f10139b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public cb f10140c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public boolean f10141d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public boolean f10142e;
            /* access modifiers changed from: private */

            /* renamed from: f  reason: collision with root package name */
            public boolean f10143f;
            /* access modifiers changed from: private */

            /* renamed from: g  reason: collision with root package name */
            public ab f10144g;
            /* access modifiers changed from: private */

            /* renamed from: h  reason: collision with root package name */
            public byte[] f10145h;

            private a() {
                this.f10140c = cb.h();
                this.f10144g = ab.h();
            }

            public e a() {
                return new e(this);
            }

            private a(e eVar) {
                this.f10138a = eVar.f10130a;
                this.f10139b = eVar.f10131b;
                this.f10140c = eVar.f10132c;
                this.f10141d = eVar.f10133d;
                this.f10142e = eVar.f10134e;
                this.f10143f = eVar.f10135f;
                this.f10144g = eVar.f10136g;
                this.f10145h = eVar.f10137h;
            }
        }

        private e(a aVar) {
            a1.b(!aVar.f10143f || aVar.f10139b != null);
            this.f10130a = (UUID) a1.a((Object) aVar.f10138a);
            this.f10131b = aVar.f10139b;
            this.f10132c = aVar.f10140c;
            this.f10133d = aVar.f10141d;
            this.f10135f = aVar.f10143f;
            this.f10134e = aVar.f10142e;
            this.f10136g = aVar.f10144g;
            this.f10137h = aVar.f10145h != null ? Arrays.copyOf(aVar.f10145h, aVar.f10145h.length) : null;
        }

        public byte[] b() {
            byte[] bArr = this.f10137h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!this.f10130a.equals(eVar.f10130a) || !yp.a((Object) this.f10131b, (Object) eVar.f10131b) || !yp.a((Object) this.f10132c, (Object) eVar.f10132c) || this.f10133d != eVar.f10133d || this.f10135f != eVar.f10135f || this.f10134e != eVar.f10134e || !this.f10136g.equals(eVar.f10136g) || !Arrays.equals(this.f10137h, eVar.f10137h)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f10130a.hashCode() * 31;
            Uri uri = this.f10131b;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f10132c.hashCode()) * 31) + (this.f10133d ? 1 : 0)) * 31) + (this.f10135f ? 1 : 0)) * 31) + (this.f10134e ? 1 : 0)) * 31) + this.f10136g.hashCode()) * 31) + Arrays.hashCode(this.f10137h);
        }

        public a a() {
            return new a();
        }
    }

    public static final class f implements m2 {

        /* renamed from: g  reason: collision with root package name */
        public static final f f10146g = new a().a();

        /* renamed from: h  reason: collision with root package name */
        public static final m2.a f10147h = k00.f8850a;

        /* renamed from: a  reason: collision with root package name */
        public final long f10148a;

        /* renamed from: b  reason: collision with root package name */
        public final long f10149b;

        /* renamed from: c  reason: collision with root package name */
        public final long f10150c;

        /* renamed from: d  reason: collision with root package name */
        public final float f10151d;

        /* renamed from: f  reason: collision with root package name */
        public final float f10152f;

        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public long f10153a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public long f10154b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public long f10155c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public float f10156d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public float f10157e;

            public a() {
                this.f10153a = -9223372036854775807L;
                this.f10154b = -9223372036854775807L;
                this.f10155c = -9223372036854775807L;
                this.f10156d = -3.4028235E38f;
                this.f10157e = -3.4028235E38f;
            }

            public f a() {
                return new f(this);
            }

            private a(f fVar) {
                this.f10153a = fVar.f10148a;
                this.f10154b = fVar.f10149b;
                this.f10155c = fVar.f10150c;
                this.f10156d = fVar.f10151d;
                this.f10157e = fVar.f10152f;
            }
        }

        public f(long j10, long j11, long j12, float f10, float f11) {
            this.f10148a = j10;
            this.f10149b = j11;
            this.f10150c = j12;
            this.f10151d = f10;
            this.f10152f = f11;
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f10148a == fVar.f10148a && this.f10149b == fVar.f10149b && this.f10150c == fVar.f10150c && this.f10151d == fVar.f10151d && this.f10152f == fVar.f10152f) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f10148a;
            long j11 = this.f10149b;
            long j12 = this.f10150c;
            int i10 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            float f10 = this.f10151d;
            int i11 = 0;
            int floatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f10152f;
            if (f11 != 0.0f) {
                i11 = Float.floatToIntBits(f11);
            }
            return floatToIntBits + i11;
        }

        public a a() {
            return new a();
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ f a(Bundle bundle) {
            return new f(bundle.getLong(a(0), -9223372036854775807L), bundle.getLong(a(1), -9223372036854775807L), bundle.getLong(a(2), -9223372036854775807L), bundle.getFloat(a(3), -3.4028235E38f), bundle.getFloat(a(4), -3.4028235E38f));
        }

        private f(a aVar) {
            this(aVar.f10153a, aVar.f10154b, aVar.f10155c, aVar.f10156d, aVar.f10157e);
        }
    }

    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f10158a;

        /* renamed from: b  reason: collision with root package name */
        public final String f10159b;

        /* renamed from: c  reason: collision with root package name */
        public final e f10160c;

        /* renamed from: d  reason: collision with root package name */
        public final List f10161d;

        /* renamed from: e  reason: collision with root package name */
        public final String f10162e;

        /* renamed from: f  reason: collision with root package name */
        public final List f10163f;

        /* renamed from: g  reason: collision with root package name */
        public final Object f10164g;

        private g(Uri uri, String str, e eVar, b bVar, List list, String str2, List list2, Object obj) {
            this.f10158a = uri;
            this.f10159b = str;
            this.f10160c = eVar;
            this.f10161d = list;
            this.f10162e = str2;
            this.f10163f = list2;
            this.f10164g = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (!this.f10158a.equals(gVar.f10158a) || !yp.a((Object) this.f10159b, (Object) gVar.f10159b) || !yp.a((Object) this.f10160c, (Object) gVar.f10160c) || !yp.a((Object) null, (Object) null) || !this.f10161d.equals(gVar.f10161d) || !yp.a((Object) this.f10162e, (Object) gVar.f10162e) || !this.f10163f.equals(gVar.f10163f) || !yp.a(this.f10164g, gVar.f10164g)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f10158a.hashCode() * 31;
            String str = this.f10159b;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            e eVar = this.f10160c;
            int hashCode3 = (((hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 961) + this.f10161d.hashCode()) * 31;
            String str2 = this.f10162e;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f10163f.hashCode()) * 31;
            Object obj = this.f10164g;
            if (obj != null) {
                i10 = obj.hashCode();
            }
            return hashCode4 + i10;
        }
    }

    private od(String str, d dVar, g gVar, f fVar, qd qdVar) {
        this.f10104a = str;
        this.f10105b = gVar;
        this.f10106c = fVar;
        this.f10107d = qdVar;
        this.f10108f = dVar;
    }

    /* access modifiers changed from: private */
    public static od a(Bundle bundle) {
        f fVar;
        qd qdVar;
        d dVar;
        Bundle bundle2 = bundle;
        String str = (String) a1.a((Object) bundle2.getString(a(0), MaxReward.DEFAULT_LABEL));
        Bundle bundle3 = bundle2.getBundle(a(1));
        if (bundle3 == null) {
            fVar = f.f10146g;
        } else {
            fVar = (f) f.f10147h.a(bundle3);
        }
        f fVar2 = fVar;
        Bundle bundle4 = bundle2.getBundle(a(2));
        if (bundle4 == null) {
            qdVar = qd.H;
        } else {
            qdVar = (qd) qd.I.a(bundle4);
        }
        qd qdVar2 = qdVar;
        Bundle bundle5 = bundle2.getBundle(a(3));
        if (bundle5 == null) {
            dVar = new d(0, Long.MIN_VALUE, false, false, false);
        } else {
            dVar = (d) d.f10124g.a(bundle5);
        }
        return new od(str, dVar, (g) null, fVar2, qdVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od)) {
            return false;
        }
        od odVar = (od) obj;
        if (!yp.a((Object) this.f10104a, (Object) odVar.f10104a) || !this.f10108f.equals(odVar.f10108f) || !yp.a((Object) this.f10105b, (Object) odVar.f10105b) || !yp.a((Object) this.f10106c, (Object) odVar.f10106c) || !yp.a((Object) this.f10107d, (Object) odVar.f10107d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f10104a.hashCode() * 31;
        g gVar = this.f10105b;
        return ((((((hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.f10106c.hashCode()) * 31) + this.f10108f.hashCode()) * 31) + this.f10107d.hashCode();
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private String f10109a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f10110b;

        /* renamed from: c  reason: collision with root package name */
        private String f10111c;

        /* renamed from: d  reason: collision with root package name */
        private long f10112d;

        /* renamed from: e  reason: collision with root package name */
        private long f10113e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f10114f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f10115g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f10116h;

        /* renamed from: i  reason: collision with root package name */
        private e.a f10117i;

        /* renamed from: j  reason: collision with root package name */
        private List f10118j;

        /* renamed from: k  reason: collision with root package name */
        private String f10119k;

        /* renamed from: l  reason: collision with root package name */
        private List f10120l;

        /* renamed from: m  reason: collision with root package name */
        private Object f10121m;

        /* renamed from: n  reason: collision with root package name */
        private qd f10122n;

        /* renamed from: o  reason: collision with root package name */
        private f.a f10123o;

        public c() {
            this.f10113e = Long.MIN_VALUE;
            this.f10117i = new e.a();
            this.f10118j = Collections.emptyList();
            this.f10120l = Collections.emptyList();
            this.f10123o = new f.a();
        }

        public od a() {
            g gVar;
            a1.b(this.f10117i.f10139b == null || this.f10117i.f10138a != null);
            Uri uri = this.f10110b;
            e eVar = null;
            if (uri != null) {
                String str = this.f10111c;
                if (this.f10117i.f10138a != null) {
                    eVar = this.f10117i.a();
                }
                gVar = new g(uri, str, eVar, (b) null, this.f10118j, this.f10119k, this.f10120l, this.f10121m);
            } else {
                gVar = null;
            }
            String str2 = this.f10109a;
            if (str2 == null) {
                str2 = MaxReward.DEFAULT_LABEL;
            }
            String str3 = str2;
            d dVar = new d(this.f10112d, this.f10113e, this.f10114f, this.f10115g, this.f10116h);
            f a10 = this.f10123o.a();
            qd qdVar = this.f10122n;
            if (qdVar == null) {
                qdVar = qd.H;
            }
            return new od(str3, dVar, gVar, a10, qdVar);
        }

        public c b(String str) {
            this.f10109a = (String) a1.a((Object) str);
            return this;
        }

        private c(od odVar) {
            this();
            e.a aVar;
            d dVar = odVar.f10108f;
            this.f10113e = dVar.f10126b;
            this.f10114f = dVar.f10127c;
            this.f10115g = dVar.f10128d;
            this.f10112d = dVar.f10125a;
            this.f10116h = dVar.f10129f;
            this.f10109a = odVar.f10104a;
            this.f10122n = odVar.f10107d;
            this.f10123o = odVar.f10106c.a();
            g gVar = odVar.f10105b;
            if (gVar != null) {
                this.f10119k = gVar.f10162e;
                this.f10111c = gVar.f10159b;
                this.f10110b = gVar.f10158a;
                this.f10118j = gVar.f10161d;
                this.f10120l = gVar.f10163f;
                this.f10121m = gVar.f10164g;
                e eVar = gVar.f10160c;
                if (eVar != null) {
                    aVar = eVar.a();
                } else {
                    aVar = new e.a();
                }
                this.f10117i = aVar;
            }
        }

        public c a(String str) {
            this.f10119k = str;
            return this;
        }

        public c a(Object obj) {
            this.f10121m = obj;
            return this;
        }

        public c a(Uri uri) {
            this.f10110b = uri;
            return this;
        }
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public static od a(Uri uri) {
        return new c().a(uri).a();
    }

    public c a() {
        return new c();
    }
}
