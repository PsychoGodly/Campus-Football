package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzrr implements zzqu {
    private final MediaCodec zza;
    private ByteBuffer[] zzb;
    private ByteBuffer[] zzc;

    /* synthetic */ zzrr(MediaCodec mediaCodec, zzrq zzrq) {
        this.zza = mediaCodec;
        if (zzew.zza < 21) {
            this.zzb = mediaCodec.getInputBuffers();
            this.zzc = mediaCodec.getOutputBuffers();
        }
    }

    public final int zza() {
        return this.zza.dequeueInputBuffer(0);
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3) {
                if (zzew.zza < 21) {
                    this.zzc = this.zza.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public final MediaFormat zzc() {
        return this.zza.getOutputFormat();
    }

    public final ByteBuffer zzf(int i10) {
        if (zzew.zza >= 21) {
            return this.zza.getInputBuffer(i10);
        }
        return ((ByteBuffer[]) zzew.zzH(this.zzb))[i10];
    }

    public final ByteBuffer zzg(int i10) {
        if (zzew.zza >= 21) {
            return this.zza.getOutputBuffer(i10);
        }
        return ((ByteBuffer[]) zzew.zzH(this.zzc))[i10];
    }

    public final void zzi() {
        this.zza.flush();
    }

    public final void zzj(int i10, int i11, int i12, long j10, int i13) {
        this.zza.queueInputBuffer(i10, 0, i12, j10, i13);
    }

    public final void zzk(int i10, int i11, zzgo zzgo, long j10, int i12) {
        this.zza.queueSecureInputBuffer(i10, 0, zzgo.zza(), j10, 0);
    }

    public final void zzl() {
        this.zzb = null;
        this.zzc = null;
        this.zza.release();
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
