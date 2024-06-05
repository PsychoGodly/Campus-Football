package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.List;

class y extends zb {

    /* renamed from: f  reason: collision with root package name */
    private final z f13459f;

    /* renamed from: g  reason: collision with root package name */
    private final a0 f13460g;

    /* renamed from: h  reason: collision with root package name */
    private final kr f13461h;

    /* renamed from: i  reason: collision with root package name */
    private final String f13462i;

    /* renamed from: j  reason: collision with root package name */
    private final List f13463j;

    /* renamed from: k  reason: collision with root package name */
    private final List f13464k;

    /* renamed from: l  reason: collision with root package name */
    private final List f13465l;

    enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    class b extends xf {

        /* renamed from: p  reason: collision with root package name */
        private final kr f13471p;

        b(kr krVar, String str, boolean z10) {
            super(krVar.b().d(), y.this.f13816a);
            this.f13471p = krVar;
            this.f13563c = StringUtils.createSpannedString(krVar.b().a(), -16777216, 18, 1);
            this.f13564d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f13562b = z10;
        }

        public int g() {
            return -12303292;
        }

        public boolean o() {
            return this.f13562b;
        }

        public kr v() {
            return this.f13471p;
        }
    }

    y(z zVar, a0 a0Var, kr krVar, Context context) {
        super(context);
        a0 a0Var2;
        this.f13459f = zVar;
        this.f13461h = krVar;
        if (a0Var != null) {
            a0Var2 = a0Var;
        } else {
            a0Var2 = zVar.f();
        }
        this.f13460g = a0Var2;
        this.f13462i = a0Var != null ? a0Var.c() : zVar.d();
        this.f13463j = h();
        this.f13464k = e();
        this.f13465l = l();
        notifyDataSetChanged();
    }

    private List e() {
        kr krVar = this.f13461h;
        if (krVar != null && !krVar.d()) {
            return new ArrayList();
        }
        List<kr> a10 = this.f13460g.a();
        ArrayList arrayList = new ArrayList(a10.size());
        for (kr krVar2 : a10) {
            kr krVar3 = this.f13461h;
            if (krVar3 == null || krVar3.b().c().equals(krVar2.b().c())) {
                arrayList.add(new b(krVar2, krVar2.a() != null ? krVar2.a().a() : MaxReward.DEFAULT_LABEL, this.f13461h == null));
            }
        }
        return arrayList;
    }

    private yb f() {
        return yb.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private yb g() {
        return yb.a().d("ID").c(this.f13459f.c()).a();
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f13460g.b() != null) {
            arrayList.add(f());
        }
        if (this.f13461h != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private yb i() {
        return yb.a().d("Selected Network").c(this.f13461h.b().a()).a();
    }

    private List l() {
        kr krVar = this.f13461h;
        if (krVar != null && krVar.d()) {
            return new ArrayList();
        }
        List<kr> e10 = this.f13460g.e();
        ArrayList arrayList = new ArrayList(e10.size());
        for (kr krVar2 : e10) {
            kr krVar3 = this.f13461h;
            if (krVar3 == null || krVar3.b().c().equals(krVar2.b().c())) {
                arrayList.add(new b(krVar2, (String) null, this.f13461h == null));
                for (yf yfVar : krVar2.c()) {
                    arrayList.add(yb.a().d(yfVar.a()).c(yfVar.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public int b() {
        return a.COUNT.ordinal();
    }

    /* access modifiers changed from: protected */
    public List c(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return this.f13463j;
        }
        if (i10 == a.BIDDERS.ordinal()) {
            return this.f13464k;
        }
        return this.f13465l;
    }

    /* access modifiers changed from: protected */
    public int d(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return this.f13463j.size();
        }
        if (i10 == a.BIDDERS.ordinal()) {
            return this.f13464k.size();
        }
        return this.f13465l.size();
    }

    public a0 j() {
        return this.f13460g;
    }

    public String k() {
        return this.f13462i;
    }

    private yb d() {
        return yb.a().d("Ad Format").c(this.f13459f.b()).a();
    }

    /* access modifiers changed from: protected */
    public yb e(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return new bj("INFO");
        }
        if (i10 == a.BIDDERS.ordinal()) {
            return new bj("BIDDERS");
        }
        return new bj("WATERFALL");
    }
}
