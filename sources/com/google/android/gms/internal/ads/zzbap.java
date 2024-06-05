package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.unity3d.services.UnityAdsConstants;
import h5.j;
import o5.c;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbap implements SharedPreferences.OnSharedPreferenceChangeListener {
    volatile boolean zza = false;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    /* access modifiers changed from: private */
    public SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private Context zzg;
    private JSONObject zzh = new JSONObject();

    private final void zzf() {
        if (this.zze != null) {
            try {
                this.zzh = new JSONObject((String) zzbaw.zza(new zzban(this)));
            } catch (JSONException unused) {
            }
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzf();
        }
    }

    public final Object zzb(zzbaj zzbaj) {
        if (!this.zzc.block(UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null) {
            synchronized (this.zzb) {
                if (this.zzd) {
                    if (this.zze == null) {
                    }
                }
                Object zzm = zzbaj.zzm();
                return zzm;
            }
        }
        if (zzbaj.zze() == 2) {
            Bundle bundle = this.zzf;
            if (bundle == null) {
                return zzbaj.zzm();
            }
            return zzbaj.zzb(bundle);
        } else if (zzbaj.zze() != 1 || !this.zzh.has(zzbaj.zzn())) {
            return zzbaw.zza(new zzbam(this, zzbaj));
        } else {
            return zzbaj.zza(this.zzh);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(zzbaj zzbaj) {
        return zzbaj.zzc(this.zze);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String zzd() {
        return this.zze.getString("flag_configuration", JsonUtils.EMPTY_JSON);
    }

    public final void zze(Context context) {
        if (!this.zzd) {
            synchronized (this.zzb) {
                if (!this.zzd) {
                    if (!this.zza) {
                        this.zza = true;
                    }
                    Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    this.zzg = applicationContext;
                    try {
                        this.zzf = c.a(applicationContext).c(this.zzg.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context e10 = j.e(context);
                        if (!(e10 == null && (e10 = context.getApplicationContext()) == null)) {
                            context = e10;
                        }
                        if (context != null) {
                            a0.b();
                            SharedPreferences zza2 = zzbal.zza(context);
                            this.zze = zza2;
                            if (zza2 != null) {
                                zza2.registerOnSharedPreferenceChangeListener(this);
                            }
                            zzbdc.zzc(new zzbao(this));
                            zzf();
                            this.zzd = true;
                            this.zza = false;
                            this.zzc.open();
                        }
                    } finally {
                        this.zza = false;
                        this.zzc.open();
                    }
                }
            }
        }
    }
}
