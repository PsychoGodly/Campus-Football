package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzflg extends zzflz {
    private final IBinder zza;
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final String zzf;

    /* synthetic */ zzflg(IBinder iBinder, boolean z10, String str, int i10, float f10, int i11, String str2, int i12, String str3, zzflf zzflf) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = f10;
        this.zze = i12;
        this.zzf = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        r1 = r4.zzf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.zzflz
            r2 = 0
            if (r1 == 0) goto L_0x006c
            com.google.android.gms.internal.ads.zzflz r5 = (com.google.android.gms.internal.ads.zzflz) r5
            android.os.IBinder r1 = r4.zza
            android.os.IBinder r3 = r5.zze()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006c
            r5.zzi()
            java.lang.String r1 = r4.zzb
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = r5.zzg()
            if (r1 != 0) goto L_0x006c
            goto L_0x002f
        L_0x0025:
            java.lang.String r3 = r5.zzg()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006c
        L_0x002f:
            int r1 = r4.zzc
            int r3 = r5.zzc()
            if (r1 != r3) goto L_0x006c
            float r1 = r4.zzd
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r5.zza()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L_0x006c
            r5.zzb()
            r5.zzh()
            int r1 = r4.zze
            int r3 = r5.zzd()
            if (r1 != r3) goto L_0x006c
            java.lang.String r1 = r4.zzf
            if (r1 != 0) goto L_0x0060
            java.lang.String r5 = r5.zzf()
            if (r5 != 0) goto L_0x006c
            goto L_0x006b
        L_0x0060:
            java.lang.String r5 = r5.zzf()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            return r0
        L_0x006c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzflg.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int i11 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int floatToIntBits = ((((((((((hashCode * 1000003) ^ 1237) * 1000003) ^ i10) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd)) * 583896283) ^ this.zze) * 1000003;
        String str2 = this.zzf;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return floatToIntBits ^ i11;
    }

    public final String toString() {
        String obj = this.zza.toString();
        String str = this.zzb;
        int i10 = this.zzc;
        float f10 = this.zzd;
        int i11 = this.zze;
        String str2 = this.zzf;
        return "OverlayDisplayShowRequest{windowToken=" + obj + ", stableSessionToken=false, appId=" + str + ", layoutGravity=" + i10 + ", layoutVerticalMargin=" + f10 + ", displayMode=0, sessionToken=null, windowWidthPx=" + i11 + ", adFieldEnifd=" + str2 + "}";
    }

    public final float zza() {
        return this.zzd;
    }

    public final int zzb() {
        return 0;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zze;
    }

    public final IBinder zze() {
        return this.zza;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzb;
    }

    public final String zzh() {
        return null;
    }

    public final boolean zzi() {
        return false;
    }
}
