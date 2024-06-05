package f3;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.mediation.MaxReward;
import java.util.Arrays;
import java.util.List;
import k4.n0;
import n2.e2;
import n2.r1;
import v6.g;

/* compiled from: Metadata */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0188a();

    /* renamed from: a  reason: collision with root package name */
    private final b[] f17985a;

    /* renamed from: b  reason: collision with root package name */
    public final long f17986b;

    /* renamed from: f3.a$a  reason: collision with other inner class name */
    /* compiled from: Metadata */
    class C0188a implements Parcelable.Creator<a> {
        C0188a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* compiled from: Metadata */
    public interface b extends Parcelable {
        r1 F();

        void M(e2.b bVar);

        byte[] a0();
    }

    public a(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public a a(b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        return new a(this.f17986b, (b[]) n0.G0(this.f17985a, bVarArr));
    }

    public a b(a aVar) {
        return aVar == null ? this : a(aVar.f17985a);
    }

    public a c(long j10) {
        if (this.f17986b == j10) {
            return this;
        }
        return new a(j10, this.f17985a);
    }

    public b d(int i10) {
        return this.f17985a[i10];
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f17985a.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!Arrays.equals(this.f17985a, aVar.f17985a) || this.f17986b != aVar.f17986b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f17985a) * 31) + g.b(this.f17986b);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f17985a));
        if (this.f17986b == -9223372036854775807L) {
            str = MaxReward.DEFAULT_LABEL;
        } else {
            str = ", presentationTimeUs=" + this.f17986b;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f17985a.length);
        for (b writeParcelable : this.f17985a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
        parcel.writeLong(this.f17986b);
    }

    public a(long j10, b... bVarArr) {
        this.f17986b = j10;
        this.f17985a = bVarArr;
    }

    public a(List<? extends b> list) {
        this((b[]) list.toArray(new b[0]));
    }

    public a(long j10, List<? extends b> list) {
        this(j10, (b[]) list.toArray(new b[0]));
    }

    a(Parcel parcel) {
        this.f17985a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f17985a;
            if (i10 < bVarArr.length) {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            } else {
                this.f17986b = parcel.readLong();
                return;
            }
        }
    }
}
