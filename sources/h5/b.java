package h5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new p();

    /* renamed from: f  reason: collision with root package name */
    public static final b f18803f = new b(0);

    /* renamed from: a  reason: collision with root package name */
    final int f18804a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18805b;

    /* renamed from: c  reason: collision with root package name */
    private final PendingIntent f18806c;

    /* renamed from: d  reason: collision with root package name */
    private final String f18807d;

    public b(int i10) {
        this(i10, (PendingIntent) null, (String) null);
    }

    b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f18804a = i10;
        this.f18805b = i11;
        this.f18806c = pendingIntent;
        this.f18807d = str;
    }

    static String B(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18805b == bVar.f18805b && p.a(this.f18806c, bVar.f18806c) && p.a(this.f18807d, bVar.f18807d);
    }

    public int hashCode() {
        return p.b(Integer.valueOf(this.f18805b), this.f18806c, this.f18807d);
    }

    public String toString() {
        p.a c10 = p.c(this);
        c10.a("statusCode", B(this.f18805b));
        c10.a("resolution", this.f18806c);
        c10.a("message", this.f18807d);
        return c10.toString();
    }

    public int v() {
        return this.f18805b;
    }

    public String w() {
        return this.f18807d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f18804a);
        c.k(parcel, 2, v());
        c.p(parcel, 3, x(), i10, false);
        c.q(parcel, 4, w(), false);
        c.b(parcel, a10);
    }

    public PendingIntent x() {
        return this.f18806c;
    }

    public boolean y() {
        return (this.f18805b == 0 || this.f18806c == null) ? false : true;
    }

    public boolean z() {
        return this.f18805b == 0;
    }

    public b(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, (String) null);
    }

    public b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }
}
