package com.google.android.gms.internal.p001firebaseauthapi;

import android.app.Activity;
import androidx.collection.a;
import com.google.firebase.auth.q0;
import java.util.Map;
import java.util.concurrent.Executor;
import m5.h;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzadt {
    private static final Map<String, zzadv> zza = new a();

    public static q0.b zza(String str, q0.b bVar, zzacx zzacx) {
        zza(str, zzacx);
        return new zzads(bVar, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzacx zzacx) {
        zza.put(str, new zzadv(zzacx, h.d().a()));
    }

    public static boolean zza(String str, q0.b bVar, Activity activity, Executor executor) {
        Map<String, zzadv> map = zza;
        if (map.containsKey(str)) {
            zzadv zzadv = map.get(str);
            if (h.d().a() - zzadv.zzb < 120000) {
                zzacx zzacx = zzadv.zza;
                if (zzacx == null) {
                    return true;
                }
                zzacx.zza(bVar, activity, executor, str);
                return true;
            }
            zza(str, (zzacx) null);
            return false;
        }
        zza(str, (zzacx) null);
        return false;
    }
}
