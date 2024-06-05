package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.a;
import com.applovin.mediation.MaxReward;
import java.lang.reflect.Method;

/* compiled from: VersionedParcelParcel */
class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f4964d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f4965e;

    /* renamed from: f  reason: collision with root package name */
    private final int f4966f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4967g;

    /* renamed from: h  reason: collision with root package name */
    private final String f4968h;

    /* renamed from: i  reason: collision with root package name */
    private int f4969i;

    /* renamed from: j  reason: collision with root package name */
    private int f4970j;

    /* renamed from: k  reason: collision with root package name */
    private int f4971k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), MaxReward.DEFAULT_LABEL, new a(), new a(), new a());
    }

    public String D() {
        return this.f4965e.readString();
    }

    public IBinder F() {
        return this.f4965e.readStrongBinder();
    }

    public void J(int i10) {
        a();
        this.f4969i = i10;
        this.f4964d.put(i10, this.f4965e.dataPosition());
        X(0);
        X(i10);
    }

    public void L(boolean z10) {
        this.f4965e.writeInt(z10 ? 1 : 0);
    }

    public void N(Bundle bundle) {
        this.f4965e.writeBundle(bundle);
    }

    public void P(byte[] bArr) {
        if (bArr != null) {
            this.f4965e.writeInt(bArr.length);
            this.f4965e.writeByteArray(bArr);
            return;
        }
        this.f4965e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    public void R(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4965e, 0);
    }

    public void V(float f10) {
        this.f4965e.writeFloat(f10);
    }

    public void X(int i10) {
        this.f4965e.writeInt(i10);
    }

    public void a() {
        int i10 = this.f4969i;
        if (i10 >= 0) {
            int i11 = this.f4964d.get(i10);
            int dataPosition = this.f4965e.dataPosition();
            this.f4965e.setDataPosition(i11);
            this.f4965e.writeInt(dataPosition - i11);
            this.f4965e.setDataPosition(dataPosition);
        }
    }

    public void a0(long j10) {
        this.f4965e.writeLong(j10);
    }

    /* access modifiers changed from: protected */
    public a b() {
        Parcel parcel = this.f4965e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f4970j;
        if (i10 == this.f4966f) {
            i10 = this.f4967g;
        }
        int i11 = i10;
        return new b(parcel, dataPosition, i11, this.f4968h + "  ", this.f4960a, this.f4961b, this.f4962c);
    }

    public void c0(Parcelable parcelable) {
        this.f4965e.writeParcelable(parcelable, 0);
    }

    public void g0(String str) {
        this.f4965e.writeString(str);
    }

    public boolean h() {
        return this.f4965e.readInt() != 0;
    }

    public void i0(IBinder iBinder) {
        this.f4965e.writeStrongBinder(iBinder);
    }

    public Bundle j() {
        return this.f4965e.readBundle(getClass().getClassLoader());
    }

    public byte[] l() {
        int readInt = this.f4965e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f4965e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public CharSequence n() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4965e);
    }

    public boolean q(int i10) {
        while (this.f4970j < this.f4967g) {
            int i11 = this.f4971k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f4965e.setDataPosition(this.f4970j);
            int readInt = this.f4965e.readInt();
            this.f4971k = this.f4965e.readInt();
            this.f4970j += readInt;
        }
        if (this.f4971k == i10) {
            return true;
        }
        return false;
    }

    public float r() {
        return this.f4965e.readFloat();
    }

    public int u() {
        return this.f4965e.readInt();
    }

    public long x() {
        return this.f4965e.readLong();
    }

    public <T extends Parcelable> T z() {
        return this.f4965e.readParcelable(getClass().getClassLoader());
    }

    private b(Parcel parcel, int i10, int i11, String str, a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f4964d = new SparseIntArray();
        this.f4969i = -1;
        this.f4970j = 0;
        this.f4971k = -1;
        this.f4965e = parcel;
        this.f4966f = i10;
        this.f4967g = i11;
        this.f4970j = i10;
        this.f4968h = str;
    }
}
