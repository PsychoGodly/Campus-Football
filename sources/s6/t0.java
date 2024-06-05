package s6;

/* compiled from: RegularImmutableSet */
final class t0<E> extends x<E> {

    /* renamed from: i  reason: collision with root package name */
    private static final Object[] f30243i;

    /* renamed from: j  reason: collision with root package name */
    static final t0<Object> f30244j;

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f30245c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f30246d;

    /* renamed from: f  reason: collision with root package name */
    final transient Object[] f30247f;

    /* renamed from: g  reason: collision with root package name */
    private final transient int f30248g;

    /* renamed from: h  reason: collision with root package name */
    private final transient int f30249h;

    static {
        Object[] objArr = new Object[0];
        f30243i = objArr;
        f30244j = new t0(objArr, 0, objArr, 0, 0);
    }

    t0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f30245c = objArr;
        this.f30246d = i10;
        this.f30247f = objArr2;
        this.f30248g = i11;
        this.f30249h = i12;
    }

    /* access modifiers changed from: package-private */
    public int c(Object[] objArr, int i10) {
        System.arraycopy(this.f30245c, 0, objArr, i10, this.f30249h);
        return i10 + this.f30249h;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.f30247f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int c10 = r.c(obj);
        while (true) {
            int i10 = c10 & this.f30248g;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c10 = i10 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    public Object[] e() {
        return this.f30245c;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f30249h;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return false;
    }

    public int hashCode() {
        return this.f30246d;
    }

    /* renamed from: m */
    public d1<E> iterator() {
        return b().iterator();
    }

    public int size() {
        return this.f30249h;
    }

    /* access modifiers changed from: package-private */
    public u<E> u() {
        return u.o(this.f30245c, this.f30249h);
    }

    /* access modifiers changed from: package-private */
    public boolean v() {
        return true;
    }
}
