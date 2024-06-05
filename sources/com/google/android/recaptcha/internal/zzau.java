package com.google.android.recaptcha.internal;

import fe.p;
import kotlin.jvm.internal.n;
import sd.w;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzau extends n implements p {
    final /* synthetic */ zzba zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzau(zzba zzba, String str, int i10) {
        super(2);
        this.zza = zzba;
        this.zzb = str;
        this.zzc = i10;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzv(this.zzb, (String) obj2);
        int i10 = this.zzc;
        if (i10 != -1) {
            this.zza.zzb().zzb().zzf(i10, objArr);
        }
        return w.f38141a;
    }
}
