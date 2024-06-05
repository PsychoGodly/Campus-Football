package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzv extends d {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    /* synthetic */ Object zze;
    final /* synthetic */ zzw zzf;
    int zzg;
    zzw zzh;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzv(zzw zzw, xd.d dVar) {
        super(dVar);
        this.zzf = zzw;
    }

    public final Object invokeSuspend(Object obj) {
        this.zze = obj;
        this.zzg |= RecyclerView.UNDEFINED_DURATION;
        return this.zzf.zza((Application) null, (String) null, (zzr) null, (WebView) null, this);
    }
}
