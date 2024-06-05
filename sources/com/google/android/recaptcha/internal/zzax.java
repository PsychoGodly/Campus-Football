package com.google.android.recaptcha.internal;

import fe.p;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import pe.q0;
import sd.w;
import xd.d;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzax extends l implements p {
    int zza;
    final /* synthetic */ zzba zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzn zzd;
    final /* synthetic */ zzn zze;
    private /* synthetic */ Object zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzax(zzba zzba, List list, zzn zzn, zzn zzn2, d dVar) {
        super(2, dVar);
        this.zzb = zzba;
        this.zzc = list;
        this.zzd = zzn;
        this.zze = zzn2;
    }

    public final d create(Object obj, d dVar) {
        zzax zzax = new zzax(this.zzb, this.zzc, this.zzd, this.zze, dVar);
        zzax.zzf = obj;
        return zzax;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzax) create((p0) obj, (d) obj2)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.zza;
        sd.p.b(obj);
        if (i10 == 0) {
            p0 p0Var = (p0) this.zzf;
            zzbl zzbl = new zzbl(this.zzb.zzb());
            zzdk zzb2 = zzdk.zzb();
            while (zzbl.zzb() >= 0 && zzbl.zzb() < this.zzc.size() && q0.g(p0Var)) {
                zzmv zzmv = (zzmv) this.zzc.get(zzbl.zzb());
                try {
                    int zzk = zzmv.zzk();
                    int zzg = zzmv.zzg();
                    List zzj = zzmv.zzj();
                    if (!this.zzb.zzw(zzmv, zzbl)) {
                        zzdk zzb3 = zzdk.zzb();
                        int i11 = zzk - 2;
                        if (i11 == 7) {
                            zzba.zzo(this.zzb, zzg, zzj);
                        } else if (i11 == 15) {
                            zzba.zzi(this.zzb, zzj);
                        } else if (i11 == 30) {
                            zzba.zzh(this.zzb, zzg, zzj);
                        } else if (i11 != 40) {
                            switch (i11) {
                                case 10:
                                    zzba.zzm(this.zzb, zzg, zzj);
                                    break;
                                case 11:
                                    zzba.zzn(this.zzb, zzg, zzj);
                                    break;
                                case 12:
                                    zzba.zzp(this.zzb, zzj);
                                    break;
                                case 13:
                                    zzba.zzq(this.zzb, zzj);
                                    break;
                                default:
                                    switch (i11) {
                                        case 18:
                                            zzba.zzk(this.zzb, zzg, zzj);
                                            break;
                                        case 19:
                                            zzba.zzl(this.zzb, zzg, zzj);
                                            break;
                                        case 20:
                                            zzba.zzj(this.zzb, zzj);
                                            break;
                                        default:
                                            throw new zzt(5, 2, (Throwable) null);
                                    }
                            }
                        } else {
                            zzba.zzr(this.zzb, this.zzd, zzg, zzj);
                        }
                        zzb3.zzf();
                        long zza2 = zzb3.zza(TimeUnit.MICROSECONDS);
                        zzj zzj2 = zzj.zza;
                        zzj.zza(zzms.zza(zzk), zza2);
                        b.d(zza2);
                        b.c(zzg);
                        String unused = y.y(zzj, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new zzaw(this.zzb), 31, (Object) null);
                        zzbl.zzg(zzbl.zzb() + 1);
                    }
                } catch (Exception e10) {
                    zzba zzba = this.zzb;
                    String zzd2 = zzbl.zzd();
                    zzn zzn = this.zzd;
                    zzn zzn2 = this.zze;
                    int zzb4 = zzbl.zzb();
                    this.zza = 1;
                    if (zzba.zzu(e10, zzd2, zzn, zzn2, zzb4, this) == c10) {
                        return c10;
                    }
                }
            }
            zzb2.zzf();
            b.d(zzb2.zza(TimeUnit.MICROSECONDS));
            return w.f38141a;
        }
        return w.f38141a;
    }
}
