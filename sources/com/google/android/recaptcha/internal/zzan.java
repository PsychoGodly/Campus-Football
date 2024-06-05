package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import com.applovin.sdk.AppLovinErrorCodes;
import fe.p;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzan extends l implements p {
    final /* synthetic */ zzkx zza;
    final /* synthetic */ zzao zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzan(zzkx zzkx, zzao zzao, d dVar) {
        super(2, dVar);
        this.zza = zzkx;
        this.zzb = zzao;
    }

    public final d create(Object obj, d dVar) {
        return new zzan(this.zza, this.zzb, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzan) create((p0) obj, (d) obj2)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        w wVar;
        Object unused = d.c();
        sd.p.b(obj);
        zzkx zzkx = this.zza;
        zzao zzao = this.zzb;
        synchronized (zzaj.class) {
            byte[] zzd = zzkx.zzd();
            zzae zzae = new zzae(zzeb.zzg().zzi(zzd, 0, zzd.length), System.currentTimeMillis(), 0);
            zzad zza2 = zzao.zze;
            ContentValues contentValues = new ContentValues();
            contentValues.put("ss", zzae.zzc());
            contentValues.put("ts", Long.valueOf(zzae.zzb()));
            zza2.getWritableDatabase().insert("ce", (String) null, contentValues);
            int zzb2 = zzao.zze.zzb() + AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
            if (zzb2 > 0) {
                zzao.zze.zza(y.H(zzao.zze.zzd(), zzb2));
            }
            if (zzao.zze.zzb() >= 20) {
                zzao.zzg();
            }
            wVar = w.f38141a;
        }
        return wVar;
    }
}
