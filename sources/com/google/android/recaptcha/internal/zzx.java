package com.google.android.recaptcha.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.recaptcha.RecaptchaAction;
import kotlin.coroutines.jvm.internal.d;
import sd.o;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzx extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzaa zzb;
    int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzx(zzaa zzaa, xd.d dVar) {
        super(dVar);
        this.zzb = zzaa;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= RecyclerView.UNDEFINED_DURATION;
        Object r22 = this.zzb.m10executegIAlus((RecaptchaAction) null, this);
        return r22 == d.c() ? r22 : o.a(r22);
    }
}
