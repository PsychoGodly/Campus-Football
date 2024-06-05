package q9;

/* compiled from: ErrorCorrectionLevel */
public enum f {
    L(1),
    M(0),
    Q(3),
    H(2);
    

    /* renamed from: g  reason: collision with root package name */
    private static final f[] f29730g = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f29732a;

    static {
        f fVar;
        f fVar2;
        f fVar3;
        f fVar4;
        f29730g = new f[]{fVar2, fVar, fVar4, fVar3};
    }

    private f(int i10) {
        this.f29732a = i10;
    }

    public static f a(int i10) {
        if (i10 >= 0) {
            f[] fVarArr = f29730g;
            if (i10 < fVarArr.length) {
                return fVarArr[i10];
            }
        }
        throw new IllegalArgumentException();
    }
}
