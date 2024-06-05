package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class c3 extends ua {
    public static final Parcelable.Creator<c3> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f6823b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6824c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6825d;

    /* renamed from: f  reason: collision with root package name */
    public final long f6826f;

    /* renamed from: g  reason: collision with root package name */
    public final long f6827g;

    /* renamed from: h  reason: collision with root package name */
    private final ua[] f6828h;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public c3[] newArray(int i10) {
            return new c3[i10];
        }

        /* renamed from: a */
        public c3 createFromParcel(Parcel parcel) {
            return new c3(parcel);
        }
    }

    c3(Parcel parcel) {
        super("CHAP");
        this.f6823b = (String) yp.a((Object) parcel.readString());
        this.f6824c = parcel.readInt();
        this.f6825d = parcel.readInt();
        this.f6826f = parcel.readLong();
        this.f6827g = parcel.readLong();
        int readInt = parcel.readInt();
        this.f6828h = new ua[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f6828h[i10] = (ua) parcel.readParcelable(ua.class.getClassLoader());
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c3.class != obj.getClass()) {
            return false;
        }
        c3 c3Var = (c3) obj;
        if (this.f6824c == c3Var.f6824c && this.f6825d == c3Var.f6825d && this.f6826f == c3Var.f6826f && this.f6827g == c3Var.f6827g && yp.a((Object) this.f6823b, (Object) c3Var.f6823b) && Arrays.equals(this.f6828h, c3Var.f6828h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((((this.f6824c + 527) * 31) + this.f6825d) * 31) + ((int) this.f6826f)) * 31) + ((int) this.f6827g)) * 31;
        String str = this.f6823b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6823b);
        parcel.writeInt(this.f6824c);
        parcel.writeInt(this.f6825d);
        parcel.writeLong(this.f6826f);
        parcel.writeLong(this.f6827g);
        parcel.writeInt(this.f6828h.length);
        for (ua writeParcelable : this.f6828h) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public c3(String str, int i10, int i11, long j10, long j11, ua[] uaVarArr) {
        super("CHAP");
        this.f6823b = str;
        this.f6824c = i10;
        this.f6825d = i11;
        this.f6826f = j10;
        this.f6827g = j11;
        this.f6828h = uaVarArr;
    }
}
