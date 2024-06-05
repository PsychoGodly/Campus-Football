package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;

public final class y0 implements we.b {
    public static final Parcelable.Creator<y0> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f13473a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13474b;

    public y0(int i10, String str) {
        this.f13473a = i10;
        this.f13474b = str;
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

    public String toString() {
        return "Ait(controlCode=" + this.f13473a + ",url=" + this.f13474b + ")";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13474b);
        parcel.writeInt(this.f13473a);
    }

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public y0 createFromParcel(Parcel parcel) {
            return new y0(parcel.readInt(), (String) a1.a((Object) parcel.readString()));
        }

        /* renamed from: a */
        public y0[] newArray(int i10) {
            return new y0[i10];
        }
    }
}
