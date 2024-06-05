package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sn;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

public abstract class on extends ne {

    /* renamed from: a  reason: collision with root package name */
    private k f10490a;

    /* renamed from: b  reason: collision with root package name */
    private zb f10491b;

    class a extends zb {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f10492f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f10493g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f10494h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
            super(context);
            this.f10492f = arrayList;
            this.f10493g = arrayList2;
            this.f10494h = z10;
        }

        /* access modifiers changed from: protected */
        public int b() {
            return b.values().length;
        }

        /* access modifiers changed from: protected */
        public List c(int i10) {
            if (i10 == b.TC_NETWORKS.ordinal()) {
                return this.f10492f;
            }
            return this.f10493g;
        }

        /* access modifiers changed from: protected */
        public int d(int i10) {
            if (i10 == b.TC_NETWORKS.ordinal()) {
                return this.f10492f.size();
            }
            return this.f10493g.size();
        }

        /* access modifiers changed from: protected */
        public yb e(int i10) {
            if (i10 == b.TC_NETWORKS.ordinal()) {
                return new bj("TCF VENDORS (TC STRING)");
            }
            return new bj(this.f10494h ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }
    }

    private enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    private yb a(String str, String str2) {
        return yb.a().d(str).c(str2).a();
    }

    /* access modifiers changed from: protected */
    public k getSdk() {
        return this.f10490a;
    }

    public void initialize(k kVar) {
        this.f10490a = kVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String a10 = y3.b().a((Context) this);
        boolean b10 = kVar.m0().b();
        if (!b10) {
            arrayList2.add(a("Has User Consent", a10));
        }
        for (sn snVar : kVar.m0().i()) {
            Boolean a11 = snVar.a();
            if (a11 != null) {
                if (snVar.f() == sn.a.TCF_VENDOR) {
                    arrayList.add(a(snVar.b(), String.valueOf(a11)));
                } else if (snVar.f() == sn.a.ATP_NETWORK) {
                    arrayList2.add(a(snVar.b(), String.valueOf(a11)));
                }
            } else if (b10 && snVar.f() == sn.a.ATP_NETWORK) {
                arrayList2.add(a(snVar.b(), a10));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, b10);
        this.f10491b = aVar;
        aVar.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(R.id.listView)).setAdapter(this.f10491b);
    }
}
