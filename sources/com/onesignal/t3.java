package com.onesignal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.k3;
import java.util.HashMap;
import java.util.Set;

/* compiled from: OneSignalPrefs */
class t3 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f28204a = k3.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    static HashMap<String, HashMap<String, Object>> f28205b;

    /* renamed from: c  reason: collision with root package name */
    public static a f28206c;

    /* compiled from: OneSignalPrefs */
    public static class a extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        private Handler f28207a;

        /* renamed from: b  reason: collision with root package name */
        private long f28208b = 0;

        /* renamed from: c  reason: collision with root package name */
        private boolean f28209c;

        /* renamed from: com.onesignal.t3$a$a  reason: collision with other inner class name */
        /* compiled from: OneSignalPrefs */
        class C0294a implements Runnable {
            C0294a() {
            }

            public void run() {
                a.this.c();
            }
        }

        a(String str) {
            super(str);
        }

        /* access modifiers changed from: private */
        public void c() {
            for (String next : t3.f28205b.keySet()) {
                SharedPreferences.Editor edit = t3.e(next).edit();
                HashMap hashMap = t3.f28205b.get(next);
                synchronized (hashMap) {
                    for (String str : hashMap.keySet()) {
                        Object obj = hashMap.get(str);
                        if (obj instanceof String) {
                            edit.putString(str, (String) obj);
                        } else if (obj instanceof Boolean) {
                            edit.putBoolean(str, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof Integer) {
                            edit.putInt(str, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            edit.putLong(str, ((Long) obj).longValue());
                        } else if (obj instanceof Set) {
                            edit.putStringSet(str, (Set) obj);
                        } else if (obj == null) {
                            edit.remove(str);
                        }
                    }
                    hashMap.clear();
                }
                edit.apply();
            }
            this.f28208b = k3.N0().b();
        }

        private synchronized void d() {
            Handler handler = this.f28207a;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
                if (this.f28208b == 0) {
                    this.f28208b = k3.N0().b();
                }
                C0294a aVar = new C0294a();
                this.f28207a.postDelayed(aVar, (this.f28208b - k3.N0().b()) + 200);
            }
        }

        /* access modifiers changed from: private */
        public synchronized void e() {
            if (k3.f27912f != null) {
                f();
                d();
            }
        }

        private void f() {
            if (!this.f28209c) {
                start();
                this.f28209c = true;
            }
        }

        /* access modifiers changed from: protected */
        public void onLooperPrepared() {
            super.onLooperPrepared();
            this.f28207a = new Handler(getLooper());
            d();
        }
    }

    static {
        h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r4 = e(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r4 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r6.equals(java.lang.String.class) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        return r4.getString(r5, (java.lang.String) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r6.equals(java.lang.Boolean.class) == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        return java.lang.Boolean.valueOf(r4.getBoolean(r5, ((java.lang.Boolean) r7).booleanValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (r6.equals(java.lang.Integer.class) == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        return java.lang.Integer.valueOf(r4.getInt(r5, ((java.lang.Integer) r7).intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r6.equals(java.lang.Long.class) == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        return java.lang.Long.valueOf(r4.getLong(r5, ((java.lang.Long) r7).longValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (r6.equals(java.util.Set.class) == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0092, code lost:
        return r4.getStringSet(r5, (java.util.Set) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        if (r6.equals(r0) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        return java.lang.Boolean.valueOf(r4.contains(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object a(java.lang.String r4, java.lang.String r5, java.lang.Class r6, java.lang.Object r7) {
        /*
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Object>> r1 = f28205b
            java.lang.Object r1 = r1.get(r4)
            java.util.HashMap r1 = (java.util.HashMap) r1
            monitor-enter(r1)
            boolean r2 = r6.equals(r0)     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x001b
            boolean r2 = r1.containsKey(r5)     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x001b
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            return r4
        L_0x001b:
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x00a7 }
            if (r2 != 0) goto L_0x00a5
            boolean r3 = r1.containsKey(r5)     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x0029
            goto L_0x00a5
        L_0x0029:
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            android.content.SharedPreferences r4 = e(r4)
            if (r4 == 0) goto L_0x00a4
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x003f
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r4 = r4.getString(r5, r7)
            return r4
        L_0x003f:
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0056
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            boolean r4 = r4.getBoolean(r5, r6)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L_0x0056:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x006d
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            int r4 = r4.getInt(r5, r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L_0x006d:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0084
            java.lang.Long r7 = (java.lang.Long) r7
            long r6 = r7.longValue()
            long r4 = r4.getLong(r5, r6)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L_0x0084:
            java.lang.Class<java.util.Set> r1 = java.util.Set.class
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0093
            java.util.Set r7 = (java.util.Set) r7
            java.util.Set r4 = r4.getStringSet(r5, r7)
            return r4
        L_0x0093:
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x00a2
            boolean r4 = r4.contains(r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L_0x00a2:
            r4 = 0
            return r4
        L_0x00a4:
            return r7
        L_0x00a5:
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            return r2
        L_0x00a7:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.t3.a(java.lang.String, java.lang.String, java.lang.Class, java.lang.Object):java.lang.Object");
    }

    static boolean b(String str, String str2, boolean z10) {
        return ((Boolean) a(str, str2, Boolean.class, Boolean.valueOf(z10))).booleanValue();
    }

    static int c(String str, String str2, int i10) {
        return ((Integer) a(str, str2, Integer.class, Integer.valueOf(i10))).intValue();
    }

    static long d(String str, String str2, long j10) {
        return ((Long) a(str, str2, Long.class, Long.valueOf(j10))).longValue();
    }

    static synchronized SharedPreferences e(String str) {
        synchronized (t3.class) {
            Context context = k3.f27912f;
            if (context == null) {
                k3.b(k3.r0.WARN, "OneSignal.appContext null, could not read " + str + " from getSharedPreferences.", new Throwable());
                return null;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            return sharedPreferences;
        }
    }

    static String f(String str, String str2, String str3) {
        return (String) a(str, str2, String.class, str3);
    }

    public static Set<String> g(String str, String str2, Set<String> set) {
        return (Set) a(str, str2, Set.class, set);
    }

    public static void h() {
        HashMap<String, HashMap<String, Object>> hashMap = new HashMap<>();
        f28205b = hashMap;
        hashMap.put(f28204a, new HashMap());
        f28205b.put("GTPlayerPurchases", new HashMap());
        f28205b.put("OneSignalTriggers", new HashMap());
        f28206c = new a("OSH_WritePrefs");
    }

    private static void i(String str, String str2, Object obj) {
        HashMap hashMap = f28205b.get(str);
        synchronized (hashMap) {
            hashMap.put(str2, obj);
        }
        o();
    }

    public static void j(String str, String str2, boolean z10) {
        i(str, str2, Boolean.valueOf(z10));
    }

    public static void k(String str, String str2, int i10) {
        i(str, str2, Integer.valueOf(i10));
    }

    public static void l(String str, String str2, long j10) {
        i(str, str2, Long.valueOf(j10));
    }

    public static void m(String str, String str2, String str3) {
        i(str, str2, str3);
    }

    public static void n(String str, String str2, Set<String> set) {
        i(str, str2, set);
    }

    public static void o() {
        f28206c.e();
    }
}
