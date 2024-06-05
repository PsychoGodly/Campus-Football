package com.startapp;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: Sta */
public class v7 extends b2 {
    public static final Parcelable.Creator<v7> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public float f17413f;

    /* renamed from: g  reason: collision with root package name */
    public float f17414g;

    /* compiled from: Sta */
    public class a implements Parcelable.Creator<v7> {
        public Object createFromParcel(Parcel parcel) {
            return new v7(parcel);
        }

        public Object[] newArray(int i10) {
            return new v7[i10];
        }
    }

    public v7(float f10, float f11) {
        this.f17413f = f10;
        this.f17414g = f11;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return super.toString() + ", Friction: [" + this.f17413f + "], Snap:[" + this.f17414g + "]";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f15634a);
        parcel.writeFloat(this.f15635b);
        parcel.writeFloat(this.f15636c);
        parcel.writeFloat(this.f15637d);
        parcel.writeFloat(this.f17413f);
        parcel.writeFloat(this.f17414g);
    }

    public v7(Parcel parcel) {
        super(parcel);
        this.f17413f = parcel.readFloat();
        this.f17414g = parcel.readFloat();
    }
}
