package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzou {
    public final zzaf zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzdb zzi;

    public zzou(zzaf zzaf, int i10, int i11, int i12, int i13, int i14, int i15, int i16, zzdb zzdb) {
        this.zza = zzaf;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzdb;
    }

    public final long zza(long j10) {
        return (j10 * 1000000) / ((long) this.zze);
    }

    public final AudioTrack zzb(boolean z10, zzk zzk, int i10) throws zzoe {
        AudioTrack audioTrack;
        try {
            int i11 = zzew.zza;
            if (i11 >= 29) {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(zzk.zza().zza).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.zze).setChannelMask(this.zzf).setEncoding(this.zzg).build()).setTransferMode(1).setBufferSizeInBytes(this.zzh).setSessionId(i10).setOffloadedPlayback(this.zzc == 1).build();
            } else if (i11 < 21) {
                int i12 = zzk.zzc;
                if (i10 == 0) {
                    audioTrack = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1, i10);
                }
            } else {
                audioTrack = new AudioTrack(zzk.zza().zza, new AudioFormat.Builder().setSampleRate(this.zze).setChannelMask(this.zzf).setEncoding(this.zzg).build(), this.zzh, 1, i10);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzoe(state, this.zze, this.zzf, this.zzh, this.zza, zzc(), (Exception) null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new zzoe(0, this.zze, this.zzf, this.zzh, this.zza, zzc(), e10);
        }
    }

    public final boolean zzc() {
        return this.zzc == 1;
    }
}
