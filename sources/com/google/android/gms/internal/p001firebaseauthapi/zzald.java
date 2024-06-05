package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzald  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzald implements zzakl {
    private final zzakn zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzald(zzakn zzakn, String str, Object[] objArr) {
        this.zza = zzakn;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        char c10 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                c10 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            } else {
                this.zzd = c10 | (charAt2 << i10);
                return;
            }
        }
    }

    public final zzakn zza() {
        return this.zza;
    }

    public final zzaky zzb() {
        int i10 = this.zzd;
        if ((i10 & 1) != 0) {
            return zzaky.PROTO2;
        }
        if ((i10 & 4) == 4) {
            return zzaky.EDITIONS;
        }
        return zzaky.PROTO3;
    }

    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    /* access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }
}
