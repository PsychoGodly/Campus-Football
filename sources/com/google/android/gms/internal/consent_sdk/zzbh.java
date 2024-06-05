package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zzbh implements UserMessagingPlatform.OnConsentFormLoadFailureListener {
    public final /* synthetic */ ConsentForm.OnConsentFormDismissedListener zza;

    public /* synthetic */ zzbh(ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        this.zza = onConsentFormDismissedListener;
    }

    public final void onConsentFormLoadFailure(FormError formError) {
        this.zza.onConsentFormDismissed(formError);
    }
}
