package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
abstract class zzfof extends zzfna {
    final CharSequence zzb;
    final zzfng zzc;
    int zzd = 0;
    int zze;

    protected zzfof(zzfoh zzfoh, CharSequence charSequence) {
        this.zzc = zzfoh.zza;
        this.zze = a.e.API_PRIORITY_OTHER;
        this.zzb = charSequence;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        int i10;
        int i11 = this.zzd;
        while (true) {
            int i12 = this.zzd;
            if (i12 != -1) {
                int zzd2 = zzd(i12);
                if (zzd2 == -1) {
                    zzd2 = this.zzb.length();
                    this.zzd = -1;
                    i10 = -1;
                } else {
                    i10 = zzc(zzd2);
                    this.zzd = i10;
                }
                if (i10 == i11) {
                    int i13 = i10 + 1;
                    this.zzd = i13;
                    if (i13 > this.zzb.length()) {
                        this.zzd = -1;
                    }
                } else {
                    if (i11 < zzd2) {
                        this.zzb.charAt(i11);
                    }
                    if (i11 < zzd2) {
                        this.zzb.charAt(zzd2 - 1);
                    }
                    int i14 = this.zze;
                    if (i14 == 1) {
                        zzd2 = this.zzb.length();
                        this.zzd = -1;
                        if (zzd2 > i11) {
                            this.zzb.charAt(zzd2 - 1);
                        }
                    } else {
                        this.zze = i14 - 1;
                    }
                    return this.zzb.subSequence(i11, zzd2).toString();
                }
            } else {
                zzb();
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract int zzc(int i10);

    /* access modifiers changed from: package-private */
    public abstract int zzd(int i10);
}
