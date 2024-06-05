package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfjn {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfjo zzc;
    private final zzfhp zzd;
    private final zzfhk zze;
    private zzfjc zzf;
    private final Object zzg = new Object();

    public zzfjn(Context context, zzfjo zzfjo, zzfhp zzfhp, zzfhk zzfhk) {
        this.zzb = context;
        this.zzc = zzfjo;
        this.zzd = zzfhp;
        this.zze = zzfhk;
    }

    private final synchronized Class zzd(zzfjd zzfjd) throws zzfjm {
        String zzk = zzfjd.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.zze.zza(zzfjd.zzc())) {
                File zzb2 = zzfjd.zzb();
                if (!zzb2.exists()) {
                    zzb2.mkdirs();
                }
                Class loadClass = new DexClassLoader(zzfjd.zzc().getAbsolutePath(), zzb2.getAbsolutePath(), (String) null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(zzk, loadClass);
                return loadClass;
            }
            throw new zzfjm(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e10) {
            throw new zzfjm(2026, (Throwable) e10);
        } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e11) {
            throw new zzfjm((int) AdError.REMOTE_ADS_SERVICE_ERROR, e11);
        }
    }

    public final zzfhs zza() {
        zzfjc zzfjc;
        synchronized (this.zzg) {
            zzfjc = this.zzf;
        }
        return zzfjc;
    }

    public final zzfjd zzb() {
        synchronized (this.zzg) {
            zzfjc zzfjc = this.zzf;
            if (zzfjc == null) {
                return null;
            }
            zzfjd zzf2 = zzfjc.zzf();
            return zzf2;
        }
    }

    public final boolean zzc(zzfjd zzfjd) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Class zzd2 = zzd(zzfjd);
            zzfjc zzfjc = new zzfjc(zzd2.getDeclaredConstructor(new Class[]{Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE}).newInstance(new Object[]{this.zzb, "msa-r", zzfjd.zze(), null, new Bundle(), 2}), zzfjd, this.zzc, this.zzd);
            if (zzfjc.zzh()) {
                int zze2 = zzfjc.zze();
                if (zze2 == 0) {
                    synchronized (this.zzg) {
                        zzfjc zzfjc2 = this.zzf;
                        if (zzfjc2 != null) {
                            try {
                                zzfjc2.zzg();
                            } catch (zzfjm e10) {
                                this.zzd.zzc(e10.zza(), -1, e10);
                            }
                        }
                        this.zzf = zzfjc;
                    }
                    this.zzd.zzd(3000, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                throw new zzfjm(4001, "ci: " + zze2);
            }
            throw new zzfjm(4000, "init failed");
        } catch (Exception e11) {
            throw new zzfjm((int) AdError.INTERNAL_ERROR_2004, (Throwable) e11);
        } catch (zzfjm e12) {
            this.zzd.zzc(e12.zza(), System.currentTimeMillis() - currentTimeMillis, e12);
            return false;
        } catch (Exception e13) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e13);
            return false;
        }
    }
}
