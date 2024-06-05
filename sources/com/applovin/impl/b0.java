package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.yb;
import com.applovin.impl.zb;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerWaterfallKeywordsActivity;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class b0 extends ne {

    /* renamed from: a  reason: collision with root package name */
    private z f6592a;

    /* renamed from: b  reason: collision with root package name */
    private k f6593b;

    /* renamed from: c  reason: collision with root package name */
    private zb f6594c;

    class a extends zb {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ z f6595f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, z zVar) {
            super(context);
            this.f6595f = zVar;
        }

        /* access modifiers changed from: protected */
        public int b() {
            return this.f6595f.g().size();
        }

        /* access modifiers changed from: protected */
        public List c(int i10) {
            ArrayList arrayList = new ArrayList();
            a0 a0Var = (a0) this.f6595f.g().get(i10);
            arrayList.add(b0.this.c(a0Var.c()));
            if (a0Var.b() != null) {
                arrayList.add(b0.this.a("AB Test Experiment Name", a0Var.b()));
            }
            lr d10 = a0Var.d();
            b0 b0Var = b0.this;
            arrayList.add(b0Var.a("Device ID Targeting", b0Var.a(d10.a())));
            b0 b0Var2 = b0.this;
            arrayList.add(b0Var2.a("Device Type Targeting", b0Var2.b(d10.b())));
            if (d10.c() != null) {
                b0 b0Var3 = b0.this;
                arrayList.add(b0Var3.a("Gender", b0Var3.a(d10.c())));
            }
            if (!(d10.f() == null || d10.e() == null)) {
                b0 b0Var4 = b0.this;
                arrayList.add(b0Var4.a("Age", d10.f() + "-" + d10.e()));
            }
            if (d10.d() != null) {
                arrayList.add(b0.this.b(d10.d()));
            }
            return arrayList;
        }

        /* access modifiers changed from: protected */
        public int d(int i10) {
            a0 a0Var = (a0) this.f6595f.g().get(i10);
            int i11 = a0Var.b() != null ? 1 : 0;
            int i12 = 2;
            lr d10 = a0Var.d();
            if (!(d10.f() == null || d10.e() == null)) {
                i12 = 3;
            }
            if (d10.c() != null) {
                i12++;
            }
            if (d10.d() != null) {
                i12++;
            }
            return i11 + 1 + i12;
        }

        /* access modifiers changed from: protected */
        public yb e(int i10) {
            if (i10 == b.TARGETED_WATERFALL.ordinal()) {
                return new bj("TARGETED WATERFALL FOR CURRENT DEVICE");
            }
            if (i10 == b.OTHER_WATERFALLS.ordinal()) {
                return new bj("OTHER WATERFALLS");
            }
            return new bj(MaxReward.DEFAULT_LABEL);
        }
    }

    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    /* access modifiers changed from: protected */
    public k getSdk() {
        return this.f6593b;
    }

    public void initialize(z zVar, k kVar) {
        this.f6592a = zVar;
        this.f6593b = kVar;
        a aVar = new a(this, zVar);
        this.f6594c = aVar;
        aVar.a((zb.a) new mt(this, kVar, zVar));
        this.f6594c.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f6592a.d());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(this.f6594c);
        listView.setDividerHeight(0);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        zb zbVar = this.f6594c;
        if (zbVar != null) {
            zbVar.a((zb.a) null);
        }
    }

    /* access modifiers changed from: private */
    public yb c(String str) {
        return yb.a(yb.c.RIGHT_DETAIL).b(StringUtils.createSpannedString(str, -16777216, 18, 1)).a((Context) this).a(true).a();
    }

    /* access modifiers changed from: private */
    public String b(String str) {
        if (str.equals("phone")) {
            return "Phones";
        }
        return str.equals("tablet") ? "Tablets" : "All";
    }

    /* access modifiers changed from: private */
    public String a(String str) {
        if (str.equals("idfa")) {
            return "IDFA Only";
        }
        return str.equals("dnt") ? "No IDFA Only" : "All";
    }

    /* access modifiers changed from: private */
    public yb b(List list) {
        yb.b d10 = yb.a(yb.c.DETAIL).d("Keywords");
        return d10.a(StringUtils.createSpannedString(list.size() + " keyword group(s)", -7829368, 14)).a((Context) this).a(true).a();
    }

    /* access modifiers changed from: private */
    public String a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals("m")) {
                arrayList.add("Male");
            } else if (str.equals("f")) {
                arrayList.add("Female");
            } else {
                arrayList.add("Unknown");
            }
        }
        return jt.a(", ", arrayList);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(z zVar, hb hbVar, k kVar, MaxDebuggerWaterfallKeywordsActivity maxDebuggerWaterfallKeywordsActivity) {
        a0 a0Var = (a0) zVar.g().get(hbVar.b());
        maxDebuggerWaterfallKeywordsActivity.initialize(a0Var.c(), a0Var.d().d(), kVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(k kVar, z zVar, hb hbVar, yb ybVar) {
        if (hbVar.a() == 0) {
            r.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new kt(zVar, hbVar, kVar));
        } else if (ybVar.k().toString().equals("Keywords")) {
            r.a(this, MaxDebuggerWaterfallKeywordsActivity.class, kVar.e(), new lt(zVar, hbVar, kVar));
        }
    }

    /* access modifiers changed from: private */
    public yb a(String str, String str2) {
        return yb.a(yb.c.RIGHT_DETAIL).d(str).c(str2).a();
    }
}
