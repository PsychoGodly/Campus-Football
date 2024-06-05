package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzart extends zzasm {
    private final Map zzi;
    private final View zzj;
    private final Context zzk;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzart(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11, Map map, View view, Context context) {
        super(zzaqx, "uJP+jOkstXYybMCjk2UNbhttr8UNt74vp0QYS1O6gudZhXLs5QWRNg4TXtm9Zlmd", "mdZYlvc02sSKOzn2zFon1K3MqwwFkSMjVA38SM16TyQ=", zzamv, i10, 85);
        this.zzi = map;
        this.zzj = view;
        this.zzk = context;
    }

    private final long zzc(int i10) {
        Map map = this.zzi;
        Integer valueOf = Integer.valueOf(i10);
        if (map.containsKey(valueOf)) {
            return ((Long) this.zzi.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Object[]} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r10 = this;
            r0 = 2
            long[] r1 = new long[r0]
            r2 = 1
            long r3 = r10.zzc(r2)
            r5 = 0
            r1[r5] = r3
            long r3 = r10.zzc(r0)
            r1[r2] = r3
            android.content.Context r3 = r10.zzk
            if (r3 != 0) goto L_0x001b
            com.google.android.gms.internal.ads.zzaqx r3 = r10.zzb
            android.content.Context r3 = r3.zzb()
        L_0x001b:
            java.lang.reflect.Method r4 = r10.zzf
            r6 = 0
            r7 = 3
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r5] = r1
            r8[r2] = r3
            android.view.View r1 = r10.zzj
            r8[r0] = r1
            java.lang.Object r1 = r4.invoke(r6, r8)
            long[] r1 = (long[]) r1
            r3 = r1[r5]
            java.util.Map r5 = r10.zzi
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r8 = r1[r2]
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r5.put(r6, r2)
            r5 = r1[r0]
            java.util.Map r2 = r10.zzi
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7 = r1[r7]
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r2.put(r0, r1)
            com.google.android.gms.internal.ads.zzamv r0 = r10.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzamv r1 = r10.zze     // Catch:{ all -> 0x0060 }
            r1.zzv(r3)     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.zzamv r1 = r10.zze     // Catch:{ all -> 0x0060 }
            r1.zzu(r5)     // Catch:{ all -> 0x0060 }
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x0060:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzart.zza():void");
    }
}
