package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import i5.a;
import i5.c;
import m5.h;
import m5.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzafn extends a implements zzacs<zzafn> {
    public static final Parcelable.Creator<zzafn> CREATOR = new zzafm();
    private static final String zza = zzafn.class.getSimpleName();
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    public zzafn() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    /* access modifiers changed from: private */
    /* renamed from: zzd */
    public final zzafn zza(String str) throws zzaaf {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = q.a(jSONObject.optString("refresh_token"));
            this.zzc = q.a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0));
            this.zze = q.a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 2, this.zzb, false);
        c.q(parcel, 3, this.zzc, false);
        c.o(parcel, 4, Long.valueOf(zza()), false);
        c.q(parcel, 5, this.zze, false);
        c.o(parcel, 6, Long.valueOf(this.zzf.longValue()), false);
        c.b(parcel, a10);
    }

    public final long zza() {
        Long l10 = this.zzd;
        if (l10 == null) {
            return 0;
        }
        return l10.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzxw(e10);
        }
    }

    public final boolean zzg() {
        return h.d().a() + 300000 < this.zzf.longValue() + (this.zzd.longValue() * 1000);
    }

    public static zzafn zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzafn zzafn = new zzafn();
            zzafn.zzb = jSONObject.optString("refresh_token", (String) null);
            zzafn.zzc = jSONObject.optString("access_token", (String) null);
            zzafn.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzafn.zze = jSONObject.optString("token_type", (String) null);
            zzafn.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzafn;
        } catch (JSONException e10) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzxw(e10);
        }
    }

    public final void zzc(String str) {
        this.zzb = com.google.android.gms.common.internal.q.g(str);
    }

    public zzafn(String str, String str2, Long l10, String str3) {
        this(str, str2, l10, str3, Long.valueOf(System.currentTimeMillis()));
    }

    zzafn(String str, String str2, Long l10, String str3, Long l11) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l10;
        this.zze = str3;
        this.zzf = l11;
    }

    public final String zzd() {
        return this.zzb;
    }
}
