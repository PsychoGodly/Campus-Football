package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfhh extends zzfhc {
    public zzfhh(zzfgv zzfgv, HashSet hashSet, JSONObject jSONObject, long j10, byte[] bArr) {
        super(zzfgv, hashSet, jSONObject, j10, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfgp.zzj(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* access modifiers changed from: protected */
    public final void zza(String str) {
        zzffz zza;
        if (!TextUtils.isEmpty(str) && (zza = zzffz.zza()) != null) {
            for (zzffo zzffo : zza.zzc()) {
                if (this.zza.contains(zzffo.zzh())) {
                    zzffo.zzg().zze(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
