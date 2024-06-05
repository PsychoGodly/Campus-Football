package i2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import b2.h;
import b2.i;
import b2.o;
import c2.e;
import c2.f;
import c2.g;
import c2.m;
import e2.c;
import j2.c;
import j2.d;
import j2.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import k2.b;
import l2.a;

/* compiled from: Uploader */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private final Context f18893a;

    /* renamed from: b  reason: collision with root package name */
    private final e f18894b;

    /* renamed from: c  reason: collision with root package name */
    private final d f18895c;

    /* renamed from: d  reason: collision with root package name */
    private final y f18896d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f18897e;

    /* renamed from: f  reason: collision with root package name */
    private final b f18898f;

    /* renamed from: g  reason: collision with root package name */
    private final a f18899g;

    /* renamed from: h  reason: collision with root package name */
    private final a f18900h;

    /* renamed from: i  reason: collision with root package name */
    private final c f18901i;

    public s(Context context, e eVar, d dVar, y yVar, Executor executor, b bVar, a aVar, a aVar2, c cVar) {
        this.f18893a = context;
        this.f18894b = eVar;
        this.f18895c = dVar;
        this.f18896d = yVar;
        this.f18897e = executor;
        this.f18898f = bVar;
        this.f18899g = aVar;
        this.f18900h = aVar2;
        this.f18901i = cVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean l(o oVar) {
        return Boolean.valueOf(this.f18895c.A0(oVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Iterable m(o oVar) {
        return this.f18895c.z0(oVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, o oVar, long j10) {
        this.f18895c.K0(iterable);
        this.f18895c.r0(oVar, this.f18899g.a() + j10);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f18895c.m(iterable);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f18901i.h();
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f18901i.j((long) ((Integer) entry.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object r(o oVar, long j10) {
        this.f18895c.r0(oVar, this.f18899g.a() + j10);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object s(o oVar, int i10) {
        this.f18896d.b(oVar, i10 + 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.f18896d.b(r4, r5 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0026 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void t(b2.o r4, int r5, java.lang.Runnable r6) {
        /*
            r3 = this;
            k2.b r0 = r3.f18898f     // Catch:{ a -> 0x0026 }
            j2.d r1 = r3.f18895c     // Catch:{ a -> 0x0026 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ a -> 0x0026 }
            i2.i r2 = new i2.i     // Catch:{ a -> 0x0026 }
            r2.<init>(r1)     // Catch:{ a -> 0x0026 }
            r0.i(r2)     // Catch:{ a -> 0x0026 }
            boolean r0 = r3.k()     // Catch:{ a -> 0x0026 }
            if (r0 != 0) goto L_0x0020
            k2.b r0 = r3.f18898f     // Catch:{ a -> 0x0026 }
            i2.m r1 = new i2.m     // Catch:{ a -> 0x0026 }
            r1.<init>(r3, r4, r5)     // Catch:{ a -> 0x0026 }
            r0.i(r1)     // Catch:{ a -> 0x0026 }
            goto L_0x002d
        L_0x0020:
            r3.u(r4, r5)     // Catch:{ a -> 0x0026 }
            goto L_0x002d
        L_0x0024:
            r4 = move-exception
            goto L_0x0031
        L_0x0026:
            i2.y r0 = r3.f18896d     // Catch:{ all -> 0x0024 }
            int r5 = r5 + 1
            r0.b(r4, r5)     // Catch:{ all -> 0x0024 }
        L_0x002d:
            r6.run()
            return
        L_0x0031:
            r6.run()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.s.t(b2.o, int, java.lang.Runnable):void");
    }

    public i j(m mVar) {
        b bVar = this.f18898f;
        j2.c cVar = this.f18901i;
        Objects.requireNonNull(cVar);
        return mVar.a(i.a().i(this.f18899g.a()).k(this.f18900h.a()).j("GDT_CLIENT_METRICS").h(new h(z1.b.b("proto"), ((e2.a) bVar.i(new r(cVar))).f())).d());
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f18893a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public g u(o oVar, int i10) {
        g b10;
        m mVar = this.f18894b.get(oVar.b());
        long j10 = 0;
        g e10 = g.e(0);
        while (true) {
            long j11 = j10;
            while (((Boolean) this.f18898f.i(new k(this, oVar))).booleanValue()) {
                Iterable<k> iterable = (Iterable) this.f18898f.i(new l(this, oVar));
                if (!iterable.iterator().hasNext()) {
                    return e10;
                }
                if (mVar == null) {
                    f2.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                    b10 = g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (k b11 : iterable) {
                        arrayList.add(b11.b());
                    }
                    if (oVar.e()) {
                        arrayList.add(j(mVar));
                    }
                    b10 = mVar.b(f.a().b(arrayList).c(oVar.c()).a());
                }
                e10 = b10;
                if (e10.c() == g.a.TRANSIENT_ERROR) {
                    this.f18898f.i(new p(this, iterable, oVar, j11));
                    this.f18896d.a(oVar, i10 + 1, true);
                    return e10;
                }
                this.f18898f.i(new o(this, iterable));
                if (e10.c() == g.a.OK) {
                    j10 = Math.max(j11, e10.b());
                    if (oVar.e()) {
                        this.f18898f.i(new j(this));
                    }
                } else if (e10.c() == g.a.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (k b12 : iterable) {
                        String j12 = b12.b().j();
                        if (!hashMap.containsKey(j12)) {
                            hashMap.put(j12, 1);
                        } else {
                            hashMap.put(j12, Integer.valueOf(((Integer) hashMap.get(j12)).intValue() + 1));
                        }
                    }
                    this.f18898f.i(new q(this, hashMap));
                }
            }
            this.f18898f.i(new n(this, oVar, j11));
            return e10;
        }
    }

    public void v(o oVar, int i10, Runnable runnable) {
        this.f18897e.execute(new h(this, oVar, i10, runnable));
    }
}
