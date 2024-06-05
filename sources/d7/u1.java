package d7;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.internal.q;
import com.google.firebase.auth.g;
import i5.c;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class u1 implements g {
    public static final Parcelable.Creator<u1> CREATOR = new x1();

    /* renamed from: a  reason: collision with root package name */
    private final String f28625a;

    /* renamed from: b  reason: collision with root package name */
    private final String f28626b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Object> f28627c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f28628d;

    public u1(boolean z10) {
        this.f28628d = z10;
        this.f28626b = null;
        this.f28625a = null;
        this.f28627c = null;
    }

    public final String D() {
        return this.f28625a;
    }

    public final String H() {
        if ("github.com".equals(this.f28625a)) {
            return (String) this.f28627c.get(AppLovinEventTypes.USER_LOGGED_IN);
        }
        if ("twitter.com".equals(this.f28625a)) {
            return (String) this.f28627c.get("screen_name");
        }
        return null;
    }

    public final Map<String, Object> R() {
        return this.f28627c;
    }

    public final boolean X() {
        return this.f28628d;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, D(), false);
        c.q(parcel, 2, this.f28626b, false);
        c.c(parcel, 3, X());
        c.b(parcel, a10);
    }

    public u1(String str, String str2, boolean z10) {
        q.g(str);
        q.g(str2);
        this.f28625a = str;
        this.f28626b = str2;
        this.f28627c = j0.d(str2);
        this.f28628d = z10;
    }
}
