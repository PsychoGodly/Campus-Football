package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.sdk.R;

public class yb {

    /* renamed from: a  reason: collision with root package name */
    protected c f13561a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f13562b;

    /* renamed from: c  reason: collision with root package name */
    protected SpannedString f13563c;

    /* renamed from: d  reason: collision with root package name */
    protected SpannedString f13564d;

    /* renamed from: e  reason: collision with root package name */
    protected String f13565e;

    /* renamed from: f  reason: collision with root package name */
    protected String f13566f;

    /* renamed from: g  reason: collision with root package name */
    protected int f13567g;

    /* renamed from: h  reason: collision with root package name */
    protected int f13568h;

    /* renamed from: i  reason: collision with root package name */
    protected int f13569i;

    /* renamed from: j  reason: collision with root package name */
    protected int f13570j;

    /* renamed from: k  reason: collision with root package name */
    protected int f13571k;

    /* renamed from: l  reason: collision with root package name */
    protected int f13572l;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f13573m;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final c f13574a;

        /* renamed from: b  reason: collision with root package name */
        boolean f13575b;

        /* renamed from: c  reason: collision with root package name */
        SpannedString f13576c;

        /* renamed from: d  reason: collision with root package name */
        SpannedString f13577d;

        /* renamed from: e  reason: collision with root package name */
        String f13578e;

        /* renamed from: f  reason: collision with root package name */
        String f13579f;

        /* renamed from: g  reason: collision with root package name */
        int f13580g = 0;

        /* renamed from: h  reason: collision with root package name */
        int f13581h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f13582i = -16777216;

        /* renamed from: j  reason: collision with root package name */
        int f13583j = -16777216;

        /* renamed from: k  reason: collision with root package name */
        int f13584k = 0;

        /* renamed from: l  reason: collision with root package name */
        int f13585l = 0;

        /* renamed from: m  reason: collision with root package name */
        boolean f13586m;

        public b(c cVar) {
            this.f13574a = cVar;
        }

        public b a(String str) {
            this.f13579f = str;
            return this;
        }

        public b b(String str) {
            this.f13578e = str;
            return this;
        }

        public b c(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b d(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b a(int i10) {
            this.f13581h = i10;
            return this;
        }

        public b b(int i10) {
            this.f13585l = i10;
            return this;
        }

        public b a(Context context) {
            this.f13581h = R.drawable.applovin_ic_disclosure_arrow;
            this.f13585l = r3.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public b b(boolean z10) {
            this.f13586m = z10;
            return this;
        }

        public b c(int i10) {
            this.f13583j = i10;
            return this;
        }

        public b d(int i10) {
            this.f13582i = i10;
            return this;
        }

        public b b(SpannedString spannedString) {
            this.f13576c = spannedString;
            return this;
        }

        public b a(boolean z10) {
            this.f13575b = z10;
            return this;
        }

        public b a(SpannedString spannedString) {
            this.f13577d = spannedString;
            return this;
        }

        public yb a() {
            return new yb(this);
        }
    }

    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f13594a;

        private c(int i10) {
            this.f13594a = i10;
        }

        public int b() {
            if (this == SECTION) {
                return R.layout.mediation_debugger_list_section;
            }
            if (this == SECTION_CENTERED) {
                return R.layout.mediation_debugger_list_section_centered;
            }
            if (this == SIMPLE) {
                return 17367043;
            }
            if (this == DETAIL) {
                return R.layout.applovin_debugger_list_item_detail;
            }
            return R.layout.mediation_debugger_list_item_right_detail;
        }

        public int c() {
            return this.f13594a;
        }
    }

    private yb(b bVar) {
        this.f13567g = 0;
        this.f13568h = 0;
        this.f13569i = -16777216;
        this.f13570j = -16777216;
        this.f13571k = 0;
        this.f13572l = 0;
        this.f13561a = bVar.f13574a;
        this.f13562b = bVar.f13575b;
        this.f13563c = bVar.f13576c;
        this.f13564d = bVar.f13577d;
        this.f13565e = bVar.f13578e;
        this.f13566f = bVar.f13579f;
        this.f13567g = bVar.f13580g;
        this.f13568h = bVar.f13581h;
        this.f13569i = bVar.f13582i;
        this.f13570j = bVar.f13583j;
        this.f13571k = bVar.f13584k;
        this.f13572l = bVar.f13585l;
        this.f13573m = bVar.f13586m;
    }

    public static b a() {
        return a(c.RIGHT_DETAIL);
    }

    public static int n() {
        return c.COUNT.c();
    }

    public String b() {
        return this.f13566f;
    }

    public String c() {
        return this.f13565e;
    }

    public int d() {
        return this.f13568h;
    }

    public int e() {
        return this.f13572l;
    }

    public SpannedString f() {
        return this.f13564d;
    }

    public int g() {
        return this.f13570j;
    }

    public int h() {
        return this.f13567g;
    }

    public int i() {
        return this.f13571k;
    }

    public int j() {
        return this.f13561a.b();
    }

    public SpannedString k() {
        return this.f13563c;
    }

    public int l() {
        return this.f13569i;
    }

    public int m() {
        return this.f13561a.c();
    }

    public boolean o() {
        return this.f13562b;
    }

    public boolean p() {
        return this.f13573m;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    protected yb(c cVar) {
        this.f13567g = 0;
        this.f13568h = 0;
        this.f13569i = -16777216;
        this.f13570j = -16777216;
        this.f13571k = 0;
        this.f13572l = 0;
        this.f13561a = cVar;
    }
}
