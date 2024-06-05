package l3;

import android.os.Parcel;
import android.os.Parcelable;
import f3.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import k4.n0;
import n2.e2;
import n2.r1;
import r6.k;

/* compiled from: SlowMotionData */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f19886a;

    /* compiled from: SlowMotionData */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new c(arrayList);
        }

        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* compiled from: SlowMotionData */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public static final Comparator<b> f19887d = d.f36058a;

        /* renamed from: a  reason: collision with root package name */
        public final long f19888a;

        /* renamed from: b  reason: collision with root package name */
        public final long f19889b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19890c;

        /* compiled from: SlowMotionData */
        class a implements Parcelable.Creator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            /* renamed from: b */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(long j10, long j11, int i10) {
            k4.a.a(j10 < j11);
            this.f19888a = j10;
            this.f19889b = j11;
            this.f19890c = i10;
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
            if (this.f19888a == bVar.f19888a && this.f19889b == bVar.f19889b && this.f19890c == bVar.f19890c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return k.b(Long.valueOf(this.f19888a), Long.valueOf(this.f19889b), Integer.valueOf(this.f19890c));
        }

        public String toString() {
            return n0.C("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f19888a), Long.valueOf(this.f19889b), Integer.valueOf(this.f19890c));
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f19888a);
            parcel.writeLong(this.f19889b);
            parcel.writeInt(this.f19890c);
        }
    }

    public c(List<b> list) {
        this.f19886a = list;
        k4.a.a(!a(list));
    }

    private static boolean a(List<b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f19889b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f19888a < j10) {
                return true;
            }
            j10 = list.get(i10).f19889b;
        }
        return false;
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
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f19886a.equals(((c) obj).f19886a);
    }

    public int hashCode() {
        return this.f19886a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f19886a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f19886a);
    }
}
