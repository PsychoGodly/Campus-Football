package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.UserMessagingPlatform;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class zzbq {
    private final zzdr zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();

    zzbq(zzdr zzdr, Executor executor) {
        this.zza = zzdr;
        this.zzb = executor;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbe zzbe) {
        zzbe.zzb(new zzbi(this.zzd), zzbj.zza);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.consent_sdk.zzay, java.lang.Object] */
    public final void zzb(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        zzct.zza();
        zzbs zzbs = (zzbs) this.zzc.get();
        if (zzbs == null) {
            onConsentFormLoadFailureListener.onConsentFormLoadFailure(new zzi(3, "No available form can be built.").zza());
            return;
        }
        ? zzb2 = this.zza.zzb();
        zzb2.zza(zzbs);
        zzb2.zzb().zza().zzb(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.consent_sdk.zzay, java.lang.Object] */
    public final void zzc() {
        zzbs zzbs = (zzbs) this.zzc.get();
        if (zzbs == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        ? zzb2 = this.zza.zzb();
        zzb2.zza(zzbs);
        zzbe zza2 = zzb2.zzb().zza();
        zza2.zza = true;
        zzct.zza.post(new zzbk(this, zza2));
    }

    public final void zzd(zzbs zzbs) {
        this.zzc.set(zzbs);
    }

    public final void zze(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        zzct.zza();
        zzl zzb2 = zzc.zza(activity).zzb();
        if (zzb2 == null) {
            zzct.zza.post(new zzbl(onConsentFormDismissedListener));
        } else if (!zzb2.isConsentFormAvailable() && zzb2.getPrivacyOptionsRequirementStatus() != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            zzct.zza.post(new zzbm(onConsentFormDismissedListener));
            zzb2.zza(activity);
        } else if (zzb2.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            zzct.zza.post(new zzbn(onConsentFormDismissedListener));
        } else {
            ConsentForm consentForm = (ConsentForm) this.zzd.get();
            if (consentForm == null) {
                zzct.zza.post(new zzbo(onConsentFormDismissedListener));
                return;
            }
            consentForm.show(activity, onConsentFormDismissedListener);
            this.zzb.execute(new zzbp(this));
        }
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}
