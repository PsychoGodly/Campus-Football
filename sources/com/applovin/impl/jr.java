package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import com.applovin.impl.sdk.k;
import com.applovin.impl.yb;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class jr extends ne {

    /* renamed from: a  reason: collision with root package name */
    private String f8801a;

    /* renamed from: b  reason: collision with root package name */
    private k f8802b;

    /* renamed from: c  reason: collision with root package name */
    private zb f8803c;

    class a extends zb {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List f8804f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.f8804f = list;
        }

        /* access modifiers changed from: protected */
        public int b() {
            return 1;
        }

        /* access modifiers changed from: protected */
        public List c(int i10) {
            return this.f8804f;
        }

        /* access modifiers changed from: protected */
        public int d(int i10) {
            return this.f8804f.size();
        }

        /* access modifiers changed from: protected */
        public yb e(int i10) {
            return new bj("KEYWORDS");
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(yb.a(yb.c.DETAIL).d(((String) it.next()).replace("1:", "+").replace("0:", "-")).a());
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public k getSdk() {
        return this.f8802b;
    }

    public void initialize(String str, List<String> list, k kVar) {
        this.f8801a = str;
        this.f8802b = kVar;
        a aVar = new a(this, a(list));
        this.f8803c = aVar;
        aVar.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f8801a);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(this.f8803c);
        listView.setDividerHeight(0);
    }
}
