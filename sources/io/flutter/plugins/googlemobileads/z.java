package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.nativead.c;

/* compiled from: FlutterNativeAdOptions */
class z {

    /* renamed from: a  reason: collision with root package name */
    final Integer f34161a;

    /* renamed from: b  reason: collision with root package name */
    final Integer f34162b;

    /* renamed from: c  reason: collision with root package name */
    final g0 f34163c;

    /* renamed from: d  reason: collision with root package name */
    final Boolean f34164d;

    /* renamed from: e  reason: collision with root package name */
    final Boolean f34165e;

    /* renamed from: f  reason: collision with root package name */
    final Boolean f34166f;

    z(Integer num, Integer num2, g0 g0Var, Boolean bool, Boolean bool2, Boolean bool3) {
        this.f34161a = num;
        this.f34162b = num2;
        this.f34163c = g0Var;
        this.f34164d = bool;
        this.f34165e = bool2;
        this.f34166f = bool3;
    }

    /* access modifiers changed from: package-private */
    public c a() {
        c.a aVar = new c.a();
        Integer num = this.f34161a;
        if (num != null) {
            aVar.c(num.intValue());
        }
        Integer num2 = this.f34162b;
        if (num2 != null) {
            aVar.d(num2.intValue());
        }
        g0 g0Var = this.f34163c;
        if (g0Var != null) {
            aVar.h(g0Var.a());
        }
        Boolean bool = this.f34164d;
        if (bool != null) {
            aVar.e(bool.booleanValue());
        }
        Boolean bool2 = this.f34165e;
        if (bool2 != null) {
            aVar.f(bool2.booleanValue());
        }
        Boolean bool3 = this.f34166f;
        if (bool3 != null) {
            aVar.g(bool3.booleanValue());
        }
        return aVar.a();
    }
}
