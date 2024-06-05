package a2;

import a2.i;
import android.util.SparseArray;
import com.google.auto.value.AutoValue;

@AutoValue
/* compiled from: NetworkConnectionInfo */
public abstract class o {

    @AutoValue.Builder
    /* compiled from: NetworkConnectionInfo */
    public static abstract class a {
        public abstract o a();

        public abstract a b(b bVar);

        public abstract a c(c cVar);
    }

    /* compiled from: NetworkConnectionInfo */
    public enum b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: x  reason: collision with root package name */
        private static final SparseArray<b> f156x = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f158a;

        static {
            b bVar;
            b bVar2;
            b bVar3;
            b bVar4;
            b bVar5;
            b bVar6;
            b bVar7;
            b bVar8;
            b bVar9;
            b bVar10;
            b bVar11;
            b bVar12;
            b bVar13;
            b bVar14;
            b bVar15;
            b bVar16;
            b bVar17;
            b bVar18;
            b bVar19;
            b bVar20;
            SparseArray<b> sparseArray = new SparseArray<>();
            f156x = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(1, bVar2);
            sparseArray.put(2, bVar3);
            sparseArray.put(3, bVar4);
            sparseArray.put(4, bVar5);
            sparseArray.put(5, bVar6);
            sparseArray.put(6, bVar7);
            sparseArray.put(7, bVar8);
            sparseArray.put(8, bVar9);
            sparseArray.put(9, bVar10);
            sparseArray.put(10, bVar11);
            sparseArray.put(11, bVar12);
            sparseArray.put(12, bVar20);
            sparseArray.put(13, bVar13);
            sparseArray.put(14, bVar14);
            sparseArray.put(15, bVar15);
            sparseArray.put(16, bVar16);
            sparseArray.put(17, bVar17);
            sparseArray.put(18, bVar18);
            sparseArray.put(19, bVar19);
        }

        private b(int i10) {
            this.f158a = i10;
        }

        public static b a(int i10) {
            return f156x.get(i10);
        }

        public int c() {
            return this.f158a;
        }
    }

    /* compiled from: NetworkConnectionInfo */
    public enum c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        

        /* renamed from: v  reason: collision with root package name */
        private static final SparseArray<c> f178v = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f180a;

        static {
            c cVar;
            c cVar2;
            c cVar3;
            c cVar4;
            c cVar5;
            c cVar6;
            c cVar7;
            c cVar8;
            c cVar9;
            c cVar10;
            c cVar11;
            c cVar12;
            c cVar13;
            c cVar14;
            c cVar15;
            c cVar16;
            c cVar17;
            c cVar18;
            c cVar19;
            SparseArray<c> sparseArray = new SparseArray<>();
            f178v = sparseArray;
            sparseArray.put(0, cVar);
            sparseArray.put(1, cVar2);
            sparseArray.put(2, cVar3);
            sparseArray.put(3, cVar4);
            sparseArray.put(4, cVar5);
            sparseArray.put(5, cVar6);
            sparseArray.put(6, cVar7);
            sparseArray.put(7, cVar8);
            sparseArray.put(8, cVar9);
            sparseArray.put(9, cVar10);
            sparseArray.put(10, cVar11);
            sparseArray.put(11, cVar12);
            sparseArray.put(12, cVar19);
            sparseArray.put(13, cVar13);
            sparseArray.put(14, cVar14);
            sparseArray.put(15, cVar15);
            sparseArray.put(16, cVar16);
            sparseArray.put(17, cVar18);
            sparseArray.put(-1, cVar17);
        }

        private c(int i10) {
            this.f180a = i10;
        }

        public static c a(int i10) {
            return f178v.get(i10);
        }

        public int c() {
            return this.f180a;
        }
    }

    public static a a() {
        return new i.b();
    }

    public abstract b b();

    public abstract c c();
}
