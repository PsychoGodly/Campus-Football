package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sn;
import com.applovin.impl.yb;
import com.applovin.impl.zb;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

public abstract class l3 extends ne {

    /* renamed from: a  reason: collision with root package name */
    private k f9138a;

    /* renamed from: b  reason: collision with root package name */
    private zb f9139b;

    class a extends zb {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List f9140f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List f9141g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ List f9142h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ List f9143i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ List f9144j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f9140f = list;
            this.f9141g = list2;
            this.f9142h = list3;
            this.f9143i = list4;
            this.f9144j = list5;
        }

        /* access modifiers changed from: protected */
        public int b() {
            return c.values().length;
        }

        /* access modifiers changed from: protected */
        public List c(int i10) {
            List<sn> list;
            boolean z10 = true;
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f9140f;
            } else if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f9141g;
            } else {
                if (i10 == c.LISTED_TC_NETWORKS.ordinal()) {
                    list = this.f9142h;
                } else if (i10 == c.LISTED_AC_NETWORKS.ordinal()) {
                    list = this.f9143i;
                } else {
                    list = this.f9144j;
                }
                z10 = false;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (sn a10 : list) {
                arrayList.add(l3.this.a(a10, z10));
            }
            return arrayList;
        }

        /* access modifiers changed from: protected */
        public int d(int i10) {
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                return this.f9140f.size();
            }
            if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                return this.f9141g.size();
            }
            if (i10 == c.LISTED_TC_NETWORKS.ordinal()) {
                return this.f9142h.size();
            }
            if (i10 == c.LISTED_AC_NETWORKS.ordinal()) {
                return this.f9143i.size();
            }
            return this.f9144j.size();
        }

        /* access modifiers changed from: protected */
        public yb e(int i10) {
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                return new bj("MISSING TCF VENDORS (TC STRING)");
            }
            if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                return new bj("MISSING ATP NETWORKS (AC STRING)");
            }
            if (i10 == c.LISTED_TC_NETWORKS.ordinal()) {
                return new bj("LISTED TCF VENDORS (TC STRING)");
            }
            if (i10 == c.LISTED_AC_NETWORKS.ordinal()) {
                return new bj("LISTED ATP NETWORKS (AC STRING)");
            }
            return new bj("NON-CONFIGURABLE NETWORKS");
        }
    }

    class b implements zb.a {
        b() {
        }

        public void a(hb hbVar, yb ybVar) {
            zp.a(ybVar.c(), ybVar.b(), (Context) l3.this);
        }
    }

    private enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    /* access modifiers changed from: protected */
    public k getSdk() {
        return this.f9138a;
    }

    public void initialize(List<sn> list, List<sn> list2, List<sn> list3, List<sn> list4, List<sn> list5, k kVar) {
        this.f9138a = kVar;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.f9139b = aVar;
        aVar.a((zb.a) new b());
        this.f9139b.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter(this.f9139b);
    }

    /* access modifiers changed from: private */
    public yb a(sn snVar, boolean z10) {
        yb.b a10 = yb.a();
        boolean b10 = this.f9138a.m0().b();
        sn.a f10 = snVar.f();
        sn.a aVar = sn.a.TCF_VENDOR;
        if (f10 == aVar || (snVar.f() == sn.a.ATP_NETWORK && b10)) {
            String c10 = snVar.c();
            String str = snVar.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            yb.b b11 = a10.d(c10).d(z10 ? -65536 : -16777216).b(c10);
            b11.a(str + snVar.d()).a(true);
        } else {
            a10.d(snVar.b());
        }
        return a10.a();
    }
}
