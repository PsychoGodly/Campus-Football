package com.applovin.impl;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.applovin.impl.g4;
import com.applovin.impl.oe;
import com.applovin.impl.r;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.zb;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;
import com.applovin.sdk.R;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;

public abstract class me extends ne {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public oe f9348a;

    /* renamed from: b  reason: collision with root package name */
    private DataSetObserver f9349b;

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f9350c;

    /* renamed from: d  reason: collision with root package name */
    private ListView f9351d;

    /* renamed from: f  reason: collision with root package name */
    private o f9352f;

    class a extends DataSetObserver {
        a() {
        }

        public void onChanged() {
            me.this.a();
            me meVar = me.this;
            meVar.b((Context) meVar);
        }
    }

    class b implements zb.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f9354a;

        class a implements r.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f9356a;

            a(k kVar) {
                this.f9356a = kVar;
            }

            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(this.f9356a);
            }
        }

        /* renamed from: com.applovin.impl.me$b$b  reason: collision with other inner class name */
        class C0124b implements r.b {
            C0124b() {
            }

            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(me.this.f9348a.t());
            }
        }

        class c implements r.b {
            c() {
            }

            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(me.this.f9348a.t());
            }
        }

        class d implements r.b {
            d() {
            }

            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(me.this.f9348a.e(), false, me.this.f9348a.t());
            }
        }

        class e implements r.b {
            e() {
            }

            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(me.this.f9348a.j(), me.this.f9348a.w(), me.this.f9348a.t());
            }
        }

        class f implements r.b {
            f() {
            }

            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(me.this.f9348a.v(), me.this.f9348a.t());
            }
        }

        class g implements r.b {
            g() {
            }

            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(me.this.f9348a.n(), true, me.this.f9348a.t());
            }
        }

        class h implements r.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ yb f9364a;

            h(yb ybVar) {
                this.f9364a = ybVar;
            }

            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((xf) this.f9364a).r());
            }
        }

        b(q qVar) {
            this.f9354a = qVar;
        }

        public void a(hb hbVar, yb ybVar) {
            Class<MaxDebuggerAdUnitsListActivity> cls = MaxDebuggerAdUnitsListActivity.class;
            int b10 = hbVar.b();
            if (b10 == oe.f.APP_INFO.ordinal()) {
                zp.a(ybVar.c(), ybVar.b(), (Context) me.this);
            } else if (b10 == oe.f.MAX.ordinal()) {
                k t10 = me.this.f9348a.t();
                if (t10.t().k()) {
                    int a10 = hbVar.a();
                    if (t10.t().e() != g4.a.UNIFIED) {
                        int i10 = a10 + 1;
                        if (i10 == oe.d.PRIVACY_POLICY_URL.ordinal()) {
                            if (t10.t().h() != null) {
                                up.a(t10.t().h(), k.k(), t10);
                                return;
                            } else {
                                zp.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", (Context) me.this);
                                return;
                            }
                        } else if (i10 == oe.d.TERMS_OF_SERVICE_URL.ordinal()) {
                            if (t10.t().i() != null) {
                                up.a(t10.t().i(), k.k(), t10);
                                return;
                            }
                            return;
                        }
                    } else if (a10 == oe.d.CONSENT_FLOW.ordinal()) {
                        r.a(me.this, MaxDebuggerUnifiedFlowActivity.class, this.f9354a, new a(t10));
                        return;
                    }
                }
                zp.a(ybVar.c(), ybVar.b(), (Context) me.this);
            } else if (b10 == oe.f.PRIVACY.ordinal()) {
                if (hbVar.a() == oe.e.CMP.ordinal()) {
                    if (StringUtils.isValidString(me.this.f9348a.t().m0().k())) {
                        r.a(me.this, MaxDebuggerTcfInfoListActivity.class, this.f9354a, new C0124b());
                        return;
                    }
                    zp.a(ybVar.c(), ybVar.b(), (Context) me.this);
                } else if (hbVar.a() == oe.e.NETWORK_CONSENT_STATUSES.ordinal()) {
                    r.a(me.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f9354a, new c());
                }
            } else if (b10 == oe.f.ADS.ordinal()) {
                if (hbVar.a() == oe.b.AD_UNITS.ordinal()) {
                    if (me.this.f9348a.e().size() > 0) {
                        r.a(me.this, cls, this.f9354a, new d());
                    } else {
                        zp.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", (Context) me.this);
                    }
                } else if (hbVar.a() == oe.b.SELECT_LIVE_NETWORKS.ordinal()) {
                    if (me.this.f9348a.j().size() <= 0 && me.this.f9348a.w().size() <= 0) {
                        zp.a("Complete Integrations", "Please complete integrations in order to access this.", (Context) me.this);
                    } else if (me.this.f9348a.t().n0().c()) {
                        zp.a("Restart Required", ybVar.b(), (Context) me.this);
                    } else {
                        r.a(me.this, MaxDebuggerTestLiveNetworkActivity.class, this.f9354a, new e());
                    }
                } else if (hbVar.a() == oe.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                    if (!me.this.f9348a.t().n0().c()) {
                        me.this.getSdk().n0().a();
                        zp.a("Restart Required", ybVar.b(), (Context) me.this);
                    } else if (me.this.f9348a.v().size() > 0) {
                        r.a(me.this, MaxDebuggerTestModeNetworkActivity.class, this.f9354a, new f());
                    } else {
                        zp.a("Complete Integrations", "Please complete integrations in order to access this.", (Context) me.this);
                    }
                } else if (hbVar.a() == oe.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    r.a(me.this, cls, this.f9354a, new g());
                }
            } else if ((b10 == oe.f.INCOMPLETE_NETWORKS.ordinal() || b10 == oe.f.COMPLETED_NETWORKS.ordinal()) && (ybVar instanceof xf)) {
                r.a(me.this, MaxDebuggerDetailActivity.class, this.f9354a, new h(ybVar));
            }
        }
    }

    private void c() {
        a();
        o oVar = new o(this, 50, 16842874);
        this.f9352f = oVar;
        oVar.setColor(-3355444);
        this.f9350c.addView(this.f9352f, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f9350c.bringChildToFront(this.f9352f);
        this.f9352f.a();
    }

    /* access modifiers changed from: protected */
    public k getSdk() {
        oe oeVar = this.f9348a;
        if (oeVar != null) {
            return oeVar.t();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f9350c = (FrameLayout) findViewById(16908290);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f9351d = listView;
        listView.setAdapter(this.f9348a);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        oe oeVar = this.f9348a;
        if (oeVar != null) {
            oeVar.unregisterDataSetObserver(this.f9349b);
            this.f9348a.a((zb.a) null);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        b();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        oe oeVar = this.f9348a;
        if (oeVar != null && !oeVar.x()) {
            c();
        }
    }

    public void setListAdapter(oe oeVar, q qVar) {
        DataSetObserver dataSetObserver;
        oe oeVar2 = this.f9348a;
        if (!(oeVar2 == null || (dataSetObserver = this.f9349b) == null)) {
            oeVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f9348a = oeVar;
        this.f9349b = new a();
        b((Context) this);
        this.f9348a.registerDataSetObserver(this.f9349b);
        this.f9348a.a((zb.a) new b(qVar));
    }

    /* access modifiers changed from: private */
    public void b(Context context) {
        if (StringUtils.isValidString(this.f9348a.g()) && !this.f9348a.d()) {
            this.f9348a.b(true);
            runOnUiThread(new dz(this, context));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        zp.a(this.f9348a.h(), this.f9348a.g(), context);
    }

    /* access modifiers changed from: private */
    public void a() {
        o oVar = this.f9352f;
        if (oVar != null) {
            oVar.b();
            this.f9350c.removeView(this.f9352f);
            this.f9352f = null;
        }
    }

    private void b() {
        String o10 = this.f9348a.o();
        if (!TextUtils.isEmpty(o10)) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", o10);
            intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
            intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, "MAX Mediation Debugger logs");
            startActivity(Intent.createChooser(intent, (CharSequence) null));
        }
    }
}
