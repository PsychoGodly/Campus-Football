package com.google.android.ump;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.zzbg;
import com.google.android.gms.internal.consent_sdk.zzbh;
import com.google.android.gms.internal.consent_sdk.zzbq;
import com.google.android.gms.internal.consent_sdk.zzc;
import com.google.android.gms.internal.consent_sdk.zzct;
import com.google.android.ump.ConsentForm;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class UserMessagingPlatform {

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public interface OnConsentFormLoadFailureListener {
        void onConsentFormLoadFailure(@RecentlyNonNull FormError formError);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public interface OnConsentFormLoadSuccessListener {
        void onConsentFormLoadSuccess(@RecentlyNonNull ConsentForm consentForm);
    }

    private UserMessagingPlatform() {
    }

    @RecentlyNonNull
    public static ConsentInformation getConsentInformation(@RecentlyNonNull Context context) {
        return zzc.zza(context).zzb();
    }

    public static void loadAndShowConsentFormIfRequired(@RecentlyNonNull Activity activity, @RecentlyNonNull ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        if (zzc.zza(activity).zzb().canRequestAds()) {
            onConsentFormDismissedListener.onConsentFormDismissed((FormError) null);
            return;
        }
        zzbq zzc = zzc.zza(activity).zzc();
        zzct.zza();
        zzbg zzbg = new zzbg(activity, onConsentFormDismissedListener);
        onConsentFormDismissedListener.getClass();
        zzc.zzb(zzbg, new zzbh(onConsentFormDismissedListener));
    }

    public static void loadConsentForm(@RecentlyNonNull Context context, @RecentlyNonNull OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, @RecentlyNonNull OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        zzc.zza(context).zzc().zzb(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
    }

    public static void showPrivacyOptionsForm(@RecentlyNonNull Activity activity, @RecentlyNonNull ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        zzc.zza(activity).zzc().zze(activity, onConsentFormDismissedListener);
    }
}
