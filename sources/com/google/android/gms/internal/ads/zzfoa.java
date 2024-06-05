package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class zzfoa extends zzfof {
    final /* synthetic */ zzfob zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfoa(zzfob zzfob, zzfoh zzfoh, CharSequence charSequence) {
        super(zzfoh, charSequence);
        this.zza = zzfob;
    }

    /* access modifiers changed from: package-private */
    public final int zzc(int i10) {
        return i10 + 1;
    }

    /* access modifiers changed from: package-private */
    public final int zzd(int i10) {
        zzfng zzfng = this.zza.zza;
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzfnu.zzb(i10, length, "index");
        while (i10 < length) {
            if (zzfng.zzb(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
