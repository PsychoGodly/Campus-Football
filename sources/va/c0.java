package va;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinEventParameters;
import dc.a;
import java.util.HashMap;
import java.util.Map;
import lc.c;
import lc.j;
import lc.k;
import lc.s;

/* compiled from: SqflitePlugin */
public class c0 implements dc.a, k.c {

    /* renamed from: c  reason: collision with root package name */
    static final Map<String, Integer> f23345c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    static final Map<Integer, i> f23346d = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private static final Object f23347f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Object f23348g = new Object();

    /* renamed from: h  reason: collision with root package name */
    static int f23349h = 0;

    /* renamed from: i  reason: collision with root package name */
    static String f23350i;

    /* renamed from: j  reason: collision with root package name */
    private static int f23351j = 0;

    /* renamed from: k  reason: collision with root package name */
    private static int f23352k = 1;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static int f23353l = 0;

    /* renamed from: m  reason: collision with root package name */
    private static o f23354m;

    /* renamed from: a  reason: collision with root package name */
    private Context f23355a;

    /* renamed from: b  reason: collision with root package name */
    private k f23356b;

    /* compiled from: SqflitePlugin */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f23357a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k.d f23358b;

        a(i iVar, k.d dVar) {
            this.f23357a = iVar;
            this.f23358b = dVar;
        }

