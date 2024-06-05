package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.DynamiteApi;
import h5.f;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import m5.g;
import p5.c;
import p5.d;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class DynamiteModule {

    /* renamed from: b  reason: collision with root package name */
    public static final b f15496b = new d();

    /* renamed from: c  reason: collision with root package name */
    public static final b f15497c = new e();

    /* renamed from: d  reason: collision with root package name */
    public static final b f15498d = new f();

    /* renamed from: e  reason: collision with root package name */
    public static final b f15499e = new g();

    /* renamed from: f  reason: collision with root package name */
    public static final b f15500f = new h();

    /* renamed from: g  reason: collision with root package name */
    public static final b f15501g = new i();

    /* renamed from: h  reason: collision with root package name */
    private static Boolean f15502h = null;

    /* renamed from: i  reason: collision with root package name */
    private static String f15503i = null;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f15504j = false;

    /* renamed from: k  reason: collision with root package name */
    private static int f15505k = -1;

    /* renamed from: l  reason: collision with root package name */
    private static Boolean f15506l;

    /* renamed from: m  reason: collision with root package name */
    private static final ThreadLocal f15507m = new ThreadLocal();

    /* renamed from: n  reason: collision with root package name */
    private static final ThreadLocal f15508n = new b();

    /* renamed from: o  reason: collision with root package name */
    private static final b.a f15509o = new c();

    /* renamed from: p  reason: collision with root package name */
    public static final b f15510p = new j();

    /* renamed from: q  reason: collision with root package name */
    private static m f15511q;

    /* renamed from: r  reason: collision with root package name */
    private static n f15512r;

    /* renamed from: a  reason: collision with root package name */
    private final Context f15513a;

    @DynamiteApi
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class a extends Exception {
        /* synthetic */ a(String str, d dVar) {
            super(str);
        }

        /* synthetic */ a(String str, Throwable th, d dVar) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface b {

        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        public interface a {
            int a(Context context, String str, boolean z10) throws a;

            int b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        public static class C0159b {

            /* renamed from: a  reason: collision with root package name */
            public int f15514a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f15515b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f15516c = 0;
        }

        C0159b a(Context context, String str, a aVar) throws a;
    }

    private DynamiteModule(Context context) {
        q.k(context);
        this.f15513a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (p.a(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    public static DynamiteModule e(Context context, b bVar, String str) throws a {
        int i10;
        Boolean bool;
        DynamiteModule dynamiteModule;
        com.google.android.gms.dynamic.a aVar;
        n nVar;
        Boolean valueOf;
        com.google.android.gms.dynamic.a aVar2;
        Context context2 = context;
        b bVar2 = bVar;
        String str2 = str;
        Class<DynamiteModule> cls = DynamiteModule.class;
        ThreadLocal threadLocal = f15507m;
        k kVar = (k) threadLocal.get();
        k kVar2 = new k((c) null);
        threadLocal.set(kVar2);
        ThreadLocal threadLocal2 = f15508n;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            b.C0159b a10 = bVar2.a(context2, str2, f15509o);
            int i11 = a10.f15514a;
            int i12 = a10.f15515b;
            Log.i("DynamiteModule", "Considering local module " + str2 + ":" + i11 + " and remote module " + str2 + ":" + i12);
            int i13 = a10.f15516c;
            if (i13 != 0) {
                if (i13 == -1) {
                    if (a10.f15514a != 0) {
                        i13 = -1;
                    }
                }
                if (!(i13 == 1 && a10.f15515b == 0)) {
                    if (i13 == -1) {
                        DynamiteModule h10 = h(context2, str2);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = kVar2.f15517a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(kVar);
                        return h10;
                    } else if (i13 == 1) {
                        try {
                            int i14 = a10.f15515b;
                            try {
                                synchronized (cls) {
                                    if (k(context)) {
                                        bool = f15502h;
                                    } else {
                                        throw new a("Remote loading disabled", (d) null);
                                    }
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of " + str2 + ", version >= " + i14);
                                        synchronized (cls) {
                                            nVar = f15512r;
                                        }
                                        if (nVar != null) {
                                            k kVar3 = (k) threadLocal.get();
                                            if (kVar3 == null || kVar3.f15517a == null) {
                                                throw new a("No result cursor", (d) null);
                                            }
                                            Context applicationContext = context.getApplicationContext();
                                            Cursor cursor2 = kVar3.f15517a;
                                            com.google.android.gms.dynamic.b.B1(null);
                                            synchronized (cls) {
                                                valueOf = Boolean.valueOf(f15505k >= 2);
                                            }
                                            if (valueOf.booleanValue()) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                aVar2 = nVar.A1(com.google.android.gms.dynamic.b.B1(applicationContext), str2, i14, com.google.android.gms.dynamic.b.B1(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                aVar2 = nVar.M0(com.google.android.gms.dynamic.b.B1(applicationContext), str2, i14, com.google.android.gms.dynamic.b.B1(cursor2));
                                            }
                                            Context context3 = (Context) com.google.android.gms.dynamic.b.A1(aVar2);
                                            if (context3 != null) {
                                                dynamiteModule = new DynamiteModule(context3);
                                            } else {
                                                throw new a("Failed to get module context", (d) null);
                                            }
                                        } else {
                                            throw new a("DynamiteLoaderV2 was not cached.", (d) null);
                                        }
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of " + str2 + ", version >= " + i14);
                                        m l10 = l(context);
                                        if (l10 != null) {
                                            int zze = l10.zze();
                                            if (zze >= 3) {
                                                k kVar4 = (k) threadLocal.get();
                                                if (kVar4 != null) {
                                                    aVar = l10.C1(com.google.android.gms.dynamic.b.B1(context), str2, i14, com.google.android.gms.dynamic.b.B1(kVar4.f15517a));
                                                } else {
                                                    throw new a("No cached result cursor holder", (d) null);
                                                }
                                            } else if (zze == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                aVar = l10.D1(com.google.android.gms.dynamic.b.B1(context), str2, i14);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                aVar = l10.B1(com.google.android.gms.dynamic.b.B1(context), str2, i14);
                                            }
                                            Object A1 = com.google.android.gms.dynamic.b.A1(aVar);
                                            if (A1 != null) {
                                                dynamiteModule = new DynamiteModule((Context) A1);
                                            } else {
                                                throw new a("Failed to load remote module.", (d) null);
                                            }
                                        } else {
                                            throw new a("Failed to create IDynamiteLoader.", (d) null);
                                        }
                                    }
                                    if (longValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = kVar2.f15517a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(kVar);
                                    return dynamiteModule;
                                }
                                throw new a("Failed to determine which loading route to use.", (d) null);
                            } catch (RemoteException e10) {
                                throw new a("Failed to load remote module.", e10, (d) null);
                            } catch (a e11) {
                                throw e11;
                            } catch (Throwable th) {
                                g.a(context2, th);
                                throw new a("Failed to load remote module.", th, (d) null);
                            }
                        } catch (a e12) {
                            String message = e12.getMessage();
                            Log.w("DynamiteModule", "Failed to load remote module: " + message);
                            int i15 = a10.f15514a;
                            if (i15 != 0) {
                                if (bVar.a(context2, str2, new l(i15, 0)).f15516c == -1) {
                                    DynamiteModule h11 = h(context2, str2);
                                    if (i10 != 0) {
                                        f15508n.set(Long.valueOf(longValue));
                                    }
                                    return h11;
                                }
                            }
                            throw new a("Remote load failed. No local fallback found.", e12, (d) null);
                        }
                    } else {
                        throw new a("VersionPolicy returned invalid code:" + i13, (d) null);
                    }
                }
            }
            int i16 = a10.f15514a;
            int i17 = a10.f15515b;
            throw new a("No acceptable module " + str2 + " found. Local version is " + i16 + " and remote version is " + i17 + ".", (d) null);
        } finally {
            if (longValue == 0) {
                f15508n.remove();
            } else {
                f15508n.set(Long.valueOf(longValue));
            }
            Cursor cursor4 = kVar2.f15517a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f15507m.set(kVar);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0056=Splitter:B:31:0x0056, B:50:0x009a=Splitter:B:50:0x009a, B:17:0x003b=Splitter:B:17:0x003b} */
    public static int f(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.Boolean r1 = f15502h     // Catch:{ all -> 0x01bf }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x00d8
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x00b2 }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            if (r5 != r6) goto L_0x0036
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x0036:
            if (r5 == 0) goto L_0x003f
            i(r5)     // Catch:{ a -> 0x003b }
        L_0x003b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x003f:
            boolean r5 = k(r10)     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x0048
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x01bf }
            return r3
        L_0x0048:
            boolean r5 = f15504j     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x00a7
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b2 }
            boolean r6 = r5.equals(r2)     // Catch:{ all -> 0x00b2 }
            if (r6 == 0) goto L_0x0055
            goto L_0x00a7
        L_0x0055:
            r6 = 1
            int r6 = g(r10, r11, r12, r6)     // Catch:{ a -> 0x009d }
            java.lang.String r7 = f15503i     // Catch:{ a -> 0x009d }
            if (r7 == 0) goto L_0x009a
            boolean r7 = r7.isEmpty()     // Catch:{ a -> 0x009d }
            if (r7 == 0) goto L_0x0065
            goto L_0x009a
        L_0x0065:
            java.lang.ClassLoader r7 = p5.b.a()     // Catch:{ a -> 0x009d }
            if (r7 == 0) goto L_0x006c
            goto L_0x008f
        L_0x006c:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x009d }
            r8 = 29
            if (r7 < r8) goto L_0x0081
            dalvik.system.DelegateLastClassLoader r7 = new dalvik.system.DelegateLastClassLoader     // Catch:{ a -> 0x009d }
            java.lang.String r8 = f15503i     // Catch:{ a -> 0x009d }
            com.google.android.gms.common.internal.q.k(r8)     // Catch:{ a -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ a -> 0x009d }
            goto L_0x008f
        L_0x0081:
            com.google.android.gms.dynamite.a r7 = new com.google.android.gms.dynamite.a     // Catch:{ a -> 0x009d }
            java.lang.String r8 = f15503i     // Catch:{ a -> 0x009d }
            com.google.android.gms.common.internal.q.k(r8)     // Catch:{ a -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ a -> 0x009d }
        L_0x008f:
            i(r7)     // Catch:{ a -> 0x009d }
            r1.set(r2, r7)     // Catch:{ a -> 0x009d }
            f15502h = r5     // Catch:{ a -> 0x009d }
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x01bf }
            return r6
        L_0x009a:
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x01bf }
            return r6
        L_0x009d:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b2 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x00a7:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b2 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            goto L_0x00d6
        L_0x00b2:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            goto L_0x00ba
        L_0x00b7:
            r1 = move-exception
            goto L_0x00ba
        L_0x00b9:
            r1 = move-exception
        L_0x00ba:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01bf }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bf }
            r4.<init>()     // Catch:{ all -> 0x01bf }
            java.lang.String r5 = "Failed to load module via V2: "
            r4.append(r5)     // Catch:{ all -> 0x01bf }
            r4.append(r1)     // Catch:{ all -> 0x01bf }
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01bf }
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x01bf }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01bf }
        L_0x00d6:
            f15502h = r1     // Catch:{ all -> 0x01bf }
        L_0x00d8:
            monitor-exit(r0)     // Catch:{ all -> 0x01bf }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x0100
            int r10 = g(r10, r11, r12, r3)     // Catch:{ a -> 0x00e4 }
            return r10
        L_0x00e4:
            r11 = move-exception
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x01c2 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c2 }
            r12.<init>()     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x01c2 }
            r12.append(r11)     // Catch:{ all -> 0x01c2 }
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x01c2 }
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x01c2 }
            return r3
        L_0x0100:
            com.google.android.gms.dynamite.m r4 = l(r10)     // Catch:{ all -> 0x01c2 }
            if (r4 != 0) goto L_0x0108
            goto L_0x01b6
        L_0x0108:
            int r0 = r4.zze()     // Catch:{ RemoteException -> 0x0195 }
            r1 = 3
            if (r0 < r1) goto L_0x0170
            java.lang.ThreadLocal r0 = f15507m     // Catch:{ RemoteException -> 0x0195 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0195 }
            com.google.android.gms.dynamite.k r0 = (com.google.android.gms.dynamite.k) r0     // Catch:{ RemoteException -> 0x0195 }
            if (r0 == 0) goto L_0x0123
            android.database.Cursor r0 = r0.f15517a     // Catch:{ RemoteException -> 0x0195 }
            if (r0 == 0) goto L_0x0123
            int r3 = r0.getInt(r3)     // Catch:{ RemoteException -> 0x0195 }
            goto L_0x01b6
        L_0x0123:
            com.google.android.gms.dynamic.a r5 = com.google.android.gms.dynamic.b.B1(r10)     // Catch:{ RemoteException -> 0x0195 }
            java.lang.ThreadLocal r0 = f15508n     // Catch:{ RemoteException -> 0x0195 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0195 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x0195 }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x0195 }
            r6 = r11
            r7 = r12
            com.google.android.gms.dynamic.a r11 = r4.E1(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x0195 }
            java.lang.Object r11 = com.google.android.gms.dynamic.b.A1(r11)     // Catch:{ RemoteException -> 0x0195 }
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch:{ RemoteException -> 0x0195 }
            if (r11 == 0) goto L_0x015d
            boolean r12 = r11.moveToFirst()     // Catch:{ RemoteException -> 0x016d, all -> 0x016a }
            if (r12 != 0) goto L_0x0148
            goto L_0x015d
        L_0x0148:
            int r12 = r11.getInt(r3)     // Catch:{ RemoteException -> 0x016d, all -> 0x016a }
            if (r12 <= 0) goto L_0x0155
            boolean r0 = j(r11)     // Catch:{ RemoteException -> 0x016d, all -> 0x016a }
            if (r0 == 0) goto L_0x0155
            goto L_0x0156
        L_0x0155:
            r2 = r11
        L_0x0156:
            if (r2 == 0) goto L_0x015b
            r2.close()     // Catch:{ all -> 0x01c2 }
        L_0x015b:
            r3 = r12
            goto L_0x01b6
        L_0x015d:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r12, r0)     // Catch:{ RemoteException -> 0x016d, all -> 0x016a }
            if (r11 == 0) goto L_0x01b6
            r11.close()     // Catch:{ all -> 0x01c2 }
            goto L_0x01b6
        L_0x016a:
            r12 = move-exception
            r2 = r11
            goto L_0x01b9
        L_0x016d:
            r12 = move-exception
            r2 = r11
            goto L_0x0197
        L_0x0170:
            r1 = 2
            if (r0 != r1) goto L_0x0183
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x0195 }
            com.google.android.gms.dynamic.a r0 = com.google.android.gms.dynamic.b.B1(r10)     // Catch:{ RemoteException -> 0x0195 }
            int r3 = r4.A1(r0, r11, r12)     // Catch:{ RemoteException -> 0x0195 }
            goto L_0x01b6
        L_0x0183:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x0195 }
            com.google.android.gms.dynamic.a r0 = com.google.android.gms.dynamic.b.B1(r10)     // Catch:{ RemoteException -> 0x0195 }
            int r3 = r4.M0(r0, r11, r12)     // Catch:{ RemoteException -> 0x0195 }
            goto L_0x01b6
        L_0x0193:
            r12 = r11
            goto L_0x01b9
        L_0x0195:
            r11 = move-exception
            r12 = r11
        L_0x0197:
            java.lang.String r11 = r12.getMessage()     // Catch:{ all -> 0x01b7 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b7 }
            r12.<init>()     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x01b7 }
            r12.append(r11)     // Catch:{ all -> 0x01b7 }
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x01b7 }
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x01b7 }
            if (r2 == 0) goto L_0x01b6
            r2.close()     // Catch:{ all -> 0x01c2 }
        L_0x01b6:
            return r3
        L_0x01b7:
            r11 = move-exception
            goto L_0x0193
        L_0x01b9:
            if (r2 == 0) goto L_0x01be
            r2.close()     // Catch:{ all -> 0x01c2 }
        L_0x01be:
            throw r12     // Catch:{ all -> 0x01c2 }
        L_0x01bf:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01bf }
            throw r11     // Catch:{ all -> 0x01c2 }
        L_0x01c2:
            r11 = move-exception
            m5.g.a(r10, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bc A[Catch:{ all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bd A[Catch:{ all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int g(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) throws com.google.android.gms.dynamite.DynamiteModule.a {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = f15508n     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            r12.<init>()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            if (r10 == 0) goto L_0x00a3
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009b }
            if (r11 == 0) goto L_0x00a3
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x009b }
            if (r12 <= 0) goto L_0x008e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x009b }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008b }
            f15503i = r2     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            f15505k = r2     // Catch:{ all -> 0x008b }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            f15504j = r9     // Catch:{ all -> 0x008b }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            boolean r1 = j(r10)     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x008e
            r10 = r0
            goto L_0x008e
        L_0x008b:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x008e:
            if (r13 == 0) goto L_0x009d
            if (r11 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            r11 = move-exception
            goto L_0x00b8
        L_0x009d:
            if (r10 == 0) goto L_0x00a2
            r10.close()
        L_0x00a2:
            return r12
        L_0x00a3:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x009b }
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x00b2:
            r10 = move-exception
            r11 = r10
            goto L_0x00c7
        L_0x00b5:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00b8:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch:{ all -> 0x00c5 }
            if (r12 == 0) goto L_0x00bd
            throw r11     // Catch:{ all -> 0x00c5 }
        L_0x00bd:
            com.google.android.gms.dynamite.DynamiteModule$a r12 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00c5 }
            java.lang.String r13 = "V2 version check failed"
            r12.<init>(r13, r11, r0)     // Catch:{ all -> 0x00c5 }
            throw r12     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r11 = move-exception
            r0 = r10
        L_0x00c7:
            if (r0 == 0) goto L_0x00cc
            r0.close()
        L_0x00cc:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static void i(ClassLoader classLoader) throws a {
        n nVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof n) {
                    nVar = (n) queryLocalInterface;
                } else {
                    nVar = new n(iBinder);
                }
            }
            f15512r = nVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new a("Failed to instantiate dynamite loader", e10, (d) null);
        }
    }

    private static boolean j(Cursor cursor) {
        k kVar = (k) f15507m.get();
        if (kVar == null || kVar.f15517a != null) {
            return false;
        }
        kVar.f15517a = cursor;
        return true;
    }

    private static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(f15506l)) {
            return true;
        }
        boolean z10 = false;
        if (f15506l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (f.h().j(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f15506l = valueOf;
            z10 = valueOf.booleanValue();
            if (z10 && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f15504j = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    private static m l(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = f15511q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = queryLocalInterface instanceof m ? (m) queryLocalInterface : new m(iBinder);
                }
                if (mVar != null) {
                    f15511q = mVar;
                    return mVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
        }
        return null;
    }

    public Context b() {
        return this.f15513a;
    }

    public IBinder d(String str) throws a {
        try {
            return (IBinder) this.f15513a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, (d) null);
        }
    }
}
