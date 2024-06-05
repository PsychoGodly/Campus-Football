package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zzt implements Runnable {
    public final /* synthetic */ ConsentInformation.OnConsentInfoUpdateSuccessListener zza;

    public /* synthetic */ zzt(ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener) {
        this.zza = onConsentInfoUpdateSuccessListener;
    }

    public final void run() {
        this.zza.onConsentInfoUpdateSuccess();
    }
}
