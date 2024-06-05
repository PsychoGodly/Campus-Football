package com.applovin.impl;

import com.applovin.impl.bq;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sm;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashSet;
import java.util.Set;

class dn extends xl {

    /* renamed from: h  reason: collision with root package name */
    private final fq f7287h;

    /* renamed from: i  reason: collision with root package name */
    private final AppLovinAdLoadListener f7288i;

    dn(fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, k kVar) {
        super("TaskRenderVastAd", kVar);
        this.f7288i = appLovinAdLoadListener;
        this.f7287h = fqVar;
    }

    public void run() {
        if (t.a()) {
            this.f13423c.a(this.f13422b, "Rendering VAST ad...");
        }
        int size = this.f7287h.a().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String str = MaxReward.DEFAULT_LABEL;
        kq kqVar = null;
        oq oqVar = null;
        eq eqVar = null;
        dq dqVar = null;
        String str2 = str;
        for (fs fsVar : this.f7287h.a()) {
            fs b10 = fsVar.b(nq.b(fsVar) ? "Wrapper" : "InLine");
            if (b10 != null) {
                fs b11 = b10.b("AdSystem");
                if (b11 != null) {
                    kqVar = kq.a(b11, kqVar, this.f13421a);
                }
                str = nq.a(b10, "AdTitle", str);
                str2 = nq.a(b10, "Description", str2);
                nq.a(b10.a("Impression"), (Set) hashSet, this.f7287h, this.f13421a);
                fs c10 = b10.c("ViewableImpression");
                if (c10 != null) {
                    nq.a(c10.a("Viewable"), (Set) hashSet, this.f7287h, this.f13421a);
                }
                fs b12 = b10.b("AdVerifications");
                if (b12 != null) {
                    dqVar = dq.a(b12, dqVar, this.f7287h, this.f13421a);
                }
                nq.a(b10.a("Error"), (Set) hashSet2, this.f7287h, this.f13421a);
                fs c11 = b10.c("Creatives");
                if (c11 != null) {
                    for (fs fsVar2 : c11.b()) {
                        fs c12 = fsVar2.c("Linear");
                        if (c12 != null) {
                            oqVar = oq.a(c12, oqVar, this.f7287h, this.f13421a);
                        } else {
                            fs b13 = fsVar2.b("CompanionAds");
                            if (b13 != null) {
                                fs b14 = b13.b("Companion");
                                if (b14 != null) {
                                    eqVar = eq.a(b14, eqVar, this.f7287h, this.f13421a);
                                }
                            } else if (t.a()) {
                                this.f13423c.b(this.f13422b, "Received and will skip rendering for an unidentified creative: " + fsVar2);
                            }
                        }
                    }
                }
            } else if (t.a()) {
                this.f13423c.b(this.f13422b, "Did not find wrapper or inline response for node: " + fsVar);
            }
        }
        bq a10 = new bq.b().a(this.f13421a).a(this.f7287h.b()).b(this.f7287h.e()).a(this.f7287h.c()).b(str).a(str2).a(kqVar).a(oqVar).a(eqVar).a(dqVar).b((Set) hashSet).a(dqVar).a((Set) hashSet2).a();
        gq c13 = nq.c(a10);
        if (c13 == null) {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Finished rendering VAST ad: " + a10);
            }
            a10.getAdEventTracker().e();
            this.f13421a.l0().a((xl) new cm(a10, this.f13421a, this.f7288i), sm.b.CACHING);
            return;
        }
        nq.a(this.f7287h, this.f7288i, c13, -6, this.f13421a);
    }
}
