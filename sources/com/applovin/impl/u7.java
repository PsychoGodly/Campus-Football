package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.d9;
import com.applovin.impl.qd;
import com.applovin.impl.we;
import java.util.Arrays;

public final class u7 implements we.b {
    public static final Parcelable.Creator<u7> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    private static final d9 f12534h = new d9.b().f("application/id3").a();

    /* renamed from: i  reason: collision with root package name */
    private static final d9 f12535i = new d9.b().f("application/x-scte35").a();

    /* renamed from: a  reason: collision with root package name */
    public final String f12536a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12537b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12538c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12539d;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f12540f;

    /* renamed from: g  reason: collision with root package name */
    private int f12541g;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public u7[] newArray(int i10) {
            return new u7[i10];
        }

        /* renamed from: a */
        public u7 createFromParcel(Parcel parcel) {
            return new u7(parcel);
        }
    }

    u7(Parcel parcel) {
        this.f12536a = (String) yp.a((Object) parcel.readString());
        this.f12537b = (String) yp.a((Object) parcel.readString());
        this.f12538c = parcel.readLong();
        this.f12539d = parcel.readLong();
        this.f12540f = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    public /* synthetic */ void a(qd.b bVar) {
        e70.a(this, bVar);
    }

    public byte[] a() {
        if (b() != null) {
            return this.f12540f;
        }
        return null;
    }

    public d9 b() {
        String str = this.f12536a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f12535i;
            case 1:
            case 2:
                return f12534h;
            default:
                return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u7.class != obj.getClass()) {
            return false;
        }
        u7 u7Var = (u7) obj;
        if (this.f12538c != u7Var.f12538c || this.f12539d != u7Var.f12539d || !yp.a((Object) this.f12536a, (Object) u7Var.f12536a) || !yp.a((Object) this.f12537b, (Object) u7Var.f12537b) || !Arrays.equals(this.f12540f, u7Var.f12540f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f12541g == 0) {
            String str = this.f12536a;
            int i10 = 0;
            int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.f12537b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            long j10 = this.f12538c;
            long j11 = this.f12539d;
            this.f12541g = ((((((hashCode + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f12540f);
        }
        return this.f12541g;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f12536a + ", id=" + this.f12539d + ", durationMs=" + this.f12538c + ", value=" + this.f12537b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12536a);
        parcel.writeString(this.f12537b);
        parcel.writeLong(this.f12538c);
        parcel.writeLong(this.f12539d);
        parcel.writeByteArray(this.f12540f);
    }

    public u7(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f12536a = str;
        this.f12537b = str2;
        this.f12538c = j10;
        this.f12539d = j11;
        this.f12540f = bArr;
    }
}
