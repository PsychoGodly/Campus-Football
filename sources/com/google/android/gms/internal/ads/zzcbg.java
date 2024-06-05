package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcbg implements SensorEventListener {
    private final SensorManager zza;
    private final Object zzb = new Object();
    private final Display zzc;
    private final float[] zzd = new float[9];
    private final float[] zze = new float[9];
    private float[] zzf;
    private Handler zzg;
    private zzcbf zzh;

    zzcbg(Context context) {
        this.zza = (SensorManager) context.getSystemService("sensor");
        this.zzc = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.zzb) {
                if (this.zzf == null) {
                    this.zzf = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.zzd, fArr);
            int rotation = this.zzc.getRotation();
            if (rotation == 1) {
                SensorManager.remapCoordinateSystem(this.zzd, 2, 129, this.zze);
            } else if (rotation == 2) {
                SensorManager.remapCoordinateSystem(this.zzd, 129, 130, this.zze);
            } else if (rotation != 3) {
                System.arraycopy(this.zzd, 0, this.zze, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(this.zzd, 130, 1, this.zze);
            }
            float[] fArr2 = this.zze;
            float f10 = fArr2[1];
            fArr2[1] = fArr2[3];
            fArr2[3] = f10;
            float f11 = fArr2[2];
            fArr2[2] = fArr2[6];
            fArr2[6] = f11;
            float f12 = fArr2[5];
            fArr2[5] = fArr2[7];
            fArr2[7] = f12;
            synchronized (this.zzb) {
                System.arraycopy(this.zze, 0, this.zzf, 0, 9);
            }
            zzcbf zzcbf = this.zzh;
            if (zzcbf != null) {
                zzcbf.zza();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzcbf zzcbf) {
        this.zzh = zzcbf;
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        if (this.zzg == null) {
            Sensor defaultSensor = this.zza.getDefaultSensor(11);
            if (defaultSensor == null) {
                zzbza.zzg("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            zzfkr zzfkr = new zzfkr(handlerThread.getLooper());
            this.zzg = zzfkr;
            if (!this.zza.registerListener(this, defaultSensor, 0, zzfkr)) {
                zzbza.zzg("SensorManager.registerListener failed.");
                zzc();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc() {
        if (this.zzg != null) {
            this.zza.unregisterListener(this);
            this.zzg.post(new zzcbe(this));
            this.zzg = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzd(float[] fArr) {
        synchronized (this.zzb) {
            float[] fArr2 = this.zzf;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }
}
