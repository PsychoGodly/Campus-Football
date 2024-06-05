package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.core.device.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzvv {
    private final Spatializer zza;
    private final boolean zzb;
    private Handler zzc;
    private Spatializer.OnSpatializerStateChangedListener zzd;

    private zzvv(Spatializer spatializer) {
        this.zza = spatializer;
        this.zzb = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static zzvv zza(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        return new zzvv(audioManager.getSpatializer());
    }

    public final void zzb(zzwc zzwc, Looper looper) {
        if (this.zzd == null && this.zzc == null) {
            this.zzd = new zzvu(this, zzwc);
            Handler handler = new Handler(looper);
            this.zzc = handler;
            this.zza.addOnSpatializerStateChangedListener(new zzvt(handler), this.zzd);
        }
    }

    public final void zzc() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.zzd;
        if (onSpatializerStateChangedListener != null && this.zzc != null) {
            this.zza.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            Handler handler = this.zzc;
            int i10 = zzew.zza;
            handler.removeCallbacksAndMessages((Object) null);
            this.zzc = null;
            this.zzd = null;
        }
    }

    public final boolean zzd(zzk zzk, zzaf zzaf) {
        int i10;
        if (!"audio/eac3-joc".equals(zzaf.zzm) || zzaf.zzz != 16) {
            i10 = zzaf.zzz;
        } else {
            i10 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzew.zzj(i10));
        int i11 = zzaf.zzA;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        return this.zza.canBeSpatialized(zzk.zza().zza, channelMask.build());
    }

    public final boolean zze() {
        return this.zza.isAvailable();
    }

    public final boolean zzf() {
        return this.zza.isEnabled();
    }

    public final boolean zzg() {
        return this.zzb;
    }
}
