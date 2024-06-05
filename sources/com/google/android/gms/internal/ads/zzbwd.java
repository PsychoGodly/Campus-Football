package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.p1;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbwd implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final p1 zzc;
    private final zzbxf zzd;
    private String zze = "-1";
    private int zzf = -1;

    zzbwd(Context context, p1 p1Var, zzbxf zzbxf) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = p1Var;
        this.zza = context;
        this.zzd = zzbxf;
    }

    private final void zzb(String str, int i10) {
        Context context;
        boolean z10 = false;
        if (!((Boolean) a0.c().zzb(zzbar.zzat)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i10 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z10 = true;
        }
        if (((Boolean) a0.c().zzb(zzbar.zzar)).booleanValue()) {
            this.zzc.f(z10);
            if (((Boolean) a0.c().zzb(zzbar.zzfL)).booleanValue() && z10 && (context = this.zza) != null) {
                context.deleteDatabase("OfflineUpload.db");
            }
        }
        if (((Boolean) a0.c().zzb(zzbar.zzam)).booleanValue()) {
            this.zzd.zzt();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzav
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "-1"
            java.lang.String r2 = "IABTCF_PurposeConsents"
            r3 = 1
            r4 = -1
            java.lang.String r5 = "gad_has_consent_for_cookies"
            if (r0 == 0) goto L_0x007d
            boolean r0 = com.google.android.gms.internal.ads.zzbwc.zza(r10, r5)
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.zzbaj r10 = com.google.android.gms.internal.ads.zzbar.zzat
            com.google.android.gms.internal.ads.zzbap r0 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r10 = r0.zzb(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x0033
            return
        L_0x0033:
            int r9 = r9.getInt(r5, r4)
            com.google.android.gms.ads.internal.util.p1 r10 = r8.zzc
            int r10 = r10.zzb()
            if (r9 == r10) goto L_0x0044
            com.google.android.gms.ads.internal.util.p1 r10 = r8.zzc
            r10.f(r3)
        L_0x0044:
            com.google.android.gms.ads.internal.util.p1 r10 = r8.zzc
            r10.p(r9)
            return
        L_0x004a:
            java.lang.String r0 = "IABTCF_gdprApplies"
            boolean r0 = com.google.android.gms.internal.ads.zzbwc.zza(r10, r0)
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = "IABTCF_TCString"
            boolean r0 = com.google.android.gms.internal.ads.zzbwc.zza(r10, r0)
            if (r0 != 0) goto L_0x0060
            boolean r0 = com.google.android.gms.internal.ads.zzbwc.zza(r10, r2)
            if (r0 == 0) goto L_0x00df
        L_0x0060:
            java.lang.String r9 = r9.getString(r10, r1)
            if (r9 == 0) goto L_0x0077
            com.google.android.gms.ads.internal.util.p1 r0 = r8.zzc
            java.lang.String r0 = r0.zzn(r10)
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0077
            com.google.android.gms.ads.internal.util.p1 r0 = r8.zzc
            r0.f(r3)
        L_0x0077:
            com.google.android.gms.ads.internal.util.p1 r0 = r8.zzc
            r0.n(r10, r9)
            return
        L_0x007d:
            java.lang.String r0 = r9.getString(r2, r1)
            int r9 = r9.getInt(r5, r4)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r6 = r10.hashCode()
            r7 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            if (r6 == r7) goto L_0x00a0
            r2 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r6 == r2) goto L_0x0098
            goto L_0x00a8
        L_0x0098:
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L_0x00a8
            r10 = 1
            goto L_0x00a9
        L_0x00a0:
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x00a8
            r10 = 0
            goto L_0x00a9
        L_0x00a8:
            r10 = -1
        L_0x00a9:
            if (r10 == 0) goto L_0x00cc
            if (r10 == r3) goto L_0x00ae
            return
        L_0x00ae:
            com.google.android.gms.internal.ads.zzbaj r10 = com.google.android.gms.internal.ads.zzbar.zzat
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r10 = r1.zzb(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00df
            if (r9 == r4) goto L_0x00df
            int r10 = r8.zzf
            if (r10 == r9) goto L_0x00df
            r8.zzf = r9
            r8.zzb(r0, r9)
            return
        L_0x00cc:
            boolean r10 = r0.equals(r1)
            if (r10 != 0) goto L_0x00df
            java.lang.String r10 = r8.zze
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x00df
            r8.zze = r0
            r8.zzb(r0, r9)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwd.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        this.zzb.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.zzb, "gad_has_consent_for_cookies");
        if (((Boolean) a0.c().zzb(zzbar.zzav)).booleanValue()) {
            onSharedPreferenceChanged(this.zzb, "IABTCF_gdprApplies");
            onSharedPreferenceChanged(this.zzb, "IABTCF_TCString");
            return;
        }
        onSharedPreferenceChanged(this.zzb, "IABTCF_PurposeConsents");
    }
}
