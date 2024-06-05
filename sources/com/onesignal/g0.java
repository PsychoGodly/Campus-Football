package com.onesignal;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.k3;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: LocationController */
class g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final List<e> f27797a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private static ConcurrentHashMap<f, b> f27798b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f27799c;

    /* renamed from: d  reason: collision with root package name */
    static final Object f27800d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static c f27801e;

    /* renamed from: f  reason: collision with root package name */
    static Thread f27802f;

    /* renamed from: g  reason: collision with root package name */
    static Context f27803g;

    /* renamed from: h  reason: collision with root package name */
    static Location f27804h;

    /* renamed from: i  reason: collision with root package name */
    static String f27805i;

    /* compiled from: LocationController */
    class a {
        a() {
        }
    }

    /* compiled from: LocationController */
    interface b {
        void a(d dVar);

        f getType();
    }

    /* compiled from: LocationController */
    protected static class c extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        Handler f27806a = new Handler(getLooper());

        c() {
            super("OSH_LocationHandlerThread");
            start();
        }
    }

    /* compiled from: LocationController */
    static class d {

        /* renamed from: a  reason: collision with root package name */
        Double f27807a;

        /* renamed from: b  reason: collision with root package name */
        Double f27808b;

        /* renamed from: c  reason: collision with root package name */
        Float f27809c;

        /* renamed from: d  reason: collision with root package name */
        Integer f27810d;

        /* renamed from: e  reason: collision with root package name */
        Boolean f27811e;

        /* renamed from: f  reason: collision with root package name */
        Long f27812f;

        d() {
        }

        public String toString() {
            return "LocationPoint{lat=" + this.f27807a + ", log=" + this.f27808b + ", accuracy=" + this.f27809c + ", type=" + this.f27810d + ", bg=" + this.f27811e + ", timeStamp=" + this.f27812f + '}';
        }
    }

    /* compiled from: LocationController */
    static abstract class e implements b {
        e() {
        }

        /* access modifiers changed from: package-private */
        public void b(k3.g1 g1Var) {
        }
    }

    /* compiled from: LocationController */
    enum f {
        STARTUP,
        PROMPT_LOCATION,
        SYNC_SERVICE
    }

    g0() {
    }

    private static void a(b bVar) {
        if (bVar instanceof e) {
            List<e> list = f27797a;
            synchronized (list) {
                list.add((e) bVar);
            }
        }
    }

    private static void b(Context context, boolean z10, boolean z11) {
        y a10 = z3.f28487a.a(context, context.getPackageName(), 4096);
        if (!a10.b() || a10.a() == null) {
            n(z10, k3.g1.ERROR);
            return;
        }
        if (Arrays.asList(a10.a().requestedPermissions).contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
            f27805i = "android.permission.ACCESS_BACKGROUND_LOCATION";
        }
        if (f27805i == null || !z10) {
            n(z10, k3.g1.PERMISSION_GRANTED);
            p();
            return;
        }
        h0.f27830a.d(z11, f27805i);
    }

    private static void c(d dVar) {
        Thread thread;
        Class<g0> cls = g0.class;
        HashMap hashMap = new HashMap();
        synchronized (cls) {
            hashMap.putAll(f27798b);
            f27798b.clear();
            thread = f27802f;
        }
        for (f fVar : hashMap.keySet()) {
            ((b) hashMap.get(fVar)).a(dVar);
        }
        if (thread != null && !Thread.currentThread().equals(thread)) {
            thread.interrupt();
        }
        if (thread == f27802f) {
            synchronized (cls) {
                if (thread == f27802f) {
                    f27802f = null;
                }
            }
        }
        o(k3.N0().b());
    }

    protected static void d(Location location) {
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.a(r0Var, "LocationController fireCompleteForLocation with location: " + location);
        d dVar = new d();
        dVar.f27809c = Float.valueOf(location.getAccuracy());
        dVar.f27811e = Boolean.valueOf(k3.h1() ^ true);
        dVar.f27810d = Integer.valueOf(f27799c ^ true ? 1 : 0);
        dVar.f27812f = Long.valueOf(location.getTime());
        if (f27799c) {
            dVar.f27807a = Double.valueOf(new BigDecimal(location.getLatitude()).setScale(7, RoundingMode.HALF_UP).doubleValue());
            dVar.f27808b = Double.valueOf(new BigDecimal(location.getLongitude()).setScale(7, RoundingMode.HALF_UP).doubleValue());
        } else {
            dVar.f27807a = Double.valueOf(location.getLatitude());
            dVar.f27808b = Double.valueOf(location.getLongitude());
        }
        c(dVar);
        m(f27803g);
    }

    static void e() {
        synchronized (f27800d) {
            if (j()) {
                u.e();
            } else if (k()) {
                b0.e();
            }
        }
        c((d) null);
    }

    private static long f() {
        return t3.d(t3.f28204a, "OS_LAST_LOCATION_TIME", -600000);
    }

    static void g(Context context, boolean z10, boolean z11, b bVar) {
        int i10;
        a(bVar);
        f27803g = context;
        f27798b.put(bVar.getType(), bVar);
        if (!k3.j1()) {
            n(z10, k3.g1.ERROR);
            e();
            return;
        }
        int a10 = h.a(context, "android.permission.ACCESS_FINE_LOCATION");
        int i11 = -1;
        if (a10 == -1) {
            i10 = h.a(context, "android.permission.ACCESS_COARSE_LOCATION");
            f27799c = true;
        } else {
            i10 = -1;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            i11 = h.a(context, "android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        if (i12 < 23) {
            if (a10 == 0 || i10 == 0) {
                n(z10, k3.g1.PERMISSION_GRANTED);
                p();
                return;
            }
            n(z10, k3.g1.LOCATION_PERMISSIONS_MISSING_MANIFEST);
            bVar.a((d) null);
        } else if (a10 != 0) {
            y a11 = z3.f28487a.a(context, context.getPackageName(), 4096);
            if (!a11.b() || a11.a() == null) {
                n(z10, k3.g1.ERROR);
                return;
            }
            List asList = Arrays.asList(a11.a().requestedPermissions);
            k3.g1 g1Var = k3.g1.PERMISSION_DENIED;
            if (asList.contains("android.permission.ACCESS_FINE_LOCATION")) {
                f27805i = "android.permission.ACCESS_FINE_LOCATION";
            } else if (!asList.contains("android.permission.ACCESS_COARSE_LOCATION")) {
                k3.A1(k3.r0.INFO, "Location permissions not added on AndroidManifest file");
                g1Var = k3.g1.LOCATION_PERMISSIONS_MISSING_MANIFEST;
            } else if (i10 != 0) {
                f27805i = "android.permission.ACCESS_COARSE_LOCATION";
            } else if (i12 >= 29 && asList.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                f27805i = "android.permission.ACCESS_BACKGROUND_LOCATION";
            }
            if (f27805i != null && z10) {
                h0.f27830a.d(z11, f27805i);
            } else if (i10 == 0) {
                n(z10, k3.g1.PERMISSION_GRANTED);
                p();
            } else {
                n(z10, g1Var);
                e();
            }
        } else if (i12 < 29 || i11 == 0) {
            n(z10, k3.g1.PERMISSION_GRANTED);
            p();
        } else {
            b(context, z10, z11);
        }
    }

    static c h() {
        if (f27801e == null) {
            synchronized (f27800d) {
                if (f27801e == null) {
                    f27801e = new c();
                }
            }
        }
        return f27801e;
    }

    private static boolean i(Context context) {
        return h.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || h.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    static boolean j() {
        return OSUtils.B() && OSUtils.s();
    }

    static boolean k() {
        return OSUtils.G() && OSUtils.v();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void l() {
        /*
            java.lang.Object r0 = f27800d
            monitor-enter(r0)
            boolean r1 = j()     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x000e
            com.onesignal.u.l()     // Catch:{ all -> 0x0019 }
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x000e:
            boolean r1 = k()     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0017
            com.onesignal.b0.l()     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.g0.l():void");
    }

    static boolean m(Context context) {
        if (!i(context)) {
            k3.A1(k3.r0.DEBUG, "LocationController scheduleUpdate not possible, location permission not enabled");
            return false;
        } else if (!k3.j1()) {
            k3.A1(k3.r0.DEBUG, "LocationController scheduleUpdate not possible, location shared not enabled");
            return false;
        } else {
            long b10 = k3.N0().b() - f();
            long j10 = (k3.h1() ? 300 : 600) * 1000;
            k3.r0 r0Var = k3.r0.DEBUG;
            k3.A1(r0Var, "LocationController scheduleUpdate lastTime: " + b10 + " minTime: " + j10);
            x2.q().r(context, j10 - b10);
            return true;
        }
    }

    static void n(boolean z10, k3.g1 g1Var) {
        if (!z10) {
            k3.A1(k3.r0.DEBUG, "LocationController sendAndClearPromptHandlers from non prompt flow");
            return;
        }
        List<e> list = f27797a;
        synchronized (list) {
            k3.A1(k3.r0.DEBUG, "LocationController calling prompt handlers");
            for (e b10 : list) {
                b10.b(g1Var);
            }
            f27797a.clear();
        }
    }

    private static void o(long j10) {
        t3.l(t3.f28204a, "OS_LAST_LOCATION_TIME", j10);
    }

    static void p() {
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.a(r0Var, "LocationController startGetLocation with lastLocation: " + f27804h);
        try {
            if (j()) {
                u.p();
            } else if (k()) {
                b0.p();
            } else {
                k3.a(k3.r0.WARN, "LocationController startGetLocation not possible, no location dependency found");
                e();
            }
        } catch (Throwable th) {
            k3.b(k3.r0.WARN, "Location permission exists but there was an error initializing: ", th);
            e();
        }
    }
}
