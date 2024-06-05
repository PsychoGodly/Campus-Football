package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzxt extends HandlerThread implements Handler.Callback {
    private zzdr zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzxv zze;

    public zzxt() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            try {
                int i11 = message.arg1;
                zzdr zzdr = this.zza;
                Objects.requireNonNull(zzdr);
                zzdr.zzb(i11);
                this.zze = new zzxv(this, this.zza.zza(), i11 != 0, (zzxu) null);
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e10) {
                zzee.zzc("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                this.zzd = e10;
                synchronized (this) {
                    notify();
                }
            } catch (zzds e11) {
                zzee.zzc("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                this.zzd = new IllegalStateException(e11);
                synchronized (this) {
                    notify();
                }
            } catch (Error e12) {
                try {
                    zzee.zzc("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.zzc = e12;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
            return true;
        } else if (i10 != 2) {
            return true;
        } else {
            try {
                zzdr zzdr2 = this.zza;
                Objects.requireNonNull(zzdr2);
                zzdr2.zzc();
            } catch (Throwable th2) {
                quit();
                throw th2;
            }
            quit();
            return true;
        }
    }

    public final zzxv zza(int i10) {
        boolean z10;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzdr(this.zzb, (zzdq) null);
        synchronized (this) {
            z10 = false;
            this.zzb.obtainMessage(1, i10, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzxv zzxv = this.zze;
                Objects.requireNonNull(zzxv);
                return zzxv;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        handler.sendEmptyMessage(2);
    }
}
