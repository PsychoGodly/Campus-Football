package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentForm;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zzbn implements Runnable {
    public final /* synthetic */ ConsentForm.OnConsentFormDismissedListener zza;

    public /* synthetic */ zzbn(ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        this.zza = onConsentFormDismissedListener;
    }

    public final void run() {
        this.zza.onConsentFormDismissed(new zzi(3, "Privacy options form is not required.").zza());
    }
}
