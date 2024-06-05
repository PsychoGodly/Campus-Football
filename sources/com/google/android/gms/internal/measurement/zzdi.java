package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzdf;
import r5.p;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.0 */
final class zzdi extends zzdf.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Context zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ zzdf zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdi(zzdf zzdf, String str, String str2, Context context, Bundle bundle) {
        super(zzdf);
        this.zzg = zzdf;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = bundle;
    }

    public final void zza() {
        String str;
        String str2;
        String str3;
        try {
            if (this.zzg.zzc(this.zzc, this.zzd)) {
                String str4 = this.zzd;
                str2 = this.zzc;
                str = str4;
                str3 = this.zzg.zzc;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            q.k(this.zze);
            zzdf zzdf = this.zzg;
            zzdf.zzj = zzdf.zza(this.zze, true);
            if (this.zzg.zzj == null) {
                Log.w(this.zzg.zzc, "Failed to connect to measurement client.");
                return;
            }
            int a10 = DynamiteModule.a(this.zze, ModuleDescriptor.MODULE_ID);
            int c10 = DynamiteModule.c(this.zze, ModuleDescriptor.MODULE_ID);
            ((zzcu) q.k(this.zzg.zzj)).initialize(b.B1(this.zze), new zzdd(82001, (long) Math.max(a10, c10), c10 < a10, str3, str2, str, this.zzf, p.a(this.zze)), this.zza);
        } catch (Exception e10) {
            this.zzg.zza(e10, true, false);
        }
    }
}
