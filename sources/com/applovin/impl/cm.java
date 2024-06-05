package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.am;
import com.applovin.impl.bq;
import com.applovin.impl.e1;
import com.applovin.impl.jq;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class cm extends am {
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final bq f6990r;

    class a implements e1.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ jq f6991a;

        a(jq jqVar) {
            this.f6991a = jqVar;
        }

        public void a(Uri uri) {
            if (uri != null) {
                this.f6991a.a(uri);
                cm.this.f6990r.b(true);
                return;
            }
            t tVar = cm.this.f13423c;
            if (t.a()) {
                cm cmVar = cm.this;
                cmVar.f13423c.b(cmVar.f13422b, "Failed to cache static companion ad");
            }
        }
    }

    class b implements am.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ jq f6993a;

        b(jq jqVar) {
            this.f6993a = jqVar;
        }

        public void a(String str) {
            this.f6993a.a(str);
            cm.this.f6990r.b(true);
        }
    }

    class c implements am.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ jq f6995a;

        c(jq jqVar) {
            this.f6995a = jqVar;
        }

        public void a(String str) {
            this.f6995a.a(str);
            cm.this.f6990r.b(true);
        }
    }

    class d implements e1.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ pq f6997a;

        d(pq pqVar) {
            this.f6997a = pqVar;
        }

        public void a(Uri uri) {
            if (uri != null) {
                t tVar = cm.this.f13423c;
                if (t.a()) {
                    cm cmVar = cm.this;
                    t tVar2 = cmVar.f13423c;
                    String str = cmVar.f13422b;
                    tVar2.a(str, "Video file successfully cached into: " + uri);
                }
                this.f6997a.a(uri);
                return;
            }
            t tVar3 = cm.this.f13423c;
            if (t.a()) {
                cm cmVar2 = cm.this;
                t tVar4 = cmVar2.f13423c;
                String str2 = cmVar2.f13422b;
                tVar4.b(str2, "Failed to cache video file: " + this.f6997a);
            }
        }
    }

    class e implements am.e {
        e() {
        }

        public void a(String str) {
            if (cm.this.f6990r.isOpenMeasurementEnabled()) {
                str = cm.this.f13421a.Y().a(str);
            }
            cm.this.f6990r.b(str);
            t tVar = cm.this.f13423c;
            if (t.a()) {
                cm cmVar = cm.this;
                t tVar2 = cmVar.f13423c;
                String str2 = cmVar.f13422b;
                tVar2.a(str2, "Finish caching HTML template " + cm.this.f6990r.g1() + " for ad #" + cm.this.f6990r.getAdIdNumber());
            }
        }
    }

    public cm(bq bqVar, k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", bqVar, kVar, appLovinAdLoadListener);
        this.f6990r = bqVar;
    }

    private String d(String str) {
        String str2 = str;
        for (String next : StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f13421a.a(oj.f10317h5)), 1)) {
            if (!TextUtils.isEmpty(next)) {
                if (!this.f6541h.shouldCancelHtmlCachingIfShown() || !this.f6541h.hasShown()) {
                    Uri a10 = a(next, Collections.emptyList(), false);
                    if (a10 != null) {
                        str2 = str2.replace(next, a10.toString());
                        this.f6541h.a(a10);
                        this.f6542i.b();
                    } else {
                        if (t.a()) {
                            t tVar = this.f13423c;
                            String str3 = this.f13422b;
                            tVar.b(str3, "Failed to cache JavaScript resource: " + next);
                        }
                        this.f6542i.a();
                    }
                } else {
                    if (t.a()) {
                        this.f13423c.a(this.f13422b, "Cancelling HTML JavaScript caching due to ad being shown already");
                    }
                    this.f6542i.c();
                    return str;
                }
            }
        }
        return str2;
    }

    private void m() {
        if (!l()) {
            if (this.f6990r.t1()) {
                eq e12 = this.f6990r.e1();
                if (e12 != null) {
                    jq d10 = e12.d();
                    if (d10 != null) {
                        Uri b10 = d10.b();
                        String uri = b10 != null ? b10.toString() : MaxReward.DEFAULT_LABEL;
                        String a10 = d10.a();
                        if (URLUtil.isValidUrl(uri) || StringUtils.isValidString(a10)) {
                            if (d10.c() == jq.a.STATIC) {
                                if (t.a()) {
                                    t tVar = this.f13423c;
                                    String str = this.f13422b;
                                    tVar.a(str, "Caching static companion ad at " + uri + "...");
                                }
                                Uri a11 = a(uri, Collections.emptyList(), false);
                                if (a11 != null) {
                                    d10.a(a11);
                                    this.f6990r.b(true);
                                } else if (t.a()) {
                                    this.f13423c.b(this.f13422b, "Failed to cache static companion ad");
                                }
                            } else if (d10.c() == jq.a.HTML) {
                                if (StringUtils.isValidString(uri)) {
                                    if (t.a()) {
                                        t tVar2 = this.f13423c;
                                        String str2 = this.f13422b;
                                        tVar2.a(str2, "Begin caching HTML companion ad. Fetching from " + uri + "...");
                                    }
                                    String d11 = d(uri, (List) null, false);
                                    if (StringUtils.isValidString(d11)) {
                                        if (t.a()) {
                                            this.f13423c.a(this.f13422b, "HTML fetched. Caching HTML now...");
                                        }
                                        d10.a(a(d11, Collections.emptyList(), (com.applovin.impl.sdk.ad.b) this.f6990r));
                                        this.f6990r.b(true);
                                    } else if (t.a()) {
                                        t tVar3 = this.f13423c;
                                        String str3 = this.f13422b;
                                        tVar3.b(str3, "Unable to load companion ad resources from " + uri);
                                    }
                                } else {
                                    if (t.a()) {
                                        t tVar4 = this.f13423c;
                                        String str4 = this.f13422b;
                                        tVar4.a(str4, "Caching provided HTML for companion ad. No fetch required. HTML: " + a10);
                                    }
                                    if (((Boolean) this.f13421a.a(oj.f10309g5)).booleanValue()) {
                                        a10 = d(a10);
                                    }
                                    d10.a(a(a10, Collections.emptyList(), (com.applovin.impl.sdk.ad.b) this.f6990r));
                                    this.f6990r.b(true);
                                }
                            } else if (d10.c() == jq.a.IFRAME && t.a()) {
                                this.f13423c.a(this.f13422b, "Skip caching of iFrame resource...");
                            }
                        } else if (t.a()) {
                            this.f13423c.k(this.f13422b, "Companion ad does not have any resources attached. Skipping...");
                        }
                    } else if (t.a()) {
                        this.f13423c.b(this.f13422b, "Failed to retrieve non-video resources from companion ad. Skipping...");
                    }
                } else if (t.a()) {
                    this.f13423c.a(this.f13422b, "No companion ad provided. Skipping...");
                }
            } else if (t.a()) {
                this.f13423c.a(this.f13422b, "Companion ad caching disabled. Skipping...");
            }
        }
    }

    private void n() {
        String str;
        if (!l() && nq.a(this.f6990r)) {
            if (this.f6990r.h1() != null) {
                if (t.a()) {
                    t tVar = this.f13423c;
                    String str2 = this.f13422b;
                    tVar.a(str2, "Begin caching HTML template. Fetching from " + this.f6990r.h1() + "...");
                }
                str = b(this.f6990r.h1().toString(), this.f6990r.X(), true);
            } else {
                str = this.f6990r.g1();
            }
            if (StringUtils.isValidString(str)) {
                String a10 = a(str, this.f6990r.X(), this.f6541h);
                if (this.f6990r.isOpenMeasurementEnabled()) {
                    a10 = this.f13421a.Y().a(a10);
                }
                this.f6990r.b(a10);
                if (t.a()) {
                    t tVar2 = this.f13423c;
                    String str3 = this.f13422b;
                    tVar2.a(str3, "Finish caching HTML template " + this.f6990r.g1() + " for ad #" + this.f6990r.getAdIdNumber());
                }
            } else if (t.a()) {
                this.f13423c.a(this.f13422b, "Unable to load HTML template");
            }
        }
    }

    private void o() {
        pq p12;
        Uri d10;
        if (!l()) {
            if (this.f6990r.u1()) {
                if (this.f6990r.o1() != null && (p12 = this.f6990r.p1()) != null && (d10 = p12.d()) != null) {
                    Uri c10 = c(d10.toString(), Collections.emptyList(), false);
                    if (c10 != null) {
                        if (t.a()) {
                            t tVar = this.f13423c;
                            String str = this.f13422b;
                            tVar.a(str, "Video file successfully cached into: " + c10);
                        }
                        p12.a(c10);
                    } else if (t.a()) {
                        t tVar2 = this.f13423c;
                        String str2 = this.f13422b;
                        tVar2.b(str2, "Failed to cache video file: " + p12);
                    }
                }
            } else if (t.a()) {
                this.f13423c.a(this.f13422b, "Video caching disabled. Skipping...");
            }
        }
    }

    private c1 p() {
        if (!this.f6990r.t1()) {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Companion ad caching disabled. Skipping...");
            }
            return null;
        }
        eq e12 = this.f6990r.e1();
        if (e12 == null) {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "No companion ad provided. Skipping...");
            }
            return null;
        }
        jq d10 = e12.d();
        if (d10 == null) {
            if (t.a()) {
                this.f13423c.b(this.f13422b, "Failed to retrieve non-video resources from companion ad. Skipping...");
            }
            return null;
        }
        Uri b10 = d10.b();
        String uri = b10 != null ? b10.toString() : MaxReward.DEFAULT_LABEL;
        String a10 = d10.a();
        if (URLUtil.isValidUrl(uri) || StringUtils.isValidString(a10)) {
            if (d10.c() == jq.a.STATIC) {
                if (t.a()) {
                    t tVar = this.f13423c;
                    String str = this.f13422b;
                    tVar.a(str, "Caching static companion ad at " + uri + "...");
                }
                return new e1(uri, this.f6990r, Collections.emptyList(), false, this.f6542i, this.f13421a, new a(d10));
            } else if (d10.c() == jq.a.HTML) {
                if (StringUtils.isValidString(uri)) {
                    if (t.a()) {
                        t tVar2 = this.f13423c;
                        String str2 = this.f13422b;
                        tVar2.a(str2, "Begin caching HTML companion ad. Fetching from " + uri + "...");
                    }
                    String d11 = d(uri, (List) null, false);
                    if (StringUtils.isValidString(d11)) {
                        if (t.a()) {
                            this.f13423c.a(this.f13422b, "HTML fetched. Caching HTML now...");
                        }
                        return a(d11, Collections.emptyList(), (am.e) new b(d10));
                    } else if (t.a()) {
                        t tVar3 = this.f13423c;
                        String str3 = this.f13422b;
                        tVar3.b(str3, "Unable to load companion ad resources from " + uri);
                    }
                } else {
                    if (t.a()) {
                        t tVar4 = this.f13423c;
                        String str4 = this.f13422b;
                        tVar4.a(str4, "Caching provided HTML for companion ad. No fetch required. HTML: " + a10);
                    }
                    return a(a10, Collections.emptyList(), (am.e) new c(d10));
                }
            } else if (d10.c() == jq.a.IFRAME && t.a()) {
                this.f13423c.a(this.f13422b, "Skip caching of iFrame resource...");
            }
        } else if (t.a()) {
            this.f13423c.k(this.f13422b, "Companion ad does not have any resources attached. Skipping...");
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f6990r.getAdEventTracker().h();
        super.f();
    }

    /* access modifiers changed from: protected */
    public d1 q() {
        if (!TextUtils.isEmpty(this.f6990r.g1())) {
            return a(this.f6990r.g1(), this.f6990r.X(), (am.e) new e());
        }
        if (!t.a()) {
            return null;
        }
        this.f13423c.a(this.f13422b, "Unable to load HTML template");
        return null;
    }

    /* access modifiers changed from: protected */
    public e1 r() {
        pq p12;
        Uri d10;
        if (!this.f6990r.u1()) {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Video caching disabled. Skipping...");
            }
            return null;
        } else if (this.f6990r.o1() == null || (p12 = this.f6990r.p1()) == null || (d10 = p12.d()) == null) {
            return null;
        } else {
            if (t.a()) {
                t tVar = this.f13423c;
                String str = this.f13422b;
                tVar.a(str, "Caching video file " + p12 + " creative...");
            }
            return a(d10.toString(), Collections.emptyList(), false, (e1.a) new d(p12));
        }
    }

    public void run() {
        super.run();
        boolean G0 = this.f6990r.G0();
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Begin caching for VAST ");
            sb2.append(G0 ? "streaming " : MaxReward.DEFAULT_LABEL);
            sb2.append("ad #");
            sb2.append(this.f6541h.getAdIdNumber());
            sb2.append("...");
            tVar.a(str, sb2.toString());
        }
        if (G0) {
            if (((Boolean) this.f13421a.a(oj.f10274c1)).booleanValue()) {
                if (!x3.f()) {
                    a(e());
                }
                if (this.f6990r.r1()) {
                    f();
                    ArrayList arrayList = new ArrayList();
                    c1 p10 = p();
                    if (p10 != null) {
                        arrayList.add(p10);
                    }
                    d1 q10 = q();
                    if (q10 != null) {
                        arrayList.add(q10);
                    }
                    e1 r10 = r();
                    if (r10 != null) {
                        arrayList.add(r10);
                    }
                    a((List) arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (this.f6990r.i1() == bq.c.COMPANION_AD) {
                        c1 p11 = p();
                        if (p11 != null) {
                            arrayList2.add(p11);
                        }
                        d1 q11 = q();
                        if (q11 != null) {
                            arrayList2.add(q11);
                        }
                        a((List) arrayList2);
                        f();
                        e1 r11 = r();
                        if (r11 != null) {
                            arrayList3.add(r11);
                        }
                        a((List) arrayList3);
                    } else {
                        e1 r12 = r();
                        if (r12 != null) {
                            arrayList2.add(r12);
                        }
                        a((List) arrayList2);
                        f();
                        c1 p12 = p();
                        if (p12 != null) {
                            arrayList3.add(p12);
                        }
                        d1 q12 = q();
                        if (q12 != null) {
                            arrayList3.add(q12);
                        }
                        a((List) arrayList3);
                    }
                }
            } else {
                j();
                if (this.f6990r.r1()) {
                    f();
                }
                bq.c i12 = this.f6990r.i1();
                bq.c cVar = bq.c.COMPANION_AD;
                if (i12 == cVar) {
                    m();
                    n();
                    a((com.applovin.impl.sdk.ad.b) this.f6990r);
                } else {
                    o();
                }
                if (!this.f6990r.r1()) {
                    f();
                }
                if (this.f6990r.i1() == cVar) {
                    o();
                } else {
                    m();
                    n();
                    a((com.applovin.impl.sdk.ad.b) this.f6990r);
                }
            }
        } else if (((Boolean) this.f13421a.a(oj.f10274c1)).booleanValue()) {
            ArrayList arrayList4 = new ArrayList();
            if (!x3.f()) {
                arrayList4.addAll(e());
            }
            c1 p13 = p();
            if (p13 != null) {
                arrayList4.add(p13);
            }
            e1 r13 = r();
            if (r13 != null) {
                arrayList4.add(r13);
            }
            d1 q13 = q();
            if (q13 != null) {
                arrayList4.add(q13);
            }
            a((List) arrayList4);
            f();
        } else {
            j();
            m();
            o();
            n();
            a((com.applovin.impl.sdk.ad.b) this.f6990r);
            f();
        }
        if (t.a()) {
            t tVar2 = this.f13423c;
            String str2 = this.f13422b;
            tVar2.a(str2, "Finished caching VAST ad #" + this.f6990r.getAdIdNumber());
        }
        this.f6990r.s1();
        k();
    }

    /* access modifiers changed from: package-private */
    public void a(int i10) {
        this.f6990r.getAdEventTracker().f();
        super.a(i10);
    }
}
