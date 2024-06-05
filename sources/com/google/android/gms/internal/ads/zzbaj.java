package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbaj {
    private final int zza;
    private final String zzb;
    private final Object zzc;

    /* synthetic */ zzbaj(int i10, String str, Object obj, zzbai zzbai) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        a0.a().zzd(this);
    }

    public static zzbaj zzf(int i10, String str, float f10) {
        return new zzbag(1, str, Float.valueOf(f10));
    }

    public static zzbaj zzg(int i10, String str, int i11) {
        return new zzbae(1, str, Integer.valueOf(i11));
    }

    public static zzbaj zzh(int i10, String str, long j10) {
        return new zzbaf(1, str, Long.valueOf(j10));
    }

    public static zzbaj zzi(int i10, String str, Boolean bool) {
        return new zzbad(i10, str, bool);
    }

    public static zzbaj zzj(int i10, String str, String str2) {
        return new zzbah(1, str, str2);
    }

    public static zzbaj zzk(int i10, String str) {
        zzbaj zzj = zzj(1, "gads:sdk_core_constants:experiment_id", (String) null);
        a0.a().zzc(zzj);
        return zzj;
    }

    /* access modifiers changed from: protected */
    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzl() {
        return a0.c().zzb(this);
    }

    public final Object zzm() {
        return this.zzc;
    }

    public final String zzn() {
        return this.zzb;
    }
}
