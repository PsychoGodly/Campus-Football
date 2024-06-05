package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzggo {
    private ArrayList zza = new ArrayList();
    private zzggl zzb = zzggl.zza;
    private Integer zzc = null;

    public final zzggo zza(zzfwg zzfwg, int i10, String str, String str2) {
        ArrayList arrayList = this.zza;
        if (arrayList != null) {
            arrayList.add(new zzggq(zzfwg, i10, str, str2, (zzggp) null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    public final zzggo zzb(zzggl zzggl) {
        if (this.zza != null) {
            this.zzb = zzggl;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zzggo zzc(int i10) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i10);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zzggs zzd() throws GeneralSecurityException {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.zza;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int zza2 = ((zzggq) arrayList.get(i10)).zza();
                    i10++;
                    if (zza2 == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zzggs zzggs = new zzggs(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, (zzggr) null);
            this.zza = null;
            return zzggs;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
