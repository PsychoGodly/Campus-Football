package com.google.android.recaptcha.internal;

import android.webkit.ValueCallback;
import fe.p;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzbb extends l implements p {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzbc zzb;
    final /* synthetic */ String zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbb(String[] strArr, zzbc zzbc, String str, d dVar) {
        super(2, dVar);
        this.zza = strArr;
        this.zzb = zzbc;
        this.zzc = str;
    }

    public final d create(Object obj, d dVar) {
        return new zzbb(this.zza, this.zzb, this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbb) create((p0) obj, (d) obj2)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        sd.p.b(obj);
        ArrayList arrayList = new ArrayList(r1);
        for (String str : this.zza) {
            arrayList.add("\"" + str + "\"");
        }
        this.zzb.zza.evaluateJavascript(this.zzc + "(" + y.y(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (fe.l) null, 62, (Object) null) + ")", (ValueCallback) null);
        return w.f38141a;
    }
}
