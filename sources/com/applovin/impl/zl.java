package com.applovin.impl;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sm;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.List;

public class zl extends xl {

    /* renamed from: h  reason: collision with root package name */
    private final List f13942h;

    /* renamed from: i  reason: collision with root package name */
    private final Activity f13943i;

    public zl(List list, Activity activity, k kVar) {
        super("TaskAutoInitAdapters", kVar, true);
        this.f13942h = list;
        this.f13943i = activity;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ke keVar) {
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.a(str, "Auto-initing adapter: " + keVar);
        }
        this.f13421a.N().a(keVar, this.f13943i);
    }

    public void run() {
        if (this.f13942h.size() > 0) {
            if (t.a()) {
                t tVar = this.f13423c;
                String str = this.f13422b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Auto-initing ");
                sb2.append(this.f13942h.size());
                sb2.append(" adapters");
                sb2.append(this.f13421a.n0().c() ? " in test mode" : MaxReward.DEFAULT_LABEL);
                sb2.append("...");
                tVar.a(str, sb2.toString());
            }
            if (TextUtils.isEmpty(this.f13421a.Q())) {
                this.f13421a.e(AppLovinMediationProvider.MAX);
            } else if (!this.f13421a.D0()) {
                t.h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f13421a.Q());
            }
            if (this.f13943i == null) {
                t.h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            for (ke h90 : this.f13942h) {
                this.f13421a.l0().a((Runnable) new h90(this, h90), sm.b.MEDIATION);
            }
        }
    }
}
