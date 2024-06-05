package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcay {
    private final Context zza;
    private final zzcbj zzb;
    private final ViewGroup zzc;
    private zzcax zzd;

    public zzcay(Context context, ViewGroup viewGroup, zzcei zzcei) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcei;
        this.zzd = null;
    }

    public final zzcax zza() {
        return this.zzd;
    }

    public final void zzb(int i10, int i11, int i12, int i13) {
        q.f("The underlay may only be modified from the UI thread.");
        zzcax zzcax = this.zzd;
        if (zzcax != null) {
            zzcax.zzF(i10, i11, i12, i13);
        }
    }

    public final void zzc(int i10, int i11, int i12, int i13, int i14, boolean z10, zzcbi zzcbi, Integer num) {
        if (this.zzd == null) {
            zzbbb.zza(this.zzb.zzm().zza(), this.zzb.zzk(), "vpr2");
            Context context = this.zza;
            zzcbj zzcbj = this.zzb;
            zzcax zzcax = new zzcax(context, zzcbj, i14, z10, zzcbj.zzm().zza(), zzcbi, num);
            this.zzd = zzcax;
            this.zzc.addView(zzcax, 0, new ViewGroup.LayoutParams(-1, -1));
            int i15 = i10;
            int i16 = i11;
            int i17 = i12;
            this.zzd.zzF(i10, i11, i12, i13);
            this.zzb.zzz(false);
        }
    }

    public final void zzd() {
        q.f("onDestroy must be called from the UI thread.");
        zzcax zzcax = this.zzd;
        if (zzcax != null) {
            zzcax.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zze() {
        q.f("onPause must be called from the UI thread.");
        zzcax zzcax = this.zzd;
        if (zzcax != null) {
            zzcax.zzu();
        }
    }

    public final void zzf(int i10) {
        zzcax zzcax = this.zzd;
        if (zzcax != null) {
            zzcax.zzC(i10);
        }
    }
}
