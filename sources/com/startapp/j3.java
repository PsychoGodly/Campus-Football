package com.startapp;

import com.startapp.k3;
import com.startapp.m3;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class j3 {

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, j3> f15950c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final j3 f15951d;

    /* renamed from: e  reason: collision with root package name */
    public static final j3 f15952e;

    /* renamed from: f  reason: collision with root package name */
    public static final j3 f15953f;

    /* renamed from: g  reason: collision with root package name */
    public static final j3 f15954g;

    /* renamed from: h  reason: collision with root package name */
    public static final j3 f15955h;

    /* renamed from: i  reason: collision with root package name */
    public static final j3 f15956i;

    /* renamed from: j  reason: collision with root package name */
    public static final j3 f15957j;

    /* renamed from: k  reason: collision with root package name */
    public static final j3 f15958k;

    /* renamed from: l  reason: collision with root package name */
    public static final j3 f15959l;

    /* renamed from: m  reason: collision with root package name */
    public static final j3 f15960m;

    /* renamed from: n  reason: collision with root package name */
    public static final j3 f15961n;

    /* renamed from: o  reason: collision with root package name */
    public static final j3 f15962o;

    /* renamed from: p  reason: collision with root package name */
    public static final j3 f15963p;

    /* renamed from: q  reason: collision with root package name */
    public static final j3 f15964q;

    /* renamed from: a  reason: collision with root package name */
    public final String f15965a;

    /* renamed from: b  reason: collision with root package name */
    public final k3 f15966b;

    static {
        k3.a aVar = new k3.a();
        aVar.f16027b = 23;
        aVar.f16028c = 50;
        aVar.f16029d = true;
        m3.a aVar2 = new m3.a();
        String[] strArr = {MobileAdsBridgeBase.initializeMethodName};
        List list = aVar2.f16137a;
        if (list == null) {
            list = new ArrayList();
            aVar2.f16137a = list;
        }
        m3.a a10 = aVar2.a(strArr, list).a("value");
        a10.f16140d = "8h";
        k3.a a11 = aVar.a(new m3(a10));
        m3.a a12 = new m3.a().a("value", "details");
        a12.f16140d = "30m";
        k3.a a13 = a11.a(new m3(a12));
        m3.a a14 = new m3.a().a("value");
        a14.f16140d = "10s";
        k3.a a15 = a13.a(new m3(a14));
        a15.f16030e = "2h";
        a15.f16031f = "2s";
        f15951d = new j3("general", new k3(a15));
        k3.a aVar3 = new k3.a();
        aVar3.f16027b = 17;
        aVar3.f16028c = 20;
        aVar3.f16029d = true;
        m3.a aVar4 = new m3.a();
        String[] strArr2 = {"fake_click"};
        List list2 = aVar4.f16138b;
        if (list2 == null) {
            list2 = new ArrayList();
            aVar4.f16138b = list2;
        }
        m3.a a16 = aVar4.a(strArr2, list2).a("appActivity", "value", "details");
        a16.f16140d = "30m";
        k3.a a17 = aVar3.a(new m3(a16));
        m3.a aVar5 = new m3.a();
        String[] strArr3 = {"fake_click"};
        List list3 = aVar5.f16138b;
        if (list3 == null) {
            list3 = new ArrayList();
            aVar5.f16138b = list3;
        }
        m3.a a18 = aVar5.a(strArr3, list3).a("appActivity", "value");
        a18.f16140d = "10s";
        k3.a a19 = a17.a(new m3(a18));
        a19.f16030e = "4h";
        a19.f16031f = "5s";
        f15952e = new j3("error", new k3(a19));
        k3.a aVar6 = new k3.a();
        aVar6.f16026a = 0.0d;
        aVar6.f16027b = 17;
        aVar6.f16028c = 30;
        aVar6.f16029d = true;
        m3.a a20 = new m3.a().a("appActivity", "value", "details");
        a20.f16140d = "12h";
        k3.a a21 = aVar6.a(new m3(a20));
        m3.a a22 = new m3.a().a("appActivity", "value");
        a22.f16140d = "1h";
        k3.a a23 = a21.a(new m3(a22));
        a23.f16030e = "1d";
        a23.f16031f = "5s";
        k3 k3Var = new k3(a23);
        f15953f = new j3("exception", k3Var);
        new j3("exception_nt", k3Var);
        k3.a aVar7 = new k3.a();
        aVar7.f16027b = 17;
        aVar7.f16028c = 40;
        aVar7.f16029d = true;
        m3.a a24 = new m3.a().a("value", "details");
        a24.f16140d = "1h";
        k3.a a25 = aVar7.a(new m3(a24));
        a25.f16030e = "2d";
        a25.f16031f = "5s";
        f15954g = new j3("exception_fatal", new k3(a25));
        f15955h = new j3("anr", k3Var);
        k3.a aVar8 = new k3.a();
        aVar8.f16026a = 0.0d;
        aVar8.f16027b = 17;
        aVar8.f16028c = 10;
        aVar8.f16029d = false;
        aVar8.f16031f = "10s";
        f15956i = new j3("netdiag", new k3(aVar8));
        k3.a aVar9 = new k3.a();
        aVar9.f16027b = 3071;
        aVar9.f16028c = 90;
        aVar9.f16029d = true;
        m3.a a26 = new m3.a().a("service");
        a26.f16140d = "1m";
        k3.a a27 = aVar9.a(new m3(a26));
        a27.f16030e = "1h";
        f15957j = new j3("periodic", new k3(a27));
        k3.a aVar10 = new k3.a();
        aVar10.f16028c = 90;
        aVar10.f16029d = true;
        aVar10.f16030e = "4h";
        f15958k = new j3("nonimpression", new k3(aVar10));
        k3.a aVar11 = new k3.a();
        aVar11.f16027b = 17;
        aVar11.f16028c = 10;
        aVar11.f16029d = true;
        aVar11.f16030e = "4h";
        f15959l = new j3("impression_responses", new k3(aVar11));
        k3.a aVar12 = new k3.a();
        aVar12.f16026a = 0.0d;
        aVar12.f16027b = 17;
        aVar12.f16028c = 60;
        aVar12.f16029d = true;
        aVar12.f16030e = "1d";
        aVar12.f16031f = "5s";
        f15960m = new j3("success_smart_redirect_hop_info", new k3(aVar12));
        k3.a aVar13 = new k3.a();
        aVar13.f16027b = 17;
        aVar13.f16028c = 70;
        aVar13.f16029d = false;
        f15961n = new j3("triggeredLink", new k3(aVar13));
        k3.a aVar14 = new k3.a();
        aVar14.f16027b = 23;
        aVar14.f16028c = 80;
        aVar14.f16029d = true;
        aVar14.f16030e = "1d";
        f15962o = new j3("ct", new k3(aVar14));
        k3.a aVar15 = new k3.a();
        aVar15.f16027b = 23;
        aVar15.f16028c = 80;
        aVar15.f16029d = true;
        aVar15.f16030e = "1d";
        f15963p = new j3("lt", new k3(aVar15));
        k3.a aVar16 = new k3.a();
        aVar16.f16027b = 23;
        aVar16.f16028c = 80;
        aVar16.f16029d = true;
        aVar16.f16030e = "1d";
        f15964q = new j3("nir", new k3(aVar16));
    }

    public j3(String str, k3 k3Var) {
        this.f15965a = str;
        this.f15966b = k3Var;
        ((HashMap) f15950c).put(str, this);
    }

    public String a() {
        return this.f15965a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j3.class != obj.getClass()) {
            return false;
        }
        return j9.a(this.f15965a, ((j3) obj).f15965a);
    }

    public int hashCode() {
        return this.f15965a.hashCode();
    }

    public String toString() {
        return this.f15965a;
    }

    public static j3 a(String str) {
        return (j3) ((HashMap) f15950c).get(str);
    }
}