        public void run() {
            synchronized (c0.f23348g) {
                c0.this.l(this.f23357a);
            }
            this.f23358b.success((Object) null);
        }
    }

    /* compiled from: SqflitePlugin */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f23360a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f23361b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k.d f23362c;

        b(i iVar, String str, k.d dVar) {
            this.f23360a = iVar;
            this.f23361b = str;
            this.f23362c = dVar;
        }

        public void run() {
            synchronized (c0.f23348g) {
                i iVar = this.f23360a;
                if (iVar != null) {
                    c0.this.l(iVar);
                }
                try {
                    if (r.c(c0.f23349h)) {
                        Log.d("Sqflite", "delete database " + this.f23361b);
                    }
                    i.o(this.f23361b);
                } catch (Exception e10) {
                    Log.e("Sqflite", "error " + e10 + " while closing database " + c0.f23353l);
                }
            }
            this.f23362c.success((Object) null);
        }
    }

    private void A(j jVar, k.d dVar) {
        int intValue = ((Integer) jVar.a("id")).intValue();
        i n10 = n(jVar, dVar);
        if (n10 != null) {
            if (r.b(n10.f23370d)) {
                Log.d("Sqflite", n10.A() + "closing " + intValue + " " + n10.f23368b);
            }
            String str = n10.f23368b;
            synchronized (f23347f) {
                f23346d.remove(Integer.valueOf(intValue));
                if (n10.f23367a) {
                    f23345c.remove(str);
                }
            }
            f23354m.a(n10, new a(n10, dVar));
        }
    }

    private void B(j jVar, k.d dVar) {
        dVar.success(Boolean.valueOf(i.x((String) jVar.a("path"))));
    }

    private void C(j jVar, k.d dVar) {
        HashMap hashMap = new HashMap();
        if ("get".equals((String) jVar.a("cmd"))) {
            int i10 = f23349h;
            if (i10 > 0) {
                hashMap.put("logLevel", Integer.valueOf(i10));
            }
            Map<Integer, i> map = f23346d;
            if (!map.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry next : map.entrySet()) {
                    i iVar = (i) next.getValue();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("path", iVar.f23368b);
                    hashMap3.put("singleInstance", Boolean.valueOf(iVar.f23367a));
                    int i11 = iVar.f23370d;
                    if (i11 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i11));
                    }
                    hashMap2.put(((Integer) next.getKey()).toString(), hashMap3);
                }
                hashMap.put("databases", hashMap2);
            }
        }
        dVar.success(hashMap);
    }

    private void D(j jVar, k.d dVar) {
        wa.a.f23548a = Boolean.TRUE.equals(jVar.b());
        wa.a.f23550c = wa.a.f23549b && wa.a.f23548a;
        if (!wa.a.f23548a) {
            f23349h = 0;
        } else if (wa.a.f23550c) {
            f23349h = 2;
        } else if (wa.a.f23548a) {
            f23349h = 1;
        }
        dVar.success((Object) null);
    }

    private void E(j jVar, k.d dVar) {
        i iVar;
        Map<Integer, i> map;
        String str = (String) jVar.a("path");
        synchronized (f23347f) {
            if (r.c(f23349h)) {
                Log.d("Sqflite", "Look for " + str + " in " + f23345c.keySet());
            }
            Map<String, Integer> map2 = f23345c;
            Integer num = map2.get(str);
            if (num == null || (iVar = map.get(num)) == null || !iVar.f23375i.isOpen()) {
                iVar = null;
            } else {
                if (r.c(f23349h)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iVar.A());
                    sb2.append("found single instance ");
                    sb2.append(iVar.F() ? "(in transaction) " : MaxReward.DEFAULT_LABEL);
                    sb2.append(num);
                    sb2.append(" ");
                    sb2.append(str);
                    Log.d("Sqflite", sb2.toString());
                }
                (map = f23346d).remove(num);
                map2.remove(str);
            }
        }
        b bVar = new b(iVar, str, dVar);
        o oVar = f23354m;
        if (oVar != null) {
            oVar.a(iVar, bVar);
        } else {
            bVar.run();
        }
    }

    private void F(j jVar, k.d dVar) {
        i n10 = n(jVar, dVar);
        if (n10 != null) {
            f23354m.a(n10, new x(jVar, dVar, n10));
        }
    }

    private void H(j jVar, k.d dVar) {
        i n10 = n(jVar, dVar);
        if (n10 != null) {
            f23354m.a(n10, new v(jVar, dVar, n10));
        }
    }

    private void I(j jVar, k.d dVar) {
        int i10;
        i iVar;
        j jVar2 = jVar;
        String str = (String) jVar2.a("path");
        Boolean bool = (Boolean) jVar2.a("readOnly");
        boolean o10 = o(str);
        boolean z10 = !Boolean.FALSE.equals(jVar2.a("singleInstance")) && !o10;
        if (z10) {
            synchronized (f23347f) {
                if (r.c(f23349h)) {
                    Log.d("Sqflite", "Look for " + str + " in " + f23345c.keySet());
                }
                Integer num = f23345c.get(str);
                if (!(num == null || (iVar = f23346d.get(num)) == null)) {
                    if (iVar.f23375i.isOpen()) {
                        if (r.c(f23349h)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(iVar.A());
                            sb2.append("re-opened single instance ");
                            sb2.append(iVar.F() ? "(in transaction) " : MaxReward.DEFAULT_LABEL);
                            sb2.append(num);
                            sb2.append(" ");
                            sb2.append(str);
                            Log.d("Sqflite", sb2.toString());
                        }
                        dVar.success(x(num.intValue(), true, iVar.F()));
                        return;
                    } else if (r.c(f23349h)) {
                        Log.d("Sqflite", iVar.A() + "single instance database of " + str + " not opened");
                    }
                }
                k.d dVar2 = dVar;
            }
        } else {
            k.d dVar3 = dVar;
        }
        Object obj = f23347f;
        synchronized (obj) {
            i10 = f23353l + 1;
            f23353l = i10;
        }
        i iVar2 = new i(this.f23355a, str, i10, z10, f23349h);
        synchronized (obj) {
            if (f23354m == null) {
                o b10 = n.b("Sqflite", f23352k, f23351j);
                f23354m = b10;
                b10.start();
                if (r.b(iVar2.f23370d)) {
                    Log.d("Sqflite", iVar2.A() + "starting worker pool with priority " + f23351j);
                }
            }
            iVar2.f23374h = f23354m;
            if (r.b(iVar2.f23370d)) {
                Log.d("Sqflite", iVar2.A() + "opened " + i10 + " " + str);
            }
            b0 b0Var = r1;
            o oVar = f23354m;
            b0 b0Var2 = new b0(o10, str, dVar, bool, iVar2, jVar, z10, i10);
            oVar.a(iVar2, b0Var);
        }
    }

    private void K(j jVar, k.d dVar) {
        i n10 = n(jVar, dVar);
        if (n10 != null) {
            f23354m.a(n10, new u(jVar, dVar, n10));
        }
    }

    private void L(j jVar, k.d dVar) {
        i n10 = n(jVar, dVar);
        if (n10 != null) {
            f23354m.a(n10, new y(jVar, dVar, n10));
        }
    }

    private void M(j jVar, k.d dVar) {
        i n10 = n(jVar, dVar);
        if (n10 != null) {
            f23354m.a(n10, new z(jVar, n10, dVar));
        }
    }

    private void N(j jVar, k.d dVar) {
        i n10 = n(jVar, dVar);
        if (n10 != null) {
            f23354m.a(n10, new w(jVar, dVar, n10));
        }
    }

    /* access modifiers changed from: private */
    public void l(i iVar) {
        try {
            if (r.b(iVar.f23370d)) {
                Log.d("Sqflite", iVar.A() + "closing database ");
            }
            iVar.k();
        } catch (Exception e10) {
            Log.e("Sqflite", "error " + e10 + " while closing database " + f23353l);
        }
        synchronized (f23347f) {
            if (f23346d.isEmpty() && f23354m != null) {
                if (r.b(iVar.f23370d)) {
                    Log.d("Sqflite", iVar.A() + "stopping thread");
                }
                f23354m.c();
                f23354m = null;
            }
        }
    }

    private i m(int i10) {
        return f23346d.get(Integer.valueOf(i10));
    }

    private i n(j jVar, k.d dVar) {
        int intValue = ((Integer) jVar.a("id")).intValue();
        i m10 = m(intValue);
        if (m10 != null) {
            return m10;
        }
        dVar.error("sqlite_error", "database_closed " + intValue, (Object) null);
        return null;
    }

    static boolean o(String str) {
        return str == null || str.equals(":memory:");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r4.success(x(r9, false, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a1, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a2, code lost:
        r6.D(r2, new xa.d(r7, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ab, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void s(boolean r2, java.lang.String r3, lc.k.d r4, java.lang.Boolean r5, va.i r6, lc.j r7, boolean r8, int r9) {
        /*
            java.lang.Object r0 = f23348g
            monitor-enter(r0)
            if (r2 != 0) goto L_0x003e
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x009f }
            r2.<init>(r3)     // Catch:{ all -> 0x009f }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x009f }
            java.lang.String r2 = r2.getParent()     // Catch:{ all -> 0x009f }
            r1.<init>(r2)     // Catch:{ all -> 0x009f }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x009f }
            if (r2 != 0) goto L_0x003e
            boolean r2 = r1.mkdirs()     // Catch:{ all -> 0x009f }
            if (r2 != 0) goto L_0x003e
            boolean r2 = r1.exists()     // Catch:{ all -> 0x009f }
            if (r2 != 0) goto L_0x003e
            java.lang.String r2 = "sqlite_error"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r5.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r6 = "open_failed "
            r5.append(r6)     // Catch:{ all -> 0x009f }
            r5.append(r3)     // Catch:{ all -> 0x009f }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x009f }
            r5 = 0
            r4.error(r2, r3, r5)     // Catch:{ all -> 0x009f }
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            return
        L_0x003e:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00a1 }
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x00a1 }
            if (r2 == 0) goto L_0x004a
            r6.N()     // Catch:{ Exception -> 0x00a1 }
            goto L_0x004d
        L_0x004a:
            r6.M()     // Catch:{ Exception -> 0x00a1 }
        L_0x004d:
            java.lang.Object r2 = f23347f     // Catch:{ all -> 0x009f }
            monitor-enter(r2)     // Catch:{ all -> 0x009f }
            if (r8 == 0) goto L_0x005b
            java.util.Map<java.lang.String, java.lang.Integer> r5 = f23345c     // Catch:{ all -> 0x009c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x009c }
            r5.put(r3, r7)     // Catch:{ all -> 0x009c }
        L_0x005b:
            java.util.Map<java.lang.Integer, va.i> r5 = f23346d     // Catch:{ all -> 0x009c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x009c }
            r5.put(r7, r6)     // Catch:{ all -> 0x009c }
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            int r2 = r6.f23370d     // Catch:{ all -> 0x009f }
            boolean r2 = va.r.b(r2)     // Catch:{ all -> 0x009f }
            if (r2 == 0) goto L_0x0092
            java.lang.String r2 = "Sqflite"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r5.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r6 = r6.A()     // Catch:{ all -> 0x009f }
            r5.append(r6)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = "opened "
            r5.append(r6)     // Catch:{ all -> 0x009f }
            r5.append(r9)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = " "
            r5.append(r6)     // Catch:{ all -> 0x009f }
            r5.append(r3)     // Catch:{ all -> 0x009f }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x009f }
            android.util.Log.d(r2, r3)     // Catch:{ all -> 0x009f }
        L_0x0092:
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            r2 = 0
            java.util.Map r2 = x(r9, r2, r2)
            r4.success(r2)
            return
        L_0x009c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            throw r3     // Catch:{ all -> 0x009f }
        L_0x009f:
            r2 = move-exception
            goto L_0x00ac
        L_0x00a1:
            r2 = move-exception
            xa.d r3 = new xa.d     // Catch:{ all -> 0x009f }
            r3.<init>(r7, r4)     // Catch:{ all -> 0x009f }
            r6.D(r2, r3)     // Catch:{ all -> 0x009f }
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            return
        L_0x00ac:
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: va.c0.s(boolean, java.lang.String, lc.k$d, java.lang.Boolean, va.i, lc.j, boolean, int):void");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void v(j jVar, i iVar, k.d dVar) {
        try {
            iVar.f23375i.setLocale(e0.e((String) jVar.a("locale")));
            dVar.success((Object) null);
        } catch (Exception e10) {
            dVar.error("sqlite_error", "Error calling setLocale: " + e10.getMessage(), (Object) null);
        }
    }

    static Map x(int i10, boolean z10, boolean z11) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i10));
        if (z10) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z11) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    private void y(Context context, c cVar) {
        this.f23355a = context;
        k kVar = new k(cVar, "com.tekartik.sqflite", s.f36131b, cVar.b());
        this.f23356b = kVar;
        kVar.e(this);
    }

    private void z(j jVar, k.d dVar) {
        i n10 = n(jVar, dVar);
        if (n10 != null) {
            f23354m.a(n10, new a0(n10, jVar, dVar));
        }
    }

    /* access modifiers changed from: package-private */
    public void G(j jVar, k.d dVar) {
        if (f23350i == null) {
            f23350i = this.f23355a.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        dVar.success(f23350i);
    }

    /* access modifiers changed from: package-private */
    public void J(j jVar, k.d dVar) {
        Object a10 = jVar.a("androidThreadPriority");
        if (a10 != null) {
            f23351j = ((Integer) a10).intValue();
        }
        Object a11 = jVar.a("androidThreadCount");
        if (a11 != null && !a11.equals(Integer.valueOf(f23352k))) {
            f23352k = ((Integer) a11).intValue();
            o oVar = f23354m;
            if (oVar != null) {
                oVar.c();
                f23354m = null;
            }
        }
        Integer a12 = r.a(jVar);
        if (a12 != null) {
            f23349h = a12.intValue();
        }
        dVar.success((Object) null);
    }

    public void onAttachedToEngine(a.b bVar) {
        y(bVar.a(), bVar.b());
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f23355a = null;
        this.f23356b.e((k.c) null);
        this.f23356b = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1319569547:
                if (str.equals("execute")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1253581933:
                if (str.equals("closeDatabase")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1249474914:
                if (str.equals("options")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1183792455:
                if (str.equals("insert")) {
                    c10 = 3;
                    break;
                }
                break;
            case -838846263:
                if (str.equals("update")) {
                    c10 = 4;
                    break;
                }
                break;
            case -396289107:
                if (str.equals("androidSetLocale")) {
                    c10 = 5;
                    break;
                }
                break;
            case -263511994:
                if (str.equals("deleteDatabase")) {
                    c10 = 6;
                    break;
                }
                break;
            case -198450538:
                if (str.equals("debugMode")) {
                    c10 = 7;
                    break;
                }
                break;
            case -17190427:
                if (str.equals("openDatabase")) {
                    c10 = 8;
                    break;
                }
                break;
            case 93509434:
                if (str.equals("batch")) {
                    c10 = 9;
                    break;
                }
                break;
            case 95458899:
                if (str.equals("debug")) {
                    c10 = 10;
                    break;
                }
                break;
            case 107944136:
                if (str.equals(AppLovinEventParameters.SEARCH_QUERY)) {
                    c10 = 11;
                    break;
                }
                break;
            case 956410295:
                if (str.equals("databaseExists")) {
                    c10 = 12;
                    break;
                }
                break;
            case 1193546321:
                if (str.equals("queryCursorNext")) {
                    c10 = 13;
                    break;
                }
                break;
            case 1385449135:
                if (str.equals("getPlatformVersion")) {
                    c10 = 14;
                    break;
                }
                break;
            case 1863829223:
                if (str.equals("getDatabasesPath")) {
                    c10 = 15;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                F(jVar, dVar);
                return;
            case 1:
                A(jVar, dVar);
                return;
            case 2:
                J(jVar, dVar);
                return;
            case 3:
                H(jVar, dVar);
                return;
            case 4:
                N(jVar, dVar);
                return;
            case 5:
                M(jVar, dVar);
                return;
            case 6:
                E(jVar, dVar);
                return;
            case 7:
                D(jVar, dVar);
                return;
            case 8:
                I(jVar, dVar);
                return;
            case 9:
                z(jVar, dVar);
                return;
            case 10:
                C(jVar, dVar);
                return;
            case 11:
                K(jVar, dVar);
                return;
            case 12:
                B(jVar, dVar);
                return;
            case 13:
                L(jVar, dVar);
                return;
            case 14:
                dVar.success("Android " + Build.VERSION.RELEASE);
                return;
            case 15:
                G(jVar, dVar);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
