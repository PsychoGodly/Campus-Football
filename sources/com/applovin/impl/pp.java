package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import com.applovin.impl.sdk.k;
import com.applovin.impl.yb;
import com.applovin.impl.zb;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

public abstract class pp extends ne {

    /* renamed from: a  reason: collision with root package name */
    private k f10691a;

    /* renamed from: b  reason: collision with root package name */
    private zb f10692b;

    class a extends zb {
        a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public int b() {
            return d.values().length;
        }

        /* access modifiers changed from: protected */
        public List c(int i10) {
            if (i10 == d.SETTINGS.ordinal()) {
                return pp.this.c();
            }
            return pp.this.a();
        }

        /* access modifiers changed from: protected */
        public int d(int i10) {
            if (i10 == d.SETTINGS.ordinal()) {
                return e.values().length;
            }
            return c.values().length;
        }

        /* access modifiers changed from: protected */
        public yb e(int i10) {
            if (i10 == d.SETTINGS.ordinal()) {
                return new bj("SETTINGS");
            }
            return new bj("GDPR APPLICABILITY");
        }
    }

    class b implements zb.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f10694a;

        b(k kVar) {
            this.f10694a = kVar;
        }

        public void a(hb hbVar, yb ybVar) {
            if (hbVar.b() != d.SETTINGS.ordinal()) {
                return;
            }
            if (hbVar.a() == e.PRIVACY_POLICY_URL.ordinal()) {
                if (this.f10694a.t().h() != null) {
                    up.a(this.f10694a.t().h(), k.k(), this.f10694a);
                } else {
                    zp.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", (Context) pp.this);
                }
            } else if (hbVar.a() == e.TERMS_OF_SERVICE_URL.ordinal() && this.f10694a.t().i() != null) {
                up.a(this.f10694a.t().i(), k.k(), this.f10694a);
            }
        }
    }

    private enum c {
        DESCRIPTION,
        CONSENT_FLOW_GEOGRAPHY,
        DEBUG_USER_GEOGRAPHY
    }

    private enum d {
        SETTINGS,
        GDPR_APPLICABILITY
    }

    private enum e {
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL
    }

    /* access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(e.values().length);
        arrayList.add(b());
        arrayList.add(d());
        return arrayList;
    }

    private yb d() {
        yb.b d10 = yb.a().d("Terms of Service URL");
        if (this.f10691a.t().i() != null) {
            d10.a(R.drawable.applovin_ic_check_mark_bordered);
            d10.b(r3.a(R.color.applovin_sdk_checkmarkColor, this));
            d10.a(true);
        } else {
            d10.c("None");
            d10.a(false);
        }
        return d10.a();
    }

    /* access modifiers changed from: protected */
    public k getSdk() {
        return this.f10691a;
    }

    public void initialize(k kVar) {
        this.f10691a = kVar;
        a aVar = new a(this);
        this.f10692b = aVar;
        aVar.a((zb.a) new b(kVar));
        this.f10692b.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("MAX Terms and Privacy Policy Flow");
        ((ListView) findViewById(R.id.listView)).setAdapter(this.f10692b);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        zb zbVar = this.f10692b;
        if (zbVar != null) {
            zbVar.a((zb.a) null);
        }
    }

    private yb a(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z10) {
        return yb.a().d("Consent Flow Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown").b(z10).a();
    }

    private yb b(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z10) {
        return yb.a().d("Debug User Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "None").b(z10).a();
    }

    /* access modifiers changed from: private */
    public List a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f10691a.q().getConsentFlowUserGeography();
        AppLovinSdkConfiguration.ConsentFlowUserGeography f10 = this.f10691a.t().f();
        boolean z10 = zp.c(this.f10691a) && f10 != AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
        arrayList.add(yb.a().d("AppLovin determines whether the user is located in a GDPR region. If the user is in a GDPR region, the MAX SDK presents Google UMP.\n\nYou can test the flow on debug mode by overriding the region check by setting the debug user geography.").a());
        arrayList.add(a(consentFlowUserGeography, !z10));
        arrayList.add(b(f10, z10));
        return arrayList;
    }

    private yb b() {
        boolean z10 = this.f10691a.t().h() != null;
        return yb.a().d("Privacy Policy URL").a(z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(r3.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this)).a(true).a();
    }
}
