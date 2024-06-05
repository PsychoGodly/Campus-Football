package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.a;
import com.google.protobuf.b2;
import com.google.protobuf.d0;
import com.google.protobuf.f;
import com.google.protobuf.v;
import com.google.protobuf.v0;
import com.google.protobuf.z;
import com.google.protobuf.z.a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: GeneratedMessageLite */
public abstract class z<MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, z<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected w1 unknownFields = w1.c();

    /* compiled from: GeneratedMessageLite */
    public static abstract class a<MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.C0282a<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        private final MessageType f27300a;

        /* renamed from: b  reason: collision with root package name */
        protected MessageType f27301b;

        protected a(MessageType messagetype) {
            this.f27300a = messagetype;
            if (!messagetype.M()) {
                this.f27301b = E();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static <MessageType> void D(MessageType messagetype, MessageType messagetype2) {
            i1.a().d(messagetype).a(messagetype, messagetype2);
        }

        private MessageType E() {
            return this.f27300a.T();
        }

        /* renamed from: B */
        public BuilderType u(j jVar, q qVar) throws IOException {
            w();
            try {
                i1.a().d(this.f27301b).e(this.f27301b, k.Q(jVar), qVar);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public BuilderType C(MessageType messagetype) {
            if (a().equals(messagetype)) {
                return this;
            }
            w();
            D(this.f27301b, messagetype);
            return this;
        }

        public final boolean isInitialized() {
            return z.L(this.f27301b, false);
        }

        /* renamed from: s */
        public final MessageType build() {
            MessageType t10 = A();
            if (t10.isInitialized()) {
                return t10;
            }
            throw a.C0282a.r(t10);
        }

        /* renamed from: t */
        public MessageType A() {
            if (!this.f27301b.M()) {
                return this.f27301b;
            }
            this.f27301b.N();
            return this.f27301b;
        }

        /* renamed from: v */
        public BuilderType clone() {
            BuilderType R = a().j();
            R.f27301b = A();
            return R;
        }

        /* access modifiers changed from: protected */
        public final void w() {
            if (!this.f27301b.M()) {
                x();
            }
        }

        /* access modifiers changed from: protected */
        public void x() {
            MessageType E = E();
            D(E, this.f27301b);
            this.f27301b = E;
        }

        /* renamed from: y */
        public MessageType a() {
            return this.f27300a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: z */
        public BuilderType o(MessageType messagetype) {
            return C(messagetype);
        }
    }

    /* compiled from: GeneratedMessageLite */
    protected static class b<T extends z<T, ?>> extends b<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T f27302b;

        public b(T t10) {
            this.f27302b = t10;
        }

        /* renamed from: i */
        public T c(j jVar, q qVar) throws e0 {
            return z.Z(this.f27302b, jVar, qVar);
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends z<MessageType, BuilderType> implements w0 {
        protected v<d> extensions = v.h();

        public /* bridge */ /* synthetic */ v0 a() {
            return z.super.a();
        }

        public /* bridge */ /* synthetic */ v0.a b() {
            return z.super.b();
        }

        /* access modifiers changed from: package-private */
        public v<d> e0() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        public /* bridge */ /* synthetic */ v0.a j() {
            return z.super.j();
        }
    }

    /* compiled from: GeneratedMessageLite */
    static final class d implements v.b<d> {

        /* renamed from: a  reason: collision with root package name */
        final d0.d<?> f27303a;

        /* renamed from: b  reason: collision with root package name */
        final int f27304b;

        /* renamed from: c  reason: collision with root package name */
        final b2.b f27305c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f27306d;

        /* renamed from: f  reason: collision with root package name */
        final boolean f27307f;

        public int I() {
            return this.f27304b;
        }

        public boolean J() {
            return this.f27306d;
        }

        public b2.b K() {
            return this.f27305c;
        }

        public v0.a L(v0.a aVar, v0 v0Var) {
            return ((a) aVar).C((z) v0Var);
        }

        public b2.c Y() {
            return this.f27305c.c();
        }

        public boolean Z() {
            return this.f27307f;
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            return this.f27304b - dVar.f27304b;
        }

        public d0.d<?> c() {
            return this.f27303a;
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static class e<ContainingType extends v0, Type> extends o<ContainingType, Type> {

        /* renamed from: a  reason: collision with root package name */
        final v0 f27308a;

        /* renamed from: b  reason: collision with root package name */
        final d f27309b;

        public b2.b a() {
            return this.f27309b.K();
        }

        public v0 b() {
            return this.f27308a;
        }

        public int c() {
            return this.f27309b.I();
        }

        public boolean d() {
            return this.f27309b.f27306d;
        }
    }

    /* compiled from: GeneratedMessageLite */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static d0.g E() {
        return c0.g();
    }

    protected static <E> d0.j<E> F() {
        return j1.e();
    }

    static <T extends z<?, ?>> T G(Class<T> cls) {
        T t10 = (z) defaultInstanceMap.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (z) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = ((z) z1.l(cls)).a();
            if (t10 != null) {
                defaultInstanceMap.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    static Object K(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static final <T extends z<T, ?>> boolean L(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.B(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d10 = i1.a().d(t10).d(t10);
        if (z10) {
            t10.C(f.SET_MEMOIZED_IS_INITIALIZED, d10 ? t10 : null);
        }
        return d10;
    }

    protected static d0.g P(d0.g gVar) {
        int size = gVar.size();
        return gVar.d(size == 0 ? 10 : size * 2);
    }

    protected static <E> d0.j<E> Q(d0.j<E> jVar) {
        int size = jVar.size();
        return jVar.d(size == 0 ? 10 : size * 2);
    }

    protected static Object S(v0 v0Var, String str, Object[] objArr) {
        return new k1(v0Var, str, objArr);
    }

    protected static <T extends z<T, ?>> T U(T t10, i iVar) throws e0 {
        return s(V(t10, iVar, q.b()));
    }

    protected static <T extends z<T, ?>> T V(T t10, i iVar, q qVar) throws e0 {
        return s(Y(t10, iVar, qVar));
    }

    protected static <T extends z<T, ?>> T W(T t10, InputStream inputStream) throws e0 {
        return s(Z(t10, j.f(inputStream), q.b()));
    }

    protected static <T extends z<T, ?>> T X(T t10, byte[] bArr) throws e0 {
        return s(a0(t10, bArr, 0, bArr.length, q.b()));
    }

    private static <T extends z<T, ?>> T Y(T t10, i iVar, q qVar) throws e0 {
        j D = iVar.D();
        T Z = Z(t10, D, qVar);
        try {
            D.a(0);
            return Z;
        } catch (e0 e10) {
            throw e10.k(Z);
        }
    }

    static <T extends z<T, ?>> T Z(T t10, j jVar, q qVar) throws e0 {
        T T = t10.T();
        try {
            n1 d10 = i1.a().d(T);
            d10.e(T, k.Q(jVar), qVar);
            d10.c(T);
            return T;
        } catch (e0 e10) {
            e = e10;
            if (e.a()) {
                e = new e0((IOException) e);
            }
            throw e.k(T);
        } catch (u1 e11) {
            throw e11.a().k(T);
        } catch (IOException e12) {
            if (e12.getCause() instanceof e0) {
                throw ((e0) e12.getCause());
            }
            throw new e0(e12).k(T);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof e0) {
                throw ((e0) e13.getCause());
            }
            throw e13;
        }
    }

    private static <T extends z<T, ?>> T a0(T t10, byte[] bArr, int i10, int i11, q qVar) throws e0 {
        T T = t10.T();
        try {
            n1 d10 = i1.a().d(T);
            d10.f(T, bArr, i10, i10 + i11, new f.b(qVar));
            d10.c(T);
            return T;
        } catch (e0 e10) {
            e = e10;
            if (e.a()) {
                e = new e0((IOException) e);
            }
            throw e.k(T);
        } catch (u1 e11) {
            throw e11.a().k(T);
        } catch (IOException e12) {
            if (e12.getCause() instanceof e0) {
                throw ((e0) e12.getCause());
            }
            throw new e0(e12).k(T);
        } catch (IndexOutOfBoundsException unused) {
            throw e0.m().k(T);
        }
    }

    protected static <T extends z<?, ?>> void b0(Class<T> cls, T t10) {
        t10.O();
        defaultInstanceMap.put(cls, t10);
    }

    private static <T extends z<T, ?>> T s(T t10) throws e0 {
        if (t10 == null || t10.isInitialized()) {
            return t10;
        }
        throw t10.o().a().k(t10);
    }

    private int x(n1<?> n1Var) {
        if (n1Var == null) {
            return i1.a().d(this).h(this);
        }
        return n1Var.h(this);
    }

    /* access modifiers changed from: protected */
    public Object B(f fVar) {
        return D(fVar, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public Object C(f fVar, Object obj) {
        return D(fVar, obj, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object D(f fVar, Object obj, Object obj2);

    /* renamed from: H */
    public final MessageType a() {
        return (z) B(f.GET_DEFAULT_INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public int I() {
        return this.memoizedHashCode;
    }

    /* access modifiers changed from: package-private */
    public boolean J() {
        return I() == 0;
    }

    /* access modifiers changed from: package-private */
    public boolean M() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    /* access modifiers changed from: protected */
    public void N() {
        i1.a().d(this).c(this);
        O();
    }

    /* access modifiers changed from: package-private */
    public void O() {
        this.memoizedSerializedSize &= a.e.API_PRIORITY_OTHER;
    }

    /* renamed from: R */
    public final BuilderType j() {
        return (a) B(f.NEW_BUILDER);
    }

    /* access modifiers changed from: package-private */
    public MessageType T() {
        return (z) B(f.NEW_MUTABLE_INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public void c0(int i10) {
        this.memoizedHashCode = i10;
    }

    public void d(l lVar) throws IOException {
        i1.a().d(this).b(this, m.P(lVar));
    }

    /* renamed from: d0 */
    public final BuilderType b() {
        return ((a) B(f.NEW_BUILDER)).C(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return i1.a().d(this).g(this, (z) obj);
        }
        return false;
    }

    public int f() {
        return m((n1) null);
    }

    public int hashCode() {
        if (M()) {
            return w();
        }
        if (J()) {
            c0(w());
        }
        return I();
    }

    public final boolean isInitialized() {
        return L(this, true);
    }

    public final f1<MessageType> k() {
        return (f1) B(f.GET_PARSER);
    }

    /* access modifiers changed from: package-private */
    public int l() {
        return this.memoizedSerializedSize & a.e.API_PRIORITY_OTHER;
    }

    /* access modifiers changed from: package-private */
    public int m(n1 n1Var) {
        if (M()) {
            int x10 = x(n1Var);
            if (x10 >= 0) {
                return x10;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + x10);
        } else if (l() != Integer.MAX_VALUE) {
            return l();
        } else {
            int x11 = x(n1Var);
            p(x11);
            return x11;
        }
    }

    /* access modifiers changed from: package-private */
    public void p(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & a.e.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i10);
    }

    /* access modifiers changed from: package-private */
    public Object r() throws Exception {
        return B(f.BUILD_MESSAGE_INFO);
    }

    /* access modifiers changed from: package-private */
    public void t() {
        this.memoizedHashCode = 0;
    }

    public String toString() {
        return x0.f(this, super.toString());
    }

    /* access modifiers changed from: package-private */
    public void v() {
        p(a.e.API_PRIORITY_OTHER);
    }

    /* access modifiers changed from: package-private */
    public int w() {
        return i1.a().d(this).j(this);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType y() {
        return (a) B(f.NEW_BUILDER);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType z(MessageType messagetype) {
        return y().C(messagetype);
    }
}
