package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.wd;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public interface xd {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f13316a;

        /* renamed from: b  reason: collision with root package name */
        public final wd.a f13317b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArrayList f13318c;

        /* renamed from: d  reason: collision with root package name */
        private final long f13319d;

        /* renamed from: com.applovin.impl.xd$a$a  reason: collision with other inner class name */
        private static final class C0148a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f13320a;

            /* renamed from: b  reason: collision with root package name */
            public xd f13321b;

            public C0148a(Handler handler, xd xdVar) {
                this.f13320a = handler;
                this.f13321b = xdVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, (wd.a) null, 0);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(xd xdVar, ic icVar, pd pdVar) {
            xdVar.c(this.f13316a, this.f13317b, icVar, pdVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(xd xdVar, ic icVar, pd pdVar) {
            xdVar.b(this.f13316a, this.f13317b, icVar, pdVar);
        }

        public void a(Handler handler, xd xdVar) {
            a1.a((Object) handler);
            a1.a((Object) xdVar);
            this.f13318c.add(new C0148a(handler, xdVar));
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, wd.a aVar, long j10) {
            this.f13318c = copyOnWriteArrayList;
            this.f13316a = i10;
            this.f13317b = aVar;
            this.f13319d = j10;
        }

        public void b(ic icVar, int i10, int i11, d9 d9Var, int i12, Object obj, long j10, long j11) {
            ic icVar2 = icVar;
            b(icVar, new pd(i10, i11, d9Var, i12, obj, a(j10), a(j11)));
        }

        public void c(ic icVar, int i10, int i11, d9 d9Var, int i12, Object obj, long j10, long j11) {
            ic icVar2 = icVar;
            c(icVar, new pd(i10, i11, d9Var, i12, obj, a(j10), a(j11)));
        }

        private long a(long j10) {
            long b10 = r2.b(j10);
            if (b10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f13319d + b10;
        }

        public void a(int i10, d9 d9Var, int i11, Object obj, long j10) {
            a(new pd(1, i10, d9Var, i11, obj, a(j10), -9223372036854775807L));
        }

        public void b(ic icVar, pd pdVar) {
            Iterator it = this.f13318c.iterator();
            while (it.hasNext()) {
                C0148a aVar = (C0148a) it.next();
                yp.a(aVar.f13320a, (Runnable) new o70(this, aVar.f13321b, icVar, pdVar));
            }
        }

        public void c(ic icVar, pd pdVar) {
            Iterator it = this.f13318c.iterator();
            while (it.hasNext()) {
                C0148a aVar = (C0148a) it.next();
                yp.a(aVar.f13320a, (Runnable) new q70(this, aVar.f13321b, icVar, pdVar));
            }
        }

        public void a(pd pdVar) {
            Iterator it = this.f13318c.iterator();
            while (it.hasNext()) {
                C0148a aVar = (C0148a) it.next();
                yp.a(aVar.f13320a, (Runnable) new s70(this, aVar.f13321b, pdVar));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(xd xdVar, pd pdVar) {
            xdVar.a(this.f13316a, this.f13317b, pdVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(xd xdVar, ic icVar, pd pdVar) {
            xdVar.a(this.f13316a, this.f13317b, icVar, pdVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(xd xdVar, ic icVar, pd pdVar, IOException iOException, boolean z10) {
            xdVar.a(this.f13316a, this.f13317b, icVar, pdVar, iOException, z10);
        }

        public void a(ic icVar, int i10, int i11, d9 d9Var, int i12, Object obj, long j10, long j11) {
            ic icVar2 = icVar;
            a(icVar, new pd(i10, i11, d9Var, i12, obj, a(j10), a(j11)));
        }

        public void a(ic icVar, pd pdVar) {
            Iterator it = this.f13318c.iterator();
            while (it.hasNext()) {
                C0148a aVar = (C0148a) it.next();
                yp.a(aVar.f13320a, (Runnable) new p70(this, aVar.f13321b, icVar, pdVar));
            }
        }

        public void a(ic icVar, int i10, int i11, d9 d9Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            ic icVar2 = icVar;
            a(icVar, new pd(i10, i11, d9Var, i12, obj, a(j10), a(j11)), iOException, z10);
        }

        public void a(ic icVar, pd pdVar, IOException iOException, boolean z10) {
            Iterator it = this.f13318c.iterator();
            while (it.hasNext()) {
                C0148a aVar = (C0148a) it.next();
                yp.a(aVar.f13320a, (Runnable) new r70(this, aVar.f13321b, icVar, pdVar, iOException, z10));
            }
        }

        public void a(xd xdVar) {
            Iterator it = this.f13318c.iterator();
            while (it.hasNext()) {
                C0148a aVar = (C0148a) it.next();
                if (aVar.f13321b == xdVar) {
                    this.f13318c.remove(aVar);
                }
            }
        }

        public a a(int i10, wd.a aVar, long j10) {
            return new a(this.f13318c, i10, aVar, j10);
        }
    }

    void a(int i10, wd.a aVar, ic icVar, pd pdVar);

    void a(int i10, wd.a aVar, ic icVar, pd pdVar, IOException iOException, boolean z10);

    void a(int i10, wd.a aVar, pd pdVar);

    void b(int i10, wd.a aVar, ic icVar, pd pdVar);

    void c(int i10, wd.a aVar, ic icVar, pd pdVar);
}
