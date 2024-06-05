package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.n1;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzblt implements zzbkk, zzbls {
    private final zzbls zza;
    private final HashSet zzb = new HashSet();

    public zzblt(zzbls zzbls) {
        this.zza = zzbls;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        zzbkj.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            n1.a("Unregistering eventhandler: ".concat(String.valueOf(((zzbhp) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbhp) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    public final /* synthetic */ void zzd(String str, Map map) {
        zzbkj.zza(this, str, map);
    }

    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbkj.zzb(this, str, jSONObject);
    }

    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbkj.zzd(this, str, jSONObject);
    }

    public final void zzq(String str, zzbhp zzbhp) {
        this.zza.zzq(str, zzbhp);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbhp));
    }

    public final void zzr(String str, zzbhp zzbhp) {
        this.zza.zzr(str, zzbhp);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbhp));
    }
}
