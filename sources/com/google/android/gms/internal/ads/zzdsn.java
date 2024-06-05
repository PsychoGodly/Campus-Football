package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c2;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.n1;
import org.json.JSONException;
import org.json.JSONObject;
import t4.e0;
import t4.s;
import t4.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdsn implements t, zzcft {
    private final Context zza;
    private final zzbzg zzb;
    private zzdsf zzc;
    private zzcei zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private c2 zzh;
    private boolean zzi;

    zzdsn(Context context, zzbzg zzbzg) {
        this.zza = context;
        this.zzb = zzbzg;
    }

    private final synchronized boolean zzl(c2 c2Var) {
        if (!((Boolean) a0.c().zzb(zzbar.zzif)).booleanValue()) {
            zzbza.zzj("Ad inspector had an internal error.");
            try {
                c2Var.zze(zzezx.zzd(16, (String) null, (c3) null));
            } catch (RemoteException unused) {
            }
        } else if (this.zzc == null) {
            zzbza.zzj("Ad inspector had an internal error.");
            try {
                c2Var.zze(zzezx.zzd(16, (String) null, (c3) null));
            } catch (RemoteException unused2) {
            }
        } else {
            if (!this.zze && !this.zzf) {
                if (com.google.android.gms.ads.internal.t.b().a() >= this.zzg + ((long) ((Integer) a0.c().zzb(zzbar.zzii)).intValue())) {
                    return true;
                }
            }
            zzbza.zzj("Ad inspector cannot be opened because it is already open.");
            try {
                c2Var.zze(zzezx.zzd(19, (String) null, (c3) null));
            } catch (RemoteException unused3) {
            }
        }
        return false;
        return false;
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:8|9|10|11|12|(1:14)|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 1
            if (r4 == 0) goto L_0x0012
            java.lang.String r4 = "Ad inspector loaded."
            com.google.android.gms.ads.internal.util.n1.a(r4)     // Catch:{ all -> 0x002e }
            r3.zze = r0     // Catch:{ all -> 0x002e }
            java.lang.String r4 = ""
            r3.zzk(r4)     // Catch:{ all -> 0x002e }
            monitor-exit(r3)
            return
        L_0x0012:
            java.lang.String r4 = "Ad inspector failed to load."
            com.google.android.gms.internal.ads.zzbza.zzj(r4)     // Catch:{ all -> 0x002e }
            com.google.android.gms.ads.internal.client.c2 r4 = r3.zzh     // Catch:{ RemoteException -> 0x0025 }
            if (r4 == 0) goto L_0x0025
            r1 = 17
            r2 = 0
            com.google.android.gms.ads.internal.client.c3 r1 = com.google.android.gms.internal.ads.zzezx.zzd(r1, r2, r2)     // Catch:{ RemoteException -> 0x0025 }
            r4.zze(r1)     // Catch:{ RemoteException -> 0x0025 }
        L_0x0025:
            r3.zzi = r0     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.zzcei r4 = r3.zzd     // Catch:{ all -> 0x002e }
            r4.destroy()     // Catch:{ all -> 0x002e }
            monitor-exit(r3)
            return
        L_0x002e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsn.zza(boolean):void");
    }

    public final synchronized void zzb() {
        this.zzf = true;
        zzk(MaxReward.DEFAULT_LABEL);
    }

    public final void zzbF() {
    }

    public final void zzbo() {
    }

    public final void zzby() {
    }

    public final void zze() {
    }

    public final synchronized void zzf(int i10) {
        this.zzd.destroy();
        if (!this.zzi) {
            n1.a("Inspector closed.");
            c2 c2Var = this.zzh;
            if (c2Var != null) {
                try {
                    c2Var.zze((c3) null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0;
        this.zzi = false;
        this.zzh = null;
    }

    public final Activity zzg() {
        zzcei zzcei = this.zzd;
        if (zzcei == null || zzcei.zzaz()) {
            return null;
        }
        return this.zzd.zzi();
    }

    public final void zzh(zzdsf zzdsf) {
        this.zzc = zzdsf;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(String str) {
        JSONObject zze2 = this.zzc.zze();
        if (!TextUtils.isEmpty(str)) {
            try {
                zze2.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.zzd.zzb("window.inspectorInfo", zze2.toString());
    }

    public final synchronized void zzj(c2 c2Var, zzbih zzbih, zzbia zzbia) {
        c2 c2Var2 = c2Var;
        synchronized (this) {
            if (zzl(c2Var)) {
                try {
                    com.google.android.gms.ads.internal.t.B();
                    zzcei zza2 = zzceu.zza(this.zza, zzcfx.zza(), MaxReward.DEFAULT_LABEL, false, false, (zzapw) null, (zzbbt) null, this.zzb, (zzbbj) null, (l) null, (a) null, zzawe.zza(), (zzeyc) null, (zzeyf) null);
                    this.zzd = zza2;
                    zzcfv zzN = zza2.zzN();
                    if (zzN == null) {
                        zzbza.zzj("Failed to obtain a web view for the ad inspector");
                        try {
                            c2Var2.zze(zzezx.zzd(17, "Failed to obtain a web view for the ad inspector", (c3) null));
                        } catch (RemoteException unused) {
                        }
                    } else {
                        this.zzh = c2Var2;
                        zzN.zzM((com.google.android.gms.ads.internal.client.a) null, (zzbgi) null, (t) null, (zzbgk) null, (e0) null, false, (zzbhr) null, (b) null, (zzbqg) null, (zzbwb) null, (zzeaf) null, (zzfff) null, (zzdpi) null, (zzfdk) null, zzbih, (zzdcc) null, new zzbig(this.zza), zzbia);
                        zzN.zzA(this);
                        this.zzd.loadUrl((String) a0.c().zzb(zzbar.zzig));
                        com.google.android.gms.ads.internal.t.k();
                        s.a(this.zza, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true);
                        this.zzg = com.google.android.gms.ads.internal.t.b().a();
                    }
                } catch (zzcet e10) {
                    zzbza.zzk("Failed to obtain a web view for the ad inspector", e10);
                    try {
                        c2Var2.zze(zzezx.zzd(17, "Failed to obtain a web view for the ad inspector", (c3) null));
                    } catch (RemoteException unused2) {
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzk(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zze     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0016
            boolean r0 = r2.zzf     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x000a
            goto L_0x0016
        L_0x000a:
            com.google.android.gms.internal.ads.zzfuu r0 = com.google.android.gms.internal.ads.zzbzn.zze     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.ads.zzdsm r1 = new com.google.android.gms.internal.ads.zzdsm     // Catch:{ all -> 0x0018 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0018 }
            r0.execute(r1)     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)
            return
        L_0x0016:
            monitor-exit(r2)
            return
        L_0x0018:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsn.zzk(java.lang.String):void");
    }
}
