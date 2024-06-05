package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzarx extends zzasm {
    private final zzaqa zzi;
    private final long zzj;
    private final long zzk;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzarx(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11, zzaqa zzaqa, long j10, long j11) {
        super(zzaqx, "CchySZwZp0zgVfg6SBe+R4XjFGRJyETMFDNmz2TJwAQ/SC/95iAQtXV4Kn3jVqOs", "8/+tyWwCNq6PB0rUMhC29myQhViveTsZErWXCGX5t00=", zzamv, i10, 11);
        this.zzi = zzaqa;
        this.zzj = j10;
        this.zzk = j11;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaqa zzaqa = this.zzi;
        if (zzaqa != null) {
            zzapy zzapy = new zzapy((String) this.zzf.invoke((Object) null, new Object[]{zzaqa.zzb(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)}));
            synchronized (this.zze) {
                this.zze.zzz(zzapy.zza.longValue());
                if (zzapy.zzb.longValue() >= 0) {
                    this.zze.zzQ(zzapy.zzb.longValue());
                }
                if (zzapy.zzc.longValue() >= 0) {
                    this.zze.zzf(zzapy.zzc.longValue());
                }
            }
        }
    }
}
