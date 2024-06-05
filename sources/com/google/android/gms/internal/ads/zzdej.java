package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdej implements zzcuo, zzdbl {
    private final zzbwn zza;
    private final Context zzb;
    private final zzbxf zzc;
    private final View zzd;
    private String zze;
    private final zzawo zzf;

    public zzdej(zzbwn zzbwn, Context context, zzbxf zzbxf, View view, zzawo zzawo) {
        this.zza = zzbwn;
        this.zzb = context;
        this.zzc = zzbxf;
        this.zzd = view;
        this.zzf = zzawo;
    }

    public final void zzbr() {
    }

    public final void zzf() {
    }

    public final void zzg() {
        if (this.zzf != zzawo.APP_OPEN) {
            String zzd2 = this.zzc.zzd(this.zzb);
            this.zze = zzd2;
            this.zze = String.valueOf(zzd2).concat(this.zzf == zzawo.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }

    public final void zzj() {
        this.zza.zzb(false);
    }

    public final void zzm() {
    }

    public final void zzo() {
        View view = this.zzd;
        if (!(view == null || this.zze == null)) {
            this.zzc.zzs(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    public final void zzp(zzbud zzbud, String str, String str2) {
        if (this.zzc.zzu(this.zzb)) {
            try {
                zzbxf zzbxf = this.zzc;
                Context context = this.zzb;
                zzbxf.zzo(context, zzbxf.zza(context), this.zza.zza(), zzbud.zzc(), zzbud.zzb());
            } catch (RemoteException e10) {
                zzbza.zzk("Remote Exception to get reward item.", e10);
            }
        }
    }

    public final void zzq() {
    }
}
