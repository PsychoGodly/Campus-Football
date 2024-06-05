package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import h.i;

/* compiled from: ContextThemeWrapper */
public class d extends ContextWrapper {

    /* renamed from: f  reason: collision with root package name */
    private static Configuration f1013f;

    /* renamed from: a  reason: collision with root package name */
    private int f1014a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f1015b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f1016c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f1017d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f1018e;

    /* compiled from: ContextThemeWrapper */
    static class a {
        static Context a(d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public d() {
        super((Context) null);
    }

    private Resources b() {
        int i10;
        if (this.f1018e == null) {
            Configuration configuration = this.f1017d;
            if (configuration == null || ((i10 = Build.VERSION.SDK_INT) >= 26 && e(configuration))) {
                this.f1018e = super.getResources();
            } else if (i10 >= 17) {
                this.f1018e = a.a(this, this.f1017d).getResources();
            } else {
                Resources resources = super.getResources();
                Configuration configuration2 = new Configuration(resources.getConfiguration());
                configuration2.updateFrom(this.f1017d);
                this.f1018e = new Resources(resources.getAssets(), resources.getDisplayMetrics(), configuration2);
            }
        }
        return this.f1018e;
    }

    private void d() {
        boolean z10 = this.f1015b == null;
        if (z10) {
            this.f1015b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1015b.setTo(theme);
            }
        }
        f(this.f1015b, this.f1014a, z10);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f1013f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f1013f = configuration2;
        }
        return configuration.equals(f1013f);
    }

    public void a(Configuration configuration) {
        if (this.f1018e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f1017d == null) {
            this.f1017d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f1014a;
    }

    /* access modifiers changed from: protected */
    public void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1016c == null) {
            this.f1016c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1016c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1015b;
        if (theme != null) {
            return theme;
        }
        if (this.f1014a == 0) {
            this.f1014a = i.f18303e;
        }
        d();
        return this.f1015b;
    }

    public void setTheme(int i10) {
        if (this.f1014a != i10) {
            this.f1014a = i10;
            d();
        }
    }

    public d(Context context, int i10) {
        super(context);
        this.f1014a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f1015b = theme;
    }
}
