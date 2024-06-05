package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeon implements zzepn {
    final String zza;
    private final zzfuu zzb;
    private final ScheduledExecutorService zzc;
    private final zzegx zzd;
    private final Context zze;
    private final zzeyx zzf;
    private final zzegt zzg;
    private final zzdnd zzh;
    private final zzdrm zzi;

    public zzeon(zzfuu zzfuu, ScheduledExecutorService scheduledExecutorService, String str, zzegx zzegx, Context context, zzeyx zzeyx, zzegt zzegt, zzdnd zzdnd, zzdrm zzdrm) {
        this.zzb = zzfuu;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzegx;
        this.zze = context;
        this.zzf = zzeyx;
        this.zzg = zzegt;
        this.zzh = zzdnd;
        this.zzi = zzdrm;
    }

    public static /* synthetic */ zzfut zzc(zzeon zzeon) {
        String str;
        Bundle bundle;
        if (((Boolean) a0.c().zzb(zzbar.zzji)).booleanValue()) {
            str = zzeon.zzf.zzf.toLowerCase(Locale.ROOT);
        } else {
            str = zzeon.zzf.zzf;
        }
        Map zza2 = zzeon.zzd.zza(zzeon.zza, str);
        if (((Boolean) a0.c().zzb(zzbar.zzbw)).booleanValue()) {
            bundle = zzeon.zzi.zzg();
        } else {
            bundle = new Bundle();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((zzfqn) zza2).entrySet().iterator();
        while (true) {
            Bundle bundle2 = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle3 = zzeon.zzf.zzd.f14563n;
            if (bundle3 != null) {
                bundle2 = bundle3.getBundle(str2);
            }
            arrayList.add(zzeon.zzf(str2, list, bundle2, true, true));
        }
        for (Map.Entry value : ((zzfqn) zzeon.zzd.zzb()).entrySet()) {
            zzehb zzehb = (zzehb) value.getValue();
            String str3 = zzehb.zza;
            Bundle bundle4 = zzeon.zzf.zzd.f14563n;
            arrayList.add(zzeon.zzf(str3, Collections.singletonList(zzehb.zzd), bundle4 != null ? bundle4.getBundle(str3) : null, zzehb.zzb, zzehb.zzc));
        }
        return zzfuj.zzb(arrayList).zza(new zzeok(arrayList, bundle), zzeon.zzb);
    }

    private final zzfua zzf(String str, List list, Bundle bundle, boolean z10, boolean z11) {
        zzfua zzv = zzfua.zzv(zzfuj.zzk(new zzeol(this, str, list, bundle, z10, z11), this.zzb));
        if (!((Boolean) a0.c().zzb(zzbar.zzbs)).booleanValue()) {
            zzv = (zzfua) zzfuj.zzn(zzv, ((Long) a0.c().zzb(zzbar.zzbl)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzfua) zzfuj.zze(zzv, Throwable.class, new zzeom(str), this.zzb);
    }

    private final void zzg(zzbpc zzbpc, Bundle bundle, List list, zzeha zzeha) throws RemoteException {
        zzbpc.zzh(b.B1(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzeha);
    }

    public final int zza() {
        return 32;
    }

    public final zzfut zzb() {
        return zzfuj.zzk(new zzeoh(this), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzd(String str, List list, Bundle bundle, boolean z10, boolean z11) throws Exception {
        zzbpc zzbpc;
        zzbzs zzbzs = new zzbzs();
        if (z11) {
            this.zzg.zzb(str);
            zzbpc = this.zzg.zza(str);
        } else {
            try {
                zzbpc = this.zzh.zzb(str);
            } catch (RemoteException e10) {
                zzbza.zzh("Couldn't create RTB adapter : ", e10);
                zzbpc = null;
            }
        }
        if (zzbpc == null) {
            if (((Boolean) a0.c().zzb(zzbar.zzbn)).booleanValue()) {
                zzeha.zzb(str, zzbzs);
            } else {
                throw null;
            }
        } else {
            zzeha zzeha = new zzeha(str, zzbpc, zzbzs, t.b().b());
            if (((Boolean) a0.c().zzb(zzbar.zzbs)).booleanValue()) {
                this.zzc.schedule(new zzeoi(zzeha), ((Long) a0.c().zzb(zzbar.zzbl)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z10) {
                if (((Boolean) a0.c().zzb(zzbar.zzbx)).booleanValue()) {
                    this.zzb.zza(new zzeoj(this, zzbpc, bundle, list, zzeha, zzbzs));
                } else {
                    zzg(zzbpc, bundle, list, zzeha);
                }
            } else {
                zzeha.zzd();
            }
        }
        return zzbzs;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzbpc zzbpc, Bundle bundle, List list, zzeha zzeha, zzbzs zzbzs) {
        try {
            zzg(zzbpc, bundle, list, zzeha);
        } catch (RemoteException e10) {
            zzbzs.zze(e10);
        }
    }
}
