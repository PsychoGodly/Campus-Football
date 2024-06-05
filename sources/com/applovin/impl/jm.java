package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.t;
import com.applovin.impl.x0;
import com.applovin.mediation.MaxReward;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class jm extends xl {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final b f8788h;

    public interface b {
        void a(x0.b bVar);

        void a(String str);
    }

    public jm(k kVar, b bVar) {
        super("TaskFetchDeveloperUri", kVar);
        this.f8788h = bVar;
    }

    public void run() {
        String str;
        if (this.f13421a.y() != null) {
            str = String.valueOf(this.f13421a.z().g().f());
        } else {
            str = String.valueOf(this.f13421a.x().A().get("package_name"));
        }
        if (t.a()) {
            t tVar = this.f13423c;
            String str2 = this.f13422b;
            tVar.a(str2, "Looking up developer URI for package name: " + str);
        }
        a.C0139a c10 = com.applovin.impl.sdk.network.a.a(this.f13421a).c("GET");
        this.f13421a.l0().a((xl) new a(c10.b("https://play.google.com/store/apps/details?id=" + str).a((Object) MaxReward.DEFAULT_LABEL).a(false).a(), this.f13421a));
    }

    class a extends en {
        a(com.applovin.impl.sdk.network.a aVar, k kVar) {
            super(aVar, kVar);
        }

        public void a(String str, String str2, int i10) {
            if (TextUtils.isEmpty(str2)) {
                if (t.a()) {
                    this.f13423c.b(this.f13422b, "No developer URI found - response is empty");
                }
                jm.this.f8788h.a(x0.b.DEVELOPER_URI_NOT_FOUND);
            }
            Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").+?(?=\">)").matcher(str2);
            if (matcher.find()) {
                String group = matcher.group();
                if (t.a()) {
                    t tVar = this.f13423c;
                    String str3 = this.f13422b;
                    tVar.a(str3, "Found developer URI: " + group);
                }
                jm.this.f8788h.a(group);
                return;
            }
            if (t.a()) {
                this.f13423c.b(this.f13422b, "Unable to find developer URI from the Play Store listing metadata");
            }
            jm.this.f8788h.a(x0.b.DEVELOPER_URI_NOT_FOUND);
        }

        public void a(String str, int i10, String str2, String str3) {
            if (t.a()) {
                t tVar = this.f13423c;
                String str4 = this.f13422b;
                tVar.b(str4, "Unable to fetch developer URI due to: " + str2 + ", and received error code: " + i10);
            }
            jm.this.f8788h.a(x0.b.DEVELOPER_URI_NOT_FOUND);
        }
    }
}
