package com.google.android.recaptcha.internal;

import java.util.Arrays;
import kotlin.jvm.internal.m;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzaf {
    private final zzkw zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze = null;

    public zzaf(zzkw zzkw, String str, String str2, String str3, String str4) {
        this.zza = zzkw;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaf)) {
            return false;
        }
        zzaf zzaf = (zzaf) obj;
        return zzaf.zza == this.zza && m.a(zzaf.zzb, this.zzb) && m.a(zzaf.zzc, this.zzc) && m.a(zzaf.zzd, this.zzd) && m.a((Object) null, (Object) null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, null});
    }

    public final zzkw zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
