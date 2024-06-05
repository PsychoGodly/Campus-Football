package y6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import y7.x;

/* compiled from: Timestamp */
public final class q implements Comparable<q>, Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final long f31347a;

    /* renamed from: b  reason: collision with root package name */
    private final int f31348b;

    /* compiled from: Timestamp */
    class a implements Parcelable.Creator<q> {
        a() {
        }

        /* renamed from: a */
        public q createFromParcel(Parcel parcel) {
            return new q(parcel);
        }

        /* renamed from: b */
        public q[] newArray(int i10) {
            return new q[i10];
        }
    }

    public q(long j10, int i10) {
        g(j10, i10);
        this.f31347a = j10;
        this.f31348b = i10;
    }

    public static q e() {
        return new q(new Date());
    }

    private static void g(long j10, int i10) {
        x.a(i10 >= 0, "Timestamp nanoseconds out of range: %s", Integer.valueOf(i10));
        x.a(((double) i10) < 1.0E9d, "Timestamp nanoseconds out of range: %s", Integer.valueOf(i10));
        x.a(j10 >= -62135596800L, "Timestamp seconds out of range: %s", Long.valueOf(j10));
        x.a(j10 < 253402300800L, "Timestamp seconds out of range: %s", Long.valueOf(j10));
    }

    /* renamed from: a */
    public int compareTo(q qVar) {
        long j10 = this.f31347a;
        long j11 = qVar.f31347a;
        if (j10 == j11) {
            return Integer.signum(this.f31348b - qVar.f31348b);
        }
        return Long.signum(j10 - j11);
    }

    public int c() {
        return this.f31348b;
    }

    public long d() {
        return this.f31347a;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof q) && compareTo((q) obj) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f31347a;
        return (((((int) j10) * 37 * 37) + ((int) (j10 >> 32))) * 37) + this.f31348b;
    }

    public String toString() {
        return "Timestamp(seconds=" + this.f31347a + ", nanoseconds=" + this.f31348b + ")";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f31347a);
        parcel.writeInt(this.f31348b);
    }

    protected q(Parcel parcel) {
        this.f31347a = parcel.readLong();
        this.f31348b = parcel.readInt();
    }

    public q(Date date) {
        long time = date.getTime();
        long j10 = time / 1000;
        int i10 = ((int) (time % 1000)) * 1000000;
        if (i10 < 0) {
            j10--;
            i10 += 1000000000;
        }
        g(j10, i10);
        this.f31347a = j10;
        this.f31348b = i10;
    }
}
