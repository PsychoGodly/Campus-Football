package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.o;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.core.os.j;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: AppCompatDelegate */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    static o.a f841a = new o.a(new o.b());

    /* renamed from: b  reason: collision with root package name */
    private static int f842b = -100;

    /* renamed from: c  reason: collision with root package name */
    private static j f843c = null;

    /* renamed from: d  reason: collision with root package name */
    private static j f844d = null;

    /* renamed from: f  reason: collision with root package name */
    private static Boolean f845f = null;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f846g = false;

    /* renamed from: h  reason: collision with root package name */
    private static final androidx.collection.b<WeakReference<g>> f847h = new androidx.collection.b<>();

    /* renamed from: i  reason: collision with root package name */
    private static final Object f848i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private static final Object f849j = new Object();

    /* compiled from: AppCompatDelegate */
    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* compiled from: AppCompatDelegate */
    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    g() {
    }

    static void F(g gVar) {
        synchronized (f848i) {
            G(gVar);
        }
    }

    private static void G(g gVar) {
        synchronized (f848i) {
            Iterator<WeakReference<g>> it = f847h.iterator();
            while (it.hasNext()) {
                g gVar2 = (g) it.next().get();
                if (gVar2 == gVar || gVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void Q(android.content.Context r3) {
        /*
            boolean r0 = v(r3)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = androidx.core.os.a.d()
            if (r0 == 0) goto L_0x001c
            boolean r0 = f846g
            if (r0 != 0) goto L_0x0054
            androidx.appcompat.app.o$a r0 = f841a
            androidx.appcompat.app.f r1 = new androidx.appcompat.app.f
            r1.<init>(r3)
            r0.execute(r1)
            goto L_0x0054
        L_0x001c:
            java.lang.Object r0 = f849j
            monitor-enter(r0)
            androidx.core.os.j r1 = f843c     // Catch:{ all -> 0x0055 }
            if (r1 != 0) goto L_0x0040
            androidx.core.os.j r1 = f844d     // Catch:{ all -> 0x0055 }
            if (r1 != 0) goto L_0x0031
            java.lang.String r3 = androidx.appcompat.app.o.b(r3)     // Catch:{ all -> 0x0055 }
            androidx.core.os.j r3 = androidx.core.os.j.c(r3)     // Catch:{ all -> 0x0055 }
            f844d = r3     // Catch:{ all -> 0x0055 }
        L_0x0031:
            androidx.core.os.j r3 = f844d     // Catch:{ all -> 0x0055 }
            boolean r3 = r3.f()     // Catch:{ all -> 0x0055 }
            if (r3 == 0) goto L_0x003b
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return
        L_0x003b:
            androidx.core.os.j r3 = f844d     // Catch:{ all -> 0x0055 }
            f843c = r3     // Catch:{ all -> 0x0055 }
            goto L_0x0053
        L_0x0040:
            androidx.core.os.j r2 = f844d     // Catch:{ all -> 0x0055 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0055 }
            if (r1 != 0) goto L_0x0053
            androidx.core.os.j r1 = f843c     // Catch:{ all -> 0x0055 }
            f844d = r1     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = r1.h()     // Catch:{ all -> 0x0055 }
            androidx.appcompat.app.o.a(r3, r1)     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
        L_0x0054:
            return
        L_0x0055:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.Q(android.content.Context):void");
    }

    static void d(g gVar) {
        synchronized (f848i) {
            G(gVar);
            f847h.add(new WeakReference(gVar));
        }
    }

    public static g h(Activity activity, e eVar) {
        return new h(activity, eVar);
    }

    public static g i(Dialog dialog, e eVar) {
        return new h(dialog, eVar);
    }

    public static j k() {
        if (androidx.core.os.a.d()) {
            Object p10 = p();
            if (p10 != null) {
                return j.i(b.a(p10));
            }
        } else {
            j jVar = f843c;
            if (jVar != null) {
                return jVar;
            }
        }
        return j.e();
    }

    public static int m() {
        return f842b;
    }

    static Object p() {
        Context l10;
        Iterator<WeakReference<g>> it = f847h.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next().get();
            if (gVar != null && (l10 = gVar.l()) != null) {
                return l10.getSystemService("locale");
            }
        }
        return null;
    }

    static j r() {
        return f843c;
    }

    static boolean v(Context context) {
        if (f845f == null) {
            try {
                Bundle bundle = m.a(context).metaData;
                if (bundle != null) {
                    f845f = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f845f = Boolean.FALSE;
            }
        }
        return f845f.booleanValue();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void w(Context context) {
        o.c(context);
        f846g = true;
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E();

    public abstract boolean H(int i10);

    public abstract void I(int i10);

    public abstract void J(View view);

    public abstract void K(View view, ViewGroup.LayoutParams layoutParams);

    public void L(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void M(Toolbar toolbar);

    public void N(int i10) {
    }

    public abstract void O(CharSequence charSequence);

    public abstract androidx.appcompat.view.b P(b.a aVar);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    public void f(Context context) {
    }

    public Context g(Context context) {
        f(context);
        return context;
    }

    public abstract <T extends View> T j(int i10);

    public Context l() {
        return null;
    }

    public abstract b n();

    public int o() {
        return -100;
    }

    public abstract MenuInflater q();

    public abstract a s();

    public abstract void t();

    public abstract void u();

    public abstract void x(Configuration configuration);

    public abstract void y(Bundle bundle);

    public abstract void z();
}
