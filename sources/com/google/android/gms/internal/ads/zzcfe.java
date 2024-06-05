package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.n4;
import com.google.android.gms.ads.internal.client.r2;
import com.google.android.gms.ads.internal.client.v2;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;
import m5.f;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcfe extends r2 {
    private final zzcbj zza;
    private final Object zzb = new Object();
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private v2 zzf;
    private boolean zzg;
    private boolean zzh = true;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbff zzn;

    public zzcfe(zzcbj zzcbj, float f10, boolean z10, boolean z11) {
        this.zza = zzcbj;
        this.zzi = f10;
        this.zzc = z10;
        this.zzd = z11;
    }

    private final void zzw(int i10, int i11, boolean z10, boolean z11) {
        zzbzn.zze.execute(new zzcfd(this, i10, i11, z10, z11));
    }

    private final void zzx(String str, Map map) {
        HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("action", str);
        zzbzn.zze.execute(new zzcfc(this, hashMap));
    }

    public final void zzc(float f10, float f11, int i10, boolean z10, float f12) {
        boolean z11;
        boolean z12;
        int i11;
        synchronized (this.zzb) {
            z11 = true;
            if (f11 == this.zzi) {
                if (f12 == this.zzk) {
                    z11 = false;
                }
            }
            this.zzi = f11;
            this.zzj = f10;
            z12 = this.zzh;
            this.zzh = z10;
            i11 = this.zze;
            this.zze = i10;
            float f13 = this.zzk;
            this.zzk = f12;
            if (Math.abs(f12 - f13) > 1.0E-4f) {
                this.zza.zzF().invalidate();
            }
        }
        if (z11) {
            try {
                zzbff zzbff = this.zzn;
                if (zzbff != null) {
                    zzbff.zze();
                }
            } catch (RemoteException e10) {
                zzbza.zzl("#007 Could not call remote method.", e10);
            }
        }
        zzw(i11, i10, z12, z10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        int i12;
        boolean z13;
        v2 v2Var;
        v2 v2Var2;
        v2 v2Var3;
        synchronized (this.zzb) {
            boolean z14 = this.zzg;
            boolean z15 = false;
            if (z14 || i11 != 1) {
                i12 = i11;
                z12 = false;
            } else {
                i11 = 1;
                i12 = 1;
                z12 = true;
            }
            boolean z16 = i10 != i11;
            if (!z16 || i12 != 1) {
                z13 = false;
            } else {
                z13 = true;
                i12 = 1;
            }
            boolean z17 = z16 && i12 == 2;
            boolean z18 = z16 && i12 == 3;
            if (z14 || z12) {
                z15 = true;
            }
            this.zzg = z15;
            if (z12) {
                try {
                    v2 v2Var4 = this.zzf;
                    if (v2Var4 != null) {
                        v2Var4.zzi();
                    }
                } catch (RemoteException e10) {
                    zzbza.zzl("#007 Could not call remote method.", e10);
                }
            }
            if (z13 && (v2Var3 = this.zzf) != null) {
                v2Var3.zzh();
            }
            if (z17 && (v2Var2 = this.zzf) != null) {
                v2Var2.zzg();
            }
            if (z18) {
                v2 v2Var5 = this.zzf;
                if (v2Var5 != null) {
                    v2Var5.zze();
                }
                this.zza.zzw();
            }
            if (!(z10 == z11 || (v2Var = this.zzf) == null)) {
                v2Var.zzf(z11);
            }
        }
    }

    public final float zze() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzk;
        }
        return f10;
    }

    public final float zzf() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzj;
        }
        return f10;
    }

    public final float zzg() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzi;
        }
        return f10;
    }

    public final int zzh() {
        int i10;
        synchronized (this.zzb) {
            i10 = this.zze;
        }
        return i10;
    }

    public final v2 zzi() throws RemoteException {
        v2 v2Var;
        synchronized (this.zzb) {
            v2Var = this.zzf;
        }
        return v2Var;
    }

    public final void zzj(boolean z10) {
        zzx(true != z10 ? "unmute" : "mute", (Map) null);
    }

    public final void zzk() {
        zzx("pause", (Map) null);
    }

    public final void zzl() {
        zzx("play", (Map) null);
    }

    public final void zzm(v2 v2Var) {
        synchronized (this.zzb) {
            this.zzf = v2Var;
        }
    }

    public final void zzn() {
        zzx("stop", (Map) null);
    }

    public final boolean zzo() {
        boolean z10;
        boolean zzp = zzp();
        synchronized (this.zzb) {
            z10 = false;
            if (!zzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z10 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z10;
    }

    public final boolean zzp() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = false;
            if (this.zzc && this.zzl) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean zzq() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = this.zzh;
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzr(Map map) {
        this.zza.zzd("pubVideoCmd", map);
    }

    public final void zzs(n4 n4Var) {
        boolean z10 = n4Var.f14513a;
        boolean z11 = n4Var.f14514b;
        boolean z12 = n4Var.f14515c;
        synchronized (this.zzb) {
            this.zzl = z11;
            this.zzm = z12;
        }
        zzx("initialState", f.d("muteStart", true != z10 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, "customControlsRequested", true != z11 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, "clickToExpandRequested", true != z12 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION));
    }

    public final void zzt(float f10) {
        synchronized (this.zzb) {
            this.zzj = f10;
        }
    }

    public final void zzu() {
        boolean z10;
        int i10;
        synchronized (this.zzb) {
            z10 = this.zzh;
            i10 = this.zze;
            this.zze = 3;
        }
        zzw(i10, 3, z10, z10);
    }

    public final void zzv(zzbff zzbff) {
        synchronized (this.zzb) {
            this.zzn = zzbff;
        }
    }
}
