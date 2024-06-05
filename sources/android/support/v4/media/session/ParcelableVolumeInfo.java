package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f619a;

    /* renamed from: b  reason: collision with root package name */
    public int f620b;

    /* renamed from: c  reason: collision with root package name */
    public int f621c;

    /* renamed from: d  reason: collision with root package name */
    public int f622d;

    /* renamed from: f  reason: collision with root package name */
    public int f623f;

    class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(int i10, int i11, int i12, int i13, int i14) {
        this.f619a = i10;
        this.f620b = i11;
        this.f621c = i12;
        this.f622d = i13;
        this.f623f = i14;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f619a);
        parcel.writeInt(this.f621c);
        parcel.writeInt(this.f622d);
        parcel.writeInt(this.f623f);
        parcel.writeInt(this.f620b);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f619a = parcel.readInt();
        this.f621c = parcel.readInt();
        this.f622d = parcel.readInt();
        this.f623f = parcel.readInt();
        this.f620b = parcel.readInt();
    }
}
