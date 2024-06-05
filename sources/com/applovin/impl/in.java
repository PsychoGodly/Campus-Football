package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

class in extends xl {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final fq f8570h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final AppLovinAdLoadListener f8571i;

    class a extends en {
        a(com.applovin.impl.sdk.network.a aVar, k kVar) {
            super(aVar, kVar);
        }

        public void a(String str, fs fsVar, int i10) {
            this.f13421a.l0().a((xl) bn.a(fsVar, in.this.f8570h, in.this.f8571i, in.this.f13421a));
        }

        public void a(String str, int i10, String str2, fs fsVar) {
            if (t.a()) {
                t tVar = this.f13423c;
                String str3 = this.f13422b;
                tVar.b(str3, "Unable to resolve VAST wrapper. Server returned " + i10);
            }
            in.this.a(i10);
        }
    }

    in(fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, k kVar) {
        super("TaskResolveVastWrapper", kVar);
        this.f8571i = appLovinAdLoadListener;
        this.f8570h = fqVar;
    }

    public void run() {
        String a10 = nq.a(this.f8570h);
        if (StringUtils.isValidString(a10)) {
            if (t.a()) {
                t tVar = this.f13423c;
                String str = this.f13422b;
                tVar.a(str, "Resolving VAST ad with depth " + this.f8570h.d() + " at " + a10);
            }
            try {
                this.f13421a.l0().a((xl) new a(com.applovin.impl.sdk.network.a.a(this.f13421a).b(a10).c("GET").a((Object) fs.f7857f).a(((Integer) this.f13421a.a(oj.U4)).intValue()).c(((Integer) this.f13421a.a(oj.V4)).intValue()).a(false).a(), this.f13421a));
            } catch (Throwable th) {
                if (t.a()) {
                    this.f13423c.a(this.f13422b, "Unable to resolve VAST wrapper", th);
                }
                a(-1);
            }
        } else {
            if (t.a()) {
                this.f13423c.b(this.f13422b, "Resolving VAST failed. Could not find resolution URL");
            }
            a(-1);
        }
    }

    /* access modifiers changed from: private */
    public void a(int i10) {
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.b(str, "Failed to resolve VAST wrapper due to error code " + i10);
        }
        if (i10 == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f8571i;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i10);
                return;
            }
            return;
        }
        nq.a(this.f8570h, this.f8571i, i10 == -1001 ? gq.TIMED_OUT : gq.GENERAL_WRAPPER_ERROR, i10, this.f13421a);
    }
}
