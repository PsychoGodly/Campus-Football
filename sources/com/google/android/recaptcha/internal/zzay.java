package com.google.android.recaptcha.internal;

import fe.p;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.a0;
import pe.p0;
import pe.q0;
import sd.w;
import xd.d;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzay extends l implements p {
    final /* synthetic */ Exception zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzn zzc;
    final /* synthetic */ zzn zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zzba zzf;
    private /* synthetic */ Object zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzay(Exception exc, int i10, zzn zzn, zzn zzn2, String str, zzba zzba, d dVar) {
        super(2, dVar);
        this.zza = exc;
        this.zzb = i10;
        this.zzc = zzn;
        this.zzd = zzn2;
        this.zze = str;
        this.zzf = zzba;
    }

    public final d create(Object obj, d dVar) {
        zzay zzay = new zzay(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, dVar);
        zzay.zzg = obj;
        return zzay;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzay) create((p0) obj, (d) obj2)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        zzmi zzmi;
        Object unused = d.c();
        sd.p.b(obj);
        p0 p0Var = (p0) this.zzg;
        Exception exc = this.zza;
        if (exc instanceof zzt) {
            zzmi = ((zzt) exc).zza();
            zzmi.zzd(this.zzb);
        } else {
            zzmi = zzmj.zzf();
            zzmi.zzd(this.zzb);
            zzmi.zzp(2);
            zzmi.zze(2);
        }
        zzmj zzmj = (zzmj) zzmi.zzj();
        zzmj.zzk();
        zzmj.zzj();
        a0.b(this.zza.getClass()).a();
        this.zza.getMessage();
        zzlg zza2 = zzar.zza(this.zzc, this.zzd);
        String str = this.zze;
        if (str.length() == 0) {
            str = "recaptcha.m.Main.rge";
        }
        if (q0.g(p0Var)) {
            zzba zzba = this.zzf;
            zzeb zzh = zzeb.zzh();
            byte[] zzd2 = zzmj.zzd();
            zzeb zzh2 = zzeb.zzh();
            byte[] zzd3 = zza2.zzd();
            zzba.zzv(str, zzh.zzi(zzd2, 0, zzd2.length), zzh2.zzi(zzd3, 0, zzd3.length));
        }
        return w.f38141a;
    }
}
