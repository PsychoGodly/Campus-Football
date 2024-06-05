package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.g4;
import com.applovin.impl.k3;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdkUtils;

public class CmpServiceImpl implements AppLovinCmpService, a.d {

    /* renamed from: a  reason: collision with root package name */
    private final k f10725a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final k3 f10726b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public a f10727c = b();

    /* renamed from: d  reason: collision with root package name */
    private d f10728d;

    /* renamed from: e  reason: collision with root package name */
    private e f10729e;

    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AppLovinCmpService.OnCompletedListener f10730a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f10731b;

        /* renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a$a  reason: collision with other inner class name */
        class C0131a implements e {
            C0131a() {
            }

            public void a(AppLovinCmpError appLovinCmpError) {
                a.this.f10730a.onCompleted(appLovinCmpError);
            }
        }

        a(AppLovinCmpService.OnCompletedListener onCompletedListener, Activity activity) {
            this.f10730a = onCompletedListener;
            this.f10731b = activity;
        }

        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                this.f10730a.onCompleted(appLovinCmpError);
            } else {
                CmpServiceImpl.this.showCmp(this.f10731b, new C0131a());
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f10734a;

        b(Activity activity) {
            this.f10734a = activity;
        }

        public void run() {
            CmpServiceImpl.this.f10727c.a(this.f10734a, CmpServiceImpl.this.f10726b, (a.d) CmpServiceImpl.this);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f10736a;

        c(Activity activity) {
            this.f10736a = activity;
        }

        public void run() {
            CmpServiceImpl.this.f10727c.b(this.f10736a, CmpServiceImpl.this.f10726b, CmpServiceImpl.this);
        }
    }

    public interface d {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public interface e {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public CmpServiceImpl(k kVar) {
        this.f10725a = kVar;
        this.f10726b = new k3(kVar.t().f());
    }

    private void c() {
        if (hasSupportedCmp()) {
            this.f10727c.c();
        }
    }

    public boolean hasSupportedCmp() {
        return this.f10727c != null;
    }

    public void loadCmp(Activity activity, d dVar) {
        if (!hasSupportedCmp()) {
            dVar.a(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
            return;
        }
        this.f10728d = dVar;
        b bVar = new b(activity);
        if (this.f10727c.d()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            bVar.run();
        }
    }

    public void onFlowHidden(Bundle bundle) {
        b((AppLovinCmpError) null);
        a();
    }

    public void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl) {
        a((AppLovinCmpError) cmpErrorImpl);
        a();
    }

    public void onFlowLoaded(Bundle bundle) {
        a((AppLovinCmpError) null);
    }

    public void onFlowShowFailed(CmpErrorImpl cmpErrorImpl) {
        b((AppLovinCmpError) cmpErrorImpl);
        a();
    }

    public void showCmp(Activity activity, e eVar) {
        c cVar = new c(activity);
        this.f10729e = eVar;
        if (this.f10727c.e()) {
            AppLovinSdkUtils.runOnUiThread(cVar);
        } else {
            cVar.run();
        }
    }

    public void showCmpForExistingUser(Activity activity, AppLovinCmpService.OnCompletedListener onCompletedListener) {
        this.f10725a.L();
        if (t.a()) {
            t L = this.f10725a.L();
            L.a("AppLovinCmpService", "showCmpForExistingUser(activity=" + activity + ", completedListener=" + onCompletedListener + ")");
        }
        if (!hasSupportedCmp()) {
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
            return;
        }
        c();
        loadCmp(activity, new a(onCompletedListener, activity));
    }

    public String toString() {
        return "[CmpService]";
    }

    private void a(AppLovinCmpError appLovinCmpError) {
        d dVar = this.f10728d;
        if (dVar != null) {
            dVar.a(appLovinCmpError);
            this.f10728d = null;
        }
    }

    private void b(AppLovinCmpError appLovinCmpError) {
        e eVar = this.f10729e;
        if (eVar != null) {
            eVar.a(appLovinCmpError);
            this.f10729e = null;
        }
    }

    private void a() {
        a aVar = this.f10727c;
        if (aVar != null) {
            aVar.a();
        }
    }

    private a b() {
        if (zp.a("com.google.android.ump.ConsentForm")) {
            return new a(this.f10725a);
        }
        if (!this.f10725a.t().k() || this.f10725a.t().e() != g4.a.UNIFIED) {
            return null;
        }
        t.h("AppLovinSdk", "Could not load Google UMP. Please add the Google User Messaging Platform SDK into your application. Instructions can be found here: https://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow#enabling-google-ump");
        return null;
    }
}
