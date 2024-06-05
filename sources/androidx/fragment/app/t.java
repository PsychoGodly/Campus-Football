package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: FragmentState */
final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final String f3699a;

    /* renamed from: b  reason: collision with root package name */
    final String f3700b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f3701c;

    /* renamed from: d  reason: collision with root package name */
    final int f3702d;

    /* renamed from: f  reason: collision with root package name */
    final int f3703f;

    /* renamed from: g  reason: collision with root package name */
    final String f3704g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f3705h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f3706i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f3707j;

    /* renamed from: k  reason: collision with root package name */
    final Bundle f3708k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f3709l;

    /* renamed from: m  reason: collision with root package name */
    final int f3710m;

    /* renamed from: n  reason: collision with root package name */
    Bundle f3711n;

    /* compiled from: FragmentState */
    class a implements Parcelable.Creator<t> {
        a() {
        }

        /* renamed from: a */
        public t createFromParcel(Parcel parcel) {
            return new t(parcel);
        }

        /* renamed from: b */
        public t[] newArray(int i10) {
            return new t[i10];
        }
    }

    t(Fragment fragment) {
        this.f3699a = fragment.getClass().getName();
        this.f3700b = fragment.f3424g;
        this.f3701c = fragment.f3432o;
        this.f3702d = fragment.f3441x;
        this.f3703f = fragment.f3442y;
        this.f3704g = fragment.f3443z;
        this.f3705h = fragment.C;
        this.f3706i = fragment.f3431n;
        this.f3707j = fragment.B;
        this.f3708k = fragment.f3425h;
        this.f3709l = fragment.A;
        this.f3710m = fragment.S.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f3699a);
        sb2.append(" (");
        sb2.append(this.f3700b);
        sb2.append(")}:");
        if (this.f3701c) {
            sb2.append(" fromLayout");
        }
        if (this.f3703f != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f3703f));
        }
        String str = this.f3704g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f3704g);
        }
        if (this.f3705h) {
            sb2.append(" retainInstance");
        }
        if (this.f3706i) {
            sb2.append(" removing");
        }
        if (this.f3707j) {
            sb2.append(" detached");
        }
        if (this.f3709l) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3699a);
        parcel.writeString(this.f3700b);
        parcel.writeInt(this.f3701c ? 1 : 0);
        parcel.writeInt(this.f3702d);
        parcel.writeInt(this.f3703f);
        parcel.writeString(this.f3704g);
        parcel.writeInt(this.f3705h ? 1 : 0);
        parcel.writeInt(this.f3706i ? 1 : 0);
        parcel.writeInt(this.f3707j ? 1 : 0);
        parcel.writeBundle(this.f3708k);
        parcel.writeInt(this.f3709l ? 1 : 0);
        parcel.writeBundle(this.f3711n);
        parcel.writeInt(this.f3710m);
    }

    t(Parcel parcel) {
        this.f3699a = parcel.readString();
        this.f3700b = parcel.readString();
        boolean z10 = true;
        this.f3701c = parcel.readInt() != 0;
        this.f3702d = parcel.readInt();
        this.f3703f = parcel.readInt();
        this.f3704g = parcel.readString();
        this.f3705h = parcel.readInt() != 0;
        this.f3706i = parcel.readInt() != 0;
        this.f3707j = parcel.readInt() != 0;
        this.f3708k = parcel.readBundle();
        this.f3709l = parcel.readInt() == 0 ? false : z10;
        this.f3711n = parcel.readBundle();
        this.f3710m = parcel.readInt();
    }
}
