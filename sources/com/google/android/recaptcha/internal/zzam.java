package com.google.android.recaptcha.internal;

import fe.p;
import java.util.Timer;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzam extends l implements p {
    final /* synthetic */ zzao zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzam(zzao zzao, d dVar) {
        super(2, dVar);
        this.zza = zzao;
    }

    public final d create(Object obj, d dVar) {
        return new zzam(this.zza, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((p0) obj, (d) obj2)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        w wVar;
        Object unused = d.c();
        sd.p.b(obj);
        zzao zzao = this.zza;
        synchronized (zzaj.class) {
            if (zzao.zze.zzb() == 0) {
                Timer zzb = zzao.zzb;
                if (zzb != null) {
                    zzb.cancel();
                }
                zzao.zzb = null;
            }
            zzao.zzg();
            wVar = w.f38141a;
        }
        return wVar;
    }
}
