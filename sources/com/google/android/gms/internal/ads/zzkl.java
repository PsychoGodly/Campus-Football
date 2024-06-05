package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzkl extends zzgs {
    public static final /* synthetic */ int zzc = 0;
    private final int zzd;
    private final int zze;
    private final int[] zzf;
    private final int[] zzg;
    private final zzcn[] zzh;
    private final Object[] zzi;
    private final HashMap zzj = new HashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzkl(Collection collection, zzum zzum, byte[] bArr) {
        super(false, zzum, (byte[]) null);
        int i10 = 0;
        int size = collection.size();
        this.zzf = new int[size];
        this.zzg = new int[size];
        this.zzh = new zzcn[size];
        this.zzi = new Object[size];
        Iterator it = collection.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            zzjv zzjv = (zzjv) it.next();
            this.zzh[i12] = zzjv.zza();
            this.zzg[i12] = i10;
            this.zzf[i12] = i11;
            i10 += this.zzh[i12].zzc();
            i11 += this.zzh[i12].zzb();
            this.zzi[i12] = zzjv.zzb();
            this.zzj.put(this.zzi[i12], Integer.valueOf(i12));
            i12++;
        }
        this.zzd = i10;
        this.zze = i11;
    }

    public final int zzb() {
        return this.zze;
    }

    public final int zzc() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final int zzp(Object obj) {
        Integer num = (Integer) this.zzj.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    public final int zzq(int i10) {
        return zzew.zzc(this.zzf, i10 + 1, false, false);
    }

    /* access modifiers changed from: protected */
    public final int zzr(int i10) {
        return zzew.zzc(this.zzg, i10 + 1, false, false);
    }

    /* access modifiers changed from: protected */
    public final int zzs(int i10) {
        return this.zzf[i10];
    }

    /* access modifiers changed from: protected */
    public final int zzt(int i10) {
        return this.zzg[i10];
    }

    /* access modifiers changed from: protected */
    public final zzcn zzu(int i10) {
        return this.zzh[i10];
    }

    /* access modifiers changed from: protected */
    public final Object zzv(int i10) {
        return this.zzi[i10];
    }

    /* access modifiers changed from: package-private */
    public final List zzw() {
        return Arrays.asList(this.zzh);
    }
}
