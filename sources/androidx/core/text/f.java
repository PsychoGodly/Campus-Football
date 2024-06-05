package androidx.core.text;

import android.os.Build;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import java.util.Locale;

/* compiled from: TextUtilsCompat */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Locale f3079a = new Locale(MaxReward.DEFAULT_LABEL, MaxReward.DEFAULT_LABEL);

    /* compiled from: TextUtilsCompat */
    static class a {
        static int a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    private static int a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    public static int b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return a.a(locale);
        }
        if (locale == null || locale.equals(f3079a)) {
            return 0;
        }
        String c10 = b.c(locale);
        if (c10 == null) {
            return a(locale);
        }
        return (c10.equalsIgnoreCase("Arab") || c10.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
