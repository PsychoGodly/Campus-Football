package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.f5;
import com.google.android.gms.ads.internal.client.u4;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfau implements zzfat {
    private final Object[] zza;

    public zzfau(u4 u4Var, String str, int i10, String str2, f5 f5Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i10));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(u4Var.f14552b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(zza(u4Var.f14553c));
        } else if (hashSet.contains("npa")) {
            arrayList.add(u4Var.f14553c.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(u4Var.f14554d));
        }
        if (hashSet.contains("keywords")) {
            List list = u4Var.f14555f;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(u4Var.f14556g));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(u4Var.f14557h));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(u4Var.f14558i));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(u4Var.f14559j);
        }
        if (hashSet.contains("location")) {
            Location location = u4Var.f14561l;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(u4Var.f14562m);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zza(u4Var.f14563n));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zza(u4Var.f14564o));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = u4Var.f14565p;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(u4Var.f14566q);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(u4Var.f14567r);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(u4Var.f14568s));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(u4Var.f14570u));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(u4Var.f14571v);
        }
        if (hashSet.contains(AdUnitActivity.EXTRA_ORIENTATION)) {
            if (f5Var != null) {
                arrayList.add(Integer.valueOf(f5Var.f14465a));
            } else {
                arrayList.add((Object) null);
            }
        }
        this.zza = arrayList.toArray();
    }

    private static String zza(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                str = "null";
            } else if (obj instanceof Bundle) {
                str = zza((Bundle) obj);
            } else {
                str = obj.toString();
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfau)) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzfau) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        int hashCode = Arrays.hashCode(this.zza);
        String arrays = Arrays.toString(this.zza);
        return "[PoolKey#" + hashCode + " " + arrays + "]";
    }
}
