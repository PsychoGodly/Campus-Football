package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzdhh implements zzbdk {
    final /* synthetic */ zzdie zza;
    final /* synthetic */ ViewGroup zzb;

    zzdhh(zzdie zzdie, ViewGroup viewGroup) {
        this.zza = zzdie;
        this.zzb = viewGroup;
    }

    public final JSONObject zza() {
        return this.zza.zzo();
    }

    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    public final void zzc() {
        zzdie zzdie = this.zza;
        zzfqk zzfqk = zzdhe.zza;
        Map zzm = zzdie.zzm();
        if (zzm != null) {
            int size = zzfqk.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = zzm.get((String) zzfqk.get(i10));
                i10++;
                if (obj != null) {
                    this.zza.onClick(this.zzb);
                    return;
                }
            }
        }
    }

    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch((View) null, motionEvent);
    }
}
