package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzftt extends zzfti {
    private List zza;

    zzftt(zzfqf zzfqf, boolean z10) {
        super(zzfqf, true, true);
        List list;
        if (zzfqf.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = zzfqy.zza(zzfqf.size());
        }
        for (int i10 = 0; i10 < zzfqf.size(); i10++) {
            list.add((Object) null);
        }
        this.zza = list;
    }

    /* access modifiers changed from: package-private */
    public abstract Object zzH(List list);

    /* access modifiers changed from: package-private */
    public final void zzg(int i10, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i10, new zzfts(obj));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzv() {
        List list = this.zza;
        if (list != null) {
            zzd(zzH(list));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzz(int i10) {
        super.zzz(i10);
        this.zza = null;
    }
}
