package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListCompat */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    private static final j f2972b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    private final l f2973a;

    /* compiled from: LocaleListCompat */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final Locale[] f2974a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        private static boolean b(Locale locale) {
            for (Locale equals : f2974a) {
                if (equals.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        static boolean c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String c10 = androidx.core.text.b.c(locale);
            if (!c10.isEmpty()) {
                return c10.equals(androidx.core.text.b.c(locale2));
            }
            String country = locale.getCountry();
            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: LocaleListCompat */
    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private j(l lVar) {
        this.f2973a = lVar;
    }

    public static j a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return i(b.a(localeArr));
        }
        return new j(new k(localeArr));
    }

    static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static j c(String str) {
        Locale locale;
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            if (Build.VERSION.SDK_INT >= 21) {
                locale = a.a(split[i10]);
            } else {
                locale = b(split[i10]);
            }
            localeArr[i10] = locale;
        }
        return a(localeArr);
    }

    public static j e() {
        return f2972b;
    }

    public static j i(LocaleList localeList) {
        return new j(new m(localeList));
    }

    public Locale d(int i10) {
        return this.f2973a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) && this.f2973a.equals(((j) obj).f2973a);
    }

    public boolean f() {
        return this.f2973a.isEmpty();
    }

    public int g() {
        return this.f2973a.size();
    }

    public String h() {
        return this.f2973a.a();
    }

    public int hashCode() {
        return this.f2973a.hashCode();
    }

    public String toString() {
        return this.f2973a.toString();
    }
}
