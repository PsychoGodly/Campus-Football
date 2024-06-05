package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.util.w0;
import i5.a;
import i5.c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbvy extends a {
    public static final Parcelable.Creator<zzbvy> CREATOR = new zzbvz();
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final List zze;
    public final boolean zzf;
    public final boolean zzg;
    public final List zzh;

    public zzbvy(String str, String str2, boolean z10, boolean z11, List list, boolean z12, boolean z13, List list2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = z11;
        this.zze = list;
        this.zzf = z12;
        this.zzg = z13;
        this.zzh = list2 == null ? new ArrayList() : list2;
    }

    public static zzbvy zza(JSONObject jSONObject) throws JSONException {
        return new zzbvy(jSONObject.optString("click_string", MaxReward.DEFAULT_LABEL), jSONObject.optString("report_url", MaxReward.DEFAULT_LABEL), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), w0.c(jSONObject.optJSONArray("allowed_headers"), (List) null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), w0.c(jSONObject.optJSONArray("webview_permissions"), (List) null));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 2, this.zza, false);
        c.q(parcel, 3, this.zzb, false);
        c.c(parcel, 4, this.zzc);
        c.c(parcel, 5, this.zzd);
        c.s(parcel, 6, this.zze, false);
        c.c(parcel, 7, this.zzf);
        c.c(parcel, 8, this.zzg);
        c.s(parcel, 9, this.zzh, false);
        c.b(parcel, a10);
    }
}
