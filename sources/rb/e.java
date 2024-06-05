package rb;

import com.google.protobuf.d0;

/* compiled from: Protos */
public enum e implements d0.c {
    unknown(0),
    aztec(1),
    code39(2),
    code93(3),
    ean8(4),
    ean13(5),
    code128(6),
    dataMatrix(7),
    qr(8),
    interleaved2of5(9),
    upce(10),
    pdf417(11),
    UNRECOGNIZED(-1);
    

    /* renamed from: p  reason: collision with root package name */
    private static final d0.d<e> f37893p = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f37895a;

    /* compiled from: Protos */
    class a implements d0.d<e> {
        a() {
        }

        /* renamed from: b */
        public e a(int i10) {
            return e.a(i10);
        }
    }

    static {
        f37893p = new a();
    }

    private e(int i10) {
        this.f37895a = i10;
    }

    public static e a(int i10) {
        switch (i10) {
            case 0:
                return unknown;
            case 1:
                return aztec;
            case 2:
                return code39;
            case 3:
                return code93;
            case 4:
                return ean8;
            case 5:
                return ean13;
            case 6:
                return code128;
            case 7:
                return dataMatrix;
            case 8:
                return qr;
            case 9:
                return interleaved2of5;
            case 10:
                return upce;
            case 11:
                return pdf417;
            default:
                return null;
        }
    }

    public final int I() {
        if (this != UNRECOGNIZED) {
            return this.f37895a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
