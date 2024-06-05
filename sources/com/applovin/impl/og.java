package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class og extends ig {

    /* renamed from: p  reason: collision with root package name */
    static final /* synthetic */ boolean f10235p = true;

    /* renamed from: h  reason: collision with root package name */
    private final bq f10236h;

    /* renamed from: i  reason: collision with root package name */
    private final AtomicBoolean f10237i = new AtomicBoolean();

    /* renamed from: j  reason: collision with root package name */
    private MediaEvents f10238j;

    /* renamed from: k  reason: collision with root package name */
    private final VastProperties f10239k;

    /* renamed from: l  reason: collision with root package name */
    private final AtomicBoolean f10240l = new AtomicBoolean();

    /* renamed from: m  reason: collision with root package name */
    private final AtomicBoolean f10241m = new AtomicBoolean();

    /* renamed from: n  reason: collision with root package name */
    private final AtomicBoolean f10242n = new AtomicBoolean();

    /* renamed from: o  reason: collision with root package name */
    private final AtomicBoolean f10243o = new AtomicBoolean();

    public og(bq bqVar) {
        super(bqVar);
        this.f10236h = bqVar;
        float l12 = (float) bqVar.l1();
        if (bqVar.l1() == -1) {
            this.f10239k = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.f10239k = VastProperties.createVastPropertiesForSkippableMedia(l12, true, Position.STANDALONE);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.f10238j.bufferFinish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.f10238j.bufferStart();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.f10238j.adUserInteraction(InteractionType.CLICK);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.f10238j.complete();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f10238j.firstQuartile();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.f8541g.loaded(this.f10239k);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.f10238j.midpoint();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.f10238j.pause();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.f10238j.resume();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.f10238j.skipped();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.f10238j.thirdQuartile();
    }

    public void A() {
        b("track resumed", (Runnable) new m00(this));
    }

    public void B() {
        b("track skipped", (Runnable) new s00(this));
    }

    public void C() {
        if (this.f10243o.compareAndSet(false, true)) {
            b("track third quartile", (Runnable) new n00(this));
        }
    }

    /* access modifiers changed from: protected */
    public AdSessionConfiguration a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th) {
            if (t.a()) {
                this.f8537c.a(this.f8538d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    public void b(float f10, boolean z10) {
        if (this.f10240l.compareAndSet(false, true)) {
            b("track started", (Runnable) new o00(this, f10, z10));
        }
    }

    public void h() {
        b("track loaded", (Runnable) new u00(this));
    }

    public void i() {
        if (this.f10237i.compareAndSet(true, false)) {
            b("buffer finished", (Runnable) new t00(this));
        }
    }

    public void j() {
        if (this.f10237i.compareAndSet(false, true)) {
            b("buffer started", (Runnable) new w00(this));
        }
    }

    public void v() {
        b("track clicked", (Runnable) new x00(this));
    }

    public void w() {
        b("track completed", (Runnable) new r00(this));
    }

    public void x() {
        if (this.f10241m.compareAndSet(false, true)) {
            b("track first quartile", (Runnable) new y00(this));
        }
    }

    public void y() {
        if (this.f10242n.compareAndSet(false, true)) {
            b("track midpoint", (Runnable) new v00(this));
        }
    }

    public void z() {
        b("track paused", (Runnable) new q00(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(float f10, boolean z10) {
        this.f10238j.start(f10, z10 ? 0.0f : 1.0f);
    }

    public void b(boolean z10) {
        b("track volume changed", (Runnable) new p00(this, z10));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10) {
        this.f10238j.volumeChange(z10 ? 0.0f : 1.0f);
    }

    /* access modifiers changed from: protected */
    public void a(AdSession adSession) {
        try {
            this.f10238j = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            if (t.a()) {
                this.f8537c.a(this.f8538d, "Failed to create media events", th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public AdSessionContext a(WebView webView) {
        VerificationScriptResource verificationScriptResource;
        if (f10235p || this.f10236h.d1() != null) {
            ArrayList arrayList = new ArrayList();
            for (cq cqVar : this.f10236h.d1().a()) {
                List<iq> b10 = cqVar.b();
                if (b10.isEmpty()) {
                    nq.a(cqVar.a(), gq.FAILED_TO_LOAD_RESOURCE, this.f8536b);
                } else {
                    ArrayList<iq> arrayList2 = new ArrayList<>();
                    for (iq iqVar : b10) {
                        if ("omid".equalsIgnoreCase(iqVar.a())) {
                            arrayList2.add(iqVar);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        nq.a(cqVar.a(), gq.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.f8536b);
                    } else {
                        ArrayList<URL> arrayList3 = new ArrayList<>();
                        for (iq b11 : arrayList2) {
                            try {
                                arrayList3.add(new URL(b11.b()));
                            } catch (Throwable th) {
                                if (t.a()) {
                                    this.f8537c.a(this.f8538d, "Failed to parse JavaScript resource url", th);
                                }
                            }
                        }
                        if (arrayList3.isEmpty()) {
                            nq.a(cqVar.a(), gq.FAILED_TO_LOAD_RESOURCE, this.f8536b);
                        } else {
                            String d10 = cqVar.d();
                            String c10 = cqVar.c();
                            if (!StringUtils.isValidString(d10) || StringUtils.isValidString(c10)) {
                                for (URL url : arrayList3) {
                                    if (StringUtils.isValidString(d10)) {
                                        verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(c10, url, d10);
                                    } else {
                                        verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                                    }
                                    arrayList.add(verificationScriptResource);
                                }
                            } else {
                                nq.a(cqVar.a(), gq.FAILED_TO_LOAD_RESOURCE, this.f8536b);
                            }
                        }
                    }
                }
            }
            String a10 = this.f8536b.Y().a();
            if (TextUtils.isEmpty(a10)) {
                if (t.a()) {
                    this.f8537c.b(this.f8538d, "JavaScript SDK content not loaded successfully");
                }
                return null;
            }
            try {
                return AdSessionContext.createNativeAdSessionContext(this.f8536b.Y().b(), a10, arrayList, this.f10236h.getOpenMeasurementContentUrl(), this.f10236h.getOpenMeasurementCustomReferenceData());
            } catch (Throwable th2) {
                if (!t.a()) {
                    return null;
                }
                this.f8537c.a(this.f8538d, "Failed to create ad session context", th2);
                return null;
            }
        } else {
            throw new AssertionError();
        }
    }
}
