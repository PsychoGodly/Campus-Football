package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

/* compiled from: DateValidatorPointForward */
public class f implements a.c {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final long f25626a;

    /* compiled from: DateValidatorPointForward */
    static class a implements Parcelable.Creator<f> {
        a() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel.readLong(), (a) null);
        }

        /* renamed from: b */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    /* synthetic */ f(long j10, a aVar) {
        this(j10);
    }

    public static f a(long j10) {
        return new f(j10);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && this.f25626a == ((f) obj).f25626a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f25626a)});
    }

    public boolean o(long j10) {
        return j10 >= this.f25626a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f25626a);
    }

    private f(long j10) {
        this.f25626a = j10;
    }
}
