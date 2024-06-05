package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaix {
    public final int zza;
    public final String zzb;
    public final List zzc;
    public final byte[] zzd;

    public zzaix(int i10, String str, List list, byte[] bArr) {
        List list2;
        this.zza = i10;
        this.zzb = str;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.zzc = list2;
        this.zzd = bArr;
    }
}
