package k3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import k4.n0;
import s6.u;

/* compiled from: TextInformationFrame */
public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f19665b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public final String f19666c;

    /* renamed from: d  reason: collision with root package name */
    public final u<String> f19667d;

    /* compiled from: TextInformationFrame */
    class a implements Parcelable.Creator<m> {
        a() {
        }

        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel, (a) null);
        }

        /* renamed from: b */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    /* synthetic */ m(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static List<Integer> a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void M(n2.e2.b r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.f19654a
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = -1
            switch(r1) {
                case 82815: goto L_0x0125;
                case 82878: goto L_0x011a;
                case 82897: goto L_0x010f;
                case 83253: goto L_0x0104;
                case 83254: goto L_0x00f9;
                case 83255: goto L_0x00ee;
                case 83341: goto L_0x00e3;
                case 83378: goto L_0x00d8;
                case 83536: goto L_0x00ca;
                case 83552: goto L_0x00bc;
                case 2567331: goto L_0x00ae;
                case 2569357: goto L_0x00a0;
                case 2569891: goto L_0x0092;
                case 2570401: goto L_0x0084;
                case 2570410: goto L_0x0076;
                case 2571565: goto L_0x0068;
                case 2575251: goto L_0x005a;
                case 2581512: goto L_0x004c;
                case 2581513: goto L_0x003e;
                case 2581514: goto L_0x0030;
                case 2583398: goto L_0x0022;
                case 2590194: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x012f
        L_0x0014:
            java.lang.String r1 = "TYER"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001e
            goto L_0x012f
        L_0x001e:
            r7 = 21
            goto L_0x012f
        L_0x0022:
            java.lang.String r1 = "TRCK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002c
            goto L_0x012f
        L_0x002c:
            r7 = 20
            goto L_0x012f
        L_0x0030:
            java.lang.String r1 = "TPE3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003a
            goto L_0x012f
        L_0x003a:
            r7 = 19
            goto L_0x012f
        L_0x003e:
            java.lang.String r1 = "TPE2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0048
            goto L_0x012f
        L_0x0048:
            r7 = 18
            goto L_0x012f
        L_0x004c:
            java.lang.String r1 = "TPE1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0056
            goto L_0x012f
        L_0x0056:
            r7 = 17
            goto L_0x012f
        L_0x005a:
            java.lang.String r1 = "TIT2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0064
            goto L_0x012f
        L_0x0064:
            r7 = 16
            goto L_0x012f
        L_0x0068:
            java.lang.String r1 = "TEXT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0072
            goto L_0x012f
        L_0x0072:
            r7 = 15
            goto L_0x012f
        L_0x0076:
            java.lang.String r1 = "TDRL"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0080
            goto L_0x012f
        L_0x0080:
            r7 = 14
            goto L_0x012f
        L_0x0084:
            java.lang.String r1 = "TDRC"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x008e
            goto L_0x012f
        L_0x008e:
            r7 = 13
            goto L_0x012f
        L_0x0092:
            java.lang.String r1 = "TDAT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009c
            goto L_0x012f
        L_0x009c:
            r7 = 12
            goto L_0x012f
        L_0x00a0:
            java.lang.String r1 = "TCOM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00aa
            goto L_0x012f
        L_0x00aa:
            r7 = 11
            goto L_0x012f
        L_0x00ae:
            java.lang.String r1 = "TALB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b8
            goto L_0x012f
        L_0x00b8:
            r7 = 10
            goto L_0x012f
        L_0x00bc:
            java.lang.String r1 = "TYE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c6
            goto L_0x012f
        L_0x00c6:
            r7 = 9
            goto L_0x012f
        L_0x00ca:
            java.lang.String r1 = "TXT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00d4
            goto L_0x012f
        L_0x00d4:
            r7 = 8
            goto L_0x012f
        L_0x00d8:
            java.lang.String r1 = "TT2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e1
            goto L_0x012f
        L_0x00e1:
            r7 = 7
            goto L_0x012f
        L_0x00e3:
            java.lang.String r1 = "TRK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00ec
            goto L_0x012f
        L_0x00ec:
            r7 = 6
            goto L_0x012f
        L_0x00ee:
            java.lang.String r1 = "TP3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00f7
            goto L_0x012f
        L_0x00f7:
            r7 = 5
            goto L_0x012f
        L_0x00f9:
            java.lang.String r1 = "TP2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0102
            goto L_0x012f
        L_0x0102:
            r7 = 4
            goto L_0x012f
        L_0x0104:
            java.lang.String r1 = "TP1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x010d
            goto L_0x012f
        L_0x010d:
            r7 = 3
            goto L_0x012f
        L_0x010f:
            java.lang.String r1 = "TDA"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0118
            goto L_0x012f
        L_0x0118:
            r7 = 2
            goto L_0x012f
        L_0x011a:
            java.lang.String r1 = "TCM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0123
            goto L_0x012f
        L_0x0123:
            r7 = 1
            goto L_0x012f
        L_0x0125:
            java.lang.String r1 = "TAL"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x012e
            goto L_0x012f
        L_0x012e:
            r7 = 0
        L_0x012f:
            switch(r7) {
                case 0: goto L_0x0254;
                case 1: goto L_0x0248;
                case 2: goto L_0x0220;
                case 3: goto L_0x0214;
                case 4: goto L_0x0208;
                case 5: goto L_0x01fc;
                case 6: goto L_0x01cd;
                case 7: goto L_0x01c0;
                case 8: goto L_0x01b3;
                case 9: goto L_0x019e;
                case 10: goto L_0x0254;
                case 11: goto L_0x0248;
                case 12: goto L_0x0220;
                case 13: goto L_0x0169;
                case 14: goto L_0x0134;
                case 15: goto L_0x01b3;
                case 16: goto L_0x01c0;
                case 17: goto L_0x0214;
                case 18: goto L_0x0208;
                case 19: goto L_0x01fc;
                case 20: goto L_0x01cd;
                case 21: goto L_0x019e;
                default: goto L_0x0132;
            }
        L_0x0132:
            goto L_0x025f
        L_0x0134:
            s6.u<java.lang.String> r0 = r8.f19667d
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = a(r0)
            int r1 = r0.size()
            if (r1 == r5) goto L_0x015e
            if (r1 == r4) goto L_0x0155
            if (r1 == r3) goto L_0x014c
            goto L_0x025f
        L_0x014c:
            java.lang.Object r1 = r0.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.h0(r1)
        L_0x0155:
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.i0(r1)
        L_0x015e:
            java.lang.Object r0 = r0.get(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.j0(r0)
            goto L_0x025f
        L_0x0169:
            s6.u<java.lang.String> r0 = r8.f19667d
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = a(r0)
            int r1 = r0.size()
            if (r1 == r5) goto L_0x0193
            if (r1 == r4) goto L_0x018a
            if (r1 == r3) goto L_0x0181
            goto L_0x025f
        L_0x0181:
            java.lang.Object r1 = r0.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.e0(r1)
        L_0x018a:
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.f0(r1)
        L_0x0193:
            java.lang.Object r0 = r0.get(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.g0(r0)
            goto L_0x025f
        L_0x019e:
            s6.u<java.lang.String> r0 = r8.f19667d     // Catch:{  }
            java.lang.Object r0 = r0.get(r6)     // Catch:{  }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{  }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{  }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{  }
            r9.g0(r0)     // Catch:{  }
            goto L_0x025f
        L_0x01b3:
            s6.u<java.lang.String> r0 = r8.f19667d
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.r0(r0)
            goto L_0x025f
        L_0x01c0:
            s6.u<java.lang.String> r0 = r8.f19667d
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.m0(r0)
            goto L_0x025f
        L_0x01cd:
            s6.u<java.lang.String> r0 = r8.f19667d
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "/"
            java.lang.String[] r0 = k4.n0.R0(r0, r1)
            r1 = r0[r6]     // Catch:{  }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{  }
            int r2 = r0.length     // Catch:{  }
            if (r2 <= r5) goto L_0x01ef
            r0 = r0[r5]     // Catch:{  }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{  }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{  }
            goto L_0x01f0
        L_0x01ef:
            r0 = 0
        L_0x01f0:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{  }
            n2.e2$b r9 = r9.p0(r1)     // Catch:{  }
            r9.o0(r0)     // Catch:{  }
            goto L_0x025f
        L_0x01fc:
            s6.u<java.lang.String> r0 = r8.f19667d
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.T(r0)
            goto L_0x025f
        L_0x0208:
            s6.u<java.lang.String> r0 = r8.f19667d
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.M(r0)
            goto L_0x025f
        L_0x0214:
            s6.u<java.lang.String> r0 = r8.f19667d
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.O(r0)
            goto L_0x025f
        L_0x0220:
            s6.u<java.lang.String> r0 = r8.f19667d     // Catch:{ NumberFormatException -> 0x025f }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ NumberFormatException -> 0x025f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x025f }
            java.lang.String r1 = r0.substring(r4, r2)     // Catch:{ NumberFormatException -> 0x025f }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x025f }
            java.lang.String r0 = r0.substring(r6, r4)     // Catch:{ NumberFormatException -> 0x025f }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x025f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x025f }
            n2.e2$b r9 = r9.f0(r1)     // Catch:{ NumberFormatException -> 0x025f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x025f }
            r9.e0(r0)     // Catch:{ NumberFormatException -> 0x025f }
            goto L_0x025f
        L_0x0248:
            s6.u<java.lang.String> r0 = r8.f19667d
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.S(r0)
            goto L_0x025f
        L_0x0254:
            s6.u<java.lang.String> r0 = r8.f19667d
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.N(r0)
        L_0x025f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.m.M(n2.e2$b):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (!n0.c(this.f19654a, mVar.f19654a) || !n0.c(this.f19665b, mVar.f19665b) || !this.f19667d.equals(mVar.f19667d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (527 + this.f19654a.hashCode()) * 31;
        String str = this.f19665b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f19667d.hashCode();
    }

    public String toString() {
        return this.f19654a + ": description=" + this.f19665b + ": values=" + this.f19667d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19654a);
        parcel.writeString(this.f19665b);
        parcel.writeStringArray((String[]) this.f19667d.toArray(new String[0]));
    }

    public m(String str, String str2, List<String> list) {
        super(str);
        k4.a.a(!list.isEmpty());
        this.f19665b = str2;
        u<String> u10 = u.u(list);
        this.f19667d = u10;
        this.f19666c = u10.get(0);
    }

    private m(Parcel parcel) {
        this((String) k4.a.e(parcel.readString()), parcel.readString(), u.v((String[]) k4.a.e(parcel.createStringArray())));
    }
}
