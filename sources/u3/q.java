package u3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import f3.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n2.e2;
import n2.r1;

/* compiled from: HlsTrackMetadataEntry */
public final class q implements a.b {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f22964a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22965b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f22966c;

    /* compiled from: HlsTrackMetadataEntry */
    class a implements Parcelable.Creator<q> {
        a() {
        }

        /* renamed from: a */
        public q createFromParcel(Parcel parcel) {
            return new q(parcel);
        }

        /* renamed from: b */
        public q[] newArray(int i10) {
            return new q[i10];
        }
    }

    public q(String str, String str2, List<b> list) {
        this.f22964a = str;
        this.f22965b = str2;
        this.f22966c = Collections.unmodifiableList(new ArrayList(list));
    }

    public /* synthetic */ r1 F() {
        return f3.b.b(this);
    }

    public /* synthetic */ void M(e2.b bVar) {
        f3.b.c(this, bVar);
    }

    public /* synthetic */ byte[] a0() {
        return f3.b.a(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (!TextUtils.equals(this.f22964a, qVar.f22964a) || !TextUtils.equals(this.f22965b, qVar.f22965b) || !this.f22966c.equals(qVar.f22966c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f22964a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f22965b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode + i10) * 31) + this.f22966c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HlsTrackMetadataEntry");
        if (this.f22964a != null) {
            str = " [" + this.f22964a + ", " + this.f22965b + "]";
        } else {
            str = MaxReward.DEFAULT_LABEL;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22964a);
        parcel.writeString(this.f22965b);
        int size = this.f22966c.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable(this.f22966c.get(i11), 0);
        }
    }

    q(Parcel parcel) {
        this.f22964a = parcel.readString();
        this.f22965b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f22966c = Collections.unmodifiableList(arrayList);
    }

    /* compiled from: HlsTrackMetadataEntry */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final int f22967a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22968b;

        /* renamed from: c  reason: collision with root package name */
        public final String f22969c;

        /* renamed from: d  reason: collision with root package name */
        public final String f22970d;

        /* renamed from: f  reason: collision with root package name */
        public final String f22971f;

        /* renamed from: g  reason: collision with root package name */
        public final String f22972g;

        /* compiled from: HlsTrackMetadataEntry */
        class a implements Parcelable.Creator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            /* renamed from: b */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f22967a = i10;
            this.f22968b = i11;
            this.f22969c = str;
            this.f22970d = str2;
            this.f22971f = str3;
            this.f22972g = str4;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f22967a != bVar.f22967a || this.f22968b != bVar.f22968b || !TextUtils.equals(this.f22969c, bVar.f22969c) || !TextUtils.equals(this.f22970d, bVar.f22970d) || !TextUtils.equals(this.f22971f, bVar.f22971f) || !TextUtils.equals(this.f22972g, bVar.f22972g)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10 = ((this.f22967a * 31) + this.f22968b) * 31;
            String str = this.f22969c;
            int i11 = 0;
            int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f22970d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f22971f;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f22972g;
            if (str4 != null) {
                i11 = str4.hashCode();
            }
            return hashCode3 + i11;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f22967a);
            parcel.writeInt(this.f22968b);
            parcel.writeString(this.f22969c);
            parcel.writeString(this.f22970d);
            parcel.writeString(this.f22971f);
            parcel.writeString(this.f22972g);
        }

        b(Parcel parcel) {
            this.f22967a = parcel.readInt();
            this.f22968b = parcel.readInt();
            this.f22969c = parcel.readString();
            this.f22970d = parcel.readString();
            this.f22971f = parcel.readString();
            this.f22972g = parcel.readString();
        }
    }
}
