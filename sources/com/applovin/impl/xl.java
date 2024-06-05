package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public abstract class xl implements Runnable {
    /* access modifiers changed from: protected */

    /* renamed from: a  reason: collision with root package name */
    public final k f13421a;
    /* access modifiers changed from: protected */

    /* renamed from: b  reason: collision with root package name */
    public final String f13422b;
    /* access modifiers changed from: protected */

    /* renamed from: c  reason: collision with root package name */
    public final t f13423c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f13424d;

    /* renamed from: f  reason: collision with root package name */
    private String f13425f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13426g;

    public xl(String str, k kVar) {
        this(str, kVar, false, (String) null);
    }

    public Context a() {
        return this.f13424d;
    }

    public k b() {
        return this.f13421a;
    }

    public String c() {
        return this.f13422b;
    }

    public boolean d() {
        return this.f13426g;
    }

    public xl(String str, k kVar, String str2) {
        this(str, kVar, false, str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Thread thread, long j10) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap(MediationMetaData.KEY_NAME, thread.getState().name());
        if (StringUtils.isValidString(this.f13425f)) {
            hashMap.put("details", this.f13425f);
        }
        this.f13421a.B().a(o.b.TASK_LATENCY_ALERT, this.f13422b, (Map) hashMap);
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.k(str, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j10) + " seconds");
        }
    }

    public ScheduledFuture b(Thread thread, long j10) {
        if (j10 <= 0) {
            return null;
        }
        k kVar = this.f13421a;
        return this.f13421a.l0().b(new kn(kVar, "timeout:" + this.f13422b, new x70(this, thread, j10)), sm.b.TIMEOUT, j10);
    }

    public xl(String str, k kVar, boolean z10) {
        this(str, kVar, z10, (String) null);
    }

    public xl(String str, k kVar, boolean z10, String str2) {
        this.f13422b = str;
        this.f13421a = kVar;
        this.f13423c = kVar.L();
        this.f13424d = k.k();
        this.f13426g = z10;
        this.f13425f = str2;
    }

    public void a(String str) {
        this.f13425f = str;
    }

    public void a(boolean z10) {
        this.f13426g = z10;
    }

    public void a(Throwable th) {
        Map map = CollectionUtils.map("source", this.f13422b);
        map.put("top_main_method", th.toString());
        map.put("details", StringUtils.emptyIfNull(this.f13425f));
        this.f13421a.B().a(o.b.TASK_EXCEPTION, map);
    }
}
