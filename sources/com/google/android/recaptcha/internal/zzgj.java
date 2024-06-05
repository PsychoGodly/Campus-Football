package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public class zzgj extends zzgi implements zzhz {
    protected zzgj(zzgk zzgk) {
        super(zzgk);
    }

    /* renamed from: zzd */
    public final zzgk zzk() {
        if (!((zzgk) this.zza).zzF()) {
            return (zzgk) this.zza;
        }
        ((zzgk) this.zza).zzb.zzg();
        return (zzgk) super.zzk();
    }

    /* access modifiers changed from: protected */
    public final void zzn() {
        super.zzn();
        if (((zzgk) this.zza).zzb != zzge.zzd()) {
            zzgk zzgk = (zzgk) this.zza;
            zzgk.zzb = zzgk.zzb.clone();
        }
    }
}
