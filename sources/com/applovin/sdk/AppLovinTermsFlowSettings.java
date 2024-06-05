package com.applovin.sdk;

import android.net.Uri;

public interface AppLovinTermsFlowSettings {
    Uri getPrivacyPolicyUri();

    Uri getTermsOfServiceUri();

    boolean isEnabled();

    void setEnabled(boolean z10);

    void setPrivacyPolicyUri(Uri uri);

    void setTermsOfServiceUri(Uri uri);
}
