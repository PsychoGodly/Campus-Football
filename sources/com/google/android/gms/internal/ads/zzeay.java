package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.d5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeay {
    private final List zza = Collections.synchronizedList(new ArrayList());
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final String zzc;
    private zzeyf zzd = null;
    private zzeyc zze = null;
    private d5 zzf = null;

    public zzeay(String str) {
        this.zzc = str;
    }

    private final void zzh(zzeyc zzeyc, long j10, c3 c3Var, boolean z10) {
        String str = zzeyc.zzx;
        if (this.zzb.containsKey(str)) {
            if (this.zze == null) {
                this.zze = zzeyc;
            }
            d5 d5Var = (d5) this.zzb.get(str);
            d5Var.f14451b = j10;
            d5Var.f14452c = c3Var;
            if (((Boolean) a0.c().zzb(zzbar.zzgr)).booleanValue() && z10) {
                this.zzf = d5Var;
            }
        }
    }

    public final d5 zza() {
        return this.zzf;
    }

    public final zzcuh zzb() {
        return new zzcuh(this.zze, MaxReward.DEFAULT_LABEL, this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzeyc zzeyc) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = zzeyc.zzx;
        if (!this.zzb.containsKey(str5)) {
            Bundle bundle = new Bundle();
            Iterator<String> keys = zzeyc.zzw.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    bundle.putString(next, zzeyc.zzw.getString(next));
                } catch (JSONException unused) {
                }
            }
            if (((Boolean) a0.c().zzb(zzbar.zzgq)).booleanValue()) {
                String str6 = zzeyc.zzG;
                String str7 = zzeyc.zzH;
                str4 = str6;
                str3 = str7;
                str2 = zzeyc.zzI;
                str = zzeyc.zzJ;
            } else {
                str4 = MaxReward.DEFAULT_LABEL;
                str3 = str4;
                str2 = str3;
                str = str2;
            }
            d5 d5Var = new d5(zzeyc.zzF, 0, (c3) null, bundle, str4, str3, str2, str);
            this.zza.add(d5Var);
            this.zzb.put(str5, d5Var);
        }
    }

    public final void zze(zzeyc zzeyc, long j10, c3 c3Var) {
        zzh(zzeyc, j10, c3Var, false);
    }

    public final void zzf(zzeyc zzeyc, long j10, c3 c3Var) {
        zzh(zzeyc, j10, (c3) null, true);
    }

    public final void zzg(zzeyf zzeyf) {
        this.zzd = zzeyf;
    }
}
