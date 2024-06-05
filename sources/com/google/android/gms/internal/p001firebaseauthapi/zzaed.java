package com.google.android.gms.internal.p001firebaseauthapi;

import androidx.collection.a;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import y6.f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaed  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzaed {
    private static final Map<String, zzaec> zza = new a();
    private static final Map<String, List<WeakReference<zzaef>>> zzb = new a();

    private static String zza(String str, int i10, boolean z10) {
        if (z10) {
            return "http://[" + str + "]:" + i10 + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH;
        }
        return "http://" + str + ":" + i10 + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH;
    }

    public static String zzb(String str) {
        zzaec zzaec;
        String str2;
        Map<String, zzaec> map = zza;
        synchronized (map) {
            zzaec = map.get(str);
        }
        if (zzaec != null) {
            str2 = MaxReward.DEFAULT_LABEL + zza(zzaec.zzb(), zzaec.zza(), zzaec.zzb().contains(":"));
        } else {
            str2 = MaxReward.DEFAULT_LABEL + "https://";
        }
        return str2 + "www.googleapis.com/identitytoolkit/v3/relyingparty";
    }

    public static String zzc(String str) {
        zzaec zzaec;
        String str2;
        Map<String, zzaec> map = zza;
        synchronized (map) {
            zzaec = map.get(str);
        }
        if (zzaec != null) {
            str2 = MaxReward.DEFAULT_LABEL + zza(zzaec.zzb(), zzaec.zza(), zzaec.zzb().contains(":"));
        } else {
            str2 = MaxReward.DEFAULT_LABEL + "https://";
        }
        return str2 + "identitytoolkit.googleapis.com/v2";
    }

    public static String zzd(String str) {
        zzaec zzaec;
        String str2;
        Map<String, zzaec> map = zza;
        synchronized (map) {
            zzaec = map.get(str);
        }
        if (zzaec != null) {
            str2 = MaxReward.DEFAULT_LABEL + zza(zzaec.zzb(), zzaec.zza(), zzaec.zzb().contains(":"));
        } else {
            str2 = MaxReward.DEFAULT_LABEL + "https://";
        }
        return str2 + "securetoken.googleapis.com/v1";
    }

    public static String zza(String str) {
        zzaec zzaec;
        Map<String, zzaec> map = zza;
        synchronized (map) {
            zzaec = map.get(str);
        }
        if (zzaec != null) {
            String zza2 = zza(zzaec.zzb(), zzaec.zza(), zzaec.zzb().contains(":"));
            return zza2 + "emulator/auth/handler";
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static void zza(String str, zzaef zzaef) {
        Map<String, List<WeakReference<zzaef>>> map = zzb;
        synchronized (map) {
            if (map.containsKey(str)) {
                map.get(str).add(new WeakReference(zzaef));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference(zzaef));
                map.put(str, arrayList);
            }
        }
    }

    public static void zza(f fVar, String str, int i10) {
        String b10 = fVar.r().b();
        Map<String, zzaec> map = zza;
        synchronized (map) {
            map.put(b10, new zzaec(str, i10));
        }
        Map<String, List<WeakReference<zzaef>>> map2 = zzb;
        synchronized (map2) {
            if (map2.containsKey(b10)) {
                boolean z10 = false;
                for (WeakReference weakReference : map2.get(b10)) {
                    zzaef zzaef = (zzaef) weakReference.get();
                    if (zzaef != null) {
                        z10 = true;
                        zzaef.zza();
                    }
                }
                if (!z10) {
                    zza.remove(b10);
                }
            }
        }
    }

    public static boolean zza(f fVar) {
        return zza.containsKey(fVar.r().b());
    }
}
