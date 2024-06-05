package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.appset.zze;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h5.f;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class zzp extends e<a.d.c> implements AppSetIdClient {
    private static final a.g<zzd> zza;
    private static final a.C0154a<zzd, a.d.c> zzb;
    private static final a<a.d.c> zzc;
    private final Context zzd;
    private final f zze;

    static {
        a.g<zzd> gVar = new a.g<>();
        zza = gVar;
        zzn zzn = new zzn();
        zzb = zzn;
        zzc = new a<>("AppSet.API", zzn, gVar);
    }

    zzp(Context context, f fVar) {
        super(context, zzc, a.d.f15024a, e.a.f15026c);
        this.zzd = context;
        this.zze = fVar;
    }

    public final Task<AppSetIdInfo> getAppSetIdInfo() {
        if (this.zze.j(this.zzd, 212800000) != 0) {
            return Tasks.forException(new b(new Status(17)));
        }
        return doRead(s.a().d(zze.zza).b(new zzm(this)).c(false).e(27601).a());
    }
}
