package com.iab.omid.library.applovin.adsession;

import android.view.View;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.internal.f;
import com.iab.omid.library.applovin.internal.i;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.b;
import com.iab.omid.library.applovin.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

public class a extends AdSession {

    /* renamed from: a  reason: collision with root package name */
    private final AdSessionContext f27348a;

    /* renamed from: b  reason: collision with root package name */
    private final AdSessionConfiguration f27349b;

    /* renamed from: c  reason: collision with root package name */
    private final f f27350c;

    /* renamed from: d  reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.a f27351d;

    /* renamed from: e  reason: collision with root package name */
    private AdSessionStatePublisher f27352e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f27353f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f27354g;

    /* renamed from: h  reason: collision with root package name */
    private final String f27355h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f27356i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f27357j;

    /* renamed from: k  reason: collision with root package name */
    private PossibleObstructionListener f27358k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f27356i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f27357j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f27354g) {
            this.f27350c.a(view, friendlyObstructionPurpose, str);
        }
    }

    public View c() {
        return (View) this.f27351d.get();
    }

    public List<e> d() {
        return this.f27350c.a();
    }

    public boolean e() {
        return this.f27358k != null;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f27354g) {
            g.a((Object) errorType, "Error type is null");
            g.a(str, "Message is null");
            getAdSessionStatePublisher().a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public boolean f() {
        return this.f27353f && !this.f27354g;
    }

    public void finish() {
        if (!this.f27354g) {
            this.f27351d.clear();
            removeAllFriendlyObstructions();
            this.f27354g = true;
            getAdSessionStatePublisher().f();
            c.c().b(this);
            getAdSessionStatePublisher().b();
            this.f27352e = null;
            this.f27358k = null;
        }
    }

    public boolean g() {
        return this.f27354g;
    }

    public String getAdSessionId() {
        return this.f27355h;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f27352e;
    }

    public boolean h() {
        return this.f27349b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f27349b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f27353f;
    }

    /* access modifiers changed from: package-private */
    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f27356i = true;
    }

    /* access modifiers changed from: package-private */
    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f27357j = true;
    }

    public void registerAdView(View view) {
        if (!this.f27354g) {
            g.a((Object) view, "AdView is null");
            if (c() != view) {
                b(view);
                getAdSessionStatePublisher().a();
                a(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f27354g) {
            this.f27350c.b();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f27354g) {
            this.f27350c.c(view);
        }
    }

    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f27358k = possibleObstructionListener;
    }

    public void start() {
        if (!this.f27353f) {
            this.f27353f = true;
            c.c().c(this);
            this.f27352e.a(i.c().b());
            this.f27352e.a(com.iab.omid.library.applovin.internal.a.a().b());
            this.f27352e.a(this, this.f27348a);
        }
    }

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f27350c = new f();
        this.f27353f = false;
        this.f27354g = false;
        this.f27349b = adSessionConfiguration;
        this.f27348a = adSessionContext;
        this.f27355h = str;
        b((View) null);
        this.f27352e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f27352e.i();
        c.c().a(this);
        this.f27352e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> b10 = c.c().b();
        if (b10 != null && !b10.isEmpty()) {
            for (a next : b10) {
                if (next != this && next.c() == view) {
                    next.f27351d.clear();
                }
            }
        }
    }

    private void b(View view) {
        this.f27351d = new com.iab.omid.library.applovin.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.applovin.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            for (com.iab.omid.library.applovin.weakreference.a aVar : list) {
                View view = (View) aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f27358k.onPossibleObstructionsDetected(this.f27355h, arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f27357j = true;
    }
}
