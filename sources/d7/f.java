package d7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.b0;
import i5.c;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class f implements b0 {
    public static final Parcelable.Creator<f> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    private long f28546a;

    /* renamed from: b  reason: collision with root package name */
    private long f28547b;

    public f(long j10, long j11) {
        this.f28546a = j10;
        this.f28547b = j11;
    }

    public static f a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new f(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final long G() {
        return this.f28547b;
    }

    public final long N() {
        return this.f28546a;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f28546a);
            jSONObject.put("creationTimestamp", this.f28547b);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, N());
        c.n(parcel, 2, G());
        c.b(parcel, a10);
    }
}
