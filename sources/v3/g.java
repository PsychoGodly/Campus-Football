package v3;

import android.net.Uri;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import r2.m;
import s6.b0;
import s6.u;
import s6.v;

/* compiled from: HlsMediaPlaylist */
public final class g extends i {

    /* renamed from: d  reason: collision with root package name */
    public final int f23214d;

    /* renamed from: e  reason: collision with root package name */
    public final long f23215e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f23216f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f23217g;

    /* renamed from: h  reason: collision with root package name */
    public final long f23218h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f23219i;

    /* renamed from: j  reason: collision with root package name */
    public final int f23220j;

    /* renamed from: k  reason: collision with root package name */
    public final long f23221k;

    /* renamed from: l  reason: collision with root package name */
    public final int f23222l;

    /* renamed from: m  reason: collision with root package name */
    public final long f23223m;

    /* renamed from: n  reason: collision with root package name */
    public final long f23224n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f23225o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f23226p;

    /* renamed from: q  reason: collision with root package name */
    public final m f23227q;

    /* renamed from: r  reason: collision with root package name */
    public final List<d> f23228r;

    /* renamed from: s  reason: collision with root package name */
    public final List<b> f23229s;

    /* renamed from: t  reason: collision with root package name */
    public final Map<Uri, c> f23230t;

    /* renamed from: u  reason: collision with root package name */
    public final long f23231u;

    /* renamed from: v  reason: collision with root package name */
    public final f f23232v;

    /* compiled from: HlsMediaPlaylist */
    public static final class b extends e {

        /* renamed from: m  reason: collision with root package name */
        public final boolean f23233m;

