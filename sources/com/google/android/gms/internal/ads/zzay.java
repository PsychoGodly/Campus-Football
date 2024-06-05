package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzay {
    public final Uri zza;
    public final String zzb = null;
    public final zzas zzc = null;
    public final zzai zzd = null;
    public final List zze;
    public final String zzf;
    public final zzfqk zzg;
    @Deprecated
    public final List zzh;
    public final Object zzi;

    /* synthetic */ zzay(Uri uri, String str, zzas zzas, zzai zzai, List list, String str2, zzfqk zzfqk, Object obj, zzax zzax) {
        this.zza = uri;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzfqk;
        zzfqh zzi2 = zzfqk.zzi();
        if (zzfqk.size() <= 0) {
            this.zzh = zzi2.zzi();
            this.zzi = null;
            return;
        }
        zzbe zzbe = (zzbe) zzfqk.get(0);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzay)) {
            return false;
        }
        zzay zzay = (zzay) obj;
        return this.zza.equals(zzay.zza) && zzew.zzU((Object) null, (Object) null) && zzew.zzU((Object) null, (Object) null) && zzew.zzU((Object) null, (Object) null) && this.zze.equals(zzay.zze) && zzew.zzU((Object) null, (Object) null) && this.zzg.equals(zzay.zzg) && zzew.zzU((Object) null, (Object) null);
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() * 923521) + this.zze.hashCode()) * 961) + this.zzg.hashCode()) * 31;
    }
}
