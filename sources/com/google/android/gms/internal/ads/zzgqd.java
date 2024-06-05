package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgqd {
    private static final zzgqd zzb = new zzgqd(true);
    final zzgtc zza = new zzgss(16);
    private boolean zzc;
    private boolean zzd;

    private zzgqd() {
    }

    public static zzgqd zza() {
        throw null;
    }

    private static final void zzd(zzgqc zzgqc, Object obj) {
        boolean z10;
        zzgtw zzb2 = zzgqc.zzb();
        zzgqw.zze(obj);
        zzgtw zzgtw = zzgtw.DOUBLE;
        zzgtx zzgtx = zzgtx.INT;
        switch (zzb2.zza().ordinal()) {
            case 0:
                z10 = obj instanceof Integer;
                break;
            case 1:
                z10 = obj instanceof Long;
                break;
            case 2:
                z10 = obj instanceof Float;
                break;
            case 3:
                z10 = obj instanceof Double;
                break;
            case 4:
                z10 = obj instanceof Boolean;
                break;
            case 5:
                z10 = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzgpe) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzgqo)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzgrw) || (obj instanceof zzgrb)) {
                    return;
                }
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzgqc.zza()), zzgqc.zzb().zza(), obj.getClass().getName()}));
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgqd zzgqd = new zzgqd();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            zzgqd.zzc((zzgqc) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzgqd.zzc((zzgqc) entry.getKey(), entry.getValue());
        }
        zzgqd.zzd = this.zzd;
        return zzgqd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgqd)) {
            return false;
        }
        return this.zza.equals(((zzgqd) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (!this.zzc) {
            for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
                Map.Entry zzg = this.zza.zzg(i10);
                if (zzg.getValue() instanceof zzgqm) {
                    ((zzgqm) zzg.getValue()).zzaR();
                }
            }
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzc(zzgqc zzgqc, Object obj) {
        if (!zzgqc.zzc()) {
            zzd(zzgqc, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                zzd(zzgqc, arrayList.get(i10));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzgrb) {
            this.zzd = true;
        }
        this.zza.put(zzgqc, obj);
    }

    private zzgqd(boolean z10) {
        zzb();
        zzb();
    }
}
