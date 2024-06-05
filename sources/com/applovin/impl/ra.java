package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;

public final class ra implements we.b {
    public static final Parcelable.Creator<ra> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f11164a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11165b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11166c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11167d;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f11168f;

    /* renamed from: g  reason: collision with root package name */
    public final int f11169g;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public ra[] newArray(int i10) {
            return new ra[i10];
        }

        /* renamed from: a */
        public ra createFromParcel(Parcel parcel) {
            return new ra(parcel);
        }
    }

    public ra(int i10, String str, String str2, String str3, boolean z10, int i11) {
        a1.a(i11 == -1 || i11 > 0);
        this.f11164a = i10;
        this.f11165b = str;
        this.f11166c = str2;
        this.f11167d = str3;
        this.f11168f = z10;
        this.f11169g = i11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.applovin.impl.ra a(java.util.Map r14) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r14.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = "IcyHeaders"
            r3 = -1
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x004f
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r6 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0037 }
            int r6 = r6 * 1000
            if (r6 <= 0) goto L_0x0022
            r8 = r6
            r1 = 1
            goto L_0x0051
        L_0x0022:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0038 }
            r7.<init>()     // Catch:{ NumberFormatException -> 0x0038 }
            java.lang.String r8 = "Invalid bitrate: "
            r7.append(r8)     // Catch:{ NumberFormatException -> 0x0038 }
            r7.append(r1)     // Catch:{ NumberFormatException -> 0x0038 }
            java.lang.String r7 = r7.toString()     // Catch:{ NumberFormatException -> 0x0038 }
            com.applovin.impl.kc.d(r2, r7)     // Catch:{ NumberFormatException -> 0x0038 }
            goto L_0x004f
        L_0x0037:
            r6 = -1
        L_0x0038:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Invalid bitrate header: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            com.applovin.impl.kc.d(r2, r1)
            r8 = r6
            r1 = 0
            goto L_0x0051
        L_0x004f:
            r1 = 0
            r8 = -1
        L_0x0051:
            java.lang.String r6 = "icy-genre"
            java.lang.Object r6 = r14.get(r6)
            java.util.List r6 = (java.util.List) r6
            r7 = 0
            if (r6 == 0) goto L_0x0065
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = 1
            goto L_0x0066
        L_0x0065:
            r9 = r7
        L_0x0066:
            java.lang.String r6 = "icy-name"
            java.lang.Object r6 = r14.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0079
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = 1
            goto L_0x007a
        L_0x0079:
            r10 = r7
        L_0x007a:
            java.lang.String r6 = "icy-url"
            java.lang.Object r6 = r14.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x008d
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = 1
            goto L_0x008e
        L_0x008d:
            r11 = r7
        L_0x008e:
            java.lang.String r6 = "icy-pub"
            java.lang.Object r6 = r14.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x00a7
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = "1"
            boolean r1 = r1.equals(r6)
            r12 = r1
            r1 = 1
            goto L_0x00a8
        L_0x00a7:
            r12 = 0
        L_0x00a8:
            java.lang.String r6 = "icy-metaint"
            java.lang.Object r14 = r14.get(r6)
            java.util.List r14 = (java.util.List) r14
            if (r14 == 0) goto L_0x00e9
            java.lang.Object r14 = r14.get(r5)
            java.lang.String r14 = (java.lang.String) r14
            int r5 = java.lang.Integer.parseInt(r14)     // Catch:{ NumberFormatException -> 0x00d4 }
            if (r5 <= 0) goto L_0x00c0
            r13 = r5
            goto L_0x00eb
        L_0x00c0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00d3 }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x00d3 }
            r4.append(r0)     // Catch:{ NumberFormatException -> 0x00d3 }
            r4.append(r14)     // Catch:{ NumberFormatException -> 0x00d3 }
            java.lang.String r4 = r4.toString()     // Catch:{ NumberFormatException -> 0x00d3 }
            com.applovin.impl.kc.d(r2, r4)     // Catch:{ NumberFormatException -> 0x00d3 }
            goto L_0x00e9
        L_0x00d3:
            r3 = r5
        L_0x00d4:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r14)
            java.lang.String r14 = r4.toString()
            com.applovin.impl.kc.d(r2, r14)
            r4 = r1
            r13 = r3
            goto L_0x00eb
        L_0x00e9:
            r4 = r1
            r13 = -1
        L_0x00eb:
            if (r4 == 0) goto L_0x00f3
            com.applovin.impl.ra r14 = new com.applovin.impl.ra
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x00f3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ra.a(java.util.Map):com.applovin.impl.ra");
    }

    public /* synthetic */ void a(qd.b bVar) {
        e70.a(this, bVar);
    }

    public /* synthetic */ byte[] a() {
        return e70.b(this);
    }

    public /* synthetic */ d9 b() {
        return e70.c(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ra.class != obj.getClass()) {
            return false;
        }
        ra raVar = (ra) obj;
        if (this.f11164a != raVar.f11164a || !yp.a((Object) this.f11165b, (Object) raVar.f11165b) || !yp.a((Object) this.f11166c, (Object) raVar.f11166c) || !yp.a((Object) this.f11167d, (Object) raVar.f11167d) || this.f11168f != raVar.f11168f || this.f11169g != raVar.f11169g) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10 = (this.f11164a + 527) * 31;
        String str = this.f11165b;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11166c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11167d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return ((((hashCode2 + i11) * 31) + (this.f11168f ? 1 : 0)) * 31) + this.f11169g;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f11166c + "\", genre=\"" + this.f11165b + "\", bitrate=" + this.f11164a + ", metadataInterval=" + this.f11169g;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11164a);
        parcel.writeString(this.f11165b);
        parcel.writeString(this.f11166c);
        parcel.writeString(this.f11167d);
        yp.a(parcel, this.f11168f);
        parcel.writeInt(this.f11169g);
    }

    ra(Parcel parcel) {
        this.f11164a = parcel.readInt();
        this.f11165b = parcel.readString();
        this.f11166c = parcel.readString();
        this.f11167d = parcel.readString();
        this.f11168f = yp.a(parcel);
        this.f11169g = parcel.readInt();
    }
}
