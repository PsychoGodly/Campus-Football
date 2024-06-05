package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.a;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.d;
import androidx.browser.customtabs.e;
import androidx.browser.customtabs.i;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b5 extends e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final k f6641a;

    /* renamed from: b  reason: collision with root package name */
    private c f6642b;

    private class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final com.applovin.impl.adview.a f6643a;

        public a(com.applovin.impl.adview.a aVar) {
            this.f6643a = aVar;
        }

        public void onNavigationEvent(int i10, Bundle bundle) {
            com.applovin.impl.sdk.ad.b i11 = this.f6643a.i();
            if (i11 == null) {
                b5.this.f6641a.L();
                if (t.a()) {
                    t L = b5.this.f6641a.L();
                    L.b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i10) {
                case 1:
                    if (i11.P0()) {
                        b5.this.f6641a.i().trackCustomTabsNavigationStarted(i11);
                        return;
                    }
                    return;
                case 2:
                    if (i11.P0()) {
                        b5.this.f6641a.i().trackCustomTabsNavigationFinished(i11);
                        return;
                    }
                    return;
                case 3:
                    if (i11.P0()) {
                        b5.this.f6641a.i().trackCustomTabsNavigationFailed(i11);
                        return;
                    }
                    return;
                case 4:
                    if (i11.P0()) {
                        b5.this.f6641a.i().trackCustomTabsNavigationAborted(i11);
                        return;
                    }
                    return;
                case 5:
                    if (i11.P0()) {
                        b5.this.f6641a.i().trackCustomTabsTabShown(i11);
                    }
                    bc.c(this.f6643a.e(), (AppLovinAd) i11, this.f6643a.k());
                    return;
                case 6:
                    if (i11.P0()) {
                        b5.this.f6641a.i().trackCustomTabsTabHidden(i11);
                    }
                    bc.a(this.f6643a.e(), (AppLovinAd) i11, this.f6643a.k());
                    return;
                default:
                    b5.this.f6641a.L();
                    if (t.a()) {
                        t L2 = b5.this.f6641a.L();
                        L2.a("CustomTabsManager", "Unknown navigation event: " + i10);
                        return;
                    }
                    return;
            }
        }

        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
            b5.this.f6641a.L();
            if (t.a()) {
                t L = b5.this.f6641a.L();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Validation ");
                sb2.append(z10 ? "succeeded" : "failed");
                sb2.append(" for session-URL relation(");
                sb2.append(i10);
                sb2.append("), requestedOrigin(");
                sb2.append(uri);
                sb2.append(")");
                L.a("CustomTabsManager", sb2.toString());
            }
        }
    }

    public b5(k kVar) {
        this.f6641a = kVar;
        if (((Boolean) kVar.a(oj.f10446x6)).booleanValue()) {
            Context k10 = k.k();
            String c10 = c.c(k10, (List<String>) null);
            if (c10 == null) {
                kVar.L();
                if (t.a()) {
                    kVar.L().a("CustomTabsManager", "Cannot find a browser that supports Custom Tabs.");
                    return;
                }
                return;
            }
            c.a(k10, c10, this);
        }
    }

    public void b(List list, i iVar) {
        if (!list.isEmpty()) {
            if (iVar == null) {
                this.f6641a.L();
                if (t.a()) {
                    this.f6641a.L().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
                    return;
                }
                return;
            }
            a("warmup urls", (Runnable) new qt(this, list, iVar));
        }
    }

    public void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
        this.f6641a.L();
        if (t.a()) {
            t L = this.f6641a.L();
            L.a("CustomTabsManager", "Custom Tabs service connected for package: " + componentName.getPackageName());
        }
        this.f6642b = cVar;
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f6641a.L();
        if (t.a()) {
            this.f6641a.L().a("CustomTabsManager", "Custom Tabs service disconnected");
        }
        this.f6642b = null;
        Long l10 = (Long) this.f6641a.a(oj.f10454y6);
        if (l10.longValue() >= 0) {
            this.f6641a.l0().a((xl) new kn(this.f6641a, "CustomTabsManager", new nt(this, componentName)), sm.b.OTHER, l10.longValue());
        }
    }

    private d a(com.applovin.impl.adview.a aVar, Activity activity) {
        this.f6641a.L();
        if (t.a()) {
            this.f6641a.L().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        com.applovin.impl.sdk.ad.b i10 = aVar.i();
        d.b bVar = new d.b(aVar.j());
        c5 x10 = i10 != null ? i10.x() : null;
        if (x10 != null) {
            Integer l10 = x10.l();
            if (l10 != null) {
                bVar.f(new a.C0017a().e(l10.intValue()).a());
            }
            Integer a10 = x10.a();
            if (a10 != null) {
                bVar.d(2, new a.C0017a().e(a10.intValue()).a());
            }
            Integer j10 = x10.j();
            Integer k10 = x10.k();
            if (!(j10 == null || k10 == null)) {
                bVar.n(activity, j10.intValue(), k10.intValue());
            }
            Integer c10 = x10.c();
            Integer d10 = x10.d();
            if (!(c10 == null || d10 == null)) {
                bVar.g(activity, c10.intValue(), d10.intValue());
            }
            Boolean m10 = x10.m();
            if (m10 != null) {
                bVar.o(m10.booleanValue());
            }
            Boolean i11 = x10.i();
            if (i11 != null) {
                bVar.m(i11.booleanValue());
            }
            Boolean e10 = x10.e();
            if (e10 != null) {
                bVar.h(e10.booleanValue());
            }
            Integer h10 = x10.h();
            if (h10 != null) {
                bVar.l(h10.intValue());
            }
        }
        d b10 = bVar.b();
        if (x10 != null) {
            String f10 = x10.f();
            if (f10 != null) {
                b10.f1921a.putExtra("android.intent.extra.REFERRER", Uri.parse(f10));
            }
            Bundle s10 = i10.s();
            if (!s10.isEmpty()) {
                b10.f1921a.putExtra("com.android.browser.headers", s10);
            }
        }
        return b10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.adview.a aVar, Activity activity, String str) {
        a(aVar, activity).b(activity, Uri.parse(str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, i iVar) {
        this.f6642b.g(0);
        c5 x10 = bVar.x();
        if (x10 != null) {
            Integer g10 = x10.g();
            String b10 = x10.b();
            if (g10 != null && !TextUtils.isEmpty(b10)) {
                if (iVar == null) {
                    this.f6641a.L();
                    if (t.a()) {
                        this.f6641a.L().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                        return;
                    }
                    return;
                }
                this.f6641a.L();
                if (t.a()) {
                    t L = this.f6641a.L();
                    L.a("CustomTabsManager", "Validating session-URL relation: " + g10 + " with digital asset link: " + b10);
                }
                iVar.o(g10.intValue(), Uri.parse(b10), (Bundle) null);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list, i iVar) {
        this.f6641a.L();
        if (t.a()) {
            t L = this.f6641a.L();
            L.a("CustomTabsManager", "Warming up URLs: " + list);
        }
        Iterator it = list.iterator();
        String str = (String) it.next();
        it.remove();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.customtabs.otherurls.URL", Uri.parse((String) it2.next()));
            arrayList.add(bundle);
        }
        boolean i10 = iVar.i(Uri.parse(str), (Bundle) null, arrayList);
        this.f6641a.L();
        if (t.a()) {
            t L2 = this.f6641a.L();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Warmup for URLs ");
            sb2.append(i10 ? "succeeded" : "failed");
            L2.a("CustomTabsManager", sb2.toString());
        }
    }

    public void a(String str, com.applovin.impl.adview.a aVar, Activity activity) {
        a("launch url", (Runnable) new ot(this, aVar, activity, str));
    }

    private void a(String str, Runnable runnable) {
        try {
            this.f6641a.L();
            if (t.a()) {
                t L = this.f6641a.L();
                L.a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.f6641a.L();
            if (t.a()) {
                t L2 = this.f6641a.L();
                L2.a("CustomTabsManager", "Finished operation: " + str);
            }
        } catch (Throwable th) {
            this.f6641a.L();
            if (t.a()) {
                t L3 = this.f6641a.L();
                L3.a("CustomTabsManager", "Failed to run operation: " + str, th);
            }
            this.f6641a.B().a("CustomTabsManager", str, th);
        }
    }

    public i a(com.applovin.impl.adview.a aVar) {
        if (this.f6642b == null) {
            this.f6641a.L();
            if (t.a()) {
                this.f6641a.L().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f6641a.L();
        if (t.a()) {
            this.f6641a.L().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            i e10 = this.f6642b.e(new a(aVar));
            a(e10, aVar.i());
            return e10;
        } catch (Exception e11) {
            this.f6641a.L();
            if (t.a()) {
                this.f6641a.L().a("CustomTabsManager", "Failed to create Custom Tabs session", e11);
            }
            return null;
        }
    }

    private void a(i iVar, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar != null && bVar.z0()) {
            a("client warmup", (Runnable) new pt(this, bVar, iVar));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ComponentName componentName) {
        c.a(k.k(), componentName.getPackageName(), this);
    }
}
