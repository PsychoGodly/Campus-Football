package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzess implements zzgwy {
    public static zzepq zza(Context context, zzbxx zzbxx, zzbxy zzbxy, Object obj, zzeqi zzeqi, zzery zzery, zzgws zzgws, zzgws zzgws2, zzgws zzgws3, zzgws zzgws4, zzgws zzgws5, zzgws zzgws6, zzgws zzgws7, zzgws zzgws8, zzgws zzgws9, Executor executor, zzfen zzfen, zzdpi zzdpi) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzerr) obj);
        zzeqi zzeqi2 = zzeqi;
        hashSet.add(zzeqi);
        zzery zzery2 = zzery;
        hashSet.add(zzery);
        if (((Boolean) a0.c().zzb(zzbar.zzfm)).booleanValue()) {
            hashSet.add((zzepn) zzgws.zzb());
        }
        if (((Boolean) a0.c().zzb(zzbar.zzfn)).booleanValue()) {
            hashSet.add((zzepn) zzgws2.zzb());
        }
        if (((Boolean) a0.c().zzb(zzbar.zzfo)).booleanValue()) {
            hashSet.add((zzepn) zzgws3.zzb());
        }
        if (((Boolean) a0.c().zzb(zzbar.zzfp)).booleanValue()) {
            hashSet.add((zzepn) zzgws4.zzb());
        }
        if (((Boolean) a0.c().zzb(zzbar.zzft)).booleanValue()) {
            hashSet.add((zzepn) zzgws6.zzb());
        }
        if (((Boolean) a0.c().zzb(zzbar.zzfu)).booleanValue()) {
            hashSet.add((zzepn) zzgws7.zzb());
        }
        if (((Boolean) a0.c().zzb(zzbar.zzcw)).booleanValue()) {
            hashSet.add((zzepn) zzgws9.zzb());
        }
        return new zzepq(context, executor, hashSet, zzfen, zzdpi);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
