package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.ads.internal.client.a0;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzarm extends zzasm {
    private static final zzasn zzi = new zzasn();
    private final Context zzj;

    public zzarm(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11, Context context, zzamo zzamo) {
        super(zzaqx, "zOES1C/X3KjGUl735PWTCIIeaiX8ogaBw1coqgLpdTjY6Symxbx5mbEMtlABs9zo", "hsHYBstzTMhc90xao/PTJuPT724yCZ6q03cV54fb+14=", zzamv, i10, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzans zzc = this.zzb.zzc();
            if (zzc == null || !zzc.zzaj()) {
                return null;
            }
            return zzc.zzh();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaoi zzaoi;
        int i10;
        Boolean bool;
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzaoi zzaoi2 = (zzaoi) zza.get();
            if (zzaoi2 == null || zzarb.zzg(zzaoi2.zza) || zzaoi2.zza.equals("E") || zzaoi2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (!zzarb.zzg((String) null)) {
                    i10 = 5;
                } else {
                    if (!zzarb.zzg((String) null)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    bool.booleanValue();
                    i10 = 3;
                }
                Boolean valueOf = Boolean.valueOf(i10 == 3);
                Boolean bool2 = (Boolean) a0.c().zzb(zzbar.zzca);
                String zzb = ((Boolean) a0.c().zzb(zzbar.zzbZ)).booleanValue() ? zzb() : null;
                if (bool2.booleanValue() && this.zzb.zzp() && zzarb.zzg(zzb)) {
                    zzb = zzc();
                }
                zzaoi zzaoi3 = new zzaoi((String) this.zzf.invoke((Object) null, new Object[]{this.zzj, valueOf, zzb}));
                if (zzarb.zzg(zzaoi3.zza) || zzaoi3.zza.equals("E")) {
                    int i11 = i10 - 1;
                    if (i11 == 3) {
                        String zzc = zzc();
                        if (!zzarb.zzg(zzc)) {
                            zzaoi3.zza = zzc;
                        }
                    } else if (i11 == 4) {
                        throw null;
                    }
                }
                zza.set(zzaoi3);
            }
            zzaoi = (zzaoi) zza.get();
        }
        synchronized (this.zze) {
            if (zzaoi != null) {
                this.zze.zzx(zzaoi.zza);
                this.zze.zzX(zzaoi.zzb);
                this.zze.zzZ(zzaoi.zzc);
                this.zze.zzi(zzaoi.zzd);
                this.zze.zzw(zzaoi.zze);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String zzb() {
        try {
            CertificateFactory instance = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            byte[] zzi2 = zzarb.zzi((String) a0.c().zzb(zzbar.zzcb));
            ArrayList arrayList = new ArrayList();
            arrayList.add(instance.generateCertificate(new ByteArrayInputStream(zzi2)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(instance.generateCertificate(new ByteArrayInputStream(zzarb.zzi((String) a0.c().zzb(zzbar.zzcc)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zzb.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            zzfvc zzf = zzfvc.zzf();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new zzaso(zzf));
            return (String) zzf.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
