package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

public class fm extends xl {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final e f7830h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final AppLovinPostbackListener f7831i;

    /* renamed from: j  reason: collision with root package name */
    private final sm.b f7832j;

    class a implements AppLovinPostbackListener {
        a() {
        }

        public void onPostbackFailure(String str, int i10) {
            fm.this.e();
        }

        public void onPostbackSuccess(String str) {
            if (fm.this.f7831i != null) {
                fm.this.f7831i.onPostbackSuccess(fm.this.f7830h.f());
            }
        }
    }

    public fm(e eVar, sm.b bVar, k kVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", kVar);
        if (eVar != null) {
            this.f7830h = eVar;
            this.f7831i = appLovinPostbackListener;
            this.f7832j = bVar;
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    /* access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.f7830h, b());
        bVar.a(this.f7832j);
        b().l0().a((xl) bVar);
    }

    public void run() {
        if (!StringUtils.isValidString(this.f7830h.f())) {
            if (t.a()) {
                this.f13423c.d(this.f13422b, "Requested URL is not valid; nothing to do...");
            }
            AppLovinPostbackListener appLovinPostbackListener = this.f7831i;
            if (appLovinPostbackListener != null) {
                appLovinPostbackListener.onPostbackFailure(this.f7830h.f(), AppLovinErrorCodes.INVALID_URL);
            }
        } else if (this.f7830h.u()) {
            b().u0().a(this.f7830h, (AppLovinPostbackListener) new a());
        } else {
            e();
        }
    }

    class b extends en {

        /* renamed from: n  reason: collision with root package name */
        final String f7834n;

        b(com.applovin.impl.sdk.network.a aVar, k kVar) {
            super(aVar, kVar);
            this.f7834n = fm.this.f7830h.f();
        }

        public void a(String str, Object obj, int i10) {
            if (obj instanceof String) {
                for (String str2 : this.f13421a.c(oj.F0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (!TextUtils.isEmpty(str3)) {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                c4.c(jSONObject, this.f13421a);
                                c4.b(jSONObject, this.f13421a);
                                c4.a(jSONObject, this.f13421a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (fm.this.f7831i != null) {
                fm.this.f7831i.onPostbackSuccess(this.f7834n);
            }
            if (fm.this.f7830h.t()) {
                this.f13421a.o().a(fm.this.f7830h.s(), this.f7834n, i10, obj, (String) null, true);
            }
        }

        public void a(String str, int i10, String str2, Object obj) {
            if (t.a()) {
                t tVar = this.f13423c;
                String str3 = this.f13422b;
                tVar.b(str3, "Failed to dispatch postback. Error code: " + i10 + " URL: " + this.f7834n);
            }
            if (fm.this.f7831i != null) {
                fm.this.f7831i.onPostbackFailure(this.f7834n, i10);
            }
            if (fm.this.f7830h.t()) {
                this.f13421a.o().a(fm.this.f7830h.s(), this.f7834n, i10, obj, str2, false);
            }
        }
    }
}
