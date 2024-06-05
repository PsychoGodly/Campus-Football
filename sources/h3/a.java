package h3;

import android.os.Parcel;
import android.os.Parcelable;
import f3.a;
import f3.b;
import java.util.Arrays;
import k4.n0;
import n2.e2;
import n2.r1;

/* compiled from: EventMessage */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0200a();

    /* renamed from: h  reason: collision with root package name */
    private static final r1 f18734h = new r1.b().g0("application/id3").G();

    /* renamed from: i  reason: collision with root package name */
    private static final r1 f18735i = new r1.b().g0("application/x-scte35").G();

    /* renamed from: a  reason: collision with root package name */
    public final String f18736a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18737b;

    /* renamed from: c  reason: collision with root package name */
    public final long f18738c;

    /* renamed from: d  reason: collision with root package name */
    public final long f18739d;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f18740f;

    /* renamed from: g  reason: collision with root package name */
    private int f18741g;

    /* renamed from: h3.a$a  reason: collision with other inner class name */
    /* compiled from: EventMessage */
    class C0200a implements Parcelable.Creator<a> {
        C0200a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f18736a = str;
        this.f18737b = str2;
        this.f18738c = j10;
        this.f18739d = j11;
        this.f18740f = bArr;
    }

    public r1 F() {
        String str = this.f18736a;
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
                return f18735i;
            case 1:
            case 2:
                return f18734h;
            default:
                return null;
        }
    }

    public /* synthetic */ void M(e2.b bVar) {
        b.c(this, bVar);
    }

    public byte[] a0() {
        if (F() != null) {
            return this.f18740f;
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f18738c != aVar.f18738c || this.f18739d != aVar.f18739d || !n0.c(this.f18736a, aVar.f18736a) || !n0.c(this.f18737b, aVar.f18737b) || !Arrays.equals(this.f18740f, aVar.f18740f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f18741g == 0) {
            String str = this.f18736a;
            int i10 = 0;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f18737b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            long j10 = this.f18738c;
            long j11 = this.f18739d;
            this.f18741g = ((((((hashCode + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f18740f);
        }
        return this.f18741g;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f18736a + ", id=" + this.f18739d + ", durationMs=" + this.f18738c + ", value=" + this.f18737b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18736a);
        parcel.writeString(this.f18737b);
        parcel.writeLong(this.f18738c);
        parcel.writeLong(this.f18739d);
        parcel.writeByteArray(this.f18740f);
    }

    a(Parcel parcel) {
        this.f18736a = (String) n0.j(parcel.readString());
        this.f18737b = (String) n0.j(parcel.readString());
        this.f18738c = parcel.readLong();
        this.f18739d = parcel.readLong();
        this.f18740f = (byte[]) n0.j(parcel.createByteArray());
    }
}
