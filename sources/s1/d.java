package s1;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.p;

/* compiled from: PackageManagerHelper */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f22300a = p.f("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z10) {
        String str;
        String str2 = "enabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            p c10 = p.c();
            String str3 = f22300a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z10) {
                str = str2;
            } else {
                str = "disabled";
            }
            objArr[1] = str;
            c10.a(str3, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e10) {
            p c11 = p.c();
            String str4 = f22300a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z10) {
                str2 = "disabled";
            }
            objArr2[1] = str2;
            c11.a(str4, String.format("%s could not be %s", objArr2), e10);
        }
    }
}
