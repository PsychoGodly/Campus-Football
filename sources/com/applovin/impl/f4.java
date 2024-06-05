package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.g4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class f4 implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* renamed from: a  reason: collision with root package name */
    private final k f7614a;

    /* renamed from: b  reason: collision with root package name */
    private final l4 f7615b;

    /* renamed from: c  reason: collision with root package name */
    private List f7616c;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7617a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.applovin.impl.g4$a[] r0 = com.applovin.impl.g4.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7617a = r0
                com.applovin.impl.g4$a r1 = com.applovin.impl.g4.a.UNIFIED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7617a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.applovin.impl.g4$a r1 = com.applovin.impl.g4.a.TERMS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.f4.a.<clinit>():void");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f7618a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public d4 f7619b;

        public b() {
        }

        public b(d4 d4Var) {
            this.f7619b = d4Var;
        }

        public boolean b() {
            return this.f7618a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.a((Object) this) || b() != bVar.b()) {
                return false;
            }
            d4 a10 = a();
            d4 a11 = bVar.a();
            return a10 != null ? a10.equals(a11) : a11 == null;
        }

        public int hashCode() {
            int i10 = b() ? 79 : 97;
            d4 a10 = a();
            return ((i10 + 59) * 59) + (a10 == null ? 43 : a10.hashCode());
        }

        public String toString() {
            return "ConsentFlowManager.FlowCompletionStatus(cmpPromptShown=" + b() + ", error=" + a() + ")";
        }

        /* access modifiers changed from: protected */
        public boolean a(Object obj) {
            return obj instanceof b;
        }

        public d4 a() {
            return this.f7619b;
        }

        public void a(boolean z10) {
            this.f7618a = z10;
        }

        public void a(d4 d4Var) {
            this.f7619b = d4Var;
        }
    }

    public interface c {
        void a(b bVar);
    }

    public f4(k kVar) {
        this.f7614a = kVar;
        this.f7615b = new l4(kVar);
    }

    public static g4 a(JSONObject jSONObject) {
        Boolean bool = JsonUtils.getBoolean(jSONObject, "terms_flow_enabled", Boolean.FALSE);
        Uri uri = null;
        String string = JsonUtils.getString(jSONObject, "terms_flow_terms_of_service", (String) null);
        Uri parse = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        String string2 = JsonUtils.getString(jSONObject, "terms_flow_privacy_policy", (String) null);
        if (StringUtils.isValidString(string2)) {
            uri = Uri.parse(string2);
        }
        return new g4(bool.booleanValue(), AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN, g4.a.TERMS, uri, parse);
    }

    public static g4 b(JSONObject jSONObject) {
        Boolean bool = JsonUtils.getBoolean(jSONObject, "consent_flow_enabled", Boolean.FALSE);
        String string = JsonUtils.getString(jSONObject, "consent_flow_debug_user_geography", MaxReward.DEFAULT_LABEL);
        Uri uri = null;
        String string2 = JsonUtils.getString(jSONObject, "consent_flow_terms_of_service", (String) null);
        Uri parse = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        String string3 = JsonUtils.getString(jSONObject, "consent_flow_privacy_policy", (String) null);
        if (StringUtils.isValidString(string3)) {
            uri = Uri.parse(string3);
        }
        return new g4(bool.booleanValue(), a(string), g4.a.UNIFIED, uri, parse);
    }

    public JSONObject c() {
        g4 d10 = d();
        Uri privacyPolicyUri = d10.getPrivacyPolicyUri();
        Uri termsOfServiceUri = d10.getTermsOfServiceUri();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "enabled", String.valueOf(k()));
        String str = MaxReward.DEFAULT_LABEL;
        JsonUtils.putString(jSONObject, "privacy_policy_url", privacyPolicyUri != null ? privacyPolicyUri.toString() : str);
        if (termsOfServiceUri != null) {
            str = termsOfServiceUri.toString();
        }
        JsonUtils.putString(jSONObject, "terms_of_service_url", str);
        return jSONObject;
    }

    public g4 d() {
        return (g4) this.f7614a.u();
    }

    public g4.a e() {
        return d().a();
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography f() {
        return d().getDebugUserGeography();
    }

    public String g() {
        d();
        Uri h10 = h();
        Uri i10 = i();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nConsent Flow Enabled - ");
        sb2.append(k());
        sb2.append("\nPrivacy Policy - ");
        if (h10 == null) {
            h10 = "undefined";
        }
        sb2.append(h10);
        sb2.append("\nTerms of Service - ");
        if (i10 == null) {
            i10 = "undefined";
        }
        sb2.append(i10);
        return sb2.toString();
    }

    public String getCommunicatorId() {
        return "consent_flow_manager";
    }

    public Uri h() {
        return d().getPrivacyPolicyUri();
    }

    public Uri i() {
        return d().getTermsOfServiceUri();
    }

    public boolean j() {
        k kVar = k.A0;
        if (!kVar.D0()) {
            return false;
        }
        f4 t10 = kVar.t();
        List list = t10.f7616c;
        if (t10.f7615b.b() || (list != null && list.size() > 0)) {
            return true;
        }
        return false;
    }

    public boolean k() {
        Map<String, String> extraParameters = this.f7614a.g0().getExtraParameters();
        if (extraParameters.containsKey("consent_flow_enabled")) {
            return Boolean.parseBoolean(extraParameters.get("consent_flow_enabled"));
        }
        return d().isEnabled();
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (i() == null || !appLovinCommunicatorMessage.getMessageData().getBoolean("include_tos")) {
            this.f7616c = m4.a(this.f7614a);
        } else {
            this.f7616c = m4.b(this.f7614a);
        }
        if (this.f7616c.size() == 0) {
            zp.a("No Consent Flow Available", (String) null, (Context) this.f7614a.p0());
        } else {
            b(this.f7614a.p0(), new tw(this));
        }
    }

    public static g4 a(Context context) {
        if (context == null) {
            t.h("AppLovinSdk", "Failed to get default terms flow settings.");
            return new g4(false, AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN, g4.a.TERMS, (Uri) null, (Uri) null);
        }
        String a10 = zp.a(context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName()), context, (k) null);
        JSONObject jsonObjectFromJsonString = StringUtils.isValidString(a10) ? JsonUtils.jsonObjectFromJsonString(a10, new JSONObject()) : new JSONObject();
        g4.a c10 = c(jsonObjectFromJsonString);
        int i10 = a.f7617a[c10.ordinal()];
        if (i10 == 1) {
            return b(JsonUtils.getJSONObject(jsonObjectFromJsonString, "consent_flow_settings", new JSONObject()));
        }
        if (i10 == 2) {
            return a(JsonUtils.getJSONObject(jsonObjectFromJsonString, "terms_flow_settings", new JSONObject()));
        }
        throw new IllegalStateException("Unknown consent flow type: " + c10);
    }

    private Uri b() {
        return Uri.parse((String) this.f7614a.a(this.f7614a.E0() ? oj.f10430v6 : oj.f10422u6));
    }

    private static g4.a c(JSONObject jSONObject) {
        return jSONObject.has("consent_flow_settings") ? g4.a.UNIFIED : g4.a.TERMS;
    }

    public void b(Activity activity, c cVar) {
        if (!k()) {
            cVar.a(new b(new d4(d4.f7114d, "Failed to start consent flow. Please make sure that the consent flow is enabled.")));
            return;
        }
        List list = this.f7616c;
        if (list == null || list.size() == 0) {
            this.f7614a.b(qj.f11011o, (Object) Boolean.FALSE);
            cVar.a(new b(new d4(d4.f7113c, "User may not be eligible for flow.")));
            return;
        }
        a(activity, (Runnable) new ww(this, activity, cVar));
    }

    public void a() {
        if (k()) {
            if (d().a() == g4.a.UNIFIED) {
                this.f7614a.L();
                if (t.a()) {
                    this.f7614a.L().a("AppLovinSdk", "Generating Unified Consent Flow...");
                }
                this.f7616c = e4.c(this.f7614a);
            } else {
                this.f7614a.L();
                if (t.a()) {
                    this.f7614a.L().a("AppLovinSdk", "Generating Terms Flow...");
                }
                this.f7616c = e4.a(this.f7614a);
            }
        }
        if (zp.i(k.k())) {
            AppLovinCommunicator.getInstance(k.k()).subscribe((AppLovinCommunicatorSubscriber) this, "start_sdk_consent_flow");
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(Uri uri, DialogInterface dialogInterface, int i10) {
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri, DialogInterface dialogInterface, int i10) {
        up.a(uri, k.k(), this.f7614a);
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        Uri b10 = b();
        new AlertDialog.Builder(activity).setTitle("Missing Privacy Policy URL").setMessage("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL").setNeutralButton("Go To Documentation", new sw(this, b10)).setNegativeButton("DISMISS", new rw(b10)).create().show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar, b bVar) {
        if (bVar.f7619b == null) {
            this.f7614a.b(qj.f11011o, (Object) Boolean.FALSE);
            this.f7616c = null;
        } else if (bVar.f7619b.a() != d4.f7115e) {
            this.f7616c = null;
        }
        cVar.a(bVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, c cVar) {
        this.f7614a.L();
        if (t.a()) {
            t L = this.f7614a.L();
            L.a("ConsentFlowManager", "Starting consent flow with states: " + this.f7616c);
        }
        if (!this.f7614a.w0()) {
            this.f7614a.b(qj.f11011o, (Object) Boolean.TRUE);
        }
        this.f7615b.a(this.f7616c, activity, (c) new uw(this, cVar));
    }

    private void a(Activity activity, Runnable runnable) {
        if (d().getPrivacyPolicyUri() != null) {
            runnable.run();
        } else {
            AppLovinSdkUtils.runOnUiThread(new vw(this, activity));
        }
    }

    private static AppLovinSdkConfiguration.ConsentFlowUserGeography a(String str) {
        if ("gdpr".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
        }
        if ("other".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER;
        }
        return AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        AppLovinCommunicator.getInstance(k.k()).getMessagingService().publish(new AppLovinCommunicatorMessage(new Bundle(), "sdk_consent_flow_finished", this));
    }
}
