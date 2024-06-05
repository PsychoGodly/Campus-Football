package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzi implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String Q = p.Q(String.valueOf(this.zzb / ((long) this.zza)), 10, 0, 2, (Object) null);
        String Q2 = p.Q(String.valueOf(this.zzc), 10, 0, 2, (Object) null);
        String Q3 = p.Q(String.valueOf(this.zzb), 10, 0, 2, (Object) null);
        String Q4 = p.Q(String.valueOf(this.zza), 5, 0, 2, (Object) null);
        return "avgExecutionTime: " + Q + " us| maxExecutionTime: " + Q2 + " us| totalTime: " + Q3 + " us| #Usages: " + Q4;
    }

    /* renamed from: zza */
    public final int compareTo(zzi zzi) {
        return b.a(Long.valueOf(this.zzb), Long.valueOf(zzi.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j10) {
        this.zzc = j10;
    }

    public final void zzf(long j10) {
        this.zzb = j10;
    }

    public final void zzg(int i10) {
        this.zza = i10;
    }
}
