package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzvo extends zzct {
    /* access modifiers changed from: private */
    public boolean zza;
    /* access modifiers changed from: private */
    public boolean zzb;
    /* access modifiers changed from: private */
    public boolean zzc;
    /* access modifiers changed from: private */
    public boolean zzd;
    /* access modifiers changed from: private */
    public boolean zze;
    /* access modifiers changed from: private */
    public boolean zzf;
    /* access modifiers changed from: private */
    public final SparseArray zzg;
    /* access modifiers changed from: private */
    public final SparseBooleanArray zzh;

    @Deprecated
    public zzvo() {
        this.zzg = new SparseArray();
        this.zzh = new SparseBooleanArray();
        zzv();
    }

    private final void zzv() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
    }

    public final /* synthetic */ zzct zze(int i10, int i11, boolean z10) {
        super.zze(i10, i11, true);
        return this;
    }

    public final zzvo zzo(int i10, boolean z10) {
        if (this.zzh.get(i10) == z10) {
            return this;
        }
        if (z10) {
            this.zzh.put(i10, true);
        } else {
            this.zzh.delete(i10);
        }
        return this;
    }

    public zzvo(Context context) {
        super.zzd(context);
        Point zzB = zzew.zzB(context);
        zze(zzB.x, zzB.y, true);
        this.zzg = new SparseArray();
        this.zzh = new SparseBooleanArray();
        zzv();
    }

    /* synthetic */ zzvo(zzvq zzvq, zzvn zzvn) {
        super(zzvq);
        this.zza = zzvq.zzG;
        this.zzb = zzvq.zzI;
        this.zzc = zzvq.zzK;
        this.zzd = zzvq.zzP;
        this.zze = zzvq.zzQ;
        this.zzf = zzvq.zzS;
        SparseArray zza2 = zzvq.zzak;
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < zza2.size(); i10++) {
            sparseArray.put(zza2.keyAt(i10), new HashMap((Map) zza2.valueAt(i10)));
        }
        this.zzg = sparseArray;
        this.zzh = zzvq.zzal.clone();
    }
}
