package c1;

/* compiled from: SimpleSQLiteQuery */
public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    private final String f5573a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f5574b;

    public a(String str, Object[] objArr) {
        this.f5573a = str;
        this.f5574b = objArr;
    }

    private static void a(d dVar, int i10, Object obj) {
        if (obj == null) {
            dVar.j0(i10);
        } else if (obj instanceof byte[]) {
            dVar.S(i10, (byte[]) obj);
        } else if (obj instanceof Float) {
            dVar.C(i10, (double) ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            dVar.C(i10, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            dVar.N(i10, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            dVar.N(i10, (long) ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            dVar.N(i10, (long) ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            dVar.N(i10, (long) ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            dVar.t(i10, (String) obj);
        } else if (obj instanceof Boolean) {
            dVar.N(i10, ((Boolean) obj).booleanValue() ? 1 : 0);
        } else {
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
        }
    }

    public static void b(d dVar, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                a(dVar, i10, obj);
            }
        }
    }

    public void h(d dVar) {
        b(dVar, this.f5574b);
    }

    public String i() {
        return this.f5573a;
    }

    public a(String str) {
        this(str, (Object[]) null);
    }
}
