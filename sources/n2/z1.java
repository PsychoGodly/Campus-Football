package n2;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.mediation.MaxReward;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k4.n0;
import n2.h;
import s6.u;
import s6.v;

/* compiled from: MediaItem */
public final class z1 implements h {

    /* renamed from: j  reason: collision with root package name */
    public static final z1 f20777j = new c().a();

    /* renamed from: k  reason: collision with root package name */
    private static final String f20778k = n0.r0(0);

    /* renamed from: l  reason: collision with root package name */
    private static final String f20779l = n0.r0(1);

    /* renamed from: m  reason: collision with root package name */
    private static final String f20780m = n0.r0(2);

    /* renamed from: n  reason: collision with root package name */
    private static final String f20781n = n0.r0(3);

    /* renamed from: o  reason: collision with root package name */
    private static final String f20782o = n0.r0(4);

    /* renamed from: p  reason: collision with root package name */
    public static final h.a<z1> f20783p = y1.f36480a;

    /* renamed from: a  reason: collision with root package name */
    public final String f20784a;

    /* renamed from: b  reason: collision with root package name */
    public final h f20785b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public final i f20786c;

    /* renamed from: d  reason: collision with root package name */
    public final g f20787d;

    /* renamed from: f  reason: collision with root package name */
    public final e2 f20788f;

    /* renamed from: g  reason: collision with root package name */
    public final d f20789g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public final e f20790h;

    /* renamed from: i  reason: collision with root package name */
    public final j f20791i;

    /* compiled from: MediaItem */
    public static final class b {
    }

    /* compiled from: MediaItem */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private String f20792a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f20793b;

        /* renamed from: c  reason: collision with root package name */
        private String f20794c;

        /* renamed from: d  reason: collision with root package name */
        private d.a f20795d;

        /* renamed from: e  reason: collision with root package name */
        private f.a f20796e;

        /* renamed from: f  reason: collision with root package name */
        private List<o3.c> f20797f;

        /* renamed from: g  reason: collision with root package name */
        private String f20798g;

        /* renamed from: h  reason: collision with root package name */
        private u<l> f20799h;

        /* renamed from: i  reason: collision with root package name */
        private b f20800i;

        /* renamed from: j  reason: collision with root package name */
        private Object f20801j;

        /* renamed from: k  reason: collision with root package name */
        private e2 f20802k;

        /* renamed from: l  reason: collision with root package name */
        private g.a f20803l;

        /* renamed from: m  reason: collision with root package name */
        private j f20804m;

        public z1 a() {
            i iVar;
            k4.a.f(this.f20796e.f20835b == null || this.f20796e.f20834a != null);
            Uri uri = this.f20793b;
            f fVar = null;
            if (uri != null) {
                String str = this.f20794c;
                if (this.f20796e.f20834a != null) {
                    fVar = this.f20796e.i();
                }
                iVar = new i(uri, str, fVar, this.f20800i, this.f20797f, this.f20798g, this.f20799h, this.f20801j);
            } else {
                iVar = null;
            }
            String str2 = this.f20792a;
            if (str2 == null) {
                str2 = MaxReward.DEFAULT_LABEL;
            }
            String str3 = str2;
            e g10 = this.f20795d.g();
            g f10 = this.f20803l.f();
            e2 e2Var = this.f20802k;
            if (e2Var == null) {
                e2Var = e2.J;
            }
            return new z1(str3, g10, iVar, f10, e2Var, this.f20804m);
        }

        public c b(String str) {
            this.f20798g = str;
            return this;
        }

        public c c(String str) {
            this.f20792a = (String) k4.a.e(str);
            return this;
        }

        public c d(String str) {
            this.f20794c = str;
            return this;
        }

        public c e(Object obj) {
            this.f20801j = obj;
            return this;
        }

        public c f(Uri uri) {
            this.f20793b = uri;
            return this;
        }

