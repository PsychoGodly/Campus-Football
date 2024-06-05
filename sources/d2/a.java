package d2;

/* compiled from: DoubleCheck */
public final class a<T> implements rd.a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f17654c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile rd.a<T> f17655a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f17656b = f17654c;

    private a(rd.a<T> aVar) {
        this.f17655a = aVar;
    }

    public static <P extends rd.a<T>, T> rd.a<T> a(P p10) {
        d.b(p10);
        if (p10 instanceof a) {
            return p10;
        }
        return new a(p10);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != f17654c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t10 = this.f17656b;
        T t11 = f17654c;
        if (t10 == t11) {
            synchronized (this) {
                t10 = this.f17656b;
                if (t10 == t11) {
                    t10 = this.f17655a.get();
                    this.f17656b = b(this.f17656b, t10);
                    this.f17655a = null;
                }
            }
        }
        return t10;
    }
}
