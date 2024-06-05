package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzxb extends Handler implements Runnable {
    final /* synthetic */ zzxg zza;
    private final zzxc zzb;
    private final long zzc;
    private zzwy zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzxb(zzxg zzxg, Looper looper, zzxc zzxc, zzwy zzwy, int i10, long j10) {
        super(looper);
        this.zza = zzxg;
        this.zzb = zzxc;
        this.zzd = zzwy;
        this.zzc = j10;
    }

    private final void zzd() {
        this.zze = null;
        zzxg zzxg = this.zza;
        ExecutorService zzd2 = zzxg.zze;
        zzxb zzc2 = zzxg.zzf;
        Objects.requireNonNull(zzc2);
        zzd2.execute(zzc2);
    }

    public final void handleMessage(Message message) {
        long j10;
        if (!this.zzi) {
            int i10 = message.what;
            if (i10 == 0) {
                zzd();
            } else if (i10 != 3) {
                this.zza.zzf = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = elapsedRealtime - this.zzc;
                zzwy zzwy = this.zzd;
                Objects.requireNonNull(zzwy);
                if (this.zzh) {
                    zzwy.zzI(this.zzb, elapsedRealtime, j11, false);
                    return;
                }
                int i11 = message.what;
                if (i11 == 1) {
                    try {
                        zzwy.zzJ(this.zzb, elapsedRealtime, j11);
                    } catch (RuntimeException e10) {
                        zzee.zzc("LoadTask", "Unexpected exception handling load completed", e10);
                        this.zza.zzg = new zzxf(e10);
                    }
                } else if (i11 == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.zze = iOException;
                    int i12 = this.zzf + 1;
                    this.zzf = i12;
                    zzxa zzt = zzwy.zzt(this.zzb, elapsedRealtime, j11, iOException, i12);
                    if (zzt.zza == 3) {
                        this.zza.zzg = this.zze;
                    } else if (zzt.zza != 2) {
                        if (zzt.zza == 1) {
                            this.zzf = 1;
                        }
                        if (zzt.zzb != -9223372036854775807L) {
                            j10 = zzt.zzb;
                        } else {
                            j10 = (long) Math.min((this.zzf - 1) * 1000, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
                        }
                        zzc(j10);
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z10) {
                int i10 = zzew.zza;
                Trace.beginSection("load:" + this.zzb.getClass().getSimpleName());
                this.zzb.zzh();
                Trace.endSection();
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (!this.zzi) {
                sendEmptyMessage(1);
            }
        } catch (IOException e10) {
            if (!this.zzi) {
                obtainMessage(2, e10).sendToTarget();
            }
        } catch (Exception e11) {
            if (!this.zzi) {
                zzee.zzc("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(2, new zzxf(e11)).sendToTarget();
            }
        } catch (OutOfMemoryError e12) {
            if (!this.zzi) {
                zzee.zzc("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(2, new zzxf(e12)).sendToTarget();
            }
        } catch (Error e13) {
            if (!this.zzi) {
                zzee.zzc("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(3, e13).sendToTarget();
            }
            throw e13;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void zza(boolean z10) {
        this.zzi = z10;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z10) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzwy zzwy = this.zzd;
            Objects.requireNonNull(zzwy);
            zzwy.zzI(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i10) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i10) {
            throw iOException;
        }
    }

    public final void zzc(long j10) {
        zzdl.zzf(this.zza.zzf == null);
        this.zza.zzf = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(0, j10);
        } else {
            zzd();
        }
    }
}
