package com.google.protobuf;

/* compiled from: ManifestSchemaFactory */
final class n0 implements o1 {

    /* renamed from: b  reason: collision with root package name */
    private static final u0 f27159b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final u0 f27160a;

    /* compiled from: ManifestSchemaFactory */
    class a implements u0 {
        a() {
        }

        public t0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* compiled from: ManifestSchemaFactory */
    private static class b implements u0 {

        /* renamed from: a  reason: collision with root package name */
        private u0[] f27161a;

        b(u0... u0VarArr) {
            this.f27161a = u0VarArr;
        }

        public t0 a(Class<?> cls) {
            for (u0 u0Var : this.f27161a) {
                if (u0Var.b(cls)) {
                    return u0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        public boolean b(Class<?> cls) {
            for (u0 b10 : this.f27161a) {
                if (b10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public n0() {
        this(b());
    }

    private static u0 b() {
        return new b(y.c(), c());
    }

    private static u0 c() {
        try {
            return (u0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f27159b;
        }
    }

    private static boolean d(t0 t0Var) {
        return t0Var.c() == h1.PROTO2;
    }

    private static <T> n1<T> e(Class<T> cls, t0 t0Var) {
        if (z.class.isAssignableFrom(cls)) {
            if (d(t0Var)) {
                return y0.V(cls, t0Var, c1.b(), l0.b(), p1.M(), t.b(), s0.b());
            }
            return y0.V(cls, t0Var, c1.b(), l0.b(), p1.M(), (r<?>) null, s0.b());
        } else if (d(t0Var)) {
            return y0.V(cls, t0Var, c1.a(), l0.a(), p1.H(), t.a(), s0.a());
        } else {
            return y0.V(cls, t0Var, c1.a(), l0.a(), p1.I(), (r<?>) null, s0.a());
        }
    }

    public <T> n1<T> a(Class<T> cls) {
        p1.J(cls);
        t0 a10 = this.f27160a.a(cls);
        if (!a10.a()) {
            return e(cls, a10);
        }
        if (z.class.isAssignableFrom(cls)) {
            return z0.m(p1.M(), t.b(), a10.b());
        }
        return z0.m(p1.H(), t.a(), a10.b());
    }

    private n0(u0 u0Var) {
        this.f27160a = (u0) d0.b(u0Var, "messageInfoFactory");
    }
}
