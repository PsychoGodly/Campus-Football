package o5;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.core.util.d;
import m5.m;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class b {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f21083a;

    public b(Context context) {
        this.f21083a = context;
    }

    public int a(String str) {
        return this.f21083a.checkCallingOrSelfPermission(str);
    }

    public int b(String str, String str2) {
        return this.f21083a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo c(String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f21083a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence d(String str) throws PackageManager.NameNotFoundException {
        return this.f21083a.getPackageManager().getApplicationLabel(this.f21083a.getPackageManager().getApplicationInfo(str, 0));
    }

    public d<CharSequence, Drawable> e(String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.f21083a.getPackageManager().getApplicationInfo(str, 0);
        return d.a(this.f21083a.getPackageManager().getApplicationLabel(applicationInfo), this.f21083a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    public PackageInfo f(String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f21083a.getPackageManager().getPackageInfo(str, i10);
    }

    public boolean g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.f21083a);
        }
        if (!m.i() || (nameForUid = this.f21083a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f21083a.getPackageManager().isInstantApp(nameForUid);
    }

    public final boolean h(int i10, String str) {
        if (m.d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f21083a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i10, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f21083a.getPackageManager().getPackagesForUid(i10);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
