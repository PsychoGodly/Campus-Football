package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzema implements zzepn {
    private final Context zza;
    private final zzfuu zzb;

    zzema(Context context, zzfuu zzfuu) {
        this.zza = context;
        this.zzb = zzfuu;
    }

    public final int zza() {
        return 18;
    }

    public final zzfut zzb() {
        return this.zzb.zzb(new zzelx(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzelz zzc() throws Exception {
        String str;
        Bundle bundle;
        t.r();
        Context context = this.zza;
        boolean booleanValue = ((Boolean) a0.c().zzb(zzbar.zzfE)).booleanValue();
        String str2 = MaxReward.DEFAULT_LABEL;
        if (!booleanValue) {
            str = str2;
        } else {
            str = context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", str2);
        }
        if (((Boolean) a0.c().zzb(zzbar.zzfG)).booleanValue()) {
            str2 = this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", str2);
        }
        t.r();
        Context context2 = this.zza;
        if (!((Boolean) a0.c().zzb(zzbar.zzfF)).booleanValue()) {
            bundle = null;
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i10 = 0; i10 < 4; i10++) {
                String str3 = strArr[i10];
                if (defaultSharedPreferences.contains(str3)) {
                    bundle.putString(str3, defaultSharedPreferences.getString(str3, (String) null));
                }
            }
        }
        return new zzelz(str, str2, bundle, (zzely) null);
    }
}
