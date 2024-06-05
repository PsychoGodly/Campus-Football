package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListView;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.yb;
import com.applovin.impl.zb;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class c0 extends ne {

    /* renamed from: a  reason: collision with root package name */
    private k f6806a;

    /* renamed from: b  reason: collision with root package name */
    private zb f6807b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public List f6808c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6809d;

    /* renamed from: f  reason: collision with root package name */
    private ListView f6810f;

    class a extends zb {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List f6811f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.f6811f = list;
        }

        /* access modifiers changed from: protected */
        public int b() {
            return 1;
        }

        /* access modifiers changed from: protected */
        public List c(int i10) {
            return c0.this.f6808c;
        }

        /* access modifiers changed from: protected */
        public int d(int i10) {
            return this.f6811f.size();
        }

        /* access modifiers changed from: protected */
        public yb e(int i10) {
            return new bj(MaxReward.DEFAULT_LABEL);
        }
    }

    /* access modifiers changed from: protected */
    public k getSdk() {
        return this.f6806a;
    }

    public void initialize(List<z> list, boolean z10, k kVar) {
        this.f6809d = z10;
        this.f6806a = kVar;
        this.f6808c = a((List) list);
        a aVar = new a(this, list);
        this.f6807b = aVar;
        aVar.a((zb.a) new rv(this, list, kVar));
        this.f6807b.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6809d ? "Selective Init " : MaxReward.DEFAULT_LABEL);
        sb2.append("Ad Units");
        setTitle(sb2.toString());
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f6810f = listView;
        listView.setAdapter(this.f6807b);
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(zVar.c(), -16777216));
            spannableStringBuilder.append(new SpannedString("\n"));
            spannableStringBuilder.append(StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(zVar.b(), -16777216));
            arrayList.add(yb.a(yb.c.DETAIL).b(StringUtils.createSpannedString(zVar.d(), -16777216, 18, 1)).a(new SpannedString(spannableStringBuilder)).a((Context) this).a(true).a());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list, k kVar, hb hbVar, yb ybVar) {
        z zVar = (z) list.get(hbVar.a());
        if (zVar.g().size() == 1) {
            r.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new pv(zVar, kVar));
            return;
        }
        r.a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, kVar.e(), new qv(zVar, kVar));
    }
}
