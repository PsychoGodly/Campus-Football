package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class fk {

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator f7809h = bx.f6801a;

    /* renamed from: i  reason: collision with root package name */
    private static final Comparator f7810i = ax.f6587a;

    /* renamed from: a  reason: collision with root package name */
    private final int f7811a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList f7812b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final b[] f7813c = new b[5];

    /* renamed from: d  reason: collision with root package name */
    private int f7814d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f7815e;

    /* renamed from: f  reason: collision with root package name */
    private int f7816f;

    /* renamed from: g  reason: collision with root package name */
    private int f7817g;

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f7818a;

        /* renamed from: b  reason: collision with root package name */
        public int f7819b;

        /* renamed from: c  reason: collision with root package name */
        public float f7820c;

        private b() {
        }
    }

    public fk(int i10) {
        this.f7811a = i10;
    }

    private void b() {
        if (this.f7814d != 0) {
            Collections.sort(this.f7812b, f7810i);
            this.f7814d = 0;
        }
    }

    public void a(int i10, float f10) {
        b bVar;
        a();
        int i11 = this.f7817g;
        if (i11 > 0) {
            b[] bVarArr = this.f7813c;
            int i12 = i11 - 1;
            this.f7817g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f7815e;
        this.f7815e = i13 + 1;
        bVar.f7818a = i13;
        bVar.f7819b = i10;
        bVar.f7820c = f10;
        this.f7812b.add(bVar);
        this.f7816f += i10;
        while (true) {
            int i14 = this.f7816f;
            int i15 = this.f7811a;
            if (i14 > i15) {
                int i16 = i14 - i15;
                b bVar2 = (b) this.f7812b.get(0);
                int i17 = bVar2.f7819b;
                if (i17 <= i16) {
                    this.f7816f -= i17;
                    this.f7812b.remove(0);
                    int i18 = this.f7817g;
                    if (i18 < 5) {
                        b[] bVarArr2 = this.f7813c;
                        this.f7817g = i18 + 1;
                        bVarArr2[i18] = bVar2;
                    }
                } else {
                    bVar2.f7819b = i17 - i16;
                    this.f7816f -= i16;
                }
            } else {
                return;
            }
        }
    }

    public void c() {
        this.f7812b.clear();
        this.f7814d = -1;
        this.f7815e = 0;
        this.f7816f = 0;
    }

    private void a() {
        if (this.f7814d != 1) {
            Collections.sort(this.f7812b, f7809h);
            this.f7814d = 1;
        }
    }

    public float a(float f10) {
        b();
        float f11 = f10 * ((float) this.f7816f);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f7812b.size(); i11++) {
            b bVar = (b) this.f7812b.get(i11);
            i10 += bVar.f7819b;
            if (((float) i10) >= f11) {
                return bVar.f7820c;
            }
        }
        if (this.f7812b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.f7812b;
        return ((b) arrayList.get(arrayList.size() - 1)).f7820c;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(b bVar, b bVar2) {
        return bVar.f7818a - bVar2.f7818a;
    }
}
