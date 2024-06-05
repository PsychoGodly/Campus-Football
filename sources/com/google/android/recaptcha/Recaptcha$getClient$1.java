package com.google.android.recaptcha;

import android.app.Application;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import sd.o;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class Recaptcha$getClient$1 extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recaptcha$getClient$1(Recaptcha recaptcha, xd.d dVar) {
        super(dVar);
        this.zzb = recaptcha;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= RecyclerView.UNDEFINED_DURATION;
        Object r22 = this.zzb.m8getClient0E7RQCE((Application) null, (String) null, this);
        return r22 == d.c() ? r22 : o.a(r22);
    }
}
