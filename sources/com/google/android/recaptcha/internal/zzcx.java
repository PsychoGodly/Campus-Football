package com.google.android.recaptcha.internal;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import sd.o;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzcx extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzda zzb;
    int zzc;
    zzda zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcx(zzda zzda, xd.d dVar) {
        super(dVar);
        this.zzb = zzda;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= RecyclerView.UNDEFINED_DURATION;
        Object zzg = this.zzb.zzg(this);
        return zzg == d.c() ? zzg : o.a(zzg);
    }
}
