package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzahr implements Comparator<zzahp> {
    zzahr() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzahp zzahp = (zzahp) obj;
        zzahp zzahp2 = (zzahp) obj2;
        zzahv zzahv = (zzahv) zzahp.iterator();
        zzahv zzahv2 = (zzahv) zzahp2.iterator();
        while (zzahv.hasNext() && zzahv2.hasNext()) {
            int compareTo = Integer.valueOf(zzahp.zza(zzahv.zza())).compareTo(Integer.valueOf(zzahp.zza(zzahv2.zza())));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzahp.zzb()).compareTo(Integer.valueOf(zzahp2.zzb()));
    }
}
