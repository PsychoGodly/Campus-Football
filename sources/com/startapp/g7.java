package com.startapp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: Sta */
public class g7 {

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f15844k = {"getSupportFragmentManager", "getFragmentManager"};

    /* renamed from: a  reason: collision with root package name */
    public final Context f15845a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f15846b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f15847c;

    /* renamed from: d  reason: collision with root package name */
    public final i2<RcdMetadata> f15848d;

    /* renamed from: e  reason: collision with root package name */
    public final Application.ActivityLifecycleCallbacks f15849e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, Integer> f15850f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, List<WeakReference<Activity>>> f15851g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public Boolean f15852h;

    /* renamed from: i  reason: collision with root package name */
    public String f15853i;

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f15854j = new a();

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            try {
                g7.this.d();
            } catch (Throwable th) {
                i3.a(th);
            }
        }
    }

    /* compiled from: Sta */
    public class b extends x1 {
        public b() {
        }

        public void onActivityPostResumed(Activity activity) {
            try {
                g7.this.a(activity);
            } catch (Throwable th) {
                i3.a(th);
            }
        }
    }

    /* compiled from: Sta */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f15857a;

        public c(Activity activity) {
            this.f15857a = activity;
        }

        public void run() {
            try {
                g7.this.b(this.f15857a);
            } catch (Throwable th) {
                i3.a(th);
            }
        }
    }

    /* compiled from: Sta */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f15859a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f15860b;

        public d(Activity activity, View view) {
            this.f15859a = activity;
            this.f15860b = view;
        }

        public void run() {
            try {
                g7 g7Var = g7.this;
                Activity activity = this.f15859a;
                View view = this.f15860b;
                RcdTargets a10 = g7Var.a();
                if (a10 != null) {
                    if (g7Var.a(a10, activity)) {
                        return;
                    }
                    try {
                        g7Var.a(a10, view);
                    } catch (Throwable th) {
                        i3.a(th);
                    }
                    g7Var.f15847c.execute(g7Var.f15854j);
                }
            } catch (Throwable th2) {
                i3.a(th2);
            }
        }
    }

    /* compiled from: Sta */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StackTraceElement[] f15862a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f15863b;

        public e(StackTraceElement[] stackTraceElementArr, int i10) {
            this.f15862a = stackTraceElementArr;
            this.f15863b = i10;
        }

        public void run() {
            try {
                g7 g7Var = g7.this;
                StackTraceElement[] stackTraceElementArr = this.f15862a;
                int i10 = this.f15863b;
                RcdTargets a10 = g7Var.a();
                if (a10 != null) {
                    for (StackTraceElement className : stackTraceElementArr) {
                        g7Var.a(a10, className.getClassName(), i10);
                    }
                    g7Var.f15847c.execute(g7Var.f15854j);
                }
            } catch (Throwable th) {
                i3.a(th);
            }
        }
    }

    public g7(Context context, Executor executor, i2<RcdMetadata> i2Var) {
        this.f15845a = context;
        this.f15846b = executor;
        this.f15847c = new r7(executor);
        this.f15848d = i2Var;
        if (Build.VERSION.SDK_INT >= 14) {
            this.f15849e = new b();
        } else {
            this.f15849e = null;
        }
    }

    public final RcdTargets a() {
        RcdMetadata a10 = this.f15848d.a();
        if (a10 == null || !a10.c()) {
            a10 = null;
        }
        if (a10 != null) {
            return a10.b();
        }
        return null;
    }

    public final boolean b() {
        Boolean bool = this.f15852h;
        if (bool == null) {
            RcdMetadata a10 = this.f15848d.a();
            if (a10 == null || !a10.c()) {
                a10 = null;
            }
            bool = Boolean.valueOf(a10 == null || Math.random() >= a10.a());
            this.f15852h = bool;
        }
        return bool.booleanValue();
    }

    public void c() {
        RcdTargets a10 = a();
        if (a10 != null) {
            for (String next : a10.a(1)) {
                try {
                    Class.forName(next, false, g7.class.getClassLoader());
                    a(next, 1);
                } catch (ClassNotFoundException unused) {
                } catch (Throwable th) {
                    i3.a(th);
                }
            }
            try {
                String packageName = this.f15845a.getPackageName();
                PackageInfo packageInfo = this.f15845a.getPackageManager().getPackageInfo(packageName, 15);
                if (packageInfo != null) {
                    a(a10, packageName, (T[]) packageInfo.activities);
                    a(a10, packageName, (T[]) packageInfo.receivers);
                    a(a10, packageName, (T[]) packageInfo.services);
                    a(a10, packageName, (T[]) packageInfo.providers);
                }
            } catch (Throwable th2) {
                i3.a(th2);
            }
            this.f15847c.execute(this.f15854j);
        }
    }

    public void d() {
        HashMap hashMap;
        RcdTargets a10 = a();
        if (a10 != null) {
            synchronized (this.f15850f) {
                hashMap = new HashMap(this.f15850f);
            }
            String a11 = a10.a((Map<String, Integer>) hashMap);
            if (!a11.equals(this.f15853i)) {
                this.f15853i = a11;
                i3 i3Var = new i3(j3.f15951d);
                i3Var.f15914d = "RCD.results";
                i3Var.f15915e = a11;
                i3Var.a();
            }
        }
    }

    public void a(Activity activity) {
        Window window;
        View decorView;
        if (!b()) {
            String name = activity.getClass().getName();
            Map<Activity, Integer> map = j9.f15982a;
            if (!name.startsWith("com.startapp.")) {
                List list = this.f15851g.get(name);
                if (list == null) {
                    list = new ArrayList(2);
                    this.f15851g.put(name, list);
                    this.f15846b.execute(new c(activity));
                }
                boolean z10 = false;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    if (weakReference.get() == null) {
                        it.remove();
                    } else if (weakReference.get() == activity) {
                        z10 = true;
                    }
                }
                if (!z10 && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    list.add(new WeakReference(activity));
                    this.f15846b.execute(new d(activity, decorView));
                }
            }
        }
    }

    public void b(Activity activity) {
        RcdTargets a10 = a();
        if (a10 != null) {
            try {
                if (a(a10, activity)) {
                    return;
                }
            } catch (Throwable th) {
                i3.a(th);
            }
            try {
                a(a10, activity, 16, 32);
            } catch (Throwable th2) {
                i3.a(th2);
            }
            for (String method : f15844k) {
                try {
                    Object invoke = activity.getClass().getMethod(method, new Class[0]).invoke(activity, new Object[0]);
                    if (invoke != null) {
                        Object invoke2 = invoke.getClass().getMethod("getFragments", new Class[0]).invoke(invoke, new Object[0]);
                        if (invoke2 instanceof Collection) {
                            for (Object next : (Collection) invoke2) {
                                if (next != null) {
                                    a(a10, next, 64, 128);
                                }
                            }
                        }
                    }
                } catch (NoSuchMethodException unused) {
                } catch (Throwable th3) {
                    i3.a(th3);
                }
            }
            this.f15847c.execute(this.f15854j);
        }
    }

    public final <T extends ComponentInfo> void a(RcdTargets rcdTargets, String str, T[] tArr) {
        if (tArr != null) {
            for (T t10 : tArr) {
                if (t10 != null) {
                    String str2 = t10.name;
                    if (str2.startsWith(".")) {
                        a(rcdTargets, str + str2, 2);
                    } else {
                        a(rcdTargets, str2, 2);
                    }
                }
            }
        }
    }

    public void a(int i10) {
        try {
            if (!b()) {
                this.f15846b.execute(new e(Thread.currentThread().getStackTrace(), i10));
            }
        } catch (Throwable th) {
            i3.a(th);
        }
    }

    public final void a(RcdTargets rcdTargets, View view) {
        if (view != null) {
            a(rcdTargets, view.getClass().getName(), 4);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    a(rcdTargets, viewGroup.getChildAt(i10));
                }
            }
        }
    }

    public final boolean a(RcdTargets rcdTargets, Activity activity) {
        Collection<String> a10 = rcdTargets.a(8);
        String name = activity.getClass().getName();
        if (!a10.contains(name)) {
            return false;
        }
        a(name, 8);
        return true;
    }

    public final void a(RcdTargets rcdTargets, Object obj, int i10, int i11) {
        Class cls = obj.getClass();
        while (cls != null && !a(cls.getName())) {
            for (Field field : cls.getDeclaredFields()) {
                if (i10 != 0) {
                    a(rcdTargets, field.getType().getName(), i10);
                }
                try {
                    field.setAccessible(true);
                    if (!(field.get(obj) == null || i11 == 0)) {
                        a(rcdTargets, field.getType().getName(), i11);
                    }
                } catch (Throwable unused) {
                }
            }
            cls = cls.getSuperclass();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.startapp.sdk.adsbase.remoteconfig.RcdTargets r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            boolean r0 = a((java.lang.String) r6)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.util.Map<android.app.Activity, java.lang.Integer> r0 = com.startapp.j9.f15982a
            java.lang.String r0 = "com.startapp."
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L_0x0012
            return
        L_0x0012:
            java.util.Collection r5 = r5.a((int) r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x001a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r0.length()
            r2 = 1
            if (r1 <= 0) goto L_0x0062
            boolean r1 = r6.startsWith(r0)
            if (r1 == 0) goto L_0x0062
            int r1 = r0.length()
            int r1 = r1 - r2
            char r1 = r0.charAt(r1)
            r3 = 46
            if (r1 != r3) goto L_0x0044
            r4.a((java.lang.String) r0, (int) r7)
            goto L_0x0062
        L_0x0044:
            int r1 = r6.length()
            int r3 = r0.length()
            if (r1 <= r3) goto L_0x005e
            int r1 = r0.length()
            char r1 = r6.charAt(r1)
            r2 = 36
            if (r1 != r2) goto L_0x0062
            r4.a((java.lang.String) r0, (int) r7)
            goto L_0x0062
        L_0x005e:
            r4.a((java.lang.String) r0, (int) r7)
            goto L_0x0063
        L_0x0062:
            r2 = 0
        L_0x0063:
            if (r2 == 0) goto L_0x001a
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.g7.a(com.startapp.sdk.adsbase.remoteconfig.RcdTargets, java.lang.String, int):void");
    }

    public final void a(String str, int i10) {
        synchronized (this.f15850f) {
            Integer num = this.f15850f.get(str);
            if (num == null) {
                num = 0;
            }
            this.f15850f.put(str, Integer.valueOf(i10 | num.intValue()));
        }
    }

    public static boolean a(String str) {
        return str.startsWith("android") || str.startsWith("java.");
    }
}
