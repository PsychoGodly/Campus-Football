package r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* compiled from: CardViewApi21Impl */
class c implements f {
    c() {
    }

    private g o(e eVar) {
        return (g) eVar.f();
    }

    public void a(e eVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        eVar.c(new g(colorStateList, f10));
        View g10 = eVar.g();
        g10.setClipToOutline(true);
        g10.setElevation(f11);
        m(eVar, f12);
    }

    public float b(e eVar) {
        return k(eVar) * 2.0f;
    }

    public ColorStateList c(e eVar) {
        return o(eVar).b();
    }

    public float d(e eVar) {
        return eVar.g().getElevation();
    }

    public void e(e eVar, float f10) {
        eVar.g().setElevation(f10);
    }

    public void f(e eVar) {
        m(eVar, g(eVar));
    }

    public float g(e eVar) {
        return o(eVar).c();
    }

    public float h(e eVar) {
        return k(eVar) * 2.0f;
    }

    public void i(e eVar) {
        m(eVar, g(eVar));
    }

    public void j(e eVar, float f10) {
        o(eVar).h(f10);
    }

    public float k(e eVar) {
        return o(eVar).d();
    }

    public void l() {
    }

    public void m(e eVar, float f10) {
        o(eVar).g(f10, eVar.e(), eVar.d());
        p(eVar);
    }

    public void n(e eVar, ColorStateList colorStateList) {
        o(eVar).f(colorStateList);
    }

    public void p(e eVar) {
        if (!eVar.e()) {
            eVar.b(0, 0, 0, 0);
            return;
        }
        float g10 = g(eVar);
        float k10 = k(eVar);
        int ceil = (int) Math.ceil((double) h.c(g10, k10, eVar.d()));
        int ceil2 = (int) Math.ceil((double) h.d(g10, k10, eVar.d()));
        eVar.b(ceil, ceil2, ceil, ceil2);
    }
}
