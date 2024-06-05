package com.applovin.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class ph extends b {

    /* renamed from: g  reason: collision with root package name */
    private final int f10672g;

    /* renamed from: h  reason: collision with root package name */
    private final int f10673h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f10674i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f10675j;

    /* renamed from: k  reason: collision with root package name */
    private final go[] f10676k;

    /* renamed from: l  reason: collision with root package name */
    private final Object[] f10677l;

    /* renamed from: m  reason: collision with root package name */
    private final HashMap f10678m = new HashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ph(Collection collection, tj tjVar) {
        super(false, tjVar);
        int i10 = 0;
        int size = collection.size();
        this.f10674i = new int[size];
        this.f10675j = new int[size];
        this.f10676k = new go[size];
        this.f10677l = new Object[size];
        Iterator it = collection.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            zd zdVar = (zd) it.next();
            this.f10676k[i12] = zdVar.b();
            this.f10675j[i12] = i10;
            this.f10674i[i12] = i11;
            i10 += this.f10676k[i12].b();
            i11 += this.f10676k[i12].a();
            this.f10677l[i12] = zdVar.a();
            this.f10678m.put(this.f10677l[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f10672g = i10;
        this.f10673h = i11;
    }

    public int a() {
        return this.f10673h;
    }

    /* access modifiers changed from: protected */
    public int b(Object obj) {
        Integer num = (Integer) this.f10678m.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    public int d(int i10) {
        return yp.a(this.f10674i, i10 + 1, false, false);
    }

    /* access modifiers changed from: protected */
    public int e(int i10) {
        return yp.a(this.f10675j, i10 + 1, false, false);
    }

    /* access modifiers changed from: protected */
    public Object f(int i10) {
        return this.f10677l[i10];
    }

    /* access modifiers changed from: protected */
    public int g(int i10) {
        return this.f10674i[i10];
    }

    /* access modifiers changed from: protected */
    public int h(int i10) {
        return this.f10675j[i10];
    }

    /* access modifiers changed from: protected */
    public go i(int i10) {
        return this.f10676k[i10];
    }

    /* access modifiers changed from: package-private */
    public List d() {
        return Arrays.asList(this.f10676k);
    }

    public int b() {
        return this.f10672g;
    }
}
