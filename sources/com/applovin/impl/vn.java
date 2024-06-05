package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.yb;
import com.applovin.impl.zb;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class vn extends ne {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public k f12809a;

    /* renamed from: b  reason: collision with root package name */
    private List f12810b;

    /* renamed from: c  reason: collision with root package name */
    private List f12811c;

    /* renamed from: d  reason: collision with root package name */
    private zb f12812d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public List f12813f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public List f12814g;

    /* renamed from: h  reason: collision with root package name */
    private ListView f12815h;

    class a extends zb {
        a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public yb a() {
            return new yb.b(yb.c.SECTION_CENTERED).d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        /* access modifiers changed from: protected */
        public int b() {
            return c.COUNT.ordinal();
        }

        /* access modifiers changed from: protected */
        public List c(int i10) {
            if (i10 == c.BIDDERS.ordinal()) {
                return vn.this.f12813f;
            }
            return vn.this.f12814g;
        }

        /* access modifiers changed from: protected */
        public int d(int i10) {
            if (i10 == c.BIDDERS.ordinal()) {
                return vn.this.f12813f.size();
            }
            return vn.this.f12814g.size();
        }

        /* access modifiers changed from: protected */
        public yb e(int i10) {
            if (i10 == c.BIDDERS.ordinal()) {
                return new bj("BIDDERS");
            }
            return new bj("WATERFALL");
        }
    }

    class b extends xf {

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ ec f12817p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(fe feVar, Context context, ec ecVar) {
            super(feVar, context);
            this.f12817p = ecVar;
        }

        public int d() {
            if (vn.this.f12809a.n0().b() == null || !vn.this.f12809a.n0().b().equals(this.f12817p.b())) {
                return 0;
            }
            return R.drawable.applovin_ic_check_mark_borderless;
        }

        public int e() {
            if (vn.this.f12809a.n0().b() == null || !vn.this.f12809a.n0().b().equals(this.f12817p.b())) {
                return super.e();
            }
            return -16776961;
        }

        public SpannedString k() {
            return StringUtils.createSpannedString(this.f12817p.a(), o() ? -16777216 : -7829368, 18, 1);
        }
    }

    enum c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public vn() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    /* access modifiers changed from: protected */
    public k getSdk() {
        return this.f12809a;
    }

    public void initialize(List<ec> list, List<ec> list2, k kVar) {
        this.f12809a = kVar;
        this.f12810b = list;
        this.f12811c = list2;
        this.f12813f = a((List) list);
        this.f12814g = a((List) list2);
        a aVar = new a(this);
        this.f12812d = aVar;
        aVar.a((zb.a) new q60(this, kVar));
        this.f12812d.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f12815h = listView;
        listView.setAdapter(this.f12812d);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f12813f = a(this.f12810b);
        this.f12814g = a(this.f12811c);
        this.f12812d.c();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ec ecVar = (ec) it.next();
            arrayList.add(new b(ecVar.d(), this, ecVar));
        }
        return arrayList;
    }

    private ec a(hb hbVar) {
        if (hbVar.b() == c.BIDDERS.ordinal()) {
            return (ec) this.f12810b.get(hbVar.a());
        }
        return (ec) this.f12811c.get(hbVar.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(k kVar, hb hbVar, yb ybVar) {
        List b10 = a(hbVar).b();
        if (b10.equals(kVar.n0().b())) {
            kVar.n0().a((List) null);
        } else {
            kVar.n0().a(b10);
        }
        this.f12812d.notifyDataSetChanged();
    }
}
