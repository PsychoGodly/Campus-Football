package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class ef extends ua {
    public static final Parcelable.Creator<ef> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final int f7416b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7417c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7418d;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f7419f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f7420g;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public ef[] newArray(int i10) {
            return new ef[i10];
        }

        /* renamed from: a */
        public ef createFromParcel(Parcel parcel) {
            return new ef(parcel);
        }
    }

    public ef(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f7416b = i10;
        this.f7417c = i11;
        this.f7418d = i12;
        this.f7419f = iArr;
        this.f7420g = iArr2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ef.class != obj.getClass()) {
            return false;
        }
        ef efVar = (ef) obj;
        if (this.f7416b == efVar.f7416b && this.f7417c == efVar.f7417c && this.f7418d == efVar.f7418d && Arrays.equals(this.f7419f, efVar.f7419f) && Arrays.equals(this.f7420g, efVar.f7420g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.f7416b + 527) * 31) + this.f7417c) * 31) + this.f7418d) * 31) + Arrays.hashCode(this.f7419f)) * 31) + Arrays.hashCode(this.f7420g);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7416b);
        parcel.writeInt(this.f7417c);
        parcel.writeInt(this.f7418d);
        parcel.writeIntArray(this.f7419f);
        parcel.writeIntArray(this.f7420g);
    }

    ef(Parcel parcel) {
        super("MLLT");
        this.f7416b = parcel.readInt();
        this.f7417c = parcel.readInt();
        this.f7418d = parcel.readInt();
        this.f7419f = (int[]) yp.a((Object) parcel.createIntArray());
        this.f7420g = (int[]) yp.a((Object) parcel.createIntArray());
    }
}
