package l3;

import android.os.Parcel;
import android.os.Parcelable;
import f3.a;
import n2.e2;
import n2.r1;
import v6.g;

/* compiled from: MotionPhotoMetadata */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f19881a;

    /* renamed from: b  reason: collision with root package name */
    public final long f19882b;

    /* renamed from: c  reason: collision with root package name */
    public final long f19883c;

    /* renamed from: d  reason: collision with root package name */
    public final long f19884d;

    /* renamed from: f  reason: collision with root package name */
    public final long f19885f;

    /* compiled from: MotionPhotoMetadata */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, (a) null);
        }

        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* synthetic */ b(Parcel parcel, a aVar) {
        this(parcel);
    }

    public /* synthetic */ r1 F() {
        return f3.b.b(this);
    }

    public /* synthetic */ void M(e2.b bVar) {
        f3.b.c(this, bVar);
    }

    public /* synthetic */ byte[] a0() {
        return f3.b.a(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f19881a == bVar.f19881a && this.f19882b == bVar.f19882b && this.f19883c == bVar.f19883c && this.f19884d == bVar.f19884d && this.f19885f == bVar.f19885f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + g.b(this.f19881a)) * 31) + g.b(this.f19882b)) * 31) + g.b(this.f19883c)) * 31) + g.b(this.f19884d)) * 31) + g.b(this.f19885f);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f19881a + ", photoSize=" + this.f19882b + ", photoPresentationTimestampUs=" + this.f19883c + ", videoStartPosition=" + this.f19884d + ", videoSize=" + this.f19885f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f19881a);
        parcel.writeLong(this.f19882b);
        parcel.writeLong(this.f19883c);
        parcel.writeLong(this.f19884d);
        parcel.writeLong(this.f19885f);
    }

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f19881a = j10;
        this.f19882b = j11;
        this.f19883c = j12;
        this.f19884d = j13;
        this.f19885f = j14;
    }

    private b(Parcel parcel) {
        this.f19881a = parcel.readLong();
        this.f19882b = parcel.readLong();
        this.f19883c = parcel.readLong();
        this.f19884d = parcel.readLong();
        this.f19885f = parcel.readLong();
    }
}
