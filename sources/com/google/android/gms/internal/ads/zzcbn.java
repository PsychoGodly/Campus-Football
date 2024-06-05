package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.unity3d.services.core.device.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcbn implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager zza;
    private final zzcbm zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private float zzf = 1.0f;

    public zzcbn(Context context, zzcbm zzcbm) {
        this.zza = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.zzb = zzcbm;
    }

    private final void zzf() {
        boolean z10 = false;
        if (!this.zzd || this.zze || this.zzf <= 0.0f) {
            if (this.zzc) {
                AudioManager audioManager = this.zza;
                if (audioManager != null) {
                    if (audioManager.abandonAudioFocus(this) == 0) {
                        z10 = true;
                    }
                    this.zzc = z10;
                }
                this.zzb.zzn();
            }
        } else if (!this.zzc) {
            AudioManager audioManager2 = this.zza;
            if (audioManager2 != null) {
                if (audioManager2.requestAudioFocus(this, 3, 2) == 1) {
                    z10 = true;
                }
                this.zzc = z10;
            }
            this.zzb.zzn();
        }
    }

    public final void onAudioFocusChange(int i10) {
        this.zzc = i10 > 0;
        this.zzb.zzn();
    }

    public final float zza() {
        float f10 = this.zze ? 0.0f : this.zzf;
        if (this.zzc) {
            return f10;
        }
        return 0.0f;
    }

    public final void zzb() {
        this.zzd = true;
        zzf();
    }

    public final void zzc() {
        this.zzd = false;
        zzf();
    }

    public final void zzd(boolean z10) {
        this.zze = z10;
        zzf();
    }

    public final void zze(float f10) {
        this.zzf = f10;
        zzf();
    }
}
