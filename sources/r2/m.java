package r2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import k4.n0;
import n2.i;

/* compiled from: DrmInitData */
public final class m implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final b[] f22077a;

    /* renamed from: b  reason: collision with root package name */
    private int f22078b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22079c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22080d;

    /* compiled from: DrmInitData */
    class a implements Parcelable.Creator<m> {
        a() {
        }

        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        /* renamed from: b */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    /* compiled from: DrmInitData */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private int f22081a;

        /* renamed from: b  reason: collision with root package name */
        public final UUID f22082b;

        /* renamed from: c  reason: collision with root package name */
        public final String f22083c;

        /* renamed from: d  reason: collision with root package name */
        public final String f22084d;

        /* renamed from: f  reason: collision with root package name */
        public final byte[] f22085f;

        /* compiled from: DrmInitData */
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

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, (String) null, str, bArr);
        }

        public boolean a(b bVar) {
            return c() && !bVar.c() && d(bVar.f22082b);
        }

        public b b(byte[] bArr) {
            return new b(this.f22082b, this.f22083c, this.f22084d, bArr);
        }

        public boolean c() {
            return this.f22085f != null;
        }

        public boolean d(UUID uuid) {
            return i.f20436a.equals(this.f22082b) || uuid.equals(this.f22082b);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            if (!n0.c(this.f22083c, bVar.f22083c) || !n0.c(this.f22084d, bVar.f22084d) || !n0.c(this.f22082b, bVar.f22082b) || !Arrays.equals(this.f22085f, bVar.f22085f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.f22081a == 0) {
                int hashCode = this.f22082b.hashCode() * 31;
                String str = this.f22083c;
                this.f22081a = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f22084d.hashCode()) * 31) + Arrays.hashCode(this.f22085f);
            }
            return this.f22081a;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f22082b.getMostSignificantBits());
            parcel.writeLong(this.f22082b.getLeastSignificantBits());
            parcel.writeString(this.f22083c);
            parcel.writeString(this.f22084d);
            parcel.writeByteArray(this.f22085f);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f22082b = (UUID) k4.a.e(uuid);
            this.f22083c = str;
            this.f22084d = (String) k4.a.e(str2);
            this.f22085f = bArr;
        }

        b(Parcel parcel) {
            this.f22082b = new UUID(parcel.readLong(), parcel.readLong());
            this.f22083c = parcel.readString();
            this.f22084d = (String) n0.j(parcel.readString());
            this.f22085f = parcel.createByteArray();
        }
    }

    public m(List<b> list) {
        this((String) null, false, (b[]) list.toArray(new b[0]));
    }

    private static boolean b(ArrayList<b> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).f22082b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static m d(m mVar, m mVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (mVar != null) {
            str = mVar.f22079c;
            for (b bVar : mVar.f22077a) {
                if (bVar.c()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (mVar2 != null) {
            if (str == null) {
                str = mVar2.f22079c;
            }
            int size = arrayList.size();
            for (b bVar2 : mVar2.f22077a) {
                if (bVar2.c() && !b(arrayList, size, bVar2.f22082b)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new m(str, (List<b>) arrayList);
    }

    /* renamed from: a */
    public int compare(b bVar, b bVar2) {
        UUID uuid = i.f20436a;
        if (uuid.equals(bVar.f22082b)) {
            return uuid.equals(bVar2.f22082b) ? 0 : 1;
        }
        return bVar.f22082b.compareTo(bVar2.f22082b);
    }

    public m c(String str) {
        if (n0.c(this.f22079c, str)) {
            return this;
        }
        return new m(str, false, this.f22077a);
    }

    public int describeContents() {
        return 0;
    }

    public b e(int i10) {
        return this.f22077a[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (!n0.c(this.f22079c, mVar.f22079c) || !Arrays.equals(this.f22077a, mVar.f22077a)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r3.f22079c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r2.m g(r2.m r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.f22079c
            if (r0 == 0) goto L_0x0011
            java.lang.String r1 = r3.f22079c
            if (r1 == 0) goto L_0x0011
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r0 = 0
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            k4.a.f(r0)
            java.lang.String r0 = r2.f22079c
            if (r0 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            java.lang.String r0 = r3.f22079c
        L_0x001c:
            r2.m$b[] r1 = r2.f22077a
            r2.m$b[] r3 = r3.f22077a
            java.lang.Object[] r3 = k4.n0.G0(r1, r3)
            r2.m$b[] r3 = (r2.m.b[]) r3
            r2.m r1 = new r2.m
            r1.<init>((java.lang.String) r0, (r2.m.b[]) r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.m.g(r2.m):r2.m");
    }

    public int hashCode() {
        if (this.f22078b == 0) {
            String str = this.f22079c;
            this.f22078b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f22077a);
        }
        return this.f22078b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22079c);
        parcel.writeTypedArray(this.f22077a, 0);
    }

    public m(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public m(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public m(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: r2.m$b[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private m(java.lang.String r1, boolean r2, r2.m.b... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f22079c = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            r2.m$b[] r3 = (r2.m.b[]) r3
        L_0x000e:
            r0.f22077a = r3
            int r1 = r3.length
            r0.f22080d = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.m.<init>(java.lang.String, boolean, r2.m$b[]):void");
    }

    m(Parcel parcel) {
        this.f22079c = parcel.readString();
        b[] bVarArr = (b[]) n0.j((b[]) parcel.createTypedArray(b.CREATOR));
        this.f22077a = bVarArr;
        this.f22080d = bVarArr.length;
    }
}
