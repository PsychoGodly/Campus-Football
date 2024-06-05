package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.t;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings;

public class g4 implements AppLovinTermsAndPrivacyPolicyFlowSettings {

    /* renamed from: a  reason: collision with root package name */
    private boolean f7900a;

    /* renamed from: b  reason: collision with root package name */
    private AppLovinSdkConfiguration.ConsentFlowUserGeography f7901b;

    /* renamed from: c  reason: collision with root package name */
    private a f7902c;

    /* renamed from: d  reason: collision with root package name */
    private Uri f7903d;

    /* renamed from: e  reason: collision with root package name */
    private Uri f7904e;

    public enum a {
        TERMS("default"),
        UNIFIED("unified");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f7908a;

        private a(String str) {
            this.f7908a = str;
        }

        public String b() {
            return this.f7908a;
        }
    }

    public g4(boolean z10, AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, a aVar, Uri uri, Uri uri2) {
        this.f7900a = z10;
        this.f7901b = consentFlowUserGeography;
        this.f7902c = aVar;
        this.f7903d = uri;
        this.f7904e = uri2;
    }

    public a a() {
        return this.f7902c;
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography() {
        return this.f7901b;
    }

    public Uri getPrivacyPolicyUri() {
        return this.f7903d;
    }

    public Uri getTermsOfServiceUri() {
        return this.f7904e;
    }

    public boolean isEnabled() {
        return this.f7900a;
    }

    public void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        t.g("ConsentFlowSettingsImpl", "Setting user debug geography: " + consentFlowUserGeography);
        this.f7901b = consentFlowUserGeography;
    }

    public void setEnabled(boolean z10) {
        t.g("ConsentFlowSettingsImpl", "Setting consent flow enabled: " + z10);
        this.f7900a = z10;
    }

    public void setPrivacyPolicyUri(Uri uri) {
        t.g("ConsentFlowSettingsImpl", "Setting privacy policy: " + uri);
        this.f7903d = uri;
    }

    public void setTermsOfServiceUri(Uri uri) {
        t.g("ConsentFlowSettingsImpl", "Setting terms of service: " + uri);
        this.f7904e = uri;
    }

    public String toString() {
        return "ConsentFlowSettings{isEnabled=" + this.f7900a + ", privacyPolicyUri=" + this.f7903d + ", termsOfServiceUri=" + this.f7904e + '}';
    }

    public void a(a aVar) {
        this.f7902c = aVar;
    }
}
