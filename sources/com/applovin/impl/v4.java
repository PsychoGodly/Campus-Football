package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class v4 extends zb {

    /* renamed from: f  reason: collision with root package name */
    private k f12669f;

    /* renamed from: g  reason: collision with root package name */
    private List f12670g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f12671h = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    private List f12672i = new ArrayList();

    public enum a {
        RECENT_ADS,
        COUNT
    }

    public v4(Context context) {
        super(context);
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new t6((u6) it.next(), this.f13816a));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public int b() {
        return a.COUNT.ordinal();
    }

    /* access modifiers changed from: protected */
    public List c(int i10) {
        return this.f12672i;
    }

    public List d() {
        return this.f12670g;
    }

    public k e() {
        return this.f12669f;
    }

    public boolean f() {
        return this.f12672i.size() == 0;
    }

    public void g() {
        this.f12671h.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f12671h.get() + "}";
    }

    /* access modifiers changed from: protected */
    public int d(int i10) {
        return this.f12672i.size();
    }

    /* access modifiers changed from: protected */
    public yb e(int i10) {
        return new bj("RECENT ADS");
    }

    public void a(List list, k kVar) {
        Activity p02;
        this.f12669f = kVar;
        this.f12670g = list;
        if (!(this.f13816a instanceof Activity) && (p02 = kVar.p0()) != null) {
            this.f13816a = p02;
        }
        if (list != null && this.f12671h.compareAndSet(false, true)) {
            this.f12672i = a(this.f12670g);
        }
        AppLovinSdkUtils.runOnUiThread(new c60(this));
    }
}
