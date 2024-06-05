package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzqh implements zzqu {
    private final MediaCodec zza;
    private final zzqn zzb;
    private final zzql zzc;
    private boolean zzd;
    private int zze = 0;

    /* synthetic */ zzqh(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10, zzqg zzqg) {
        this.zza = mediaCodec;
        this.zzb = new zzqn(handlerThread);
        this.zzc = new zzql(mediaCodec, handlerThread2);
    }

    static /* synthetic */ void zzh(zzqh zzqh, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        zzqh.zzb.zzf(zzqh.zza);
        int i11 = zzew.zza;
        Trace.beginSection("configureCodec");
        zzqh.zza.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        zzqh.zzc.zzf();
        Trace.beginSection("startCodec");
        zzqh.zza.start();
        Trace.endSection();
        zzqh.zze = 1;
    }

    /* access modifiers changed from: private */
    public static String zzs(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public final int zza() {
        return this.zzb.zza();
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        return this.zzb.zzb(bufferInfo);
    }

    public final MediaFormat zzc() {
        return this.zzb.zzc();
    }

    public final ByteBuffer zzf(int i10) {
        return this.zza.getInputBuffer(i10);
    }

    public final ByteBuffer zzg(int i10) {
        return this.zza.getOutputBuffer(i10);
    }

    public final void zzi() {
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    public final void zzj(int i10, int i11, int i12, long j10, int i13) {
        this.zzc.zzc(i10, 0, i12, j10, i13);
    }

    public final void zzk(int i10, int i11, zzgo zzgo, long j10, int i12) {
        this.zzc.zzd(i10, 0, zzgo, j10, 0);
    }

    public final void zzl() {
        try {
            if (this.zze == 1) {
                this.zzc.zze();
                this.zzb.zzg();
            }
            this.zze = 2;
            if (!this.zzd) {
                this.zza.release();
                this.zzd = true;
            }
        } catch (Throwable th) {
            if (!this.zzd) {
                this.zza.release();
                this.zzd = true;
            }
            throw th;
        }
    }

    public final void zzm(int i10, long j10) {
        this.zza.releaseOutputBuffer(i10, j10);
    }

    public final void zzn(int i10, boolean z10) {
        this.zza.releaseOutputBuffer(i10, z10);
    }

    public final void zzo(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    public final void zzq(int i10) {
        this.zza.setVideoScalingMode(i10);
    }

    public final boolean zzr() {
        return false;
    }
}
