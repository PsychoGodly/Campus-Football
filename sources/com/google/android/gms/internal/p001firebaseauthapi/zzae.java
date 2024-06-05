package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzae  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
abstract class zzae extends zzi<String> {
    final CharSequence zza;
    private final zzj zzb;
    private final boolean zzc;
    private int zzd = 0;
    private int zze;

    protected zzae(zzab zzab, CharSequence charSequence) {
        this.zzb = zzab.zza;
        this.zzc = false;
        this.zze = zzab.zzd;
        this.zza = charSequence;
    }

    /* access modifiers changed from: package-private */
    public abstract int zza(int i10);

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zza() {
        int i10;
        int i11 = this.zzd;
        while (true) {
            int i12 = this.zzd;
            if (i12 != -1) {
                int zzb2 = zzb(i12);
                if (zzb2 == -1) {
                    zzb2 = this.zza.length();
                    this.zzd = -1;
                } else {
                    this.zzd = zza(zzb2);
                }
                int i13 = this.zzd;
                if (i13 == i11) {
                    int i14 = i13 + 1;
                    this.zzd = i14;
                    if (i14 > this.zza.length()) {
                        this.zzd = -1;
                    }
                } else {
                    while (i11 < zzb2 && this.zzb.zza(this.zza.charAt(i11))) {
                        i11++;
                    }
                    while (i10 > i11 && this.zzb.zza(this.zza.charAt(i10 - 1))) {
                        zzb2 = i10 - 1;
                    }
                    int i15 = this.zze;
                    if (i15 == 1) {
                        i10 = this.zza.length();
                        this.zzd = -1;
                        while (i10 > i11 && this.zzb.zza(this.zza.charAt(i10 - 1))) {
                            i10--;
                        }
                    } else {
                        this.zze = i15 - 1;
                    }
                    return this.zza.subSequence(i11, i10).toString();
                }
            } else {
                zzb();
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract int zzb(int i10);
}
