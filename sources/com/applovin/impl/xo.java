package com.applovin.impl;

public final class xo {

    /* renamed from: a  reason: collision with root package name */
    public final int f13432a;

    /* renamed from: b  reason: collision with root package name */
    public final ni[] f13433b;

    /* renamed from: c  reason: collision with root package name */
    public final f8[] f13434c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f13435d;

    public xo(ni[] niVarArr, f8[] f8VarArr, Object obj) {
        this.f13433b = niVarArr;
        this.f13434c = (f8[]) f8VarArr.clone();
        this.f13435d = obj;
        this.f13432a = niVarArr.length;
    }

    public boolean a(xo xoVar) {
        if (xoVar == null || xoVar.f13434c.length != this.f13434c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f13434c.length; i10++) {
            if (!a(xoVar, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean a(xo xoVar, int i10) {
        if (xoVar != null && yp.a((Object) this.f13433b[i10], (Object) xoVar.f13433b[i10]) && yp.a((Object) this.f13434c[i10], (Object) xoVar.f13434c[i10])) {
            return true;
        }
        return false;
    }

    public boolean a(int i10) {
        return this.f13433b[i10] != null;
    }
}
