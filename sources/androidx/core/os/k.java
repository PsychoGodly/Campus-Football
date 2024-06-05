package androidx.core.os;

import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: LocaleListCompatWrapper */
final class k implements l {

    /* renamed from: c  reason: collision with root package name */
    private static final Locale[] f2975c = new Locale[0];

    /* renamed from: d  reason: collision with root package name */
    private static final Locale f2976d = new Locale("en", "XA");

    /* renamed from: e  reason: collision with root package name */
    private static final Locale f2977e = new Locale("ar", "XB");

    /* renamed from: f  reason: collision with root package name */
    private static final Locale f2978f = j.b("en-Latn");

    /* renamed from: a  reason: collision with root package name */
    private final Locale[] f2979a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2980b;

    k(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f2979a = f2975c;
            this.f2980b = MaxReward.DEFAULT_LABEL;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < localeArr.length) {
            Locale locale = localeArr[i10];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    c(sb2, locale2);
                    if (i10 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
                i10++;
            } else {
                throw new NullPointerException("list[" + i10 + "] is null");
            }
        }
        this.f2979a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f2980b = sb2.toString();
    }

    static void c(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb2.append('-');
            sb2.append(locale.getCountry());
        }
    }

    public String a() {
        return this.f2980b;
    }

    public Object b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        Locale[] localeArr = ((k) obj).f2979a;
        if (this.f2979a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f2979a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    public Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f2979a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public int hashCode() {
        int i10 = 1;
        for (Locale hashCode : this.f2979a) {
            i10 = (i10 * 31) + hashCode.hashCode();
        }
        return i10;
    }

    public boolean isEmpty() {
        return this.f2979a.length == 0;
    }

    public int size() {
        return this.f2979a.length;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f2979a;
            if (i10 < localeArr.length) {
                sb2.append(localeArr[i10]);
                if (i10 < this.f2979a.length - 1) {
                    sb2.append(',');
                }
                i10++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
