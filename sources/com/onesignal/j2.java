package com.onesignal;

import com.onesignal.k3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: OSOutcomeEventsController */
class j2 {

    /* renamed from: a  reason: collision with root package name */
    private Set<String> f27864a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final la.c f27865b;

    /* renamed from: c  reason: collision with root package name */
    private final s2 f27866c;

    /* compiled from: OSOutcomeEventsController */
    class a implements Runnable {
        a() {
        }

        public void run() {
            Thread.currentThread().setPriority(10);
            j2.this.f27865b.b().h("notification", "notification_id");
        }
    }

    /* compiled from: OSOutcomeEventsController */
    class b implements Runnable {
        b() {
        }

        public void run() {
            Thread.currentThread().setPriority(10);
            for (ma.b b10 : j2.this.f27865b.b().e()) {
                j2.this.p(b10);
            }
        }
    }

    /* compiled from: OSOutcomeEventsController */
    class c implements n3 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ma.b f27869a;

        c(ma.b bVar) {
            this.f27869a = bVar;
        }

        public void a(int i10, String str, Throwable th) {
        }

        public void b(String str) {
            j2.this.f27865b.b().d(this.f27869a);
        }
    }

    /* compiled from: OSOutcomeEventsController */
    class d implements n3 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ma.b f27871a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k3.e1 f27872b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f27873c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f27874d;

        /* compiled from: OSOutcomeEventsController */
        class a implements Runnable {
            a() {
            }

            public void run() {
                Thread.currentThread().setPriority(10);
                d dVar = d.this;
                dVar.f27871a.f(dVar.f27873c);
                j2.this.f27865b.b().g(d.this.f27871a);
            }
        }

        d(ma.b bVar, k3.e1 e1Var, long j10, String str) {
            this.f27871a = bVar;
            this.f27872b = e1Var;
            this.f27873c = j10;
            this.f27874d = str;
        }

        public void a(int i10, String str, Throwable th) {
            new Thread(new a(), "OS_SAVE_OUTCOMES").start();
            k3.r0 r0Var = k3.r0.WARN;
            k3.A1(r0Var, "Sending outcome with name: " + this.f27874d + " failed with status code: " + i10 + " and response: " + str + "\nOutcome event was cached and will be reattempted on app cold start");
            k3.e1 e1Var = this.f27872b;
            if (e1Var != null) {
                e1Var.e((i2) null);
            }
        }

        public void b(String str) {
            j2.this.k(this.f27871a);
            k3.e1 e1Var = this.f27872b;
            if (e1Var != null) {
                e1Var.e(i2.a(this.f27871a));
            }
        }
    }

    /* compiled from: OSOutcomeEventsController */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ma.b f27877a;

        e(ma.b bVar) {
            this.f27877a = bVar;
        }

        public void run() {
            Thread.currentThread().setPriority(10);
            j2.this.f27865b.b().b(this.f27877a);
        }
    }

    /* compiled from: OSOutcomeEventsController */
    static /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27879a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f27880b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            /*
                ja.b[] r0 = ja.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27880b = r0
                r1 = 1
                ja.b r2 = ja.b.IAM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f27880b     // Catch:{ NoSuchFieldError -> 0x001d }
                ja.b r3 = ja.b.NOTIFICATION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                ja.c[] r2 = ja.c.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f27879a = r2
                ja.c r3 = ja.c.DIRECT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f27879a     // Catch:{ NoSuchFieldError -> 0x0038 }
                ja.c r2 = ja.c.INDIRECT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f27879a     // Catch:{ NoSuchFieldError -> 0x0043 }
                ja.c r1 = ja.c.UNATTRIBUTED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f27879a     // Catch:{ NoSuchFieldError -> 0x004e }
                ja.c r1 = ja.c.DISABLED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.j2.f.<clinit>():void");
        }
    }

    public j2(s2 s2Var, la.c cVar) {
        this.f27866c = s2Var;
        this.f27865b = cVar;
        g();
    }

    private List<ja.a> f(String str, List<ja.a> list) {
        List<ja.a> c10 = this.f27865b.b().c(str, list);
        if (c10.size() > 0) {
            return c10;
        }
        return null;
    }

    private void g() {
        this.f27864a = OSUtils.L();
        Set<String> i10 = this.f27865b.b().i();
        if (i10 != null) {
            this.f27864a = i10;
        }
    }

    private List<ja.a> h(List<ja.a> list) {
        ArrayList arrayList = new ArrayList(list);
        for (ja.a next : list) {
            if (next.d().e()) {
                k3.r0 r0Var = k3.r0.DEBUG;
                k3.A1(r0Var, "Outcomes disabled for channel: " + next.c().toString());
                arrayList.remove(next);
            }
        }
        return arrayList;
    }

    private void i(ma.b bVar) {
        new Thread(new e(bVar), "OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS").start();
    }

    private void j() {
        this.f27865b.b().f(this.f27864a);
    }

    /* access modifiers changed from: private */
    public void k(ma.b bVar) {
        if (bVar.e()) {
            j();
        } else {
            i(bVar);
        }
    }

    private void l(String str, float f10, List<ja.a> list, k3.e1 e1Var) {
        k3.e1 e1Var2 = e1Var;
        long b10 = k3.N0().b() / 1000;
        int e10 = new OSUtils().e();
        String str2 = k3.f27916h;
        boolean z10 = false;
        ma.e eVar = null;
        ma.e eVar2 = null;
        for (ja.a next : list) {
            int i10 = f.f27879a[next.d().ordinal()];
            if (i10 == 1) {
                if (eVar == null) {
                    eVar = new ma.e();
                }
                eVar = t(next, eVar);
            } else if (i10 == 2) {
                if (eVar2 == null) {
                    eVar2 = new ma.e();
                }
                eVar2 = t(next, eVar2);
            } else if (i10 == 3) {
                z10 = true;
            } else if (i10 == 4) {
                k3.a(k3.r0.VERBOSE, "Outcomes disabled for channel: " + next.c());
                if (e1Var2 != null) {
                    e1Var2.e((i2) null);
                    return;
                }
                return;
            }
        }
        if (eVar == null && eVar2 == null && !z10) {
            k3.a(k3.r0.VERBOSE, "Outcomes disabled for all channels");
            if (e1Var2 != null) {
                e1Var2.e((i2) null);
                return;
            }
            return;
        }
        ma.b bVar = new ma.b(str, new ma.d(eVar, eVar2), f10, 0);
        this.f27865b.b().a(str2, e10, bVar, new d(bVar, e1Var, b10, str));
    }

    /* access modifiers changed from: private */
    public void p(ma.b bVar) {
        int e10 = new OSUtils().e();
        this.f27865b.b().a(k3.f27916h, e10, bVar, new c(bVar));
    }

    private void s(String str, List<ja.a> list, k3.e1 e1Var) {
        List<ja.a> h10 = h(list);
        if (h10.isEmpty()) {
            k3.a(k3.r0.DEBUG, "Unique Outcome disabled for current session");
            return;
        }
        boolean z10 = false;
        Iterator<ja.a> it = h10.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().d().c()) {
                    z10 = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z10) {
            List<ja.a> f10 = f(str, h10);
            if (f10 == null) {
                k3.r0 r0Var = k3.r0.DEBUG;
                k3.a(r0Var, "Measure endpoint will not send because unique outcome already sent for: \nSessionInfluences: " + h10.toString() + "\nOutcome name: " + str);
                if (e1Var != null) {
                    e1Var.e((i2) null);
                    return;
                }
                return;
            }
            l(str, 0.0f, f10, e1Var);
        } else if (this.f27864a.contains(str)) {
            k3.r0 r0Var2 = k3.r0.DEBUG;
            k3.a(r0Var2, "Measure endpoint will not send because unique outcome already sent for: \nSession: " + ja.c.UNATTRIBUTED + "\nOutcome name: " + str);
            if (e1Var != null) {
                e1Var.e((i2) null);
            }
        } else {
            this.f27864a.add(str);
            l(str, 0.0f, h10, e1Var);
        }
    }

    private ma.e t(ja.a aVar, ma.e eVar) {
        int i10 = f.f27880b[aVar.c().ordinal()];
        if (i10 == 1) {
            eVar.c(aVar.b());
        } else if (i10 == 2) {
            eVar.d(aVar.b());
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        new Thread(new a(), "OS_DELETE_CACHED_UNIQUE_OUTCOMES_NOTIFICATIONS_THREAD").start();
    }

    /* access modifiers changed from: package-private */
    public void e() {
        k3.a(k3.r0.DEBUG, "OneSignal cleanOutcomes for session");
        this.f27864a = OSUtils.L();
        j();
    }

    /* access modifiers changed from: package-private */
    public void m(List<l1> list) {
        for (l1 next : list) {
            String a10 = next.a();
            if (next.c()) {
                r(a10, (k3.e1) null);
            } else if (next.b() > 0.0f) {
                o(a10, next.b(), (k3.e1) null);
            } else {
                n(a10, (k3.e1) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void n(String str, k3.e1 e1Var) {
        l(str, 0.0f, this.f27866c.e(), e1Var);
    }

    /* access modifiers changed from: package-private */
    public void o(String str, float f10, k3.e1 e1Var) {
        l(str, f10, this.f27866c.e(), e1Var);
    }

    /* access modifiers changed from: package-private */
    public void q() {
        new Thread(new b(), "OS_SEND_SAVED_OUTCOMES").start();
    }

    /* access modifiers changed from: package-private */
    public void r(String str, k3.e1 e1Var) {
        s(str, this.f27866c.e(), e1Var);
    }
}
