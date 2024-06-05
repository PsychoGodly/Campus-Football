package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.w;
import androidx.lifecycle.i;
import java.util.ArrayList;

/* compiled from: BackStackState */
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int[] f3486a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<String> f3487b;

    /* renamed from: c  reason: collision with root package name */
    final int[] f3488c;

    /* renamed from: d  reason: collision with root package name */
    final int[] f3489d;

    /* renamed from: f  reason: collision with root package name */
    final int f3490f;

    /* renamed from: g  reason: collision with root package name */
    final String f3491g;

    /* renamed from: h  reason: collision with root package name */
    final int f3492h;

    /* renamed from: i  reason: collision with root package name */
    final int f3493i;

    /* renamed from: j  reason: collision with root package name */
    final CharSequence f3494j;

    /* renamed from: k  reason: collision with root package name */
    final int f3495k;

    /* renamed from: l  reason: collision with root package name */
    final CharSequence f3496l;

    /* renamed from: m  reason: collision with root package name */
    final ArrayList<String> f3497m;

    /* renamed from: n  reason: collision with root package name */
    final ArrayList<String> f3498n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f3499o;

    /* compiled from: BackStackState */
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

    public b(a aVar) {
        int size = aVar.f3725c.size();
        this.f3486a = new int[(size * 5)];
        if (aVar.f3731i) {
            this.f3487b = new ArrayList<>(size);
            this.f3488c = new int[size];
            this.f3489d = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                w.a aVar2 = aVar.f3725c.get(i10);
                int i12 = i11 + 1;
                this.f3486a[i11] = aVar2.f3742a;
                ArrayList<String> arrayList = this.f3487b;
                Fragment fragment = aVar2.f3743b;
                arrayList.add(fragment != null ? fragment.f3424g : null);
                int[] iArr = this.f3486a;
                int i13 = i12 + 1;
                iArr[i12] = aVar2.f3744c;
                int i14 = i13 + 1;
                iArr[i13] = aVar2.f3745d;
                int i15 = i14 + 1;
                iArr[i14] = aVar2.f3746e;
                iArr[i15] = aVar2.f3747f;
                this.f3488c[i10] = aVar2.f3748g.ordinal();
                this.f3489d[i10] = aVar2.f3749h.ordinal();
                i10++;
                i11 = i15 + 1;
            }
            this.f3490f = aVar.f3730h;
            this.f3491g = aVar.f3733k;
            this.f3492h = aVar.f3481v;
            this.f3493i = aVar.f3734l;
            this.f3494j = aVar.f3735m;
            this.f3495k = aVar.f3736n;
            this.f3496l = aVar.f3737o;
            this.f3497m = aVar.f3738p;
            this.f3498n = aVar.f3739q;
            this.f3499o = aVar.f3740r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public a a(n nVar) {
        a aVar = new a(nVar);
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f3486a.length) {
            w.a aVar2 = new w.a();
            int i12 = i10 + 1;
            aVar2.f3742a = this.f3486a[i10];
            if (n.F0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f3486a[i12]);
            }
            String str = this.f3487b.get(i11);
            if (str != null) {
                aVar2.f3743b = nVar.g0(str);
            } else {
                aVar2.f3743b = null;
            }
            aVar2.f3748g = i.b.values()[this.f3488c[i11]];
            aVar2.f3749h = i.b.values()[this.f3489d[i11]];
            int[] iArr = this.f3486a;
            int i13 = i12 + 1;
            int i14 = iArr[i12];
            aVar2.f3744c = i14;
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            aVar2.f3745d = i16;
            int i17 = i15 + 1;
            int i18 = iArr[i15];
            aVar2.f3746e = i18;
            int i19 = iArr[i17];
            aVar2.f3747f = i19;
            aVar.f3726d = i14;
            aVar.f3727e = i16;
            aVar.f3728f = i18;
            aVar.f3729g = i19;
            aVar.e(aVar2);
            i11++;
            i10 = i17 + 1;
        }
        aVar.f3730h = this.f3490f;
        aVar.f3733k = this.f3491g;
        aVar.f3481v = this.f3492h;
        aVar.f3731i = true;
        aVar.f3734l = this.f3493i;
        aVar.f3735m = this.f3494j;
        aVar.f3736n = this.f3495k;
        aVar.f3737o = this.f3496l;
        aVar.f3738p = this.f3497m;
        aVar.f3739q = this.f3498n;
        aVar.f3740r = this.f3499o;
        aVar.p(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f3486a);
        parcel.writeStringList(this.f3487b);
        parcel.writeIntArray(this.f3488c);
        parcel.writeIntArray(this.f3489d);
        parcel.writeInt(this.f3490f);
        parcel.writeString(this.f3491g);
        parcel.writeInt(this.f3492h);
        parcel.writeInt(this.f3493i);
        TextUtils.writeToParcel(this.f3494j, parcel, 0);
        parcel.writeInt(this.f3495k);
        TextUtils.writeToParcel(this.f3496l, parcel, 0);
        parcel.writeStringList(this.f3497m);
        parcel.writeStringList(this.f3498n);
        parcel.writeInt(this.f3499o ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f3486a = parcel.createIntArray();
        this.f3487b = parcel.createStringArrayList();
        this.f3488c = parcel.createIntArray();
        this.f3489d = parcel.createIntArray();
        this.f3490f = parcel.readInt();
        this.f3491g = parcel.readString();
        this.f3492h = parcel.readInt();
        this.f3493i = parcel.readInt();
        this.f3494j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3495k = parcel.readInt();
        this.f3496l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3497m = parcel.createStringArrayList();
        this.f3498n = parcel.createStringArrayList();
        this.f3499o = parcel.readInt() != 0;
    }
}
