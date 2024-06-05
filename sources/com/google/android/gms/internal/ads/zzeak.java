package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.HashMap;
import t4.r;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzeak implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzeaf zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzdpi zzc;
    public final /* synthetic */ Activity zzd;
    public final /* synthetic */ zzfdk zze;
    public final /* synthetic */ r zzf;

    public /* synthetic */ zzeak(zzeaf zzeaf, String str, zzdpi zzdpi, Activity activity, zzfdk zzfdk, r rVar) {
        this.zza = zzeaf;
        this.zzb = str;
        this.zzc = zzdpi;
        this.zzd = activity;
        this.zze = zzfdk;
        this.zzf = rVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        zzeaf zzeaf = this.zza;
        String str = this.zzb;
        zzdpi zzdpi = this.zzc;
        Activity activity = this.zzd;
        zzfdk zzfdk = this.zze;
        r rVar = this.zzf;
        zzeaf.zzc(str);
        if (zzdpi != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("dialog_action", "dismiss");
            zzean.zzd(activity, zzdpi, zzfdk, zzeaf, str, "dialog_click", hashMap);
        }
        if (rVar != null) {
            rVar.zzb();
        }
    }
}
