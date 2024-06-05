package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.ads.internal.client.a0;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzasj extends zzasm {
    private final View zzi;

    public zzasj(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11, View view) {
        super(zzaqx, "5jsrpffMyqRCbSKE996yDJ4IoI5qc646KRWjOLMSbw18UnvhA6jyNpaXxK5q8Rhj", "83UKU58KVDl1XjXA/sXoYfPwdBBAdREF/fSwIBsg4EE=", zzamv, i10, 57);
        this.zzi = view;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) a0.c().zzb(zzbar.zzcV);
            Boolean bool2 = (Boolean) a0.c().zzb(zzbar.zzjl);
            DisplayMetrics displayMetrics = this.zzb.zzb().getResources().getDisplayMetrics();
            zzarc zzarc = new zzarc((String) this.zzf.invoke((Object) null, new Object[]{this.zzi, displayMetrics, bool, bool2}));
            zzanq zza = zzanr.zza();
            zza.zzb(zzarc.zza.longValue());
            zza.zzd(zzarc.zzb.longValue());
            zza.zze(zzarc.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzarc.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzarc.zzd.longValue());
            }
            this.zze.zzY((zzanr) zza.zzal());
        }
    }
}
