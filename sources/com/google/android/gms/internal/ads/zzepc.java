package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import o5.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzepc implements zzepn {
    private final zzfuu zza;
    private final Context zzb;
    private final zzbzg zzc;

    zzepc(zzfuu zzfuu, Context context, zzbzg zzbzg) {
        this.zza = zzfuu;
        this.zzb = context;
        this.zzc = zzbzg;
    }

    public final int zza() {
        return 35;
    }

    public final zzfut zzb() {
        return this.zza.zzb(new zzepb(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzepd zzc() throws Exception {
        int i10;
        boolean g10 = c.a(this.zzb).g();
        t.r();
        boolean a10 = b2.a(this.zzb);
        String str = this.zzc.zza;
        t.r();
        boolean b10 = b2.b();
        t.r();
        ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        if (applicationInfo == null) {
            i10 = 0;
        } else {
            i10 = applicationInfo.targetSdkVersion;
        }
        return new zzepd(g10, a10, str, b10, i10, DynamiteModule.c(this.zzb, ModuleDescriptor.MODULE_ID), DynamiteModule.a(this.zzb, ModuleDescriptor.MODULE_ID));
    }
}
