package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import m5.j;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfje {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfje(Context context, int i10) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfjf.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfjf.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i10;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FBAMTD");
        sb2.append(this.zzd - 1);
        return sb2.toString();
    }

    private final String zzf() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LATMTD");
        sb2.append(this.zzd - 1);
        return sb2.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(com.google.android.gms.internal.ads.zzasr r8, com.google.android.gms.internal.ads.zzfjk r9) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzasu r0 = r8.zzd()
            java.lang.String r0 = r0.zzk()
            com.google.android.gms.internal.ads.zzgpe r1 = r8.zzf()
            byte[] r1 = r1.zzE()
            com.google.android.gms.internal.ads.zzgpe r2 = r8.zze()
            byte[] r2 = r2.zzE()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r3 != 0) goto L_0x0185
            if (r2 == 0) goto L_0x0185
            int r3 = r2.length
            if (r3 != 0) goto L_0x0026
            goto L_0x0185
        L_0x0026:
            java.io.File r3 = r7.zza
            com.google.android.gms.internal.ads.zzfjf.zzd(r3)
            java.io.File r3 = r7.zza
            r3.mkdirs()
            java.io.File r3 = r7.zza
            java.io.File r3 = com.google.android.gms.internal.ads.zzfjf.zzc(r0, r3)
            r3.mkdirs()
            java.io.File r3 = r7.zza
            java.lang.String r5 = "pcam.jar"
            java.io.File r3 = com.google.android.gms.internal.ads.zzfjf.zzb(r0, r5, r3)
            if (r1 == 0) goto L_0x004c
            int r6 = r1.length
            if (r6 <= 0) goto L_0x004c
            boolean r1 = com.google.android.gms.internal.ads.zzfjf.zze(r3, r1)
            if (r1 == 0) goto L_0x0185
        L_0x004c:
            java.io.File r1 = r7.zza
            java.lang.String r3 = "pcbc"
            java.io.File r0 = com.google.android.gms.internal.ads.zzfjf.zzb(r0, r3, r1)
            boolean r0 = com.google.android.gms.internal.ads.zzfjf.zze(r0, r2)
            if (r0 == 0) goto L_0x0185
            com.google.android.gms.internal.ads.zzasu r0 = r8.zzd()
            java.lang.String r0 = r0.zzk()
            java.io.File r1 = r7.zza
            java.io.File r0 = com.google.android.gms.internal.ads.zzfjf.zzb(r0, r5, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0078
            if (r9 == 0) goto L_0x0078
            boolean r9 = r9.zza(r0)
            if (r9 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            return r4
        L_0x0078:
            com.google.android.gms.internal.ads.zzasu r9 = r8.zzd()
            java.lang.String r9 = r9.zzk()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 1
            if (r0 == 0) goto L_0x008a
        L_0x0087:
            r8 = 0
            goto L_0x013f
        L_0x008a:
            java.io.File r0 = r7.zza
            java.io.File r0 = com.google.android.gms.internal.ads.zzfjf.zzb(r9, r5, r0)
            java.io.File r2 = r7.zza
            java.io.File r2 = com.google.android.gms.internal.ads.zzfjf.zzb(r9, r3, r2)
            java.io.File r6 = r7.zzd()
            java.io.File r5 = com.google.android.gms.internal.ads.zzfjf.zzb(r9, r5, r6)
            java.io.File r6 = r7.zzd()
            java.io.File r9 = com.google.android.gms.internal.ads.zzfjf.zzb(r9, r3, r6)
            boolean r3 = r0.exists()
            if (r3 == 0) goto L_0x00b3
            boolean r0 = r0.renameTo(r5)
            if (r0 != 0) goto L_0x00b3
            goto L_0x0087
        L_0x00b3:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0087
            boolean r9 = r2.renameTo(r9)
            if (r9 == 0) goto L_0x0087
            com.google.android.gms.internal.ads.zzast r9 = com.google.android.gms.internal.ads.zzasu.zze()
            com.google.android.gms.internal.ads.zzasu r0 = r8.zzd()
            java.lang.String r0 = r0.zzk()
            r9.zze(r0)
            com.google.android.gms.internal.ads.zzasu r0 = r8.zzd()
            java.lang.String r0 = r0.zzj()
            r9.zza(r0)
            com.google.android.gms.internal.ads.zzasu r0 = r8.zzd()
            long r2 = r0.zza()
            r9.zzb(r2)
            com.google.android.gms.internal.ads.zzasu r0 = r8.zzd()
            long r2 = r0.zzd()
            r9.zzd(r2)
            com.google.android.gms.internal.ads.zzasu r8 = r8.zzd()
            long r2 = r8.zzc()
            r9.zzc(r2)
            com.google.android.gms.internal.ads.zzgqm r8 = r9.zzal()
            com.google.android.gms.internal.ads.zzasu r8 = (com.google.android.gms.internal.ads.zzasu) r8
            com.google.android.gms.internal.ads.zzasu r9 = r7.zzb(r1)
            android.content.SharedPreferences r0 = r7.zzc
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r9 == 0) goto L_0x0129
            java.lang.String r2 = r8.zzk()
            java.lang.String r3 = r9.zzk()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0129
            java.lang.String r2 = r7.zze()
            byte[] r9 = r9.zzax()
            java.lang.String r9 = m5.j.a(r9)
            r0.putString(r2, r9)
        L_0x0129:
            java.lang.String r9 = r7.zzf()
            byte[] r8 = r8.zzax()
            java.lang.String r8 = m5.j.a(r8)
            r0.putString(r9, r8)
            boolean r8 = r0.commit()
            if (r8 == 0) goto L_0x0087
            r8 = 1
        L_0x013f:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            com.google.android.gms.internal.ads.zzasu r0 = r7.zzb(r1)
            if (r0 == 0) goto L_0x0151
            java.lang.String r0 = r0.zzk()
            r9.add(r0)
        L_0x0151:
            r0 = 2
            com.google.android.gms.internal.ads.zzasu r0 = r7.zzb(r0)
            if (r0 == 0) goto L_0x015f
            java.lang.String r0 = r0.zzk()
            r9.add(r0)
        L_0x015f:
            java.io.File r0 = r7.zzd()
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
        L_0x0168:
            if (r4 >= r1) goto L_0x0184
            r2 = r0[r4]
            java.lang.String r2 = r2.getName()
            boolean r3 = r9.contains(r2)
            if (r3 != 0) goto L_0x0181
            java.io.File r3 = r7.zzd()
            java.io.File r2 = com.google.android.gms.internal.ads.zzfjf.zzc(r2, r3)
            com.google.android.gms.internal.ads.zzfjf.zzd(r2)
        L_0x0181:
            int r4 = r4 + 1
            goto L_0x0168
        L_0x0184:
            return r8
        L_0x0185:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfje.zza(com.google.android.gms.internal.ads.zzasr, com.google.android.gms.internal.ads.zzfjk):boolean");
    }

    /* access modifiers changed from: package-private */
    public final zzasu zzb(int i10) {
        String str;
        if (i10 == 1) {
            str = this.zzc.getString(zzf(), (String) null);
        } else {
            str = this.zzc.getString(zze(), (String) null);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            zzasu zzh = zzasu.zzh(zzgpe.zzv(j.d(str)));
            String zzk = zzh.zzk();
            File zzb2 = zzfjf.zzb(zzk, "pcam.jar", zzd());
            if (!zzb2.exists()) {
                zzb2 = zzfjf.zzb(zzk, "pcam", zzd());
            }
            File zzb3 = zzfjf.zzb(zzk, "pcbc", zzd());
            if (!zzb2.exists() || !zzb3.exists()) {
                return null;
            }
            return zzh;
        } catch (zzgqy unused) {
        }
    }

    public final zzfjd zzc(int i10) {
        zzasu zzb2 = zzb(1);
        if (zzb2 == null) {
            return null;
        }
        String zzk = zzb2.zzk();
        File zzb3 = zzfjf.zzb(zzk, "pcam.jar", zzd());
        if (!zzb3.exists()) {
            zzb3 = zzfjf.zzb(zzk, "pcam", zzd());
        }
        return new zzfjd(zzb2, zzb3, zzfjf.zzb(zzk, "pcbc", zzd()), zzfjf.zzb(zzk, "pcopt", zzd()));
    }
}
