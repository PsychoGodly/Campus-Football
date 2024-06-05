package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.x0;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.ArrayList;
import java.util.Arrays;

public class hm extends xl {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final b f8331h;

    /* renamed from: i  reason: collision with root package name */
    private final String f8332i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public String f8333j;

    public interface b {
        void a(x0.b bVar, String str);

        void a(String str, String str2);
    }

    public hm(k kVar, String str, b bVar) {
        super("TaskFetchAppAdsContent", kVar);
        this.f8332i = str;
        this.f8331h = bVar;
    }

    public void run() {
        ArrayList arrayList = new ArrayList(Arrays.asList(Uri.parse(this.f8332i).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            String str = (String) arrayList.get(0);
            if ("www".equals(str) || "m".equals(str)) {
                arrayList.remove(0);
            }
        }
        String join = TextUtils.join(".", arrayList);
        Uri build = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority(join).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.a a10 = com.applovin.impl.sdk.network.a.a(this.f13421a).c("GET").b(build.toString()).a(new Uri.Builder().scheme("http").authority(join).appendPath("app-ads.txt").build().toString()).a((Object) MaxReward.DEFAULT_LABEL).a(false).a();
        this.f8333j = build.toString();
        if (t.a()) {
            t tVar = this.f13423c;
            String str2 = this.f13422b;
            tVar.a(str2, "Looking up app-ads.txt at " + this.f8333j);
        }
        this.f13421a.l0().a((xl) new a(a10, this.f13421a));
    }

    class a extends en {
        a(com.applovin.impl.sdk.network.a aVar, k kVar) {
            super(aVar, kVar);
        }

        public void a(String str, String str2, int i10) {
            if (TextUtils.isEmpty(str2)) {
                if (t.a()) {
                    this.f13423c.b(this.f13422b, "No app-ads.txt found");
                }
                hm.this.f8331h.a(x0.b.APPADSTXT_NOT_FOUND, hm.this.f8333j);
                return;
            }
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Found app-ads.txt");
            }
            hm.this.f8331h.a(str2, hm.this.f8333j);
        }

        public void a(String str, int i10, String str2, String str3) {
            if (t.a()) {
                t tVar = this.f13423c;
                String str4 = this.f13422b;
                tVar.b(str4, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i10);
            }
            hm.this.f8331h.a(x0.b.APPADSTXT_NOT_FOUND, hm.this.f8333j);
        }
    }
}
