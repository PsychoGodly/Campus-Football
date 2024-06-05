package com.applovin.impl;

import com.applovin.impl.sdk.k;
import org.json.JSONObject;

public class t3 extends xl {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final String f12236h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final com.applovin.impl.sdk.network.a f12237i;

    class a extends en {
        a(com.applovin.impl.sdk.network.a aVar, k kVar, boolean z10) {
            super(aVar, kVar, z10);
        }

        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            this.f13421a.o().a(t3.this.f12236h, t3.this.f12237i.f(), i10, jSONObject, str2, false);
        }

        public void a(String str, JSONObject jSONObject, int i10) {
            this.f13421a.o().a(t3.this.f12236h, t3.this.f12237i.f(), i10, jSONObject, (String) null, true);
        }
    }

    public t3(String str, com.applovin.impl.sdk.network.a aVar, k kVar) {
        super("CommunicatorRequestTask", kVar, str);
        this.f12236h = str;
        this.f12237i = aVar;
    }

    public void run() {
        this.f13421a.l0().a((xl) new a(this.f12237i, this.f13421a, d()));
    }
}