        /* renamed from: n  reason: collision with root package name */
        public final boolean f23234n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, d dVar, long j10, int i10, long j11, m mVar, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, dVar, j10, i10, j11, mVar, str2, str3, j12, j13, z10);
            this.f23233m = z11;
            this.f23234n = z12;
        }

        public b c(long j10, int i10) {
            int i11 = i10;
            return new b(this.f23240a, this.f23241b, this.f23242c, i11, j10, this.f23245g, this.f23246h, this.f23247i, this.f23248j, this.f23249k, this.f23250l, this.f23233m, this.f23234n);
        }
    }

    /* compiled from: HlsMediaPlaylist */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f23235a;

        /* renamed from: b  reason: collision with root package name */
        public final long f23236b;

        /* renamed from: c  reason: collision with root package name */
        public final int f23237c;

        public c(Uri uri, long j10, int i10) {
            this.f23235a = uri;
            this.f23236b = j10;
            this.f23237c = i10;
        }
    }

    /* compiled from: HlsMediaPlaylist */
    public static class e implements Comparable<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final String f23240a;

        /* renamed from: b  reason: collision with root package name */
        public final d f23241b;

        /* renamed from: c  reason: collision with root package name */
        public final long f23242c;

        /* renamed from: d  reason: collision with root package name */
        public final int f23243d;

        /* renamed from: f  reason: collision with root package name */
        public final long f23244f;

        /* renamed from: g  reason: collision with root package name */
        public final m f23245g;

        /* renamed from: h  reason: collision with root package name */
        public final String f23246h;

        /* renamed from: i  reason: collision with root package name */
        public final String f23247i;

        /* renamed from: j  reason: collision with root package name */
        public final long f23248j;

        /* renamed from: k  reason: collision with root package name */
        public final long f23249k;

        /* renamed from: l  reason: collision with root package name */
        public final boolean f23250l;

        /* renamed from: a */
        public int compareTo(Long l10) {
            if (this.f23244f > l10.longValue()) {
                return 1;
            }
            return this.f23244f < l10.longValue() ? -1 : 0;
        }

        private e(String str, d dVar, long j10, int i10, long j11, m mVar, String str2, String str3, long j12, long j13, boolean z10) {
            this.f23240a = str;
            this.f23241b = dVar;
            this.f23242c = j10;
            this.f23243d = i10;
            this.f23244f = j11;
            this.f23245g = mVar;
            this.f23246h = str2;
            this.f23247i = str3;
            this.f23248j = j12;
            this.f23249k = j13;
            this.f23250l = z10;
        }
    }

    /* compiled from: HlsMediaPlaylist */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final long f23251a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f23252b;

        /* renamed from: c  reason: collision with root package name */
        public final long f23253c;

        /* renamed from: d  reason: collision with root package name */
        public final long f23254d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f23255e;

        public f(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f23251a = j10;
            this.f23252b = z10;
            this.f23253c = j11;
            this.f23254d = j12;
            this.f23255e = z11;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(int i10, String str, List<String> list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, m mVar, List<d> list2, List<b> list3, f fVar, Map<Uri, c> map) {
        super(str, list, z12);
        long j15 = j10;
        String str2 = str;
        List<String> list4 = list;
        this.f23214d = i10;
        this.f23218h = j11;
        this.f23217g = z10;
        this.f23219i = z11;
        this.f23220j = i11;
        this.f23221k = j12;
        this.f23222l = i12;
        this.f23223m = j13;
        this.f23224n = j14;
        this.f23225o = z13;
        this.f23226p = z14;
        this.f23227q = mVar;
        this.f23228r = u.u(list2);
        this.f23229s = u.u(list3);
        this.f23230t = v.d(map);
        if (!list3.isEmpty()) {
            b bVar = (b) b0.d(list3);
            this.f23231u = bVar.f23244f + bVar.f23242c;
        } else if (!list2.isEmpty()) {
            d dVar = (d) b0.d(list2);
            this.f23231u = dVar.f23244f + dVar.f23242c;
        } else {
            this.f23231u = 0;
        }
        long j16 = -9223372036854775807L;
        if (j15 != -9223372036854775807L) {
            if (j15 >= 0) {
                j16 = Math.min(this.f23231u, j10);
            } else {
                j16 = Math.max(0, this.f23231u + j15);
            }
        }
        this.f23215e = j16;
        this.f23216f = j15 >= 0;
        this.f23232v = fVar;
    }

    /* renamed from: b */
    public g a(List<o3.c> list) {
        return this;
    }

    public g c(long j10, int i10) {
        int i11 = this.f23214d;
        return new g(i11, this.f23277a, this.f23278b, this.f23215e, this.f23217g, j10, true, i10, this.f23221k, this.f23222l, this.f23223m, this.f23224n, this.f23279c, this.f23225o, this.f23226p, this.f23227q, this.f23228r, this.f23229s, this.f23232v, this.f23230t);
    }

    public g d() {
        if (this.f23225o) {
            return this;
        }
        g gVar = r2;
        g gVar2 = new g(this.f23214d, this.f23277a, this.f23278b, this.f23215e, this.f23217g, this.f23218h, this.f23219i, this.f23220j, this.f23221k, this.f23222l, this.f23223m, this.f23224n, this.f23279c, true, this.f23226p, this.f23227q, this.f23228r, this.f23229s, this.f23232v, this.f23230t);
        return gVar;
    }

    public long e() {
        return this.f23218h + this.f23231u;
    }

    public boolean f(g gVar) {
        if (gVar == null) {
            return true;
        }
        long j10 = this.f23221k;
        long j11 = gVar.f23221k;
        if (j10 > j11) {
            return true;
        }
        if (j10 < j11) {
            return false;
        }
        int size = this.f23228r.size() - gVar.f23228r.size();
        if (size == 0) {
            int size2 = this.f23229s.size();
            int size3 = gVar.f23229s.size();
            if (size2 > size3) {
                return true;
            }
            if (size2 != size3 || !this.f23225o || gVar.f23225o) {
                return false;
            }
            return true;
        } else if (size > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* compiled from: HlsMediaPlaylist */
    public static final class d extends e {

        /* renamed from: m  reason: collision with root package name */
        public final String f23238m;

        /* renamed from: n  reason: collision with root package name */
        public final List<b> f23239n;

        public d(String str, long j10, long j11, String str2, String str3) {
            this(str, (d) null, MaxReward.DEFAULT_LABEL, 0, -1, -9223372036854775807L, (m) null, str2, str3, j10, j11, false, u.y());
        }

        public d c(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.f23239n.size(); i11++) {
                b bVar = this.f23239n.get(i11);
                arrayList.add(bVar.c(j11, i10));
                j11 += bVar.f23242c;
            }
            int i12 = i10;
            return new d(this.f23240a, this.f23241b, this.f23238m, this.f23242c, i10, j10, this.f23245g, this.f23246h, this.f23247i, this.f23248j, this.f23249k, this.f23250l, arrayList);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, d dVar, String str2, long j10, int i10, long j11, m mVar, String str3, String str4, long j12, long j13, boolean z10, List<b> list) {
            super(str, dVar, j10, i10, j11, mVar, str3, str4, j12, j13, z10);
            this.f23238m = str2;
            this.f23239n = u.u(list);
        }
    }
}
