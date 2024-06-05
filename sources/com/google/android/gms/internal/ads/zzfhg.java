package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfhg extends zzfhc {
    public zzfhg(zzfgv zzfgv, HashSet hashSet, JSONObject jSONObject, long j10, byte[] bArr) {
        super(zzfgv, hashSet, jSONObject, j10, (byte[]) null);
    }

    private final void zzc(String str) {
        zzffz zza = zzffz.zza();
        if (zza != null) {
            for (zzffo zzffo : zza.zzc()) {
                if (this.zza.contains(zzffo.zzh())) {
                    zzffo.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public final void zza(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
