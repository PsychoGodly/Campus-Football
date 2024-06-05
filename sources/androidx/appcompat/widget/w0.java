package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: TintContextWrapper */
public class w0 extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1842c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<WeakReference<w0>> f1843d;

    /* renamed from: a  reason: collision with root package name */
    private final Resources f1844a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources.Theme f1845b;

    private w0(Context context) {
        super(context);
        if (j1.c()) {
            j1 j1Var = new j1(this, context.getResources());
            this.f1844a = j1Var;
            Resources.Theme newTheme = j1Var.newTheme();
            this.f1845b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1844a = new y0(this, context.getResources());
        this.f1845b = null;
    }

    private static boolean a(Context context) {
        if ((context instanceof w0) || (context.getResources() instanceof y0) || (context.getResources() instanceof j1)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21 || j1.c()) {
            return true;
        }
        return false;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1842c) {
            ArrayList<WeakReference<w0>> arrayList = f1843d;
            if (arrayList == null) {
                f1843d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f1843d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1843d.remove(size);
                    }
                }
                for (int size2 = f1843d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f1843d.get(size2);
                    w0 w0Var = weakReference2 != null ? (w0) weakReference2.get() : null;
                    if (w0Var != null && w0Var.getBaseContext() == context) {
                        return w0Var;
                    }
                }
            }
            w0 w0Var2 = new w0(context);
            f1843d.add(new WeakReference(w0Var2));
            return w0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f1844a.getAssets();
    }

    public Resources getResources() {
        return this.f1844a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1845b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i10) {
        Resources.Theme theme = this.f1845b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
