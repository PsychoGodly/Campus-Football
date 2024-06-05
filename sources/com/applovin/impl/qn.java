package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import com.applovin.impl.r;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sn;
import com.applovin.impl.yb;
import com.applovin.impl.zb;
import com.applovin.mediation.MaxDebuggerCmpNetworksListActivity;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class qn extends ne {

    /* renamed from: a  reason: collision with root package name */
    private k f11037a;

    /* renamed from: b  reason: collision with root package name */
    private zb f11038b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final List f11039c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List f11040d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final List f11041f = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final List f11042g = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final List f11043h = new ArrayList();

    class a extends zb {
        a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public int b() {
            return e.values().length;
        }

        /* access modifiers changed from: protected */
        public List c(int i10) {
            if (i10 == e.IAB_TCF_PARAMETERS.ordinal()) {
                return qn.this.c();
            }
            return qn.this.a();
        }

        /* access modifiers changed from: protected */
        public int d(int i10) {
            if (i10 == e.IAB_TCF_PARAMETERS.ordinal()) {
                return d.values().length;
            }
            return c.values().length;
        }

        /* access modifiers changed from: protected */
        public yb e(int i10) {
            if (i10 == e.IAB_TCF_PARAMETERS.ordinal()) {
                return new bj("IAB TCF Parameters");
            }
            return new bj("CMP CONFIGURATION");
        }
    }

    class b implements zb.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ rn f11045a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f11046b;

        class a implements r.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f11048a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f11049b;

            a(String str, String str2) {
                this.f11048a = str;
                this.f11049b = str2;
            }

            public void a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.f11048a, this.f11049b, b.this.f11046b);
            }
        }

        /* renamed from: com.applovin.impl.qn$b$b  reason: collision with other inner class name */
        class C0135b implements r.b {
            C0135b() {
            }

            public void a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(qn.this.f11041f, qn.this.f11042g, qn.this.f11039c, qn.this.f11040d, qn.this.f11043h, b.this.f11046b);
            }
        }

        b(rn rnVar, k kVar) {
            this.f11045a = rnVar;
            this.f11046b = kVar;
        }

        public void a(hb hbVar, yb ybVar) {
            String str;
            String str2;
            if (hbVar.b() == e.IAB_TCF_PARAMETERS.ordinal()) {
                if (hbVar.a() == d.TC_STRING.ordinal()) {
                    str2 = qj.f11015s.a();
                    str = this.f11045a.k();
                } else {
                    str2 = qj.f11016t.a();
                    str = this.f11045a.c();
                }
                r.a(qn.this, MaxDebuggerTcfStringActivity.class, this.f11046b.e(), new a(str2, str));
            } else if (hbVar.a() == c.CONFIGURED_NETWORKS.ordinal()) {
                r.a(qn.this, MaxDebuggerCmpNetworksListActivity.class, this.f11046b.e(), new C0135b());
            } else {
                zp.a(ybVar.c(), ybVar.b(), (Context) qn.this);
            }
        }
    }

    private enum c {
        CMP_SDK_ID,
        CMP_SDK_VERSION,
        INSTRUCTIONS,
        CONFIGURED_NETWORKS
    }

    private enum d {
        GDPR_APPLIES,
        TC_STRING,
        AC_STRING
    }

    private enum e {
        IAB_TCF_PARAMETERS,
        CMP_CONFIGURATION
    }

    /* access modifiers changed from: protected */
    public k getSdk() {
        return this.f11037a;
    }

    public void initialize(k kVar) {
        this.f11037a = kVar;
        rn m02 = kVar.m0();
        a(m02.i());
        a aVar = new a(this);
        this.f11038b = aVar;
        aVar.a((zb.a) new b(m02, kVar));
        this.f11038b.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(R.id.listView)).setAdapter(this.f11038b);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        zb zbVar = this.f11038b;
        if (zbVar != null) {
            zbVar.a((zb.a) null);
        }
    }

    private void a(sn snVar, List list) {
        if (snVar.d() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (snVar.d().equals(((sn) it.next()).d())) {
                    return;
                }
            }
        }
        list.add(snVar);
    }

    private yb b() {
        yb.b bVar;
        String a10 = qj.f11012p.a();
        Integer e10 = this.f11037a.m0().e();
        if (StringUtils.isValidString(this.f11037a.m0().d())) {
            bVar = yb.a(yb.c.RIGHT_DETAIL);
        } else {
            yb.b b10 = yb.a(yb.c.DETAIL).b("Unknown CMP SDK ID");
            bVar = b10.a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + a10 + " is " + e10 + ".") + "\n\n" + "If you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").a(R.drawable.applovin_ic_warning).b(r3.a(R.color.applovin_sdk_warningColor, this)).a(true);
        }
        bVar.d(a10);
        bVar.c(e10 != null ? e10.toString() : "No value set");
        bVar.c(e10 != null ? -16777216 : -65536);
        return bVar.a();
    }

    /* access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(d.values().length);
        Integer g10 = this.f11037a.m0().g();
        String k10 = this.f11037a.m0().k();
        String c10 = this.f11037a.m0().c();
        arrayList.add(a(qj.f11014r.a(), g10));
        arrayList.add(a(qj.f11015s.a(), k10, !un.b(k10)));
        arrayList.add(a(qj.f11016t.a(), c10, false));
        return arrayList;
    }

    /* access modifiers changed from: private */
    public List a() {
        String str;
        ArrayList arrayList = new ArrayList(c.values().length);
        int size = this.f11041f.size() + this.f11042g.size();
        arrayList.add(b());
        arrayList.add(a(qj.f11013q.a(), this.f11037a.m0().f()));
        arrayList.add(yb.a(yb.c.DETAIL).d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").a());
        yb.b d10 = yb.a(yb.c.RIGHT_DETAIL).d("Configured CMP Networks");
        if (size > 0) {
            str = "Missing " + size + " network(s)";
        } else {
            str = MaxReward.DEFAULT_LABEL;
        }
        arrayList.add(d10.c(str).c(size > 0 ? -65536 : -16777216).a((Context) this).a(true).a());
        return arrayList;
    }

    private yb a(String str, String str2, boolean z10) {
        boolean isValidString = StringUtils.isValidString(str2);
        if (isValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + "...";
        }
        yb.b d10 = yb.a(yb.c.DETAIL).d(str);
        if (!isValidString) {
            str2 = "No value set";
        }
        yb.b a10 = d10.c(str2).c(z10 ? -65536 : -16777216).a(isValidString);
        if (isValidString) {
            a10.a((Context) this);
        }
        return a10.a();
    }

    private yb a(String str, Integer num) {
        return yb.a(yb.c.RIGHT_DETAIL).d(str).c(num != null ? num.toString() : "No value set").c(num != null ? -16777216 : -65536).a();
    }

    private void a(List list) {
        boolean b10 = this.f11037a.m0().b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sn snVar = (sn) it.next();
            if (snVar.f() == sn.a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(snVar.a())) {
                    a(snVar, this.f11039c);
                } else {
                    a(snVar, this.f11041f);
                }
            } else if (snVar.f() != sn.a.ATP_NETWORK) {
                this.f11043h.add(snVar);
            } else if (!b10) {
                this.f11043h.add(snVar);
            } else if (Boolean.TRUE.equals(snVar.a())) {
                a(snVar, this.f11040d);
            } else {
                a(snVar, this.f11042g);
            }
        }
    }
}
