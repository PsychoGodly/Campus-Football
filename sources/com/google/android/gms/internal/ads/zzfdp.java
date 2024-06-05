package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfdp {
    private final e zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();

    public zzfdp(e eVar) {
        this.zza = eVar;
    }

    private final void zzd(String str, String str2) {
        if (!this.zzb.containsKey(str)) {
            this.zzb.put(str, new ArrayList());
        }
        ((List) this.zzb.get(str)).add(str2);
    }

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.zzb.entrySet()) {
            int i10 = 0;
            if (((List) entry.getValue()).size() > 1) {
                for (String zzfdo : (List) entry.getValue()) {
                    i10++;
                    arrayList.add(new zzfdo(((String) entry.getKey()) + "." + i10, zzfdo));
                }
            } else {
                arrayList.add(new zzfdo((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    public final void zzb(String str) {
        if (this.zzc.containsKey(str)) {
            long b10 = this.zza.b() - ((Long) this.zzc.remove(str)).longValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b10);
            zzd(str, sb2.toString());
            return;
        }
        this.zzc.put(str, Long.valueOf(this.zza.b()));
    }

    public final void zzc(String str, String str2) {
        if (this.zzc.containsKey(str)) {
            long b10 = this.zza.b() - ((Long) this.zzc.remove(str)).longValue();
            zzd(str, str2 + b10);
            return;
        }
        this.zzc.put(str, Long.valueOf(this.zza.b()));
    }
}
