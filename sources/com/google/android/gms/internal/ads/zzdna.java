package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdna {
    private final Map zza = new HashMap();

    zzdna() {
    }

    public final synchronized zzdmz zza(String str) {
        return (zzdmz) this.zza.get(str);
    }

    public final zzdmz zzb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdmz zza2 = zza((String) it.next());
            if (zza2 != null) {
                return zza2;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.zzb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzc(java.lang.String r1) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzdmz r1 = r0.zza(r1)
            if (r1 == 0) goto L_0x0010
            com.google.android.gms.internal.ads.zzbpq r1 = r1.zzb
            if (r1 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            java.lang.String r1 = r1.toString()
            return r1
        L_0x0010:
            java.lang.String r1 = ""
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdna.zzc(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x003a */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0019 A[SYNTHETIC, Splitter:B:15:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzd(java.lang.String r7, com.google.android.gms.internal.ads.zzezs r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Map r0 = r6.zza     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.containsKey(r7)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r6)
            return
        L_0x000b:
            com.google.android.gms.internal.ads.zzdmz r0 = new com.google.android.gms.internal.ads.zzdmz     // Catch:{ all -> 0x0044 }
            r1 = 0
            if (r8 != 0) goto L_0x0012
        L_0x0010:
            r2 = r1
            goto L_0x0016
        L_0x0012:
            com.google.android.gms.internal.ads.zzbpq r2 = r8.zze()     // Catch:{ zzezc -> 0x0010 }
        L_0x0016:
            if (r8 != 0) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            com.google.android.gms.internal.ads.zzbpq r1 = r8.zzf()     // Catch:{ zzezc -> 0x001d }
        L_0x001d:
            com.google.android.gms.internal.ads.zzbaj r3 = com.google.android.gms.internal.ads.zzbar.zziA     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzbap r4 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x0044 }
            java.lang.Object r3 = r4.zzb(r3)     // Catch:{ all -> 0x0044 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0044 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0044 }
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0033
        L_0x0031:
            r4 = 1
            goto L_0x003a
        L_0x0033:
            if (r8 != 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            r8.zzC()     // Catch:{ zzezc -> 0x003a }
            goto L_0x0031
        L_0x003a:
            r0.<init>(r7, r2, r1, r4)     // Catch:{ all -> 0x0044 }
            java.util.Map r8 = r6.zza     // Catch:{ all -> 0x0044 }
            r8.put(r7, r0)     // Catch:{ all -> 0x0044 }
            monitor-exit(r6)
            return
        L_0x0044:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdna.zzd(java.lang.String, com.google.android.gms.internal.ads.zzezs):void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zze(String str, zzbpc zzbpc) {
        if (!this.zza.containsKey(str)) {
            try {
                this.zza.put(str, new zzdmz(str, zzbpc.zzf(), zzbpc.zzg(), true));
            } catch (Throwable unused) {
            }
        }
    }
}
