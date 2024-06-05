package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.util.q0;
import com.google.android.gms.common.internal.q;
import h5.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import m5.m;
import o5.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbvw implements zzbwb {
    public static final /* synthetic */ int zzb = 0;
    /* access modifiers changed from: private */
    public static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzgul zzd;
    private final LinkedHashMap zze;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Context zzh;
    private final zzbvy zzi;
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;
    private final zzbvx zzn;

    public zzbvw(Context context, zzbzg zzbzg, zzbvy zzbvy, String str, zzbvx zzbvx, byte[] bArr) {
        q.l(zzbvy, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzbvx;
        this.zzi = zzbvy;
        for (String lowerCase : zzbvy.zze) {
            this.zzk.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzgul zza2 = zzgvu.zza();
        zza2.zzn(9);
        zza2.zzj(str);
        zza2.zzh(str);
        zzgum zza3 = zzgun.zza();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zza3.zza(str2);
        }
        zza2.zzg((zzgun) zza3.zzal());
        zzgvp zza4 = zzgvq.zza();
        zza4.zzc(c.a(this.zzh).g());
        String str3 = zzbzg.zza;
        if (str3 != null) {
            zza4.zza(str3);
        }
        long b10 = (long) f.h().b(this.zzh);
        if (b10 > 0) {
            zza4.zzb(b10);
        }
        zza2.zzf((zzgvq) zza4.zzal());
        this.zzd = zza2;
    }

    public final zzbvy zza() {
        return this.zzi;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzb(Map map) throws Exception {
        zzfut zzl2;
        zzgvn zzgvn;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzgvn = (zzgvn) this.zze.get(str);
                            }
                            if (zzgvn == null) {
                                zzbwa.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                boolean z10 = false;
                                for (int i10 = 0; i10 < length; i10++) {
                                    zzgvn.zza(optJSONArray.getJSONObject(i10).getString("threat_type"));
                                }
                                boolean z11 = this.zza;
                                if (length > 0) {
                                    z10 = true;
                                }
                                this.zza = z10 | z11;
                            }
                        }
                    }
                }
            } catch (JSONException e10) {
                if (((Boolean) zzbcs.zzb.zze()).booleanValue()) {
                    zzbza.zzf("Failed to get SafeBrowsing metadata", e10);
                }
                return zzfuj.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z12 = this.zza;
        if ((!z12 || !this.zzi.zzg) && ((!this.zzm || !this.zzi.zzf) && (z12 || !this.zzi.zzd))) {
            return zzfuj.zzh((Object) null);
        }
        synchronized (this.zzj) {
            for (zzgvn zzal : this.zze.values()) {
                this.zzd.zzc((zzgvo) zzal.zzal());
            }
            this.zzd.zza(this.zzf);
            this.zzd.zzb(this.zzg);
            if (zzbwa.zzb()) {
                String zzl3 = this.zzd.zzl();
                String zzk2 = this.zzd.zzk();
                StringBuilder sb2 = new StringBuilder("Sending SB report\n  url: " + zzl3 + "\n  clickUrl: " + zzk2 + "\n  resources: \n");
                for (zzgvo zzgvo : this.zzd.zzm()) {
                    sb2.append("    [");
                    sb2.append(zzgvo.zza());
                    sb2.append("] ");
                    sb2.append(zzgvo.zze());
                }
                zzbwa.zza(sb2.toString());
            }
            byte[] zzax = ((zzgvu) this.zzd.zzal()).zzax();
            zzfut b10 = new q0(this.zzh).b(1, this.zzi.zzb, (Map) null, zzax);
            if (zzbwa.zzb()) {
                b10.zzc(zzbvr.zza, zzbzn.zza);
            }
            zzl2 = zzfuj.zzl(b10, zzbvs.zza, zzbzn.zzf);
        }
        return zzl2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(java.lang.String r7, java.util.Map r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.zzj
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x0009
            r2 = 1
            r6.zzm = r2     // Catch:{ all -> 0x00b9 }
        L_0x0009:
            java.util.LinkedHashMap r2 = r6.zze     // Catch:{ all -> 0x00b9 }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x00b9 }
            if (r2 == 0) goto L_0x0026
            if (r9 != r1) goto L_0x0024
            int r8 = com.google.android.gms.internal.ads.zzgvm.zza(r1)     // Catch:{ all -> 0x00b9 }
            if (r8 == 0) goto L_0x0024
            java.util.LinkedHashMap r9 = r6.zze     // Catch:{ all -> 0x00b9 }
            java.lang.Object r7 = r9.get(r7)     // Catch:{ all -> 0x00b9 }
            com.google.android.gms.internal.ads.zzgvn r7 = (com.google.android.gms.internal.ads.zzgvn) r7     // Catch:{ all -> 0x00b9 }
            r7.zze(r8)     // Catch:{ all -> 0x00b9 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x00b9 }
            return
        L_0x0026:
            com.google.android.gms.internal.ads.zzgvn r1 = com.google.android.gms.internal.ads.zzgvo.zzc()     // Catch:{ all -> 0x00b9 }
            int r9 = com.google.android.gms.internal.ads.zzgvm.zza(r9)     // Catch:{ all -> 0x00b9 }
            if (r9 == 0) goto L_0x0033
            r1.zze(r9)     // Catch:{ all -> 0x00b9 }
        L_0x0033:
            java.util.LinkedHashMap r9 = r6.zze     // Catch:{ all -> 0x00b9 }
            int r9 = r9.size()     // Catch:{ all -> 0x00b9 }
            r1.zzb(r9)     // Catch:{ all -> 0x00b9 }
            r1.zzd(r7)     // Catch:{ all -> 0x00b9 }
            com.google.android.gms.internal.ads.zzguy r9 = com.google.android.gms.internal.ads.zzgvb.zza()     // Catch:{ all -> 0x00b9 }
            java.util.HashSet r2 = r6.zzk     // Catch:{ all -> 0x00b9 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00b9 }
            if (r2 != 0) goto L_0x00a9
            if (r8 == 0) goto L_0x00a9
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x00b9 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00b9 }
        L_0x0055:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x00b9 }
            if (r2 == 0) goto L_0x00a9
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x00b9 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00b9 }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00b9 }
            if (r3 == 0) goto L_0x006e
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00b9 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00b9 }
            goto L_0x0070
        L_0x006e:
            java.lang.String r3 = ""
        L_0x0070:
            java.lang.Object r4 = r2.getValue()     // Catch:{ all -> 0x00b9 }
            if (r4 == 0) goto L_0x007d
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00b9 }
            goto L_0x007f
        L_0x007d:
            java.lang.String r2 = ""
        L_0x007f:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00b9 }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ all -> 0x00b9 }
            java.util.HashSet r5 = r6.zzk     // Catch:{ all -> 0x00b9 }
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x00b9 }
            if (r4 == 0) goto L_0x0055
            com.google.android.gms.internal.ads.zzguw r4 = com.google.android.gms.internal.ads.zzgux.zza()     // Catch:{ all -> 0x00b9 }
            com.google.android.gms.internal.ads.zzgpe r3 = com.google.android.gms.internal.ads.zzgpe.zzx(r3)     // Catch:{ all -> 0x00b9 }
            r4.zza(r3)     // Catch:{ all -> 0x00b9 }
            com.google.android.gms.internal.ads.zzgpe r2 = com.google.android.gms.internal.ads.zzgpe.zzx(r2)     // Catch:{ all -> 0x00b9 }
            r4.zzb(r2)     // Catch:{ all -> 0x00b9 }
            com.google.android.gms.internal.ads.zzgqm r2 = r4.zzal()     // Catch:{ all -> 0x00b9 }
            com.google.android.gms.internal.ads.zzgux r2 = (com.google.android.gms.internal.ads.zzgux) r2     // Catch:{ all -> 0x00b9 }
            r9.zza(r2)     // Catch:{ all -> 0x00b9 }
            goto L_0x0055
        L_0x00a9:
            com.google.android.gms.internal.ads.zzgqm r8 = r9.zzal()     // Catch:{ all -> 0x00b9 }
            com.google.android.gms.internal.ads.zzgvb r8 = (com.google.android.gms.internal.ads.zzgvb) r8     // Catch:{ all -> 0x00b9 }
            r1.zzc(r8)     // Catch:{ all -> 0x00b9 }
            java.util.LinkedHashMap r8 = r6.zze     // Catch:{ all -> 0x00b9 }
            r8.put(r7, r1)     // Catch:{ all -> 0x00b9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b9 }
            return
        L_0x00b9:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b9 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvw.zzd(java.lang.String, java.util.Map, int):void");
    }

    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            zzfut zzh2 = zzfuj.zzh(Collections.emptyMap());
            zzbvt zzbvt = new zzbvt(this);
            zzfuu zzfuu = zzbzn.zzf;
            zzfut zzm2 = zzfuj.zzm(zzh2, zzbvt, zzfuu);
            zzfut zzn2 = zzfuj.zzn(zzm2, 10, TimeUnit.SECONDS, zzbzn.zzd);
            zzfuj.zzq(zzm2, new zzbvv(this, zzn2), zzfuu);
            zzc.add(zzn2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgpb zzt = zzgpe.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzgul zzgul = this.zzd;
            zzgvg zza2 = zzgvi.zza();
            zza2.zza(zzt.zzb());
            zza2.zzb("image/png");
            zza2.zzc(2);
            zzgul.zzi((zzgvi) zza2.zzal());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0036 A[SYNTHETIC, Splitter:B:20:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbvy r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = r7.zzl
            if (r0 == 0) goto L_0x000c
            return
        L_0x000c:
            com.google.android.gms.ads.internal.t.r()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L_0x0014
            goto L_0x006d
        L_0x0014:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch:{ RuntimeException -> 0x002d }
            r8.setDrawingCacheEnabled(r0)     // Catch:{ RuntimeException -> 0x002d }
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch:{ RuntimeException -> 0x002d }
            if (r3 == 0) goto L_0x0026
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch:{ RuntimeException -> 0x002d }
            goto L_0x0027
        L_0x0026:
            r3 = r1
        L_0x0027:
            r8.setDrawingCacheEnabled(r2)     // Catch:{ RuntimeException -> 0x002b }
            goto L_0x0034
        L_0x002b:
            r2 = move-exception
            goto L_0x002f
        L_0x002d:
            r2 = move-exception
            r3 = r1
        L_0x002f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.internal.ads.zzbza.zzh(r4, r2)
        L_0x0034:
            if (r3 != 0) goto L_0x006c
            int r2 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0065 }
            int r3 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0065 }
            if (r2 == 0) goto L_0x005f
            if (r3 != 0) goto L_0x0043
            goto L_0x005f
        L_0x0043:
            int r4 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0065 }
            int r5 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch:{ RuntimeException -> 0x0065 }
            r5.<init>(r4)     // Catch:{ RuntimeException -> 0x0065 }
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch:{ RuntimeException -> 0x0065 }
            r8.draw(r5)     // Catch:{ RuntimeException -> 0x0065 }
            r1 = r4
            goto L_0x006d
        L_0x005f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.internal.ads.zzbza.zzj(r8)     // Catch:{ RuntimeException -> 0x0065 }
            goto L_0x006d
        L_0x0065:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.internal.ads.zzbza.zzh(r2, r8)
            goto L_0x006d
        L_0x006c:
            r1 = r3
        L_0x006d:
            if (r1 != 0) goto L_0x0075
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbwa.zza(r8)
            return
        L_0x0075:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbvu r8 = new com.google.android.gms.internal.ads.zzbvu
            r8.<init>(r7, r1)
            com.google.android.gms.ads.internal.util.b2.E(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvw.zzg(android.view.View):void");
    }

    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    public final boolean zzi() {
        return m.d() && this.zzi.zzc && !this.zzl;
    }
}
