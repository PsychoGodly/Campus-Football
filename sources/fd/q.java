package fd;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import r6.o;

/* compiled from: OutboundFlowController */
class q {

    /* renamed from: a  reason: collision with root package name */
    private final d f32758a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final hd.c f32759b;

    /* renamed from: c  reason: collision with root package name */
    private int f32760c = 65535;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final c f32761d = new c(0, 65535, (b) null);

    /* compiled from: OutboundFlowController */
    public interface b {
        void b(int i10);
    }

    /* compiled from: OutboundFlowController */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        private final lf.c f32762a = new lf.c();

        /* renamed from: b  reason: collision with root package name */
        private Runnable f32763b;

        /* renamed from: c  reason: collision with root package name */
        private final int f32764c;

        /* renamed from: d  reason: collision with root package name */
        private int f32765d;

        /* renamed from: e  reason: collision with root package name */
        private int f32766e;

        /* renamed from: f  reason: collision with root package name */
        private final b f32767f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f32768g = false;

        c(int i10, int i11, b bVar) {
            this.f32764c = i10;
            this.f32765d = i11;
            this.f32767f = bVar;
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            this.f32766e += i10;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f32766e;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f32766e = 0;
        }

        /* access modifiers changed from: package-private */
        public void d(lf.c cVar, int i10, boolean z10) {
            this.f32762a.V0(cVar, (long) i10);
            this.f32768g |= z10;
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return this.f32762a.v0() > 0;
        }

        /* access modifiers changed from: package-private */
        public int f(int i10) {
            if (i10 <= 0 || a.e.API_PRIORITY_OTHER - i10 >= this.f32765d) {
                int i11 = this.f32765d + i10;
                this.f32765d = i11;
                return i11;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f32764c);
        }

        /* access modifiers changed from: package-private */
        public int g() {
            return Math.max(0, Math.min(this.f32765d, (int) this.f32762a.v0()));
        }

        /* access modifiers changed from: package-private */
        public int h() {
            return g() - this.f32766e;
        }

        /* access modifiers changed from: package-private */
        public int i() {
            return this.f32765d;
        }

        /* access modifiers changed from: package-private */
        public int j() {
            return Math.min(this.f32765d, q.this.f32761d.i());
        }

        /* access modifiers changed from: package-private */
        public void k(lf.c cVar, int i10, boolean z10) {
            do {
                int min = Math.min(i10, q.this.f32759b.L0());
                int i11 = -min;
                q.this.f32761d.f(i11);
                f(i11);
                try {
                    q.this.f32759b.H0(cVar.v0() == ((long) min) && z10, this.f32764c, cVar, min);
                    this.f32767f.b(min);
                    i10 -= min;
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            } while (i10 > 0);
        }

        /* access modifiers changed from: package-private */
        public int l(int i10, e eVar) {
            Runnable runnable;
            int min = Math.min(i10, j());
            int i11 = 0;
            while (e() && min > 0) {
                if (((long) min) >= this.f32762a.v0()) {
                    i11 += (int) this.f32762a.v0();
                    lf.c cVar = this.f32762a;
                    k(cVar, (int) cVar.v0(), this.f32768g);
                } else {
                    i11 += min;
                    k(this.f32762a, min, false);
                }
                eVar.b();
                min = Math.min(i10 - i11, j());
            }
            if (!e() && (runnable = this.f32763b) != null) {
                runnable.run();
                this.f32763b = null;
            }
            return i11;
        }
    }

    /* compiled from: OutboundFlowController */
    public interface d {
        c[] a();
    }

    /* compiled from: OutboundFlowController */
    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        int f32770a;

        private e() {
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f32770a > 0;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f32770a++;
        }
    }

    public q(d dVar, hd.c cVar) {
        this.f32758a = (d) o.p(dVar, "transport");
        this.f32759b = (hd.c) o.p(cVar, "frameWriter");
    }

    public c c(b bVar, int i10) {
        return new c(i10, this.f32760c, (b) o.p(bVar, "stream"));
    }

    public void d(boolean z10, c cVar, lf.c cVar2, boolean z11) {
        o.p(cVar2, "source");
        int j10 = cVar.j();
        boolean e10 = cVar.e();
        int v02 = (int) cVar2.v0();
        if (e10 || j10 < v02) {
            if (!e10 && j10 > 0) {
                cVar.k(cVar2, j10, false);
            }
            cVar.d(cVar2, (int) cVar2.v0(), z10);
        } else {
            cVar.k(cVar2, v02, z10);
        }
        if (z11) {
            e();
        }
    }

    public void e() {
        try {
            this.f32759b.flush();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean f(int i10) {
        if (i10 >= 0) {
            int i11 = i10 - this.f32760c;
            this.f32760c = i10;
            for (c f10 : this.f32758a.a()) {
                f10.f(i11);
            }
            if (i11 > 0) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Invalid initial window size: " + i10);
    }

    public int g(c cVar, int i10) {
        if (cVar == null) {
            int f10 = this.f32761d.f(i10);
            h();
            return f10;
        }
        int f11 = cVar.f(i10);
        e eVar = new e();
        cVar.l(cVar.j(), eVar);
        if (eVar.a()) {
            e();
        }
        return f11;
    }

    public void h() {
        int i10;
        c[] a10 = this.f32758a.a();
        Collections.shuffle(Arrays.asList(a10));
        int i11 = this.f32761d.i();
        int length = a10.length;
        while (true) {
            i10 = 0;
            if (length <= 0 || i11 <= 0) {
                e eVar = new e();
                c[] a11 = this.f32758a.a();
                int length2 = a11.length;
            } else {
                int ceil = (int) Math.ceil((double) (((float) i11) / ((float) length)));
                for (int i12 = 0; i12 < length && i11 > 0; i12++) {
                    c cVar = a10[i12];
                    int min = Math.min(i11, Math.min(cVar.h(), ceil));
                    if (min > 0) {
                        cVar.a(min);
                        i11 -= min;
                    }
                    if (cVar.h() > 0) {
                        a10[i10] = cVar;
                        i10++;
                    }
                }
                length = i10;
            }
        }
        e eVar2 = new e();
        c[] a112 = this.f32758a.a();
        int length22 = a112.length;
        while (i10 < length22) {
            c cVar2 = a112[i10];
            cVar2.l(cVar2.b(), eVar2);
            cVar2.c();
            i10++;
        }
        if (eVar2.a()) {
            e();
        }
    }
}
