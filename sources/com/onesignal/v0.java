package com.onesignal;

import com.onesignal.f3;
import com.onesignal.k3;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimerTask;

/* compiled from: OSDynamicTriggerController */
class v0 {

    /* renamed from: c  reason: collision with root package name */
    private static Date f28266c = new Date();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f28267a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<String> f28268b = new ArrayList<>();

    /* compiled from: OSDynamicTriggerController */
    class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f28269a;

        a(String str) {
            this.f28269a = str;
        }

        public void run() {
            v0.this.f28268b.remove(this.f28269a);
            v0.this.f28267a.a();
        }
    }

    /* compiled from: OSDynamicTriggerController */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f28271a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f28272b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        static {
            /*
                com.onesignal.f3$b[] r0 = com.onesignal.f3.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28272b = r0
                r1 = 1
                com.onesignal.f3$b r2 = com.onesignal.f3.b.LESS_THAN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f28272b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.f3$b r3 = com.onesignal.f3.b.LESS_THAN_OR_EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f28272b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onesignal.f3$b r3 = com.onesignal.f3.b.GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r2 = f28272b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onesignal.f3$b r3 = com.onesignal.f3.b.GREATER_THAN_OR_EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r2 = f28272b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onesignal.f3$b r3 = com.onesignal.f3.b.EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x003e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r4 = 5
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r2 = f28272b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onesignal.f3$b r3 = com.onesignal.f3.b.NOT_EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r4 = 6
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.onesignal.f3$a[] r2 = com.onesignal.f3.a.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f28271a = r2
                com.onesignal.f3$a r3 = com.onesignal.f3.a.SESSION_TIME     // Catch:{ NoSuchFieldError -> 0x005a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r1 = f28271a     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.onesignal.f3$a r2 = com.onesignal.f3.a.TIME_SINCE_LAST_IN_APP     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.v0.b.<clinit>():void");
        }
    }

    /* compiled from: OSDynamicTriggerController */
    interface c {
        void a();

        void b(String str);
    }

    v0(c cVar) {
        this.f28267a = cVar;
    }

    private static boolean d(double d10, double d11, f3.b bVar) {
        switch (b.f28272b[bVar.ordinal()]) {
            case 1:
                if (d11 < d10) {
                    return true;
                }
                return false;
            case 2:
                if (d11 <= d10 || f(d10, d11)) {
                    return true;
                }
                return false;
            case 3:
                if (d11 >= d10) {
                    return true;
                }
                return false;
            case 4:
                if (d11 >= d10 || f(d10, d11)) {
                    return true;
                }
                return false;
            case 5:
                return f(d10, d11);
            case 6:
                return !f(d10, d11);
            default:
                k3.r0 r0Var = k3.r0.ERROR;
                k3.A1(r0Var, "Attempted to apply an invalid operator on a time-based in-app-message trigger: " + bVar.toString());
                return false;
        }
    }

    static void e() {
        f28266c = new Date();
    }

    private static boolean f(double d10, double d11) {
        return Math.abs(d10 - d11) < 0.3d;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(com.onesignal.f3 r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r15.f27744e
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.util.ArrayList<java.lang.String> r0 = r14.f28268b
            monitor-enter(r0)
            java.lang.Object r2 = r15.f27744e     // Catch:{ all -> 0x009e }
            boolean r2 = r2 instanceof java.lang.Number     // Catch:{ all -> 0x009e }
            if (r2 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            return r1
        L_0x0011:
            int[] r2 = com.onesignal.v0.b.f28271a     // Catch:{ all -> 0x009e }
            com.onesignal.f3$a r3 = r15.f27741b     // Catch:{ all -> 0x009e }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x009e }
            r2 = r2[r3]     // Catch:{ all -> 0x009e }
            r3 = 1
            r4 = 0
            if (r2 == r3) goto L_0x004b
            r6 = 2
            if (r2 == r6) goto L_0x0025
            r6 = r4
            goto L_0x005b
        L_0x0025:
            com.onesignal.f1 r2 = com.onesignal.k3.n0()     // Catch:{ all -> 0x009e }
            boolean r2 = r2.Y()     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x0031
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            return r1
        L_0x0031:
            com.onesignal.f1 r2 = com.onesignal.k3.n0()     // Catch:{ all -> 0x009e }
            java.util.Date r2 = r2.f27699u     // Catch:{ all -> 0x009e }
            if (r2 != 0) goto L_0x003d
            r6 = 999999(0xf423f, double:4.94065E-318)
            goto L_0x005b
        L_0x003d:
            java.util.Date r6 = new java.util.Date     // Catch:{ all -> 0x009e }
            r6.<init>()     // Catch:{ all -> 0x009e }
            long r6 = r6.getTime()     // Catch:{ all -> 0x009e }
            long r8 = r2.getTime()     // Catch:{ all -> 0x009e }
            goto L_0x005a
        L_0x004b:
            java.util.Date r2 = new java.util.Date     // Catch:{ all -> 0x009e }
            r2.<init>()     // Catch:{ all -> 0x009e }
            long r6 = r2.getTime()     // Catch:{ all -> 0x009e }
            java.util.Date r2 = f28266c     // Catch:{ all -> 0x009e }
            long r8 = r2.getTime()     // Catch:{ all -> 0x009e }
        L_0x005a:
            long r6 = r6 - r8
        L_0x005b:
            java.lang.String r2 = r15.f27740a     // Catch:{ all -> 0x009e }
            java.lang.Object r8 = r15.f27744e     // Catch:{ all -> 0x009e }
            java.lang.Number r8 = (java.lang.Number) r8     // Catch:{ all -> 0x009e }
            double r8 = r8.doubleValue()     // Catch:{ all -> 0x009e }
            r10 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r8 = r8 * r10
            long r8 = (long) r8     // Catch:{ all -> 0x009e }
            double r10 = (double) r8     // Catch:{ all -> 0x009e }
            double r12 = (double) r6     // Catch:{ all -> 0x009e }
            com.onesignal.f3$b r15 = r15.f27743d     // Catch:{ all -> 0x009e }
            boolean r15 = d(r10, r12, r15)     // Catch:{ all -> 0x009e }
            if (r15 == 0) goto L_0x007e
            com.onesignal.v0$c r15 = r14.f28267a     // Catch:{ all -> 0x009e }
            r15.b(r2)     // Catch:{ all -> 0x009e }
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            return r3
        L_0x007e:
            long r8 = r8 - r6
            int r15 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r15 > 0) goto L_0x0085
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            return r1
        L_0x0085:
            java.util.ArrayList<java.lang.String> r15 = r14.f28268b     // Catch:{ all -> 0x009e }
            boolean r15 = r15.contains(r2)     // Catch:{ all -> 0x009e }
            if (r15 == 0) goto L_0x008f
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            return r1
        L_0x008f:
            com.onesignal.v0$a r15 = new com.onesignal.v0$a     // Catch:{ all -> 0x009e }
            r15.<init>(r2)     // Catch:{ all -> 0x009e }
            com.onesignal.w0.a(r15, r2, r8)     // Catch:{ all -> 0x009e }
            java.util.ArrayList<java.lang.String> r15 = r14.f28268b     // Catch:{ all -> 0x009e }
            r15.add(r2)     // Catch:{ all -> 0x009e }
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            return r1
        L_0x009e:
            r15 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.v0.c(com.onesignal.f3):boolean");
    }
}
