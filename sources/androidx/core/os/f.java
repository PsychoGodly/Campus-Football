package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* compiled from: ConfigurationCompat */
public final class f {

    /* compiled from: ConfigurationCompat */
    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static j a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return j.i(a.a(configuration));
        }
        return j.a(configuration.locale);
    }
}
