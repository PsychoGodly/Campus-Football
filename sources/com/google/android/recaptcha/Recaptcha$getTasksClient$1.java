package com.google.android.recaptcha;

import android.app.Application;
import android.webkit.WebView;
import com.google.android.recaptcha.internal.zzaa;
import com.google.android.recaptcha.internal.zzr;
import com.google.android.recaptcha.internal.zzw;
import fe.p;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.h;
import pe.p0;
import sd.w;
import xd.d;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class Recaptcha$getTasksClient$1 extends l implements p<p0, d<? super zzaa>, Object> {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recaptcha$getTasksClient$1(Application application, String str, d dVar) {
        super(2, dVar);
        this.zzb = application;
        this.zzc = str;
    }

    public final d create(Object obj, d dVar) {
        return new Recaptcha$getTasksClient$1(this.zzb, this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((Recaptcha$getTasksClient$1) create((p0) obj, (d) obj2)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.zza;
        sd.p.b(obj);
        if (i10 == 0) {
            zzw zzw = zzaa.zza;
            Application application = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzw.zza(application, str, new zzr((String) null, 0, 0, 7, (h) null), (WebView) null, this);
            if (obj == c10) {
                return c10;
            }
        }
        return obj;
    }
}
