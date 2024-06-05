package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
final class zzn {
    /* access modifiers changed from: private */
    public final Application zza;
    /* access modifiers changed from: private */
    public final zza zzb;
    /* access modifiers changed from: private */
    public final zzas zzc;

    zzn(Application application, zza zza2, zzas zzas) {
        this.zza = application;
        this.zzb = zza2;
        this.zzc = zzas;
    }

    /* access modifiers changed from: package-private */
    public final zzck zzd(Activity activity, ConsentRequestParameters consentRequestParameters) throws zzi {
        ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
        if (consentDebugSettings == null) {
            consentDebugSettings = new ConsentDebugSettings.Builder(this.zza).build();
        }
        return zzp.zza(new zzp(this, activity, consentDebugSettings, consentRequestParameters, (zzo) null));
    }
}
