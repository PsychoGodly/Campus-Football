package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgz {
    private final AudioManager zza;
    private final zzgx zzb;
    private zzgy zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzgz(Context context, Handler handler, zzgy zzgy) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        Objects.requireNonNull(audioManager);
        this.zza = audioManager;
        this.zzc = zzgy;
        this.zzb = new zzgx(this, handler);
        this.zzd = 0;
    }

    static /* bridge */ /* synthetic */ void zzc(zzgz zzgz, int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2) {
                zzgz.zzg(3);
                return;
            }
            zzgz.zzf(0);
            zzgz.zzg(2);
        } else if (i10 == -1) {
            zzgz.zzf(-1);
            zzgz.zze();
        } else if (i10 != 1) {
            zzee.zze("AudioFocusManager", "Unknown focus change type: " + i10);
        } else {
            zzgz.zzg(1);
            zzgz.zzf(1);
        }
    }

    private final void zze() {
        if (this.zzd != 0) {
            if (zzew.zza < 26) {
                this.zza.abandonAudioFocus(this.zzb);
            }
            zzg(0);
        }
    }

    private final void zzf(int i10) {
        zzgy zzgy = this.zzc;
        if (zzgy != null) {
            zziy zziy = (zziy) zzgy;
            boolean zzy = zziy.zza.zzy();
            zziy.zza.zzat(zzy, i10, zzjc.zzag(zzy, i10));
        }
    }

    private final void zzg(int i10) {
        if (this.zzd != i10) {
            this.zzd = i10;
            float f10 = i10 == 3 ? 0.2f : 1.0f;
            if (this.zze != f10) {
                this.zze = f10;
                zzgy zzgy = this.zzc;
                if (zzgy != null) {
                    ((zziy) zzgy).zza.zzaq();
                }
            }
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z10, int i10) {
        zze();
        return z10 ? 1 : -1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
    }
}
