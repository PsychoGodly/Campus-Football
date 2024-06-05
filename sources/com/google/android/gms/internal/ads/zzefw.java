package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzefw implements zzeat {
    private final zzeav zza;
    private final zzeba zzb;
    private final zzfda zzc;
    private final zzfuu zzd;

    public zzefw(zzfda zzfda, zzfuu zzfuu, zzeav zzeav, zzeba zzeba) {
        this.zzc = zzfda;
        this.zzd = zzfuu;
        this.zzb = zzeba;
        this.zza = zzeav;
    }

    static final String zze(String str, int i10) {
        return "Error from: " + str + ", code: " + i10;
    }

    public final zzfut zza(zzeyo zzeyo, zzeyc zzeyc) {
        zzeaw zzeaw;
        Class<AdMobAdapter> cls = AdMobAdapter.class;
        Iterator it = zzeyc.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzeaw = null;
                break;
            }
            try {
                zzeaw = this.zza.zza((String) it.next(), zzeyc.zzw);
                break;
            } catch (zzezc unused) {
            }
        }
        if (zzeaw == null) {
            return zzfuj.zzg(new zzedw("Unable to instantiate mediation adapter class."));
        }
        zzbzs zzbzs = new zzbzs();
        zzeaw.zzc.zza(new zzefv(this, zzeaw, zzbzs));
        if (zzeyc.zzN) {
            Bundle bundle = zzeyo.zza.zza.zzd.f14563n;
            Bundle bundle2 = bundle.getBundle(cls.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(cls.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfda zzfda = this.zzc;
        return zzfck.zzd(new zzeft(this, zzeyo, zzeyc, zzeaw), this.zzd, zzfcu.ADAPTER_LOAD_AD_SYN, zzfda).zzb(zzfcu.ADAPTER_LOAD_AD_ACK).zzd(zzbzs).zzb(zzfcu.ADAPTER_WRAP_ADAPTER).zze(new zzefu(this, zzeyo, zzeyc, zzeaw)).zza();
    }

    public final boolean zzb(zzeyo zzeyo, zzeyc zzeyc) {
        return !zzeyc.zzu.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw, Void voidR) throws Exception {
        return this.zzb.zza(zzeyo, zzeyc, zzeaw);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws Exception {
        this.zzb.zzb(zzeyo, zzeyc, zzeaw);
    }
}
