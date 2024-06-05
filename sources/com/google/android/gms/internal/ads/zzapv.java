package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzapv extends zzapu {
    protected zzapv(Context context, String str, boolean z10) {
        super(context, str, z10);
    }

    public static zzapv zzt(String str, Context context, boolean z10) {
        zzapu.zzr(context, false);
        return new zzapv(context, str, false);
    }

    @Deprecated
    public static zzapv zzu(String str, Context context, boolean z10, int i10) {
        zzapu.zzr(context, z10);
        return new zzapv(context, str, z10);
    }

    /* access modifiers changed from: protected */
    public final List zzp(zzaqx zzaqx, Context context, zzamv zzamv, zzamo zzamo) {
        if (zzaqx.zzk() == null || !this.zzu) {
            return super.zzp(zzaqx, context, zzamv, (zzamo) null);
        }
        int zza = zzaqx.zza();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zzp(zzaqx, context, zzamv, (zzamo) null));
        arrayList.add(new zzarq(zzaqx, "uz1YArq5cHS8AYJUDc1zzIdIMbHyJKwb7tfYne2XDSTiUe1d6tP4aZb4XhmiO5Pa", "D14sOPs9bJ6lVOYt2Sp9xUGRfFtxk1j4Rj4Ydr//Mak=", zzamv, zza, 24));
        return arrayList;
    }
}
