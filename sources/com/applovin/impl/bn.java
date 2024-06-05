package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

public abstract class bn extends xl {

    /* renamed from: h  reason: collision with root package name */
    private final AppLovinAdLoadListener f6744h;

    /* renamed from: i  reason: collision with root package name */
    private final a f6745i;

    private static final class a extends fq {
        a(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
            super(jSONObject, jSONObject2, kVar);
        }

        /* access modifiers changed from: package-private */
        public void a(fs fsVar) {
            if (fsVar != null) {
                this.f7843b.add(fsVar);
                return;
            }
            throw new IllegalArgumentException("No aggregated vast response specified");
        }
    }

    private static final class b extends bn {

        /* renamed from: j  reason: collision with root package name */
        private final String f6746j;

        b(String str, fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, k kVar) {
            super(fqVar, appLovinAdLoadListener, kVar);
            this.f6746j = str;
        }

        public void run() {
            fs b10 = b(this.f6746j);
            if (b10 != null) {
                a(b10);
                return;
            }
            if (t.a()) {
                t tVar = this.f13423c;
                String str = this.f13422b;
                tVar.b(str, "Unable to process XML: " + this.f6746j);
            }
            c(this.f6746j);
            a(gq.XML_PARSING);
        }
    }

    private static final class c extends bn {

        /* renamed from: j  reason: collision with root package name */
        private final JSONObject f6747j;

        c(fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, k kVar) {
            super(fqVar, appLovinAdLoadListener, kVar);
            this.f6747j = fqVar.b();
        }

        public void run() {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f6747j, "xml", (String) null);
            if (!StringUtils.isValidString(string)) {
                if (t.a()) {
                    this.f13423c.b(this.f13422b, "No VAST response received.");
                }
                a(gq.NO_WRAPPER_RESPONSE);
            } else if (string.length() < ((Integer) this.f13421a.a(oj.P4)).intValue()) {
                fs b10 = b(string);
                if (b10 != null) {
                    a(b10);
                    return;
                }
                if (t.a()) {
                    t tVar = this.f13423c;
                    String str = this.f13422b;
                    tVar.b(str, "Unable to process XML: " + string);
                }
                c(string);
                a(gq.XML_PARSING);
            } else {
                if (t.a()) {
                    this.f13423c.b(this.f13422b, "VAST response is over max length");
                }
                a(gq.XML_PARSING);
            }
        }
    }

    private static final class d extends bn {

        /* renamed from: j  reason: collision with root package name */
        private final fs f6748j;

        d(fs fsVar, fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, k kVar) {
            super(fqVar, appLovinAdLoadListener, kVar);
            if (fsVar == null) {
                throw new IllegalArgumentException("No response specified.");
            } else if (fqVar == null) {
                throw new IllegalArgumentException("No context specified.");
            } else if (appLovinAdLoadListener != null) {
                this.f6748j = fsVar;
            } else {
                throw new IllegalArgumentException("No callback specified.");
            }
        }

        public void run() {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Processing VAST Wrapper response...");
            }
            a(this.f6748j);
        }
    }

    bn(fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, k kVar) {
        super("TaskProcessVastResponse", kVar);
        if (fqVar != null) {
            this.f6744h = appLovinAdLoadListener;
            this.f6745i = (a) fqVar;
            return;
        }
        throw new IllegalArgumentException("No context specified.");
    }

    /* access modifiers changed from: package-private */
    public void a(fs fsVar) {
        int d10 = this.f6745i.d();
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.a(str, "Finished parsing XML at depth " + d10);
        }
        this.f6745i.a(fsVar);
        if (nq.b(fsVar)) {
            int intValue = ((Integer) this.f13421a.a(oj.Q4)).intValue();
            if (d10 < intValue) {
                if (t.a()) {
                    this.f13423c.a(this.f13422b, "VAST response is wrapper. Resolving...");
                }
                this.f13421a.l0().a((xl) new in(this.f6745i, this.f6744h, this.f13421a));
                return;
            }
            if (t.a()) {
                t tVar2 = this.f13423c;
                String str2 = this.f13422b;
                tVar2.b(str2, "Reached beyond max wrapper depth of " + intValue);
            }
            a(gq.WRAPPER_LIMIT_REACHED);
        } else if (nq.a(fsVar)) {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "VAST response is inline. Rendering ad...");
            }
            this.f13421a.l0().a((xl) new dn(this.f6745i, this.f6744h, this.f13421a));
        } else {
            if (t.a()) {
                this.f13423c.b(this.f13422b, "VAST response is an error");
            }
            a(gq.NO_WRAPPER_RESPONSE);
        }
    }

    /* access modifiers changed from: protected */
    public fs b(String str) {
        try {
            return gs.a(str, this.f13421a);
        } catch (Throwable th) {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Failed to process VAST response", th);
            }
            a(gq.XML_PARSING);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void c(String str) {
        if (str != null) {
            for (String str2 : StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f13421a.a(oj.f10325i5)), 1)) {
                fs b10 = b("<VAST>" + str2 + "</VAST>");
                if (b10 != null) {
                    this.f6745i.a(b10);
                }
            }
        }
    }

    public static bn a(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, k kVar) {
        return new c(new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    public static bn a(String str, JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, k kVar) {
        return new b(str, new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    public static bn a(fs fsVar, fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, k kVar) {
        return new d(fsVar, fqVar, appLovinAdLoadListener, kVar);
    }

    /* access modifiers changed from: package-private */
    public void a(gq gqVar) {
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.b(str, "Failed to process VAST response due to VAST error code " + gqVar);
        }
        nq.a((fq) this.f6745i, this.f6744h, gqVar, -6, this.f13421a);
    }
}
