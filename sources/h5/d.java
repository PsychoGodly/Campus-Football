package h5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.unity3d.ads.metadata.MediationMetaData;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new q();

    /* renamed from: a  reason: collision with root package name */
    private final String f18823a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    private final int f18824b;

    /* renamed from: c  reason: collision with root package name */
    private final long f18825c;

    public d(String str, int i10, long j10) {
        this.f18823a = str;
        this.f18824b = i10;
        this.f18825c = j10;
    }

    public d(String str, long j10) {
        this.f18823a = str;
        this.f18825c = j10;
        this.f18824b = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (((v() == null || !v().equals(dVar.v())) && (v() != null || dVar.v() != null)) || w() != dVar.w()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return p.b(v(), Long.valueOf(w()));
    }

    public final String toString() {
        p.a c10 = p.c(this);
        c10.a(MediationMetaData.KEY_NAME, v());
        c10.a("version", Long.valueOf(w()));
        return c10.toString();
    }

    public String v() {
        return this.f18823a;
    }

    public long w() {
        long j10 = this.f18825c;
        return j10 == -1 ? (long) this.f18824b : j10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, v(), false);
        c.k(parcel, 2, this.f18824b);
        c.n(parcel, 3, w());
        c.b(parcel, a10);
    }
}
