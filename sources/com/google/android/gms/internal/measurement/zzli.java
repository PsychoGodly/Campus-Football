package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
final class zzli implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzlg zzc;

    private zzli(zzlg zzlg) {
        this.zzc = zzlg;
        this.zza = zzlg.zzb.size();
    }

    private final Iterator zza() {
        if (this.zzb == null) {
            this.zzb = this.zzc.zzf.entrySet().iterator();
        }
        return this.zzb;
    }

    public final boolean hasNext() {
        int i10 = this.zza;
        return (i10 > 0 && i10 <= this.zzc.zzb.size()) || zza().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (zza().hasNext()) {
            return (Map.Entry) zza().next();
        }
        List zza2 = this.zzc.zzb;
        int i10 = this.zza - 1;
        this.zza = i10;
        return (Map.Entry) zza2.get(i10);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
