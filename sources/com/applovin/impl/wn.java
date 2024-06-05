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
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class wn extends ne {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public k f13116a;

    /* renamed from: b  reason: collision with root package name */
    private List f13117b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public zb f13118c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public List f13119d;

    /* renamed from: f  reason: collision with root package name */
    private ListView f13120f;

    class a extends zb {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List f13121f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.f13121f = list;
        }

        /* access modifiers changed from: protected */
        public yb a() {
            return new yb.b(yb.c.SECTION_CENTERED).d("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        /* access modifiers changed from: protected */
        public int b() {
            return 1;
        }

        /* access modifiers changed from: protected */
        public List c(int i10) {
            return wn.this.f13119d;
        }

        /* access modifiers changed from: protected */
        public int d(int i10) {
            return this.f13121f.size();
        }

        /* access modifiers changed from: protected */
        public yb e(int i10) {
            return new bj("TEST MODE NETWORKS");
        }
    }

    class b implements zb.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f13123a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f13124b;

        b(List list, k kVar) {
            this.f13123a = list;
            this.f13124b = kVar;
        }

        public void a(hb hbVar, yb ybVar) {
            List singletonList = Collections.singletonList(((fe) this.f13123a.get(hbVar.a())).m());
            if (singletonList.equals(this.f13124b.n0().b())) {
                this.f13124b.n0().a((List) null);
            } else {
                this.f13124b.n0().a(singletonList);
            }
            wn.this.f13118c.notifyDataSetChanged();
        }
    }

    class c extends xf {

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ fe f13126p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(fe feVar, Context context, fe feVar2) {
            super(feVar, context);
            this.f13126p = feVar2;
        }

        public int d() {
            if (Collections.singletonList(this.f13126p.m()).equals(wn.this.f13116a.n0().b())) {
                return R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        public int e() {
            if (Collections.singletonList(this.f13126p.m()).equals(wn.this.f13116a.n0().b())) {
                return -16776961;
            }
            return super.e();
        }

        public SpannedString k() {
            return StringUtils.createSpannedString(this.f13126p.g(), o() ? -16777216 : -7829368, 18, 1);
        }
    }

    public wn() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    /* access modifiers changed from: protected */
    public k getSdk() {
        return this.f13116a;
    }

    public void initialize(List<fe> list, k kVar) {
        this.f13116a = kVar;
        this.f13117b = list;
        this.f13119d = a((List) list);
        a aVar = new a(this, list);
        this.f13118c = aVar;
        aVar.a((zb.a) new b(list, kVar));
        this.f13118c.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f13120f = listView;
        listView.setAdapter(this.f13118c);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f13119d = a(this.f13117b);
        this.f13118c.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fe feVar = (fe) it.next();
            arrayList.add(new c(feVar, this, feVar));
        }
        return arrayList;
    }
}
