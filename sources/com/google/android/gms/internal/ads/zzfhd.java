package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzfhd extends AsyncTask {
    private zzfhe zza;
    protected final zzfgv zzd;

    public zzfhd(zzfgv zzfgv, byte[] bArr) {
        this.zzd = zzfgv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: zza */
    public void onPostExecute(String str) {
        zzfhe zzfhe = this.zza;
        if (zzfhe != null) {
            zzfhe.zza(this);
        }
    }

    public final void zzb(zzfhe zzfhe) {
        this.zza = zzfhe;
    }
}
