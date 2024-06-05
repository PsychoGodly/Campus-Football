package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import java.util.Arrays;
import java.util.List;

public final class we implements Parcelable {
    public static final Parcelable.Creator<we> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final b[] f13060a;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public we[] newArray(int i10) {
            return new we[i10];
        }

        /* renamed from: a */
        public we createFromParcel(Parcel parcel) {
            return new we(parcel);
        }
    }

    public interface b extends Parcelable {
        void a(qd.b bVar);

        byte[] a();

        d9 b();
    }

    we(Parcel parcel) {
        this.f13060a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f13060a;
            if (i10 < bVarArr.length) {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            } else {
                return;
            }
        }
    }

    public we a(b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        return new we((b[]) yp.a((Object[]) this.f13060a, (Object[]) bVarArr));
    }

    public int c() {
        return this.f13060a.length;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || we.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f13060a, ((we) obj).f13060a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f13060a);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f13060a);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f13060a.length);
        for (b writeParcelable : this.f13060a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public we a(we weVar) {
        return weVar == null ? this : a(weVar.f13060a);
    }

    public b a(int i10) {
        return this.f13060a[i10];
    }

    public we(List list) {
        this.f13060a = (b[]) list.toArray(new b[0]);
    }

    public we(b... bVarArr) {
        this.f13060a = bVarArr;
    }
}
