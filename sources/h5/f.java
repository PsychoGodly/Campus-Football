package h5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.p1;
import com.google.android.gms.internal.common.zzd;
import m5.i;
import o5.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int f18834a = j.f18843a;

    /* renamed from: b  reason: collision with root package name */
    private static final f f18835b = new f();

    f() {
    }

    public static f h() {
        return f18835b;
    }

    public void a(Context context) {
        j.a(context);
    }

    public int b(Context context) {
        return j.c(context);
    }

    @Deprecated
    public Intent c(int i10) {
        return d((Context) null, i10, (String) null);
    }

    public Intent d(Context context, int i10, String str) {
        if (i10 == 1 || i10 == 2) {
            if (context != null && i.g(context)) {
                return p1.a();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("gcore_");
            sb2.append(f18834a);
            sb2.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb2.append(str);
            }
            sb2.append("-");
            if (context != null) {
                sb2.append(context.getPackageName());
            }
            sb2.append("-");
            if (context != null) {
                try {
                    sb2.append(c.a(context).f(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return p1.b("com.google.android.gms", sb2.toString());
        } else if (i10 != 3) {
            return null;
        } else {
            return p1.c("com.google.android.gms");
        }
    }

    public PendingIntent e(Context context, int i10, int i11) {
        return f(context, i10, i11, (String) null);
    }

    public PendingIntent f(Context context, int i10, int i11, String str) {
        Intent d10 = d(context, i10, str);
        if (d10 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i11, d10, zzd.zza | 134217728);
    }

    public String g(int i10) {
        return j.d(i10);
    }

    public int i(Context context) {
        return j(context, f18834a);
    }

    public int j(Context context, int i10) {
        int h10 = j.h(context, i10);
        if (j.i(context, h10)) {
            return 18;
        }
        return h10;
    }

    public boolean k(Context context, int i10) {
        return j.i(context, i10);
    }

    public boolean l(Context context, String str) {
        return j.m(context, str);
    }

    public boolean m(int i10) {
        return j.k(i10);
    }

    public void n(Context context, int i10) throws h, g {
        j.b(context, i10);
    }
}
