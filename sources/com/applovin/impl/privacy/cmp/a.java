package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.k3;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final k f10738a;

    /* renamed from: b  reason: collision with root package name */
    private final t f10739b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public ConsentForm f10740c;

    /* renamed from: com.applovin.impl.privacy.cmp.a$a  reason: collision with other inner class name */
    class C0132a implements ConsentInformation.OnConsentInfoUpdateSuccessListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f10741a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f10742b;

        /* renamed from: com.applovin.impl.privacy.cmp.a$a$a  reason: collision with other inner class name */
        class C0133a implements UserMessagingPlatform.OnConsentFormLoadSuccessListener {
            C0133a() {
            }

            public void onConsentFormLoadSuccess(ConsentForm consentForm) {
                a.this.a("Successfully loaded consent form");
                ConsentForm unused = a.this.f10740c = consentForm;
                C0132a.this.f10742b.onFlowLoaded((Bundle) null);
            }
        }

        /* renamed from: com.applovin.impl.privacy.cmp.a$a$b */
        class b implements UserMessagingPlatform.OnConsentFormLoadFailureListener {
            b() {
            }

            public void onConsentFormLoadFailure(FormError formError) {
                a aVar = a.this;
                aVar.b("Failed to load with error: " + formError.getMessage());
                C0132a aVar2 = C0132a.this;
                aVar2.f10742b.onFlowLoadFailed(a.this.a(formError, "Consent form load failed"));
            }
        }

        C0132a(Activity activity, d dVar) {
            this.f10741a = activity;
            this.f10742b = dVar;
        }

        public void onConsentInfoUpdateSuccess() {
            ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(this.f10741a);
            boolean isConsentFormAvailable = consentInformation.isConsentFormAvailable();
            int consentStatus = consentInformation.getConsentStatus();
            a aVar = a.this;
            aVar.a("Loaded parameters consentStatus: " + consentStatus + ", consentFormAvailable: " + isConsentFormAvailable);
            if (!isConsentFormAvailable) {
                a.this.b("Failed to load form.");
                this.f10742b.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form unavailable"));
            } else if (consentStatus != 2) {
                a aVar2 = a.this;
                aVar2.b("Failed to load with consent status: " + consentStatus);
                d dVar = this.f10742b;
                AppLovinCmpError.Code code = AppLovinCmpError.Code.FORM_NOT_REQUIRED;
                dVar.onFlowLoadFailed(new CmpErrorImpl(code, "Consent form not required for consent status: " + consentStatus));
            } else {
                a.this.a("Successfully requested consent info");
                a.this.a("Loading consent form...");
                UserMessagingPlatform.loadConsentForm(this.f10741a, new C0133a(), new b());
            }
        }
    }

    class b implements ConsentInformation.OnConsentInfoUpdateFailureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f10746a;

        b(d dVar) {
            this.f10746a = dVar;
        }

        public void onConsentInfoUpdateFailure(FormError formError) {
            a aVar = a.this;
            aVar.b("Failed to request consent info with error: " + formError.getMessage());
            this.f10746a.onFlowLoadFailed(a.this.a(formError, "Consent info update failed"));
        }
    }

    class c implements ConsentForm.OnConsentFormDismissedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f10748a;

        c(d dVar) {
            this.f10748a = dVar;
        }

        public void onConsentFormDismissed(FormError formError) {
            if (formError != null) {
                a aVar = a.this;
                aVar.b("Failed to show with error: " + formError.getMessage());
                this.f10748a.onFlowShowFailed(a.this.a(formError, "Consent form show failed"));
                return;
            }
            a.this.a("Consent form finished showing");
            this.f10748a.onFlowHidden((Bundle) null);
        }
    }

    public interface d {
        void onFlowHidden(Bundle bundle);

        void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl);

        void onFlowLoaded(Bundle bundle);

        void onFlowShowFailed(CmpErrorImpl cmpErrorImpl);
    }

    public a(k kVar) {
        this.f10738a = kVar;
        this.f10739b = kVar.L();
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(k.k());
        a("Initializing with SDK Version: " + b() + ", consentStatus: " + consentInformation.getConsentStatus() + ", consentFormAvailable: " + consentInformation.isConsentFormAvailable());
    }

    public void a(Activity activity, k3 k3Var, d dVar) {
        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
        if (zp.c(this.f10738a) && k3Var.a() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            builder.setConsentDebugSettings(new ConsentDebugSettings.Builder(activity).setForceTesting(true).setDebugGeography(1).addTestDeviceHashedId(StringUtils.emptyIfNull(this.f10738a.g0().getExtraParameters().get("google_test_device_hashed_id"))).build());
        }
        UserMessagingPlatform.getConsentInformation(activity).requestConsentInfoUpdate(activity, builder.build(), new C0132a(activity, dVar), new b(dVar));
    }

    public String b() {
        return null;
    }

    public void b(Activity activity, k3 k3Var, d dVar) {
        if (this.f10740c == null) {
            b("Failed to show - not ready yet");
            dVar.onFlowShowFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form not ready"));
            return;
        }
        a("Showing consent form...");
        this.f10740c.show(activity, new c(dVar));
    }

    public void c() {
        a("Resetting consent information");
        UserMessagingPlatform.getConsentInformation(k.k()).reset();
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return true;
    }

    /* access modifiers changed from: private */
    public void b(String str) {
        if (t.a()) {
            this.f10739b.b("GoogleCmpAdapter", str);
        }
    }

    public void a() {
        if (this.f10740c != null) {
            this.f10740c = null;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r1 != 4) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.applovin.impl.privacy.cmp.CmpErrorImpl a(com.google.android.ump.FormError r4, java.lang.String r5) {
        /*
            r3 = this;
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.UNSPECIFIED
            int r1 = r4.getErrorCode()
            r2 = 1
            if (r1 == r2) goto L_0x0016
            r2 = 2
            if (r1 == r2) goto L_0x0016
            r2 = 3
            if (r1 == r2) goto L_0x0013
            r2 = 4
            if (r1 == r2) goto L_0x0016
            goto L_0x0018
        L_0x0013:
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.INTEGRATION_ERROR
            goto L_0x0018
        L_0x0016:
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.FORM_UNAVAILABLE
        L_0x0018:
            com.applovin.impl.privacy.cmp.CmpErrorImpl r1 = new com.applovin.impl.privacy.cmp.CmpErrorImpl
            int r2 = r4.getErrorCode()
            java.lang.String r4 = r4.getMessage()
            r1.<init>(r0, r5, r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.privacy.cmp.a.a(com.google.android.ump.FormError, java.lang.String):com.applovin.impl.privacy.cmp.CmpErrorImpl");
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        if (t.a()) {
            this.f10739b.a("GoogleCmpAdapter", str);
        }
    }
}
