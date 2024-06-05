package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* compiled from: BuildCompat */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f2956a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f2957b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f2958c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f2959d;

    /* renamed from: androidx.core.os.a$a  reason: collision with other inner class name */
    /* compiled from: BuildCompat */
    private static final class C0037a {

        /* renamed from: a  reason: collision with root package name */
        static final int f2960a = SdkExtensions.getExtensionVersion(30);

        /* renamed from: b  reason: collision with root package name */
        static final int f2961b = SdkExtensions.getExtensionVersion(31);

        /* renamed from: c  reason: collision with root package name */
        static final int f2962c = SdkExtensions.getExtensionVersion(33);

        /* renamed from: d  reason: collision with root package name */
        static final int f2963d = SdkExtensions.getExtensionVersion(1000000);
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 0;
        f2956a = i10 >= 30 ? C0037a.f2960a : 0;
        f2957b = i10 >= 30 ? C0037a.f2961b : 0;
        f2958c = i10 >= 30 ? C0037a.f2962c : 0;
        if (i10 >= 30) {
            i11 = C0037a.f2963d;
        }
        f2959d = i11;
    }

    protected static boolean a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Deprecated
    public static boolean c() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 31 || (i10 >= 30 && a("S", Build.VERSION.CODENAME));
    }

    public static boolean d() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 33 || (i10 >= 32 && a("Tiramisu", Build.VERSION.CODENAME));
    }
}