        public c() {
            this.f20795d = new d.a();
            this.f20796e = new f.a();
            this.f20797f = Collections.emptyList();
            this.f20799h = u.y();
            this.f20803l = new g.a();
            this.f20804m = j.f20868d;
        }

        private c(z1 z1Var) {
            this();
            f.a aVar;
            this.f20795d = z1Var.f20789g.b();
            this.f20792a = z1Var.f20784a;
            this.f20802k = z1Var.f20788f;
            this.f20803l = z1Var.f20787d.b();
            this.f20804m = z1Var.f20791i;
            h hVar = z1Var.f20785b;
            if (hVar != null) {
                this.f20798g = hVar.f20864f;
                this.f20794c = hVar.f20860b;
                this.f20793b = hVar.f20859a;
                this.f20797f = hVar.f20863e;
                this.f20799h = hVar.f20865g;
                this.f20801j = hVar.f20867i;
                f fVar = hVar.f20861c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f20796e = aVar;
            }
        }
    }

    /* compiled from: MediaItem */
    public static class d implements h {

        /* renamed from: g  reason: collision with root package name */
        public static final d f20805g = new a().f();

        /* renamed from: h  reason: collision with root package name */
        private static final String f20806h = n0.r0(0);

        /* renamed from: i  reason: collision with root package name */
        private static final String f20807i = n0.r0(1);

        /* renamed from: j  reason: collision with root package name */
        private static final String f20808j = n0.r0(2);

        /* renamed from: k  reason: collision with root package name */
        private static final String f20809k = n0.r0(3);

        /* renamed from: l  reason: collision with root package name */
        private static final String f20810l = n0.r0(4);

        /* renamed from: m  reason: collision with root package name */
        public static final h.a<e> f20811m = a2.f36367a;

        /* renamed from: a  reason: collision with root package name */
        public final long f20812a;

        /* renamed from: b  reason: collision with root package name */
        public final long f20813b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f20814c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f20815d;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f20816f;

        /* compiled from: MediaItem */
        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public long f20817a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public long f20818b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public boolean f20819c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public boolean f20820d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public boolean f20821e;

            public d f() {
                return g();
            }

            @Deprecated
            public e g() {
                return new e(this);
            }

            public a h(long j10) {
                k4.a.a(j10 == Long.MIN_VALUE || j10 >= 0);
                this.f20818b = j10;
                return this;
            }

            public a i(boolean z10) {
                this.f20820d = z10;
                return this;
            }

            public a j(boolean z10) {
                this.f20819c = z10;
                return this;
            }

            public a k(long j10) {
                k4.a.a(j10 >= 0);
                this.f20817a = j10;
                return this;
            }

            public a l(boolean z10) {
                this.f20821e = z10;
                return this;
            }

            public a() {
                this.f20818b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f20817a = dVar.f20812a;
                this.f20818b = dVar.f20813b;
                this.f20819c = dVar.f20814c;
                this.f20820d = dVar.f20815d;
                this.f20821e = dVar.f20816f;
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ e c(Bundle bundle) {
            a aVar = new a();
            String str = f20806h;
            d dVar = f20805g;
            return aVar.k(bundle.getLong(str, dVar.f20812a)).h(bundle.getLong(f20807i, dVar.f20813b)).j(bundle.getBoolean(f20808j, dVar.f20814c)).i(bundle.getBoolean(f20809k, dVar.f20815d)).l(bundle.getBoolean(f20810l, dVar.f20816f)).g();
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f20812a == dVar.f20812a && this.f20813b == dVar.f20813b && this.f20814c == dVar.f20814c && this.f20815d == dVar.f20815d && this.f20816f == dVar.f20816f) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f20812a;
            long j11 = this.f20813b;
            return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f20814c ? 1 : 0)) * 31) + (this.f20815d ? 1 : 0)) * 31) + (this.f20816f ? 1 : 0);
        }

        private d(a aVar) {
            this.f20812a = aVar.f20817a;
            this.f20813b = aVar.f20818b;
            this.f20814c = aVar.f20819c;
            this.f20815d = aVar.f20820d;
            this.f20816f = aVar.f20821e;
        }
    }

    @Deprecated
    /* compiled from: MediaItem */
    public static final class e extends d {

        /* renamed from: n  reason: collision with root package name */
        public static final e f20822n = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    /* compiled from: MediaItem */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f20823a;
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public final UUID f20824b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f20825c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public final v<String, String> f20826d;

        /* renamed from: e  reason: collision with root package name */
        public final v<String, String> f20827e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f20828f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f20829g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f20830h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public final u<Integer> f20831i;

        /* renamed from: j  reason: collision with root package name */
        public final u<Integer> f20832j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public final byte[] f20833k;

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f20833k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (!this.f20823a.equals(fVar.f20823a) || !n0.c(this.f20825c, fVar.f20825c) || !n0.c(this.f20827e, fVar.f20827e) || this.f20828f != fVar.f20828f || this.f20830h != fVar.f20830h || this.f20829g != fVar.f20829g || !this.f20832j.equals(fVar.f20832j) || !Arrays.equals(this.f20833k, fVar.f20833k)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f20823a.hashCode() * 31;
            Uri uri = this.f20825c;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f20827e.hashCode()) * 31) + (this.f20828f ? 1 : 0)) * 31) + (this.f20830h ? 1 : 0)) * 31) + (this.f20829g ? 1 : 0)) * 31) + this.f20832j.hashCode()) * 31) + Arrays.hashCode(this.f20833k);
        }

        /* compiled from: MediaItem */
        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public UUID f20834a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public Uri f20835b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public v<String, String> f20836c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public boolean f20837d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public boolean f20838e;
            /* access modifiers changed from: private */

            /* renamed from: f  reason: collision with root package name */
            public boolean f20839f;
            /* access modifiers changed from: private */

            /* renamed from: g  reason: collision with root package name */
            public u<Integer> f20840g;
            /* access modifiers changed from: private */

            /* renamed from: h  reason: collision with root package name */
            public byte[] f20841h;

            public f i() {
                return new f(this);
            }

            @Deprecated
            private a() {
                this.f20836c = v.k();
                this.f20840g = u.y();
            }

            private a(f fVar) {
                this.f20834a = fVar.f20823a;
                this.f20835b = fVar.f20825c;
                this.f20836c = fVar.f20827e;
                this.f20837d = fVar.f20828f;
                this.f20838e = fVar.f20829g;
                this.f20839f = fVar.f20830h;
                this.f20840g = fVar.f20832j;
                this.f20841h = fVar.f20833k;
            }
        }

        private f(a aVar) {
            k4.a.f(!aVar.f20839f || aVar.f20835b != null);
            UUID uuid = (UUID) k4.a.e(aVar.f20834a);
            this.f20823a = uuid;
            this.f20824b = uuid;
            this.f20825c = aVar.f20835b;
            this.f20826d = aVar.f20836c;
            this.f20827e = aVar.f20836c;
            this.f20828f = aVar.f20837d;
            this.f20830h = aVar.f20839f;
            this.f20829g = aVar.f20838e;
            this.f20831i = aVar.f20840g;
            this.f20832j = aVar.f20840g;
            this.f20833k = aVar.f20841h != null ? Arrays.copyOf(aVar.f20841h, aVar.f20841h.length) : null;
        }
    }

    /* compiled from: MediaItem */
    public static final class g implements h {

        /* renamed from: g  reason: collision with root package name */
        public static final g f20842g = new a().f();

        /* renamed from: h  reason: collision with root package name */
        private static final String f20843h = n0.r0(0);

        /* renamed from: i  reason: collision with root package name */
        private static final String f20844i = n0.r0(1);

        /* renamed from: j  reason: collision with root package name */
        private static final String f20845j = n0.r0(2);

        /* renamed from: k  reason: collision with root package name */
        private static final String f20846k = n0.r0(3);

        /* renamed from: l  reason: collision with root package name */
        private static final String f20847l = n0.r0(4);

        /* renamed from: m  reason: collision with root package name */
        public static final h.a<g> f20848m = b2.f36370a;

        /* renamed from: a  reason: collision with root package name */
        public final long f20849a;

        /* renamed from: b  reason: collision with root package name */
        public final long f20850b;

        /* renamed from: c  reason: collision with root package name */
        public final long f20851c;

        /* renamed from: d  reason: collision with root package name */
        public final float f20852d;

        /* renamed from: f  reason: collision with root package name */
        public final float f20853f;

        /* compiled from: MediaItem */
        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public long f20854a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public long f20855b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public long f20856c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public float f20857d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public float f20858e;

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f20856c = j10;
                return this;
            }

            public a h(float f10) {
                this.f20858e = f10;
                return this;
            }

            public a i(long j10) {
                this.f20855b = j10;
                return this;
            }

            public a j(float f10) {
                this.f20857d = f10;
                return this;
            }

            public a k(long j10) {
                this.f20854a = j10;
                return this;
            }

            public a() {
                this.f20854a = -9223372036854775807L;
                this.f20855b = -9223372036854775807L;
                this.f20856c = -9223372036854775807L;
                this.f20857d = -3.4028235E38f;
                this.f20858e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f20854a = gVar.f20849a;
                this.f20855b = gVar.f20850b;
                this.f20856c = gVar.f20851c;
                this.f20857d = gVar.f20852d;
                this.f20858e = gVar.f20853f;
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ g c(Bundle bundle) {
            String str = f20843h;
            g gVar = f20842g;
            return new g(bundle.getLong(str, gVar.f20849a), bundle.getLong(f20844i, gVar.f20850b), bundle.getLong(f20845j, gVar.f20851c), bundle.getFloat(f20846k, gVar.f20852d), bundle.getFloat(f20847l, gVar.f20853f));
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (this.f20849a == gVar.f20849a && this.f20850b == gVar.f20850b && this.f20851c == gVar.f20851c && this.f20852d == gVar.f20852d && this.f20853f == gVar.f20853f) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f20849a;
            long j11 = this.f20850b;
            long j12 = this.f20851c;
            int i10 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            float f10 = this.f20852d;
            int i11 = 0;
            int floatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f20853f;
            if (f11 != 0.0f) {
                i11 = Float.floatToIntBits(f11);
            }
            return floatToIntBits + i11;
        }

        private g(a aVar) {
            this(aVar.f20854a, aVar.f20855b, aVar.f20856c, aVar.f20857d, aVar.f20858e);
        }

        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f20849a = j10;
            this.f20850b = j11;
            this.f20851c = j12;
            this.f20852d = f10;
            this.f20853f = f11;
        }
    }

    /* compiled from: MediaItem */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f20859a;

        /* renamed from: b  reason: collision with root package name */
        public final String f20860b;

        /* renamed from: c  reason: collision with root package name */
        public final f f20861c;

        /* renamed from: d  reason: collision with root package name */
        public final b f20862d;

        /* renamed from: e  reason: collision with root package name */
        public final List<o3.c> f20863e;

        /* renamed from: f  reason: collision with root package name */
        public final String f20864f;

        /* renamed from: g  reason: collision with root package name */
        public final u<l> f20865g;
        @Deprecated

        /* renamed from: h  reason: collision with root package name */
        public final List<k> f20866h;

        /* renamed from: i  reason: collision with root package name */
        public final Object f20867i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (!this.f20859a.equals(hVar.f20859a) || !n0.c(this.f20860b, hVar.f20860b) || !n0.c(this.f20861c, hVar.f20861c) || !n0.c(this.f20862d, hVar.f20862d) || !this.f20863e.equals(hVar.f20863e) || !n0.c(this.f20864f, hVar.f20864f) || !this.f20865g.equals(hVar.f20865g) || !n0.c(this.f20867i, hVar.f20867i)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f20859a.hashCode() * 31;
            String str = this.f20860b;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f20861c;
            int hashCode3 = (((((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + 0) * 31) + this.f20863e.hashCode()) * 31;
            String str2 = this.f20864f;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f20865g.hashCode()) * 31;
            Object obj = this.f20867i;
            if (obj != null) {
                i10 = obj.hashCode();
            }
            return hashCode4 + i10;
        }

        private h(Uri uri, String str, f fVar, b bVar, List<o3.c> list, String str2, u<l> uVar, Object obj) {
            this.f20859a = uri;
            this.f20860b = str;
            this.f20861c = fVar;
            this.f20863e = list;
            this.f20864f = str2;
            this.f20865g = uVar;
            u.a p10 = u.p();
            for (int i10 = 0; i10 < uVar.size(); i10++) {
                p10.a(uVar.get(i10).a().i());
            }
            this.f20866h = p10.k();
            this.f20867i = obj;
        }
    }

    @Deprecated
    /* compiled from: MediaItem */
    public static final class i extends h {
        private i(Uri uri, String str, f fVar, b bVar, List<o3.c> list, String str2, u<l> uVar, Object obj) {
            super(uri, str, fVar, bVar, list, str2, uVar, obj);
        }
    }

    /* compiled from: MediaItem */
    public static final class j implements h {

        /* renamed from: d  reason: collision with root package name */
        public static final j f20868d = new a().d();

        /* renamed from: f  reason: collision with root package name */
        private static final String f20869f = n0.r0(0);

        /* renamed from: g  reason: collision with root package name */
        private static final String f20870g = n0.r0(1);

        /* renamed from: h  reason: collision with root package name */
        private static final String f20871h = n0.r0(2);

        /* renamed from: i  reason: collision with root package name */
        public static final h.a<j> f20872i = c2.f36378a;

        /* renamed from: a  reason: collision with root package name */
        public final Uri f20873a;

        /* renamed from: b  reason: collision with root package name */
        public final String f20874b;

        /* renamed from: c  reason: collision with root package name */
        public final Bundle f20875c;

        /* compiled from: MediaItem */
        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public Uri f20876a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public String f20877b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public Bundle f20878c;

            public j d() {
                return new j(this);
            }

            public a e(Bundle bundle) {
                this.f20878c = bundle;
                return this;
            }

            public a f(Uri uri) {
                this.f20876a = uri;
                return this;
            }

            public a g(String str) {
                this.f20877b = str;
                return this;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (!n0.c(this.f20873a, jVar.f20873a) || !n0.c(this.f20874b, jVar.f20874b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            Uri uri = this.f20873a;
            int i10 = 0;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f20874b;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode + i10;
        }

        private j(a aVar) {
            this.f20873a = aVar.f20876a;
            this.f20874b = aVar.f20877b;
            this.f20875c = aVar.f20878c;
        }
    }

    @Deprecated
    /* compiled from: MediaItem */
    public static final class k extends l {
        private k(l.a aVar) {
            super(aVar);
        }
    }

    /* compiled from: MediaItem */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f20879a;

        /* renamed from: b  reason: collision with root package name */
        public final String f20880b;

        /* renamed from: c  reason: collision with root package name */
        public final String f20881c;

        /* renamed from: d  reason: collision with root package name */
        public final int f20882d;

        /* renamed from: e  reason: collision with root package name */
        public final int f20883e;

        /* renamed from: f  reason: collision with root package name */
        public final String f20884f;

        /* renamed from: g  reason: collision with root package name */
        public final String f20885g;

        /* compiled from: MediaItem */
        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public Uri f20886a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public String f20887b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public String f20888c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public int f20889d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public int f20890e;
            /* access modifiers changed from: private */

            /* renamed from: f  reason: collision with root package name */
            public String f20891f;
            /* access modifiers changed from: private */

            /* renamed from: g  reason: collision with root package name */
            public String f20892g;

            /* access modifiers changed from: private */
            public k i() {
                return new k(this);
            }

            private a(l lVar) {
                this.f20886a = lVar.f20879a;
                this.f20887b = lVar.f20880b;
                this.f20888c = lVar.f20881c;
                this.f20889d = lVar.f20882d;
                this.f20890e = lVar.f20883e;
                this.f20891f = lVar.f20884f;
                this.f20892g = lVar.f20885g;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (!this.f20879a.equals(lVar.f20879a) || !n0.c(this.f20880b, lVar.f20880b) || !n0.c(this.f20881c, lVar.f20881c) || this.f20882d != lVar.f20882d || this.f20883e != lVar.f20883e || !n0.c(this.f20884f, lVar.f20884f) || !n0.c(this.f20885g, lVar.f20885g)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f20879a.hashCode() * 31;
            String str = this.f20880b;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f20881c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f20882d) * 31) + this.f20883e) * 31;
            String str3 = this.f20884f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f20885g;
            if (str4 != null) {
                i10 = str4.hashCode();
            }
            return hashCode4 + i10;
        }

        private l(a aVar) {
            this.f20879a = aVar.f20886a;
            this.f20880b = aVar.f20887b;
            this.f20881c = aVar.f20888c;
            this.f20882d = aVar.f20889d;
            this.f20883e = aVar.f20890e;
            this.f20884f = aVar.f20891f;
            this.f20885g = aVar.f20892g;
        }
    }

    /* access modifiers changed from: private */
    public static z1 c(Bundle bundle) {
        g gVar;
        e2 e2Var;
        e eVar;
        j jVar;
        String str = (String) k4.a.e(bundle.getString(f20778k, MaxReward.DEFAULT_LABEL));
        Bundle bundle2 = bundle.getBundle(f20779l);
        if (bundle2 == null) {
            gVar = g.f20842g;
        } else {
            gVar = g.f20848m.a(bundle2);
        }
        g gVar2 = gVar;
        Bundle bundle3 = bundle.getBundle(f20780m);
        if (bundle3 == null) {
            e2Var = e2.J;
        } else {
            e2Var = e2.f20300r0.a(bundle3);
        }
        e2 e2Var2 = e2Var;
        Bundle bundle4 = bundle.getBundle(f20781n);
        if (bundle4 == null) {
            eVar = e.f20822n;
        } else {
            eVar = d.f20811m.a(bundle4);
        }
        e eVar2 = eVar;
        Bundle bundle5 = bundle.getBundle(f20782o);
        if (bundle5 == null) {
            jVar = j.f20868d;
        } else {
            jVar = j.f20872i.a(bundle5);
        }
        return new z1(str, eVar2, (i) null, gVar2, e2Var2, jVar);
    }

    public static z1 d(Uri uri) {
        return new c().f(uri).a();
    }

    public c b() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        if (!n0.c(this.f20784a, z1Var.f20784a) || !this.f20789g.equals(z1Var.f20789g) || !n0.c(this.f20785b, z1Var.f20785b) || !n0.c(this.f20787d, z1Var.f20787d) || !n0.c(this.f20788f, z1Var.f20788f) || !n0.c(this.f20791i, z1Var.f20791i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f20784a.hashCode() * 31;
        h hVar = this.f20785b;
        return ((((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f20787d.hashCode()) * 31) + this.f20789g.hashCode()) * 31) + this.f20788f.hashCode()) * 31) + this.f20791i.hashCode();
    }

    private z1(String str, e eVar, i iVar, g gVar, e2 e2Var, j jVar) {
        this.f20784a = str;
        this.f20785b = iVar;
        this.f20786c = iVar;
        this.f20787d = gVar;
        this.f20788f = e2Var;
        this.f20789g = eVar;
        this.f20790h = eVar;
        this.f20791i = jVar;
    }
}
