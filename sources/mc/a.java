package mc;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kc.g;

/* compiled from: LocalizationPlugin */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final g f36334a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Context f36335b;

    /* renamed from: c  reason: collision with root package name */
    final g.b f36336c;

    /* renamed from: mc.a$a  reason: collision with other inner class name */
    /* compiled from: LocalizationPlugin */
    class C0418a implements g.b {
        C0418a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0061  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String a(java.lang.String r8, java.lang.String r9) {
            /*
                r7 = this;
                mc.a r0 = mc.a.this
                android.content.Context r0 = r0.f36335b
                r1 = 17
                r2 = 0
                if (r9 == 0) goto L_0x004a
                java.util.Locale r3 = mc.a.b(r9)
                int r4 = android.os.Build.VERSION.SDK_INT
                if (r4 < r1) goto L_0x0034
                android.content.res.Configuration r0 = new android.content.res.Configuration
                mc.a r4 = mc.a.this
                android.content.Context r4 = r4.f36335b
                android.content.res.Resources r4 = r4.getResources()
                android.content.res.Configuration r4 = r4.getConfiguration()
                r0.<init>(r4)
                r0.setLocale(r3)
                mc.a r3 = mc.a.this
                android.content.Context r3 = r3.f36335b
                android.content.Context r0 = r3.createConfigurationContext(r0)
                goto L_0x004a
            L_0x0034:
                mc.a r4 = mc.a.this
                android.content.Context r4 = r4.f36335b
                android.content.res.Resources r4 = r4.getResources()
                android.content.res.Configuration r5 = r4.getConfiguration()
                java.util.Locale r6 = r5.locale
                r5.locale = r3
                r4.updateConfiguration(r5, r2)
                goto L_0x004b
            L_0x004a:
                r6 = r2
            L_0x004b:
                mc.a r3 = mc.a.this
                android.content.Context r3 = r3.f36335b
                java.lang.String r3 = r3.getPackageName()
                android.content.res.Resources r4 = r0.getResources()
                java.lang.String r5 = "string"
                int r8 = r4.getIdentifier(r8, r5, r3)
                if (r8 == 0) goto L_0x006a
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r8 = r0.getString(r8)
                goto L_0x006b
            L_0x006a:
                r8 = r2
            L_0x006b:
                if (r9 == 0) goto L_0x0084
                int r9 = android.os.Build.VERSION.SDK_INT
                if (r9 >= r1) goto L_0x0084
                mc.a r9 = mc.a.this
                android.content.Context r9 = r9.f36335b
                android.content.res.Resources r9 = r9.getResources()
                android.content.res.Configuration r0 = r9.getConfiguration()
                r0.locale = r6
                r9.updateConfiguration(r0, r2)
            L_0x0084:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: mc.a.C0418a.a(java.lang.String, java.lang.String):java.lang.String");
        }
    }

    public a(Context context, g gVar) {
        C0418a aVar = new C0418a();
        this.f36336c = aVar;
        this.f36335b = context;
        this.f36334a = gVar;
        gVar.c(aVar);
    }

    public static Locale b(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        int length = split.length;
        String str4 = MaxReward.DEFAULT_LABEL;
        int i10 = 1;
        if (length <= 1 || split[1].length() != 4) {
            str2 = str4;
        } else {
            str2 = split[1];
            i10 = 2;
        }
        if (split.length > i10 && split[i10].length() >= 2 && split[i10].length() <= 3) {
            str4 = split[i10];
        }
        return new Locale(str3, str4, str2);
    }

    public Locale c(List<Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            ArrayList arrayList = new ArrayList();
            LocaleList locales = this.f36335b.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i11 = 0; i11 < size; i11++) {
                Locale locale = locales.get(i11);
                String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    language = language + "-" + locale.getScript();
                }
                if (!locale.getCountry().isEmpty()) {
                    language = language + "-" + locale.getCountry();
                }
                arrayList.add(new Locale.LanguageRange(language));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage()));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
            }
            Locale lookup = Locale.lookup(arrayList, list);
            if (lookup != null) {
                return lookup;
            }
            return list.get(0);
        } else if (i10 >= 24) {
            LocaleList locales2 = this.f36335b.getResources().getConfiguration().getLocales();
            for (int i12 = 0; i12 < locales2.size(); i12++) {
                Locale locale2 = locales2.get(i12);
                for (Locale next : list) {
                    if (locale2.equals(next)) {
                        return next;
                    }
                }
                for (Locale next2 : list) {
                    if (locale2.getLanguage().equals(next2.toLanguageTag())) {
                        return next2;
                    }
                }
                for (Locale next3 : list) {
                    if (locale2.getLanguage().equals(next3.getLanguage())) {
                        return next3;
                    }
                }
            }
            return list.get(0);
        } else {
            Locale locale3 = this.f36335b.getResources().getConfiguration().locale;
            if (locale3 != null) {
                for (Locale next4 : list) {
                    if (locale3.equals(next4)) {
                        return next4;
                    }
                }
                for (Locale next5 : list) {
                    if (locale3.getLanguage().equals(next5.toString())) {
                        return next5;
                    }
                }
            }
            return list.get(0);
        }
    }

    public void d(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            int size = locales.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(locales.get(i10));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.f36334a.b(arrayList);
    }
}
