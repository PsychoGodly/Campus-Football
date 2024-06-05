package com.applovin.impl;

import com.applovin.mediation.MaxReward;

public class w0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f12896a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12897b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12898c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12899d;

    /* renamed from: e  reason: collision with root package name */
    private final String f12900e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12901f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f12902g;

    public w0(String str) {
        this(str, -1);
    }

    /* access modifiers changed from: protected */
    public boolean a(Object obj) {
        return obj instanceof w0;
    }

    public String b() {
        return this.f12896a;
    }

    public String c() {
        return this.f12897b;
    }

    public String d() {
        return this.f12900e;
    }

    public String e() {
        return this.f12898c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (!w0Var.a((Object) this)) {
            return false;
        }
        String b10 = b();
        String b11 = w0Var.b();
        if (b10 != null ? !b10.equals(b11) : b11 != null) {
            return false;
        }
        String c10 = c();
        String c11 = w0Var.c();
        if (c10 != null ? !c10.equals(c11) : c11 != null) {
            return false;
        }
        String e10 = e();
        String e11 = w0Var.e();
        if (e10 != null ? !e10.equals(e11) : e11 != null) {
            return false;
        }
        String a10 = a();
        String a11 = w0Var.a();
        return a10 != null ? a10.equals(a11) : a11 == null;
    }

    public int f() {
        return this.f12901f;
    }

    public boolean g() {
        return this.f12896a.equals("applovin.com");
    }

    public boolean h() {
        return this.f12902g;
    }

    public int hashCode() {
        String b10 = b();
        int i10 = 43;
        int hashCode = b10 == null ? 43 : b10.hashCode();
        String c10 = c();
        int hashCode2 = ((hashCode + 59) * 59) + (c10 == null ? 43 : c10.hashCode());
        String e10 = e();
        int hashCode3 = (hashCode2 * 59) + (e10 == null ? 43 : e10.hashCode());
        String a10 = a();
        int i11 = hashCode3 * 59;
        if (a10 != null) {
            i10 = a10.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + b() + ", publisherId=" + c() + ", relationship=" + e() + ", certificateAuthorityId=" + a() + ", rawValue=" + d() + ", rowNumber=" + f() + ", valid=" + h() + ")";
    }

    public w0(String str, int i10) {
        this.f12900e = str;
        this.f12901f = i10;
        String[] split = str.split(",");
        boolean z10 = split.length == 3 || split.length == 4;
        this.f12902g = z10;
        String str2 = MaxReward.DEFAULT_LABEL;
        if (z10) {
            this.f12896a = a(split[0]);
            this.f12897b = a(split[1]);
            this.f12898c = a(split[2]);
            this.f12899d = split.length == 4 ? a(split[3]) : str2;
            return;
        }
        this.f12896a = str2;
        this.f12897b = str2;
        this.f12898c = str2;
        this.f12899d = str2;
    }

    public String a() {
        return this.f12899d;
    }

    private String a(String str) {
        return str.replace(173, ' ').trim();
    }
}
