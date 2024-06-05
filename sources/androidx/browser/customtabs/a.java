package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: CustomTabColorSchemeParams */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f1887a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f1888b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f1889c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f1890d;

    /* renamed from: androidx.browser.customtabs.a$a  reason: collision with other inner class name */
    /* compiled from: CustomTabColorSchemeParams */
    public static final class C0017a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f1891a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f1892b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f1893c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f1894d;

        public a a() {
            return new a(this.f1891a, this.f1892b, this.f1893c, this.f1894d);
        }

        public C0017a b(int i10) {
            this.f1893c = Integer.valueOf(i10 | -16777216);
            return this;
        }

        public C0017a c(int i10) {
            this.f1894d = Integer.valueOf(i10);
            return this;
        }

        public C0017a d(int i10) {
            this.f1892b = Integer.valueOf(i10);
            return this;
        }

        public C0017a e(int i10) {
            this.f1891a = Integer.valueOf(i10 | -16777216);
            return this;
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f1887a = num;
        this.f1888b = num2;
        this.f1889c = num3;
        this.f1890d = num4;
    }

    /* access modifiers changed from: package-private */
    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f1887a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f1888b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f1889c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f1890d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
