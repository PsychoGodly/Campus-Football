package com.google.android.recaptcha.internal;

import android.os.Build;
import fe.p;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.l;
import pe.c2;
import pe.p0;
import pe.r0;
import pe.x;
import sd.o;
import sd.w;
import xd.d;
import xd.g;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzcz extends l implements p {
    int zza;
    final /* synthetic */ zzda zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcz(zzda zzda, d dVar) {
        super(2, dVar);
        this.zzb = zzda;
    }

    public final d create(Object obj, d dVar) {
        return new zzcz(this.zzb, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcz) create((p0) obj, (d) obj2)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.zza;
        sd.p.b(obj);
        if (i10 == 0) {
            zzu zzu = zzu.zza;
            String zza2 = zzu.zza(this.zzb.zze);
            String zzj = this.zzb.zzd;
            String packageName = this.zzb.zze.getPackageName();
            String zzi = this.zzb.zzh;
            int i11 = Build.VERSION.SDK_INT;
            String encode = URLEncoder.encode(zzj, "UTF-8");
            String encode2 = URLEncoder.encode(packageName, "UTF-8");
            String encode3 = URLEncoder.encode(zza2, "UTF-8");
            String encode4 = URLEncoder.encode("18.1.2", "UTF-8");
            String encode5 = URLEncoder.encode(zzi, "UTF-8");
            byte[] bytes = ("k=" + encode + "&pk=" + encode2 + "&mst=" + encode3 + "&msv=" + encode4 + "&msi=" + encode5 + "&mov=" + i11).getBytes(Charset.forName("UTF-8"));
            zzai zzai = zzai.zza;
            zzai.zzc(new zzaf(zzkw.INIT_NATIVE, this.zzb.zzg, this.zzb.zzh, this.zzb.zzh, (String) null), this.zzb.zze, this.zzb.zzf);
            zzai.zzb(new zzaf(zzkw.INIT_NETWORK, this.zzb.zzg, this.zzb.zzh, this.zzb.zzh, (String) null), this.zzb.zzd, new zzs());
            zzp zzp = zzp.zza;
            c2 unused = k.d(zzp.zza(), (g) null, (r0) null, new zzcy(this.zzb, zza2, (d) null), 3, (Object) null);
            this.zzb.zzn.zzd();
            this.zzb.zzn.zze();
            zzda zzda = this.zzb;
            zzda.zzb().postUrl(zzda.zzf.zza(), bytes);
            b.c(this.zzb.zzm().hashCode());
            x zzm = this.zzb.zzm();
            this.zza = 1;
            if (zzm.E0(this) == c10) {
                return c10;
            }
        }
        return o.a(o.b(w.f38141a));
    }
}
