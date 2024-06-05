package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class wr {

    /* renamed from: a  reason: collision with root package name */
    private String f13158a = MaxReward.DEFAULT_LABEL;

    /* renamed from: b  reason: collision with root package name */
    private String f13159b = MaxReward.DEFAULT_LABEL;

    /* renamed from: c  reason: collision with root package name */
    private Set f13160c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private String f13161d = MaxReward.DEFAULT_LABEL;

    /* renamed from: e  reason: collision with root package name */
    private String f13162e = null;

    /* renamed from: f  reason: collision with root package name */
    private int f13163f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13164g = false;

    /* renamed from: h  reason: collision with root package name */
    private int f13165h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f13166i = false;

    /* renamed from: j  reason: collision with root package name */
    private int f13167j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f13168k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f13169l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f13170m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f13171n = -1;

    /* renamed from: o  reason: collision with root package name */
    private float f13172o;

    /* renamed from: p  reason: collision with root package name */
    private int f13173p = -1;

    /* renamed from: q  reason: collision with root package name */
    private boolean f13174q = false;

    public int a() {
        if (this.f13166i) {
            return this.f13165h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f13174q;
    }

    public int c() {
        if (this.f13164g) {
            return this.f13163f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f13162e;
    }

    public float e() {
        return this.f13172o;
    }

    public int f() {
        return this.f13171n;
    }

    public int g() {
        return this.f13173p;
    }

    public int h() {
        int i10 = this.f13169l;
        if (i10 == -1 && this.f13170m == -1) {
            return -1;
        }
        int i11 = 0;
        int i12 = i10 == 1 ? 1 : 0;
        if (this.f13170m == 1) {
            i11 = 2;
        }
        return i12 | i11;
    }

    public boolean i() {
        return this.f13166i;
    }

    public boolean j() {
        return this.f13164g;
    }

    public boolean k() {
        return this.f13167j == 1;
    }

    public boolean l() {
        return this.f13168k == 1;
    }

    public wr b(boolean z10) {
        this.f13174q = z10;
        return this;
    }

    public wr d(int i10) {
        this.f13173p = i10;
        return this;
    }

    public wr b(int i10) {
        this.f13163f = i10;
        this.f13164g = true;
        return this;
    }

    public void d(String str) {
        this.f13161d = str;
    }

    public int a(String str, String str2, Set set, String str3) {
        if (this.f13158a.isEmpty() && this.f13159b.isEmpty() && this.f13160c.isEmpty() && this.f13161d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int a10 = a(a(a(0, this.f13158a, str, 1073741824), this.f13159b, str2, 2), this.f13161d, str3, 4);
        if (a10 == -1 || !set.containsAll(this.f13160c)) {
            return 0;
        }
        return a10 + (this.f13160c.size() * 4);
    }

    public wr c(int i10) {
        this.f13171n = i10;
        return this;
    }

    public wr d(boolean z10) {
        this.f13168k = z10 ? 1 : 0;
        return this;
    }

    public void b(String str) {
        this.f13158a = str;
    }

    public wr c(boolean z10) {
        this.f13170m = z10 ? 1 : 0;
        return this;
    }

    public void c(String str) {
        this.f13159b = str;
    }

    public wr a(int i10) {
        this.f13165h = i10;
        this.f13166i = true;
        return this;
    }

    public wr a(boolean z10) {
        this.f13169l = z10 ? 1 : 0;
        return this;
    }

    public wr a(String str) {
        this.f13162e = str == null ? null : Ascii.toLowerCase(str);
        return this;
    }

    public wr a(float f10) {
        this.f13172o = f10;
        return this;
    }

    public void a(String[] strArr) {
        this.f13160c = new HashSet(Arrays.asList(strArr));
    }

    private static int a(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }
}
