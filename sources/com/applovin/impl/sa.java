package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;
import java.util.Arrays;

public final class sa implements we.b {
    public static final Parcelable.Creator<sa> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f11337a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11338b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11339c;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public sa[] newArray(int i10) {
            return new sa[i10];
        }

        /* renamed from: a */
        public sa createFromParcel(Parcel parcel) {
            return new sa(parcel);
        }
    }

    sa(Parcel parcel) {
        this.f11337a = (byte[]) a1.a((Object) parcel.createByteArray());
        this.f11338b = parcel.readString();
        this.f11339c = parcel.readString();
    }

    public void a(qd.b bVar) {
        String str = this.f11338b;
        if (str != null) {
            bVar.k((CharSequence) str);
        }
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
        if (obj == null || sa.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f11337a, ((sa) obj).f11337a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f11337a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[]{this.f11338b, this.f11339c, Integer.valueOf(this.f11337a.length)});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f11337a);
        parcel.writeString(this.f11338b);
        parcel.writeString(this.f11339c);
    }

    public sa(byte[] bArr, String str, String str2) {
        this.f11337a = bArr;
        this.f11338b = str;
        this.f11339c = str2;
    }
}
