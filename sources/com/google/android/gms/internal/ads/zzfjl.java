package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.util.HashSet;
import m5.j;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfjl {
    private static final Object zza = new Object();
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzfis zze;
    private boolean zzf = false;

    public zzfjl(Context context, int i10, zzfis zzfis, boolean z10) {
        this.zzb = context;
        this.zzd = Integer.toString(i10 - 1);
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzfis;
        this.zzf = z10;
    }

    private final File zze(String str) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static String zzf(zzasr zzasr) {
        zzast zze2 = zzasu.zze();
        zze2.zze(zzasr.zzd().zzk());
        zze2.zza(zzasr.zzd().zzj());
        zze2.zzb(zzasr.zzd().zza());
        zze2.zzd(zzasr.zzd().zzd());
        zze2.zzc(zzasr.zzd().zzc());
        return j.a(((zzasu) zze2.zzal()).zzax());
    }

    private final String zzg() {
        return "FBAMTD".concat(String.valueOf(this.zzd));
    }

    private final String zzh() {
        return "LATMTD".concat(String.valueOf(this.zzd));
    }

    private final void zzi(int i10, long j10) {
        zzfis zzfis = this.zze;
        if (zzfis != null) {
            zzfis.zza(i10, j10);
        }
    }

    private final void zzj(int i10, long j10, String str) {
        zzfis zzfis = this.zze;
        if (zzfis != null) {
            zzfis.zzb(i10, j10, str);
        }
    }

    private final zzasu zzk(int i10) {
        String str;
        zzgpy zzgpy;
        if (i10 == 1) {
            str = this.zzc.getString(zzh(), (String) null);
        } else {
            str = this.zzc.getString(zzg(), (String) null);
        }
        if (str == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzgpe zzv = zzgpe.zzv(j.d(str));
            if (this.zzf) {
                zzgpy = zzgpy.zza();
            } else {
                zzgpy = zzgpy.zzb();
            }
            return zzasu.zzi(zzv, zzgpy);
        } catch (zzgqy unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, currentTimeMillis);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(com.google.android.gms.internal.ads.zzasr r7) {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Object r2 = zza
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzasu r3 = r7.zzd()     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = r3.zzk()     // Catch:{ all -> 0x0054 }
            java.io.File r3 = r6.zze(r3)     // Catch:{ all -> 0x0054 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0054 }
            java.lang.String r5 = "pcbc"
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.ads.zzgpe r3 = r7.zze()     // Catch:{ all -> 0x0054 }
            byte[] r3 = r3.zzE()     // Catch:{ all -> 0x0054 }
            boolean r3 = com.google.android.gms.internal.ads.zzfjf.zze(r4, r3)     // Catch:{ all -> 0x0054 }
            if (r3 != 0) goto L_0x0030
            r7 = 4020(0xfb4, float:5.633E-42)
            r6.zzi(r7, r0)     // Catch:{ all -> 0x0054 }
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            r7 = 0
            return r7
        L_0x0030:
            java.lang.String r7 = zzf(r7)     // Catch:{ all -> 0x0054 }
            android.content.SharedPreferences r3 = r6.zzc     // Catch:{ all -> 0x0054 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = r6.zzh()     // Catch:{ all -> 0x0054 }
            r3.putString(r4, r7)     // Catch:{ all -> 0x0054 }
            boolean r7 = r3.commit()     // Catch:{ all -> 0x0054 }
            if (r7 == 0) goto L_0x004d
            r3 = 5015(0x1397, float:7.028E-42)
            r6.zzi(r3, r0)     // Catch:{ all -> 0x0054 }
            goto L_0x0052
        L_0x004d:
            r3 = 4021(0xfb5, float:5.635E-42)
            r6.zzi(r3, r0)     // Catch:{ all -> 0x0054 }
        L_0x0052:
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            return r7
        L_0x0054:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjl.zza(com.google.android.gms.internal.ads.zzasr):boolean");
    }

    public final boolean zzb(zzasr zzasr, zzfjk zzfjk) {
        zzfjk zzfjk2 = zzfjk;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzasu zzk = zzk(1);
            String zzk2 = zzasr.zzd().zzk();
            if (zzk == null || !zzk.zzk().equals(zzk2)) {
                long currentTimeMillis2 = System.currentTimeMillis();
                File zze2 = zze(zzk2);
                if (zze2.exists()) {
                    boolean isDirectory = zze2.isDirectory();
                    String str = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                    if (true != isDirectory) {
                        str = "0";
                    }
                    boolean isFile = zze2.isFile();
                    String str2 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                    if (true != isFile) {
                        str2 = "0";
                    }
                    zzj(4023, currentTimeMillis2, "d:" + str + ",f:" + str2);
                    zzi(4015, currentTimeMillis2);
                } else if (!zze2.mkdirs()) {
                    boolean canWrite = zze2.canWrite();
                    String str3 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                    if (true != canWrite) {
                        str3 = "0";
                    }
                    zzj(4024, currentTimeMillis2, "cw:".concat(str3));
                    zzi(4015, currentTimeMillis2);
                    return false;
                }
                File zze3 = zze(zzk2);
                File file = new File(zze3, "pcam.jar");
                File file2 = new File(zze3, "pcbc");
                if (!zzfjf.zze(file, zzasr.zzf().zzE())) {
                    zzi(4016, currentTimeMillis);
                    return false;
                } else if (!zzfjf.zze(file2, zzasr.zze().zzE())) {
                    zzi(4017, currentTimeMillis);
                    return false;
                } else if (zzfjk2 == null || zzfjk2.zza(file)) {
                    String zzf2 = zzf(zzasr);
                    long currentTimeMillis3 = System.currentTimeMillis();
                    String string = this.zzc.getString(zzh(), (String) null);
                    SharedPreferences.Editor edit = this.zzc.edit();
                    edit.putString(zzh(), zzf2);
                    if (string != null) {
                        edit.putString(zzg(), string);
                    }
                    if (!edit.commit()) {
                        zzi(4019, currentTimeMillis3);
                        return false;
                    }
                    HashSet hashSet = new HashSet();
                    zzasu zzk3 = zzk(1);
                    if (zzk3 != null) {
                        hashSet.add(zzk3.zzk());
                    }
                    zzasu zzk4 = zzk(2);
                    if (zzk4 != null) {
                        hashSet.add(zzk4.zzk());
                    }
                    for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                        if (!hashSet.contains(file3.getName())) {
                            zzfjf.zzd(file3);
                        }
                    }
                    zzi(5014, currentTimeMillis);
                    return true;
                } else {
                    zzi(4018, currentTimeMillis);
                    zzfjf.zzd(zze3);
                    return false;
                }
            } else {
                zzi(4014, currentTimeMillis);
                return false;
            }
        }
    }

    public final zzfjd zzc(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzasu zzk = zzk(1);
            if (zzk == null) {
                zzi(4022, currentTimeMillis);
                return null;
            }
            File zze2 = zze(zzk.zzk());
            File file = new File(zze2, "pcam.jar");
            if (!file.exists()) {
                file = new File(zze2, "pcam");
            }
            File file2 = new File(zze2, "pcbc");
            File file3 = new File(zze2, "pcopt");
            zzi(5016, currentTimeMillis);
            zzfjd zzfjd = new zzfjd(zzk, file, file2, file3);
            return zzfjd;
        }
    }

    public final boolean zzd(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzasu zzk = zzk(1);
            if (zzk == null) {
                zzi(4025, currentTimeMillis);
                return false;
            }
            File zze2 = zze(zzk.zzk());
            if (!new File(zze2, "pcam.jar").exists()) {
                zzi(4026, currentTimeMillis);
                return false;
            } else if (!new File(zze2, "pcbc").exists()) {
                zzi(4027, currentTimeMillis);
                return false;
            } else {
                zzi(5019, currentTimeMillis);
                return true;
            }
        }
    }
}
