package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.n;
import java.util.ArrayList;

/* compiled from: FragmentManagerState */
final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    ArrayList<t> f3683a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<String> f3684b;

    /* renamed from: c  reason: collision with root package name */
    b[] f3685c;

    /* renamed from: d  reason: collision with root package name */
    int f3686d;

    /* renamed from: f  reason: collision with root package name */
    String f3687f = null;

    /* renamed from: g  reason: collision with root package name */
    ArrayList<String> f3688g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    ArrayList<Bundle> f3689h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    ArrayList<n.m> f3690i;

    /* compiled from: FragmentManagerState */
    class a implements Parcelable.Creator<p> {
        a() {
        }

        /* renamed from: a */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        /* renamed from: b */
        public p[] newArray(int i10) {
            return new p[i10];
        }
    }

    public p() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f3683a);
        parcel.writeStringList(this.f3684b);
        parcel.writeTypedArray(this.f3685c, i10);
        parcel.writeInt(this.f3686d);
        parcel.writeString(this.f3687f);
        parcel.writeStringList(this.f3688g);
        parcel.writeTypedList(this.f3689h);
        parcel.writeTypedList(this.f3690i);
    }

    public p(Parcel parcel) {
        this.f3683a = parcel.createTypedArrayList(t.CREATOR);
        this.f3684b = parcel.createStringArrayList();
        this.f3685c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f3686d = parcel.readInt();
        this.f3687f = parcel.readString();
        this.f3688g = parcel.createStringArrayList();
        this.f3689h = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f3690i = parcel.createTypedArrayList(n.m.CREATOR);
    }
}
