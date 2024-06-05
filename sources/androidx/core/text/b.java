package androidx.core.text;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: ICUCompat */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Method f3052a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f3053b;

    /* compiled from: ICUCompat */
    static class a {
        static String a(Locale locale) {
            return locale.getScript();
        }
    }

    /* renamed from: androidx.core.text.b$b  reason: collision with other inner class name */
    /* compiled from: ICUCompat */
    static class C0041b {
        static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        Class<String> cls = String.class;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 21) {
            try {
                Class<?> cls2 = Class.forName("libcore.icu.ICU");
                f3052a = cls2.getMethod("getScript", new Class[]{cls});
                f3053b = cls2.getMethod("addLikelySubtags", new Class[]{cls});
            } catch (Exception e10) {
                f3052a = null;
                f3053b = null;
                Log.w("ICUCompat", e10);
            }
        } else if (i10 < 24) {
            try {
                f3053b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    private static String a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f3053b;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException e10) {
            Log.w("ICUCompat", e10);
        } catch (InvocationTargetException e11) {
            Log.w("ICUCompat", e11);
        }
        return locale2;
    }

    private static String b(String str) {
        try {
            Method method = f3052a;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException e10) {
            Log.w("ICUCompat", e10);
        } catch (InvocationTargetException e11) {
            Log.w("ICUCompat", e11);
        }
        return null;
    }

    public static String c(Locale locale) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return C0041b.c(C0041b.a(C0041b.b(locale)));
        }
        if (i10 >= 21) {
            try {
                return a.a((Locale) f3053b.invoke((Object) null, new Object[]{locale}));
            } catch (InvocationTargetException e10) {
                Log.w("ICUCompat", e10);
                return a.a(locale);
            } catch (IllegalAccessException e11) {
                Log.w("ICUCompat", e11);
                return a.a(locale);
            }
        } else {
            String a10 = a(locale);
            if (a10 != null) {
                return b(a10);
            }
            return null;
        }
    }
}
