package com.google.android.recaptcha.internal;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.recaptcha.RecaptchaAction;
import fe.p;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzcw extends l implements p {
    Object zza;
    Object zzb;
    Object zzc;
    int zzd;
    final /* synthetic */ RecaptchaAction zze;
    final /* synthetic */ zzda zzf;
    final /* synthetic */ String zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcw(RecaptchaAction recaptchaAction, zzda zzda, String str, d dVar) {
        super(2, dVar);
        this.zze = recaptchaAction;
        this.zzf = zzda;
        this.zzg = str;
    }

    public final d create(Object obj, d dVar) {
        return new zzcw(this.zze, this.zzf, this.zzg, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcw) create((p0) obj, (d) obj2)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.zzd;
        sd.p.b(obj);
        if (i10 == 0) {
            zzda zzda = this.zzf;
            String str = this.zzg;
            RecaptchaAction recaptchaAction = this.zze;
            this.zza = zzda;
            this.zzb = str;
            this.zzc = recaptchaAction;
            this.zzd = 1;
            pe.p pVar = new pe.p(c.b(this), 1);
            pVar.C();
            zzda.zzk.put(str, pVar);
            zzma zzf2 = zzmb.zzf();
            zzf2.zze(str);
            zzf2.zzd(recaptchaAction.getAction());
            byte[] zzd2 = ((zzmb) zzf2.zzj()).zzd();
            String zzi = zzeb.zzh().zzi(zzd2, 0, zzd2.length);
            zzai zzai = zzai.zza;
            zzai.zzc(new zzaf(zzkw.EXECUTE_NATIVE, zzda.zzg, zzda.zzh, str, (String) null), zzda.zze, zzda.zzf);
            WebView zzb2 = zzda.zzb();
            zzb2.evaluateJavascript("recaptcha.m.Main.execute(\"" + zzi + "\")", (ValueCallback) null);
            obj = pVar.z();
            if (obj == d.c()) {
                h.c(this);
            }
            if (obj == c10) {
                return c10;
            }
        }
        return obj;
    }
}
