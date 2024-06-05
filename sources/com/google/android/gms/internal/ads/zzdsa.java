package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdsa {
    private final zzdrk zza;
    private final zzdna zzb;
    private final Object zzc = new Object();
    private final List zzd;
    private boolean zze;

    zzdsa(zzdrk zzdrk, zzdna zzdna) {
        this.zza = zzdrk;
        this.zzb = zzdna;
        this.zzd = new ArrayList();
    }

    /* access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        boolean z10;
        synchronized (this.zzc) {
            if (!this.zze) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbjl zzbjl = (zzbjl) it.next();
                    if (((Boolean) a0.c().zzb(zzbar.zziz)).booleanValue()) {
                        zzdmz zza2 = this.zzb.zza(zzbjl.zza);
                        if (zza2 != null) {
                            zzbpq zzbpq = zza2.zzc;
                            if (zzbpq != null) {
                                str = zzbpq.toString();
                            }
                        }
                        str = MaxReward.DEFAULT_LABEL;
                    } else {
                        str = MaxReward.DEFAULT_LABEL;
                    }
                    String str2 = str;
                    if (((Boolean) a0.c().zzb(zzbar.zziA)).booleanValue()) {
                        zzdmz zza3 = this.zzb.zza(zzbjl.zza);
                        if (zza3 != null) {
                            if (zza3.zzd) {
                                z10 = true;
                                List list2 = this.zzd;
                                String str3 = zzbjl.zza;
                                String zzc2 = this.zzb.zzc(str3);
                                boolean z11 = zzbjl.zzb;
                                list2.add(new zzdrz(str3, str2, zzc2, z11 ? 1 : 0, zzbjl.zzd, zzbjl.zzc, z10));
                            }
                        }
                    }
                    z10 = false;
                    List list22 = this.zzd;
                    String str32 = zzbjl.zza;
                    String zzc22 = this.zzb.zzc(str32);
                    boolean z112 = zzbjl.zzb;
                    list22.add(new zzdrz(str32, str2, zzc22, z112 ? 1 : 0, zzbjl.zzd, zzbjl.zzc, z10));
                }
                this.zze = true;
            }
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                } else {
                    zzc();
                    return jSONArray;
                }
            }
            for (zzdrz zza2 : this.zzd) {
                jSONArray.put(zza2.zza());
            }
            return jSONArray;
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzdry(this));
    }
}
