package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.qd;
import com.applovin.impl.we;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class gk implements we.b {
    public static final Parcelable.Creator<gk> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List f8036a;

    public gk(List list) {
        this.f8036a = list;
        a1.a(!a(list));
    }

    private static boolean a(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = ((b) list.get(0)).f8039b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (((b) list.get(i10)).f8038a < j10) {
                return true;
            }
            j10 = ((b) list.get(i10)).f8039b;
        }
        return false;
    }

    public /* synthetic */ void a(qd.b bVar) {
        e70.a(this, bVar);
    }

    public /* synthetic */ byte[] a() {
        return e70.b(this);
    }

    public /* synthetic */ d9 b() {
        return e70.c(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gk.class != obj.getClass()) {
            return false;
        }
        return this.f8036a.equals(((gk) obj).f8036a);
    }

    public int hashCode() {
        return this.f8036a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f8036a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f8036a);
    }

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public gk createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new gk(arrayList);
        }

        /* renamed from: a */
        public gk[] newArray(int i10) {
            return new gk[i10];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public static final Comparator f8037d = mx.f9865a;

        /* renamed from: a  reason: collision with root package name */
        public final long f8038a;

        /* renamed from: b  reason: collision with root package name */
        public final long f8039b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8040c;

        public b(long j10, long j11, int i10) {
            a1.a(j10 < j11);
            this.f8038a = j10;
            this.f8039b = j11;
            this.f8040c = i10;
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
            if (this.f8038a == bVar.f8038a && this.f8039b == bVar.f8039b && this.f8040c == bVar.f8040c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.f8038a), Long.valueOf(this.f8039b), Integer.valueOf(this.f8040c));
        }

        public String toString() {
            return yp.a("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f8038a), Long.valueOf(this.f8039b), Integer.valueOf(this.f8040c));
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f8038a);
            parcel.writeLong(this.f8039b);
            parcel.writeInt(this.f8040c);
        }

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            /* renamed from: a */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }
    }
}
