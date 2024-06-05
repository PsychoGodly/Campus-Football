package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zzj implements ConsentInformation.OnConsentInfoUpdateSuccessListener {
    public final /* synthetic */ zzl zza;

    public /* synthetic */ zzj(zzl zzl) {
        this.zza = zzl;
    }

    public final void onConsentInfoUpdateSuccess() {
        this.zza.zzb(false);
    }
}
