package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public class zzap implements zzak, zzaq {
    private final Map<String, zzaq> zza = new HashMap();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzap)) {
            return false;
        }
        return this.zza.equals(((zzap) obj).zza);
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        if (!this.zza.isEmpty()) {
            for (String next : this.zza.keySet()) {
                sb2.append(String.format("%s: %s,", new Object[]{next, this.zza.get(next)}));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }

    public zzaq zza(String str, zzh zzh, List<zzaq> list) {
        if ("toString".equals(str)) {
            return new zzas(toString());
        }
        return zzan.zza(this, new zzas(str), zzh, list);
    }

    public final zzaq zzc() {
        zzap zzap = new zzap();
        for (Map.Entry next : this.zza.entrySet()) {
            if (next.getValue() instanceof zzak) {
                zzap.zza.put((String) next.getKey(), (zzaq) next.getValue());
            } else {
                zzap.zza.put((String) next.getKey(), ((zzaq) next.getValue()).zzc());
            }
        }
        return zzap;
    }

    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    public final Double zze() {
        return Double.valueOf(Double.NaN);
    }

    public final String zzf() {
        return "[object Object]";
    }

    public final Iterator<zzaq> zzh() {
        return zzan.zza(this.zza);
    }

    public final zzaq zza(String str) {
        if (this.zza.containsKey(str)) {
            return this.zza.get(str);
        }
        return zzaq.zzc;
    }

    public final boolean zzc(String str) {
        return this.zza.containsKey(str);
    }

    public final List<String> zza() {
        return new ArrayList(this.zza.keySet());
    }

    public final void zza(String str, zzaq zzaq) {
        if (zzaq == null) {
            this.zza.remove(str);
        } else {
            this.zza.put(str, zzaq);
        }
    }
}
