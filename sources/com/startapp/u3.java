package com.startapp;

import android.content.Context;

/* compiled from: Sta */
public class u3 implements h2<i3, k3, n3, t3> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17360a;

    /* renamed from: b  reason: collision with root package name */
    public final n4<a3> f17361b;

    /* renamed from: c  reason: collision with root package name */
    public final n4<c7> f17362c;

    public u3(Context context, n4<a3> n4Var, n4<c7> n4Var2) {
        this.f17360a = context;
        this.f17361b = n4Var;
        this.f17362c = n4Var2;
    }

    public Object a(Object obj, Object obj2, Object obj3) {
        i3 i3Var = (i3) obj;
        k3 k3Var = (k3) obj2;
        n3 n3Var = (n3) obj3;
        if (i3Var == null || k3Var == null) {
            return null;
        }
        if (j3.f15958k.equals(i3Var.f15911a)) {
            return new v3(this.f17361b, this.f17362c, i3Var, k3Var, n3Var);
        }
        return new s3(this.f17360a, i3Var, k3Var, n3Var);
    }
}
