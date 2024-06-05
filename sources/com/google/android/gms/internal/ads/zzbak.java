package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbak {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (zzbaj zzb2 : this.zzb) {
            String str = (String) a0.c().zzb(zzb2);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbav.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza2 = zza();
        for (zzbaj zzb2 : this.zzc) {
            String str = (String) a0.c().zzb(zzb2);
            if (!TextUtils.isEmpty(str)) {
                zza2.add(str);
            }
        }
        zza2.addAll(zzbav.zzb());
        return zza2;
    }

    public final void zzc(zzbaj zzbaj) {
        this.zzb.add(zzbaj);
    }

    public final void zzd(zzbaj zzbaj) {
        this.zza.add(zzbaj);
    }

    public final void zze(SharedPreferences.Editor editor, int i10, JSONObject jSONObject) {
        for (zzbaj zzbaj : this.zza) {
            if (zzbaj.zze() == 1) {
                zzbaj.zzd(editor, zzbaj.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzbza.zzg("Flag Json is null.");
        }
    }
}
