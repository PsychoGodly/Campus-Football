package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zzbj implements UserMessagingPlatform.OnConsentFormLoadFailureListener {
    public static final /* synthetic */ zzbj zza = new zzbj();

    private /* synthetic */ zzbj() {
    }

    public final void onConsentFormLoadFailure(FormError formError) {
        Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(formError.getMessage())));
    }
}
