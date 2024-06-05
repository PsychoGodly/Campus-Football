package kc;

import java.util.Locale;
import lc.t;

/* compiled from: LifecycleChannel */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private b f35816a;

    /* renamed from: b  reason: collision with root package name */
    private b f35817b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f35818c;

    /* renamed from: d  reason: collision with root package name */
    private final lc.a<String> f35819d;

    /* compiled from: LifecycleChannel */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f35820a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                kc.f$b[] r0 = kc.f.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35820a = r0
                kc.f$b r1 = kc.f.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35820a     // Catch:{ NoSuchFieldError -> 0x001d }
                kc.f$b r1 = kc.f.b.INACTIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35820a     // Catch:{ NoSuchFieldError -> 0x0028 }
                kc.f$b r1 = kc.f.b.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35820a     // Catch:{ NoSuchFieldError -> 0x0033 }
                kc.f$b r1 = kc.f.b.PAUSED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35820a     // Catch:{ NoSuchFieldError -> 0x003e }
                kc.f$b r1 = kc.f.b.DETACHED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kc.f.a.<clinit>():void");
        }
    }

    /* compiled from: LifecycleChannel */
    private enum b {
        DETACHED,
        RESUMED,
        INACTIVE,
        HIDDEN,
        PAUSED
    }

    public f(zb.a aVar) {
        this((lc.a<String>) new lc.a(aVar, "flutter/lifecycle", t.f36134b));
    }

    private void g(b bVar, boolean z10) {
        b bVar2 = this.f35816a;
        if (bVar2 != bVar || z10 != this.f35818c) {
            if (bVar == null && bVar2 == null) {
                this.f35818c = z10;
                return;
            }
            b bVar3 = null;
            int i10 = a.f35820a[bVar.ordinal()];
            if (i10 == 1) {
                bVar3 = z10 ? b.RESUMED : b.INACTIVE;
            } else if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                bVar3 = bVar;
            }
            this.f35816a = bVar;
            this.f35818c = z10;
            if (bVar3 != this.f35817b) {
                String str = "AppLifecycleState." + bVar3.name().toLowerCase(Locale.ROOT);
                xb.b.f("LifecycleChannel", "Sending " + str + " message.");
                this.f35819d.c(str);
                this.f35817b = bVar3;
            }
        }
    }

    public void a() {
        g(this.f35816a, true);
    }

    public void b() {
        g(b.DETACHED, this.f35818c);
    }

    public void c() {
        g(b.INACTIVE, this.f35818c);
    }

    public void d() {
        g(b.PAUSED, this.f35818c);
    }

    public void e() {
        g(b.RESUMED, this.f35818c);
    }

    public void f() {
        g(this.f35816a, false);
    }

    public f(lc.a<String> aVar) {
        this.f35816a = null;
        this.f35817b = null;
        this.f35818c = true;
        this.f35819d = aVar;
    }
}
