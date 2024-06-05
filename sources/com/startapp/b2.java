package com.startapp;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.AnimationUtils;

/* compiled from: Sta */
public abstract class b2 implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    public float f15634a;

    /* renamed from: b  reason: collision with root package name */
    public float f15635b;

    /* renamed from: c  reason: collision with root package name */
    public float f15636c = Float.MAX_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public float f15637d = -3.4028235E38f;

    /* renamed from: e  reason: collision with root package name */
    public long f15638e = 0;

    public b2() {
    }

    public String toString() {
        StringBuilder a10 = p0.a("Position: [");
        a10.append(this.f15634a);
        a10.append("], Velocity:[");
        a10.append(this.f15635b);
        a10.append("], MaxPos: [");
        a10.append(this.f15636c);
        a10.append("], mMinPos: [");
        a10.append(this.f15637d);
        a10.append("] LastTime:[");
        a10.append(this.f15638e);
        a10.append("]");
        return a10.toString();
    }

    public b2(Parcel parcel) {
        this.f15634a = parcel.readFloat();
        this.f15635b = parcel.readFloat();
        this.f15636c = parcel.readFloat();
        this.f15637d = parcel.readFloat();
        this.f15638e = AnimationUtils.currentAnimationTimeMillis();
    }
}
