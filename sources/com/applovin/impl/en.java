package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.b4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

public abstract class en extends xl implements b4.e {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final com.applovin.impl.sdk.network.a f7477h;

    /* renamed from: i  reason: collision with root package name */
    private final b4.e f7478i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public sm.b f7479j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public oj f7480k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public oj f7481l;

    /* renamed from: m  reason: collision with root package name */
    protected b4.b f7482m;

    public en(com.applovin.impl.sdk.network.a aVar, k kVar) {
        this(aVar, kVar, false);
    }

    public abstract void a(String str, int i10, String str2, Object obj);

    public abstract void a(String str, Object obj, int i10);

    public void run() {
        b4 r10 = b().r();
        if (!b().A0() && !b().y0()) {
            t.h("AppLovinSdk", "AppLovin SDK is disabled");
            a(this.f7477h.f(), -22, (String) null, (Object) null);
        } else if (!StringUtils.isValidString(this.f7477h.f()) || this.f7477h.f().length() < 4) {
            if (t.a()) {
                this.f13423c.b(this.f13422b, "Task has an invalid or null request endpoint.");
            }
            a(this.f7477h.f(), AppLovinErrorCodes.INVALID_URL, (String) null, (Object) null);
        } else {
            if (TextUtils.isEmpty(this.f7477h.h())) {
                this.f7477h.b(this.f7477h.b() != null ? "POST" : "GET");
            }
            r10.a(this.f7477h, this.f7482m, this.f7478i);
        }
    }

    public en(com.applovin.impl.sdk.network.a aVar, k kVar, boolean z10) {
        super("TaskRepeatRequest", kVar, z10);
        this.f7479j = sm.b.OTHER;
        this.f7480k = null;
        this.f7481l = null;
        if (aVar != null) {
            a(aVar.f());
            this.f7477h = aVar;
            this.f7482m = new b4.b();
            this.f7478i = new a(kVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    public void b(oj ojVar) {
        this.f7481l = ojVar;
    }

    public void c(oj ojVar) {
        this.f7480k = ojVar;
    }

    /* access modifiers changed from: private */
    public void a(oj ojVar) {
        if (ojVar != null) {
            b().h0().a(ojVar, ojVar.a());
        }
    }

    public void a(sm.b bVar) {
        this.f7479j = bVar;
    }

    class a implements b4.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f7483a;

        a(k kVar) {
            this.f7483a = kVar;
        }

        public void a(String str, int i10, String str2, Object obj) {
            long j10;
            boolean z10 = false;
            boolean z11 = i10 < 200 || i10 >= 500;
            boolean z12 = i10 == 429;
            boolean z13 = i10 != -1009 || en.this.f7477h.q();
            boolean z14 = (i10 == -900 || i10 == -1000) ? false : true;
            if (!z13 || !z14 || (!z11 && !z12 && !en.this.f7477h.p())) {
                en enVar = en.this;
                enVar.a(enVar.f7477h.f(), i10, str2, obj);
                return;
            }
            String a10 = en.this.f7477h.a();
            if (en.this.f7477h.j() > 0) {
                t tVar = en.this.f13423c;
                if (t.a()) {
                    en enVar2 = en.this;
                    t tVar2 = enVar2.f13423c;
                    String str3 = enVar2.f13422b;
                    tVar2.k(str3, "Unable to send request due to server failure (code " + i10 + "). " + en.this.f7477h.j() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds((long) en.this.f7477h.k()) + " seconds...");
                }
                int j11 = en.this.f7477h.j() - 1;
                en.this.f7477h.a(j11);
                if ((((Boolean) this.f7483a.a(oj.F)).booleanValue() && en.this.f7477h.f().endsWith("4.0/ad")) || j11 == 0) {
                    en enVar3 = en.this;
                    enVar3.a(enVar3.f7480k);
                    if (StringUtils.isValidString(a10) && a10.length() >= 4) {
                        t tVar3 = en.this.f13423c;
                        if (t.a()) {
                            en enVar4 = en.this;
                            t tVar4 = enVar4.f13423c;
                            String str4 = enVar4.f13422b;
                            tVar4.d(str4, "Switching to backup endpoint " + a10);
                        }
                        en.this.f7477h.a(a10);
                        z10 = true;
                    }
                }
                if (((Boolean) this.f7483a.a(oj.f10379p3)).booleanValue() && z10) {
                    j10 = 0;
                } else if (en.this.f7477h.n()) {
                    j10 = TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, (double) en.this.f7477h.c()));
                } else {
                    j10 = (long) en.this.f7477h.k();
                }
                sm l02 = this.f7483a.l0();
                en enVar5 = en.this;
                l02.a((xl) enVar5, enVar5.f7479j, j10);
                return;
            }
            if (a10 == null || !a10.equals(en.this.f7477h.f())) {
                en enVar6 = en.this;
                enVar6.a(enVar6.f7480k);
            } else {
                en enVar7 = en.this;
                enVar7.a(enVar7.f7481l);
            }
            en enVar8 = en.this;
            enVar8.a(enVar8.f7477h.f(), i10, str2, obj);
        }

        public void a(String str, Object obj, int i10) {
            en.this.f7477h.a(0);
            en.this.a(str, obj, i10);
        }
    }
}
