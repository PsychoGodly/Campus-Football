package df;

import bf.q;
import bf.x;
import bf.z;
import ff.d;
import ff.e;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* compiled from: CacheStrategy */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final x f32441a;

    /* renamed from: b  reason: collision with root package name */
    public final z f32442b;

    /* compiled from: CacheStrategy */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final long f32443a;

        /* renamed from: b  reason: collision with root package name */
        final x f32444b;

        /* renamed from: c  reason: collision with root package name */
        final z f32445c;

        /* renamed from: d  reason: collision with root package name */
        private Date f32446d;

        /* renamed from: e  reason: collision with root package name */
        private String f32447e;

        /* renamed from: f  reason: collision with root package name */
        private Date f32448f;

        /* renamed from: g  reason: collision with root package name */
        private String f32449g;

        /* renamed from: h  reason: collision with root package name */
        private Date f32450h;

        /* renamed from: i  reason: collision with root package name */
        private long f32451i;

        /* renamed from: j  reason: collision with root package name */
        private long f32452j;

        /* renamed from: k  reason: collision with root package name */
        private String f32453k;

        /* renamed from: l  reason: collision with root package name */
        private int f32454l = -1;

        public a(long j10, x xVar, z zVar) {
            this.f32443a = j10;
            this.f32444b = xVar;
            this.f32445c = zVar;
            if (zVar != null) {
                this.f32451i = zVar.e0();
                this.f32452j = zVar.R();
                q A = zVar.A();
                int g10 = A.g();
                for (int i10 = 0; i10 < g10; i10++) {
                    String e10 = A.e(i10);
                    String i11 = A.i(i10);
                    if ("Date".equalsIgnoreCase(e10)) {
                        this.f32446d = d.b(i11);
                        this.f32447e = i11;
                    } else if ("Expires".equalsIgnoreCase(e10)) {
                        this.f32450h = d.b(i11);
                    } else if ("Last-Modified".equalsIgnoreCase(e10)) {
                        this.f32448f = d.b(i11);
                        this.f32449g = i11;
                    } else if ("ETag".equalsIgnoreCase(e10)) {
                        this.f32453k = i11;
                    } else if ("Age".equalsIgnoreCase(e10)) {
                        this.f32454l = e.d(i11, -1);
                    }
                }
            }
        }

        private long a() {
            Date date = this.f32446d;
            long j10 = 0;
            if (date != null) {
                j10 = Math.max(0, this.f32452j - date.getTime());
            }
            int i10 = this.f32454l;
            if (i10 != -1) {
                j10 = Math.max(j10, TimeUnit.SECONDS.toMillis((long) i10));
            }
            long j11 = this.f32452j;
            return j10 + (j11 - this.f32451i) + (this.f32443a - j11);
        }

        private long b() {
            long j10;
            long j11;
            bf.c i10 = this.f32445c.i();
            if (i10.d() != -1) {
                return TimeUnit.SECONDS.toMillis((long) i10.d());
            }
            if (this.f32450h != null) {
                Date date = this.f32446d;
                if (date != null) {
                    j11 = date.getTime();
                } else {
                    j11 = this.f32452j;
                }
                long time = this.f32450h.getTime() - j11;
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f32448f == null || this.f32445c.Z().h().x() != null) {
                return 0;
            } else {
                Date date2 = this.f32446d;
                if (date2 != null) {
                    j10 = date2.getTime();
                } else {
                    j10 = this.f32451i;
                }
                long time2 = j10 - this.f32448f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0;
            }
        }

        private c d() {
            if (this.f32445c == null) {
                return new c(this.f32444b, (z) null);
            }
            if (this.f32444b.e() && this.f32445c.n() == null) {
                return new c(this.f32444b, (z) null);
            }
            if (!c.a(this.f32445c, this.f32444b)) {
                return new c(this.f32444b, (z) null);
            }
            bf.c b10 = this.f32444b.b();
            if (b10.h() || e(this.f32444b)) {
                return new c(this.f32444b, (z) null);
            }
            bf.c i10 = this.f32445c.i();
            long a10 = a();
            long b11 = b();
            if (b10.d() != -1) {
                b11 = Math.min(b11, TimeUnit.SECONDS.toMillis((long) b10.d()));
            }
            long j10 = 0;
            long millis = b10.f() != -1 ? TimeUnit.SECONDS.toMillis((long) b10.f()) : 0;
            if (!i10.g() && b10.e() != -1) {
                j10 = TimeUnit.SECONDS.toMillis((long) b10.e());
            }
            if (!i10.h()) {
                long j11 = millis + a10;
                if (j11 < j10 + b11) {
                    z.a B = this.f32445c.B();
                    if (j11 >= b11) {
                        B.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a10 > 86400000 && f()) {
                        B.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new c((x) null, B.c());
                }
            }
            String str = this.f32453k;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = "If-None-Match";
            } else if (this.f32448f != null) {
                str = this.f32449g;
            } else if (this.f32446d == null) {
                return new c(this.f32444b, (z) null);
            } else {
                str = this.f32447e;
            }
            q.a f10 = this.f32444b.d().f();
            cf.a.f31981a.b(f10, str2, str);
            return new c(this.f32444b.g().c(f10.d()).a(), this.f32445c);
        }

        private static boolean e(x xVar) {
            return (xVar.c("If-Modified-Since") == null && xVar.c("If-None-Match") == null) ? false : true;
        }

        private boolean f() {
            return this.f32445c.i().d() == -1 && this.f32450h == null;
        }

        public c c() {
            c d10 = d();
            return (d10.f32441a == null || !this.f32444b.b().j()) ? d10 : new c((x) null, (z) null);
        }
    }

    c(x xVar, z zVar) {
        this.f32441a = xVar;
        this.f32442b = zVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.i().b() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(bf.z r3, bf.x r4) {
        /*
            int r0 = r3.j()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x005a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 300: goto L_0x005a;
                case 301: goto L_0x005a;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0059
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.q(r0)
            if (r0 != 0) goto L_0x005a
            bf.c r0 = r3.i()
            int r0 = r0.d()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            bf.c r0 = r3.i()
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x005a
            bf.c r0 = r3.i()
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            bf.c r3 = r3.i()
            boolean r3 = r3.i()
            if (r3 != 0) goto L_0x006f
            bf.c r3 = r4.b()
            boolean r3 = r3.i()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: df.c.a(bf.z, bf.x):boolean");
    }
}
