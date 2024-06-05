package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import i5.a;
import i5.c;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbup extends a {
    public static final Parcelable.Creator<zzbup> CREATOR = new zzbuq();
    public final String zza;
    public final int zzb;

    public zzbup(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public static zzbup zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzbup(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbup)) {
            zzbup zzbup = (zzbup) obj;
            if (!p.a(this.zza, zzbup.zza) || !p.a(Integer.valueOf(this.zzb), Integer.valueOf(zzbup.zzb))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return p.b(this.zza, Integer.valueOf(this.zzb));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 2, this.zza, false);
        c.k(parcel, 3, this.zzb);
        c.b(parcel, a10);
    }
}
