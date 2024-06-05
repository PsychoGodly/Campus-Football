package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzfa implements zzfg {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzfl zzd;

    protected zzfa(boolean z10) {
        this.zza = z10;
    }

    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    public final void zzf(zzgi zzgi) {
        Objects.requireNonNull(zzgi);
        if (!this.zzb.contains(zzgi)) {
            this.zzb.add(zzgi);
            this.zzc++;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzg(int i10) {
        zzfl zzfl = this.zzd;
        int i11 = zzew.zza;
        for (int i12 = 0; i12 < this.zzc; i12++) {
            ((zzgi) this.zzb.get(i12)).zza(this, zzfl, this.zza, i10);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzh() {
        zzfl zzfl = this.zzd;
        int i10 = zzew.zza;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            ((zzgi) this.zzb.get(i11)).zzb(this, zzfl, this.zza);
        }
        this.zzd = null;
    }

    /* access modifiers changed from: protected */
    public final void zzi(zzfl zzfl) {
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzgi) this.zzb.get(i10)).zzc(this, zzfl, this.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzj(zzfl zzfl) {
        this.zzd = zzfl;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzgi) this.zzb.get(i10)).zzd(this, zzfl, this.zza);
        }
    }
}
