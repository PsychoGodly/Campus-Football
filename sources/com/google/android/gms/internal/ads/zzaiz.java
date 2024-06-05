package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaiz {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzaiz(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            str = i10 + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH;
        } else {
            str = MaxReward.DEFAULT_LABEL;
        }
        this.zza = str;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = RecyclerView.UNDEFINED_DURATION;
        this.zze = MaxReward.DEFAULT_LABEL;
    }

    private final void zzd() {
        if (this.zzd == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int zza() {
        zzd();
        return this.zzd;
    }

    public final String zzb() {
        zzd();
        return this.zze;
    }

    public final void zzc() {
        int i10 = this.zzd;
        int i11 = i10 == Integer.MIN_VALUE ? this.zzb : i10 + this.zzc;
        this.zzd = i11;
        String str = this.zza;
        this.zze = str + i11;
    }
}
