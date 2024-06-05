package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzyc implements Choreographer.FrameCallback, Handler.Callback {
    private static final zzyc zzb = new zzyc();
    public volatile long zza = -9223372036854775807L;
    private final Handler zzc;
    private final HandlerThread zzd;
    private Choreographer zze;
    private int zzf;

    private zzyc() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.zzd = handlerThread;
        handlerThread.start();
        Handler zzC = zzew.zzC(handlerThread.getLooper(), this);
        this.zzc = zzC;
        zzC.sendEmptyMessage(0);
    }

    public static zzyc zza() {
        return zzb;
    }

    public final void doFrame(long j10) {
        this.zza = j10;
        Choreographer choreographer = this.zze;
        Objects.requireNonNull(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            try {
                this.zze = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                zzee.zzf("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
            return true;
        } else if (i10 == 1) {
            Choreographer choreographer = this.zze;
            if (choreographer != null) {
                int i11 = this.zzf + 1;
                this.zzf = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            Choreographer choreographer2 = this.zze;
            if (choreographer2 != null) {
                int i12 = this.zzf - 1;
                this.zzf = i12;
                if (i12 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.zza = -9223372036854775807L;
                }
            }
            return true;
        }
    }

    public final void zzb() {
        this.zzc.sendEmptyMessage(1);
    }

    public final void zzc() {
        this.zzc.sendEmptyMessage(2);
    }
}
