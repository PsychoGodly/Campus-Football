package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaq extends zzap {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzap zzc;

    zzaq(zzap zzap, int i10, int i11) {
        this.zzc = zzap;
        this.zza = i10;
        this.zzb = i11;
    }

    public final Object get(int i10) {
        zzy.zza(i10, this.zzb);
        return this.zzc.get(i10 + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public final int zza() {
        return this.zzc.zzb() + this.zza + this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final int zzb() {
        return this.zzc.zzb() + this.zza;
    }

    /* access modifiers changed from: package-private */
    public final boolean zze() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzf() {
        return this.zzc.zzf();
    }

    public final zzap zza(int i10, int i11) {
        zzy.zza(i10, i11, this.zzb);
        zzap zzap = this.zzc;
        int i12 = this.zza;
        return (zzap) zzap.subList(i10 + i12, i11 + i12);
    }
}
