package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.List;
import java.util.Timer;
import kotlin.jvm.internal.h;
import pe.c2;
import pe.p0;
import pe.r0;
import xd.d;
import xd.g;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzao implements zzaj {
    public static final zzak zza = new zzak((h) null);
    /* access modifiers changed from: private */
    public static Timer zzb;
    private final zzap zzc;
    /* access modifiers changed from: private */
    public final p0 zzd;
    /* access modifiers changed from: private */
    public final zzad zze;

    public /* synthetic */ zzao(Context context, zzap zzap, p0 p0Var, int i10, h hVar) {
        zzp zzp = zzp.zza;
        p0 zza2 = zzp.zza();
        this.zzc = zzap;
        this.zzd = zza2;
        zzad zzc2 = zzad.zzb;
        zzc2 = zzc2 == null ? new zzad(context, (h) null) : zzc2;
        zzad.zzb = zzc2;
        this.zze = zzc2;
        zzh();
    }

    /* access modifiers changed from: private */
    public final void zzg() {
        for (List<zzae> list : y.Q(this.zze.zzd(), 20, 20, true)) {
            zzkz zzf = zzla.zzf();
            for (zzae zzc2 : list) {
                zzf.zzd(zzkx.zzG(zzeb.zzg().zzj(zzc2.zzc())));
            }
            if (this.zzc.zza(((zzla) zzf.zzj()).zzd())) {
                for (zzae zzf2 : list) {
                    this.zze.zzf(zzf2);
                }
            }
        }
    }

    private final void zzh() {
        if (zzb == null) {
            Timer timer = new Timer();
            zzb = timer;
            timer.schedule(new zzal(this), 120000, 120000);
        }
    }

    public final void zzf(zzkx zzkx) {
        c2 unused = k.d(this.zzd, (g) null, (r0) null, new zzan(zzkx, this, (d) null), 3, (Object) null);
        zzh();
    }
}
