package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ActivityRecreator */
final class d {

    /* renamed from: a  reason: collision with root package name */
    protected static final Class<?> f2679a;

    /* renamed from: b  reason: collision with root package name */
    protected static final Field f2680b = b();

    /* renamed from: c  reason: collision with root package name */
    protected static final Field f2681c = f();

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f2682d;

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f2683e;

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f2684f;

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f2685g = new Handler(Looper.getMainLooper());

    /* compiled from: ActivityRecreator */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0028d f2686a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f2687b;

        a(C0028d dVar, Object obj) {
            this.f2686a = dVar;
            this.f2687b = obj;
        }

        public void run() {
            this.f2686a.f2692a = this.f2687b;
        }
    }

    /* compiled from: ActivityRecreator */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Application f2688a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0028d f2689b;

        b(Application application, C0028d dVar) {
            this.f2688a = application;
            this.f2689b = dVar;
        }

        public void run() {
            this.f2688a.unregisterActivityLifecycleCallbacks(this.f2689b);
        }
    }

    /* compiled from: ActivityRecreator */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f2690a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f2691b;

        c(Object obj, Object obj2) {
            this.f2690a = obj;
            this.f2691b = obj2;
        }

        public void run() {
            try {
                Method method = d.f2682d;
                if (method != null) {
                    method.invoke(this.f2690a, new Object[]{this.f2691b, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                d.f2683e.invoke(this.f2690a, new Object[]{this.f2691b, Boolean.FALSE});
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.d$d  reason: collision with other inner class name */
    /* compiled from: ActivityRecreator */
    private static final class C0028d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        Object f2692a;

        /* renamed from: b  reason: collision with root package name */
        private Activity f2693b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2694c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f2695d = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f2696f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f2697g = false;

        C0028d(Activity activity) {
            this.f2693b = activity;
            this.f2694c = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f2693b == activity) {
                this.f2693b = null;
                this.f2696f = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f2696f && !this.f2697g && !this.f2695d && d.h(this.f2692a, this.f2694c, activity)) {
                this.f2697g = true;
                this.f2692a = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f2693b == activity) {
                this.f2695d = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a10 = a();
        f2679a = a10;
        f2682d = d(a10);
        f2683e = c(a10);
        f2684f = e(a10);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f2681c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i10) {
                    f2685g.postAtFrontOfQueue(new c(f2680b.get(activity), obj2));
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        Application application;
        C0028d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f2684f == null) {
            return false;
        } else {
            if (f2683e == null && f2682d == null) {
                return false;
            }
            try {
                Object obj2 = f2681c.get(activity);
                if (obj2 == null || (obj = f2680b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0028d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f2685g;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = f2684f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
