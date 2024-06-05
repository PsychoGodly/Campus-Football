package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import h.b;
import h.d;
import h.j;

/* compiled from: ActionBarPolicy */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f1010a;

    private a(Context context) {
        this.f1010a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f1010a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f1010a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f1010a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f1010a.getResources().getDimensionPixelSize(d.f18201b);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f1010a.obtainStyledAttributes((AttributeSet) null, j.f18304a, h.a.f18167c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(j.f18349j, 0);
        Resources resources = this.f1010a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(d.f18200a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f1010a.getResources().getBoolean(b.f18191a);
    }

    public boolean h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f1010a).hasPermanentMenuKey();
    }
}
