package com.google.android.recaptcha.internal;

import fe.p;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzaz extends l implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzba zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzn zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzaz(zzba zzba, String str, zzn zzn, d dVar) {
        super(2, dVar);
        this.zzc = zzba;
        this.zzd = str;
        this.zze = zzn;
    }

    public final d create(Object obj, d dVar) {
        return new zzaz(this.zzc, this.zzd, this.zze, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaz) create((p0) obj, (d) obj2)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object c10 = d.c();
        int i10 = this.zzb;
        if (i10 == 0) {
            sd.p.b(obj);
            zzn zzn = new zzn();
            zzmp zzg = zzmp.zzg(zzeb.zzh().zzj(this.zzd));
            obj2 = zzn;
            zzdk zzb2 = zzdk.zzb();
            zzmh zzc2 = zzba.zzy(zzg.zzi(), zzg.zzj());
            zzb2.zzf();
            long zza2 = zzb2.zza(TimeUnit.MICROSECONDS);
            zzj zzj = zzj.zza;
            zzj.zza(zzl.zzm.zza(), zza2);
            zzba zzba = this.zzc;
            List zzi = zzc2.zzi();
            zzn zzn2 = this.zze;
            this.zza = zzn;
            this.zzb = 1;
            if (zzba.zzt(zzi, zzn2, zzn, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            sd.p.b(obj);
        } else {
            Object obj3 = this.zza;
            try {
                obj2 = obj3;
                sd.p.b(obj);
                obj2 = obj3;
            } catch (Exception e10) {
                zzba zzba2 = this.zzc;
                zzn zzn3 = this.zze;
                this.zza = null;
                this.zzb = 2;
                if (zzba2.zzu(e10, "recaptcha.m.Main.rge", zzn3, (zzn) obj2, 0, this) == c10) {
                    return c10;
                }
            }
        }
        return w.f38141a;
    }
}
