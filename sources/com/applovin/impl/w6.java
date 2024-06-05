package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class w6 implements Comparator, Parcelable {
    public static final Parcelable.Creator<w6> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final b[] f13008a;

    /* renamed from: b  reason: collision with root package name */
    private int f13009b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13010c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13011d;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public w6[] newArray(int i10) {
            return new w6[i10];
        }

        /* renamed from: a */
        public w6 createFromParcel(Parcel parcel) {
            return new w6(parcel);
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private int f13012a;

        /* renamed from: b  reason: collision with root package name */
        public final UUID f13013b;

        /* renamed from: c  reason: collision with root package name */
        public final String f13014c;

        /* renamed from: d  reason: collision with root package name */
        public final String f13015d;

        /* renamed from: f  reason: collision with root package name */
        public final byte[] f13016f;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public b[] newArray(int i10) {
                return new b[i10];
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }
        }

        b(Parcel parcel) {
            this.f13013b = new UUID(parcel.readLong(), parcel.readLong());
            this.f13014c = parcel.readString();
            this.f13015d = (String) yp.a((Object) parcel.readString());
            this.f13016f = parcel.createByteArray();
        }

        public boolean a(UUID uuid) {
            return r2.f11113a.equals(this.f13013b) || uuid.equals(this.f13013b);
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
            if (!yp.a((Object) this.f13014c, (Object) bVar.f13014c) || !yp.a((Object) this.f13015d, (Object) bVar.f13015d) || !yp.a((Object) this.f13013b, (Object) bVar.f13013b) || !Arrays.equals(this.f13016f, bVar.f13016f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.f13012a == 0) {
                int hashCode = this.f13013b.hashCode() * 31;
                String str = this.f13014c;
                this.f13012a = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f13015d.hashCode()) * 31) + Arrays.hashCode(this.f13016f);
            }
            return this.f13012a;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f13013b.getMostSignificantBits());
            parcel.writeLong(this.f13013b.getLeastSignificantBits());
            parcel.writeString(this.f13014c);
            parcel.writeString(this.f13015d);
            parcel.writeByteArray(this.f13016f);
        }

        public b a(byte[] bArr) {
            return new b(this.f13013b, this.f13014c, this.f13015d, bArr);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f13013b = (UUID) a1.a((Object) uuid);
            this.f13014c = str;
            this.f13015d = (String) a1.a((Object) str2);
            this.f13016f = bArr;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, (String) null, str, bArr);
        }
    }

    w6(Parcel parcel) {
        this.f13010c = parcel.readString();
        b[] bVarArr = (b[]) yp.a((Object) (b[]) parcel.createTypedArray(b.CREATOR));
        this.f13008a = bVarArr;
        this.f13011d = bVarArr.length;
    }

    public w6 a(String str) {
        if (yp.a((Object) this.f13010c, (Object) str)) {
            return this;
        }
        return new w6(str, false, this.f13008a);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w6.class != obj.getClass()) {
            return false;
        }
        w6 w6Var = (w6) obj;
        if (!yp.a((Object) this.f13010c, (Object) w6Var.f13010c) || !Arrays.equals(this.f13008a, w6Var.f13008a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f13009b == 0) {
            String str = this.f13010c;
            this.f13009b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f13008a);
        }
        return this.f13009b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13010c);
        parcel.writeTypedArray(this.f13008a, 0);
    }

    public b a(int i10) {
        return this.f13008a[i10];
    }

    /* renamed from: a */
    public int compare(b bVar, b bVar2) {
        UUID uuid = r2.f11113a;
        if (uuid.equals(bVar.f13013b)) {
            return uuid.equals(bVar2.f13013b) ? 0 : 1;
        }
        return bVar.f13013b.compareTo(bVar2.f13013b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.applovin.impl.w6$b[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private w6(java.lang.String r1, boolean r2, com.applovin.impl.w6.b... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f13010c = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.applovin.impl.w6$b[] r3 = (com.applovin.impl.w6.b[]) r3
        L_0x000e:
            r0.f13008a = r3
            int r1 = r3.length
            r0.f13011d = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.w6.<init>(java.lang.String, boolean, com.applovin.impl.w6$b[]):void");
    }

    public w6(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public w6(List list) {
        this((String) null, false, (b[]) list.toArray(new b[0]));
    }

    public w6(b... bVarArr) {
        this((String) null, bVarArr);
    }
}
