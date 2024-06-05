package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import b7.a;
import c7.b;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import y6.f;
import z7.i;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzact  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzact {
    private Context zza;
    private zzadp zzb;
    private String zzc;
    private final f zzd;
    private boolean zze;
    private String zzf;

    public zzact(f fVar, String str) {
        this(fVar.m(), fVar, str);
    }

    private static String zza(f fVar) {
        b bVar = FirebaseAuth.getInstance(fVar).t0().get();
        if (bVar == null) {
            return null;
        }
        try {
            a aVar = (a) Tasks.await(bVar.a(false));
            if (aVar.a() != null) {
                String valueOf = String.valueOf(aVar.a());
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: " + valueOf);
            }
            return aVar.b();
        } catch (InterruptedException | ExecutionException e10) {
            String message = e10.getMessage();
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + message);
            return null;
        }
    }

    private static String zzb(f fVar) {
        i iVar = FirebaseAuth.getInstance(fVar).x0().get();
        if (iVar != null) {
            try {
                return (String) Tasks.await(iVar.a());
            } catch (InterruptedException | ExecutionException e10) {
                String message = e10.getMessage();
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + message);
            }
        }
        return null;
    }

    public zzact(Context context, f fVar, String str) {
        this.zze = false;
        this.zza = (Context) q.k(context);
        this.zzd = (f) q.k(fVar);
        this.zzc = String.format("Android/%s/%s", new Object[]{"Fallback", str});
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    public final void zza(URLConnection uRLConnection) {
        String str;
        if (this.zze) {
            str = this.zzc + "/FirebaseUI-Android";
        } else {
            str = this.zzc + "/FirebaseCore-Android";
        }
        if (this.zzb == null) {
            this.zzb = new zzadp(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzacw.zza());
        uRLConnection.setRequestProperty("X-Client-Version", str);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        uRLConnection.setRequestProperty("X-Firebase-GMPID", this.zzd.r().c());
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String zza2 = zza(this.zzd);
        if (!TextUtils.isEmpty(zza2)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", zza2);
        }
        this.zzf = null;
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }
}
