package com.startapp;

/* compiled from: Sta */
public class v3 extends t3 {

    /* renamed from: e  reason: collision with root package name */
    public final n4<a3> f17396e;

    /* renamed from: f  reason: collision with root package name */
    public final n4<c7> f17397f;

    public v3(n4<a3> n4Var, n4<c7> n4Var2, i3 i3Var, k3 k3Var, n3 n3Var) {
        super(i3Var, k3Var, n3Var);
        this.f17396e = n4Var;
        this.f17397f = n4Var2;
    }

    public int a() throws Exception {
        String str = this.f17286a.f15915e;
        if (str == null) {
            return 3;
        }
        return t8.a(this.f17397f.a(), this.f17396e.a(), str, (g2<Throwable, Void>) null) != null ? 1 : 0;
    }
}
