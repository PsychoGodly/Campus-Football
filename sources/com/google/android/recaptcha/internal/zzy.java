package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import fe.p;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.o;
import sd.w;
import xd.d;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzy extends l implements p {
    int zza;
    final /* synthetic */ zzaa zzb;
    final /* synthetic */ RecaptchaAction zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzy(zzaa zzaa, RecaptchaAction recaptchaAction, d dVar) {
        super(2, dVar);
        this.zzb = zzaa;
        this.zzc = recaptchaAction;
    }

    public final d create(Object obj, d dVar) {
        return new zzy(this.zzb, this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzy) create((p0) obj, (d) obj2)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object c10 = d.c();
        int i10 = this.zza;
        sd.p.b(obj);
        if (i10 != 0) {
            obj2 = ((o) obj).i();
        } else {
            zzda zzb2 = this.zzb.zzb();
            RecaptchaAction recaptchaAction = this.zzc;
            this.zza = 1;
            obj2 = zzb2.zzf(recaptchaAction, this);
            if (obj2 == c10) {
                return c10;
            }
        }
        return o.a(obj2);
    }
}
