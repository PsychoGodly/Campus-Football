package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zzk implements ConsentInformation.OnConsentInfoUpdateFailureListener {
    public final /* synthetic */ zzl zza;

    public /* synthetic */ zzk(zzl zzl) {
        this.zza = zzl;
    }

    public final void onConsentInfoUpdateFailure(FormError formError) {
        this.zza.zzb(false);
    }
}
