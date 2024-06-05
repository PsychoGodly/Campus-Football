package com.google.android.recaptcha.internal;

import android.webkit.JavascriptInterface;
import java.util.concurrent.TimeUnit;
import pe.o;
import sd.o;
import sd.p;
import sd.w;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzcu {
    final /* synthetic */ zzda zza;
    private Long zzb;
    private final zzdk zzc = zzdk.zzb();

    public zzcu(zzda zzda) {
        this.zza = zzda;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzoed(String str) {
        zzb();
        zzlz zzg = zzlz.zzg(zzeb.zzh().zzj(str));
        zzg.zzi().name();
        zzg.zzk();
        o oVar = (o) this.zza.zzk.remove(zzg.zzj());
        String zzk = zzg.zzk();
        if (zzk == null || zzk.length() == 0) {
            zzg.zzi().name();
            zzg zzg2 = zzh.zza;
            zzh zza2 = zzg.zza(zzg.zzi());
            zzg.zzj();
            if (oVar != null) {
                o.a aVar = sd.o.f38128b;
                oVar.resumeWith(sd.o.b(p.a(zza2)));
            }
        } else if (oVar != null) {
            oVar.resumeWith(sd.o.b(zzg.zzk()));
        }
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzmd zzg = zzmd.zzg(zzeb.zzh().zzj(str));
        zzg.zzi().name();
        if (zzg.zzi() == zzmf.JS_CODE_SUCCESS) {
            this.zza.zzm().hashCode();
            if (!this.zza.zzm().n0(w.f38141a)) {
                this.zza.zzm().hashCode();
                return;
            }
            return;
        }
        zzg.zzi().name();
        zzg zzg2 = zzh.zza;
        zzh zza2 = zzg.zza(zzg.zzi());
        this.zza.zzm().hashCode();
        this.zza.zzm().l0(zza2);
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        this.zza.zzd().zza(str);
    }
}
