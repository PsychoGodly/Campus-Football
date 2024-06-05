package m3;

import android.os.Parcel;
import android.os.Parcelable;
import k4.a0;
import k4.n0;

/* compiled from: PrivateCommand */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0215a();

    /* renamed from: a  reason: collision with root package name */
    public final long f20040a;

    /* renamed from: b  reason: collision with root package name */
    public final long f20041b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f20042c;

    /* renamed from: m3.a$a  reason: collision with other inner class name */
    /* compiled from: PrivateCommand */
    class C0215a implements Parcelable.Creator<a> {
        C0215a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0215a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0215a aVar) {
        this(parcel);
    }

    static a a(a0 a0Var, int i10, long j10) {
        long I = a0Var.I();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        a0Var.l(bArr, 0, i11);
        return new a(I, bArr, j10);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f20040a);
        parcel.writeLong(this.f20041b);
        parcel.writeByteArray(this.f20042c);
    }

    private a(long j10, byte[] bArr, long j11) {
        this.f20040a = j11;
        this.f20041b = j10;
        this.f20042c = bArr;
    }

    private a(Parcel parcel) {
        this.f20040a = parcel.readLong();
        this.f20041b = parcel.readLong();
        this.f20042c = (byte[]) n0.j(parcel.createByteArray());
    }
}
