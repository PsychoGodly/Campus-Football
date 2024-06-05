package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzrt {
    private ArrayList<zzrs> zza = new ArrayList<>();
    private zzrn zzb = zzrn.zza;
    private Integer zzc = null;

    public final zzrt zza(zzbv zzbv, int i10, String str, String str2) {
        ArrayList<zzrs> arrayList = this.zza;
        if (arrayList != null) {
            arrayList.add(new zzrs(zzbv, i10, str, str2));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    public final zzrt zza(zzrn zzrn) {
        if (this.zza != null) {
            this.zzb = zzrn;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zzrt zza(int i10) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i10);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zzrq zza() throws GeneralSecurityException {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList<zzrs> arrayList = this.zza;
                int size = arrayList.size();
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    zzrs zzrs = arrayList.get(i10);
                    i10++;
                    if (zzrs.zza() == intValue) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    throw new GeneralSecurityException("primary key ID is not present in entries");
                }
            }
            zzrq zzrq = new zzrq(this.zzb, Collections.unmodifiableList(this.zza), this.zzc);
            this.zza = null;
            return zzrq;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
