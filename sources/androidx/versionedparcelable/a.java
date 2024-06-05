package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import i1.b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: VersionedParcel */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected final androidx.collection.a<String, Method> f4960a;

    /* renamed from: b  reason: collision with root package name */
    protected final androidx.collection.a<String, Method> f4961b;

    /* renamed from: c  reason: collision with root package name */
    protected final androidx.collection.a<String, Class> f4962c;

    /* renamed from: androidx.versionedparcelable.a$a  reason: collision with other inner class name */
    /* compiled from: VersionedParcel */
    class C0087a extends ObjectInputStream {
        C0087a(InputStream inputStream) {
            super(inputStream);
        }

        /* access modifiers changed from: protected */
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            if (cls != null) {
                return cls;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public a(androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        this.f4960a = aVar;
        this.f4961b = aVar2;
        this.f4962c = aVar3;
    }

    private <T> void T(Collection<T> collection) {
        if (collection == null) {
            X(-1);
            return;
        }
        int size = collection.size();
        X(size);
        if (size > 0) {
            int e10 = e(collection.iterator().next());
            X(e10);
            switch (e10) {
                case 1:
                    for (T l02 : collection) {
                        l0(l02);
                    }
                    return;
                case 2:
                    for (T c02 : collection) {
                        c0(c02);
                    }
                    return;
                case 3:
                    for (T e02 : collection) {
                        e0(e02);
                    }
                    return;
                case 4:
                    for (T g02 : collection) {
                        g0(g02);
                    }
                    return;
                case 5:
                    for (T i02 : collection) {
                        i0(i02);
                    }
                    return;
                case 7:
                    for (T intValue : collection) {
                        X(intValue.intValue());
                    }
                    return;
                case 8:
                    for (T floatValue : collection) {
                        V(floatValue.floatValue());
                    }
                    return;
                default:
                    return;
            }
        }
    }

    private <T> void U(Collection<T> collection, int i10) {
        J(i10);
        T(collection);
    }

    private Class c(Class<? extends b> cls) throws ClassNotFoundException {
        Class cls2 = this.f4962c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f4962c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<a> cls = a.class;
        Method method = this.f4960a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f4960a.put(str, declaredMethod);
        return declaredMethod;
    }

    private <T> int e(T t10) {
        if (t10 instanceof String) {
            return 4;
        }
        if (t10 instanceof Parcelable) {
            return 2;
        }
        if (t10 instanceof b) {
            return 1;
        }
        if (t10 instanceof Serializable) {
            return 3;
        }
        if (t10 instanceof IBinder) {
            return 5;
        }
        if (t10 instanceof Integer) {
            return 7;
        }
        if (t10 instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t10.getClass().getName() + " cannot be VersionedParcelled");
    }

    private void e0(Serializable serializable) {
        if (serializable == null) {
            g0((String) null);
            return;
        }
        String name = serializable.getClass().getName();
        g0(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            P(byteArrayOutputStream.toByteArray());
        } catch (IOException e10) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e10);
        }
    }

    private Method f(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f4961b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c10 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c10.getDeclaredMethod("write", new Class[]{cls, a.class});
        this.f4961b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    private void n0(b bVar) {
        try {
            g0(c(bVar.getClass()).getName());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e10);
        }
    }

    private <T, S extends Collection<T>> S p(S s10) {
        int u10 = u();
        if (u10 < 0) {
            return null;
        }
        if (u10 != 0) {
            int u11 = u();
            if (u10 < 0) {
                return null;
            }
            if (u11 == 1) {
                while (u10 > 0) {
                    s10.add(H());
                    u10--;
                }
            } else if (u11 == 2) {
                while (u10 > 0) {
                    s10.add(z());
                    u10--;
                }
            } else if (u11 == 3) {
                while (u10 > 0) {
                    s10.add(B());
                    u10--;
                }
            } else if (u11 == 4) {
                while (u10 > 0) {
                    s10.add(D());
                    u10--;
                }
            } else if (u11 == 5) {
                while (u10 > 0) {
                    s10.add(F());
                    u10--;
                }
            }
        }
        return s10;
    }

    public <T extends Parcelable> T A(T t10, int i10) {
        if (!q(i10)) {
            return t10;
        }
        return z();
    }

    /* access modifiers changed from: protected */
    public Serializable B() {
        String D = D();
        if (D == null) {
            return null;
        }
        try {
            return (Serializable) new C0087a(new ByteArrayInputStream(l())).readObject();
        } catch (IOException e10) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + D + ")", e10);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + D + ")", e11);
        }
    }

    public <T> Set<T> C(Set<T> set, int i10) {
        if (!q(i10)) {
            return set;
        }
        return (Set) p(new androidx.collection.b());
    }

    /* access modifiers changed from: protected */
    public abstract String D();

    public String E(String str, int i10) {
        if (!q(i10)) {
            return str;
        }
        return D();
    }

    /* access modifiers changed from: protected */
    public abstract IBinder F();

    public IBinder G(IBinder iBinder, int i10) {
        if (!q(i10)) {
            return iBinder;
        }
        return F();
    }

    /* access modifiers changed from: protected */
    public <T extends b> T H() {
        String D = D();
        if (D == null) {
            return null;
        }
        return t(D, b());
    }

    public <T extends b> T I(T t10, int i10) {
        if (!q(i10)) {
            return t10;
        }
        return H();
    }

    /* access modifiers changed from: protected */
    public abstract void J(int i10);

    public void K(boolean z10, boolean z11) {
    }

    /* access modifiers changed from: protected */
    public abstract void L(boolean z10);

    public void M(boolean z10, int i10) {
        J(i10);
        L(z10);
    }

    /* access modifiers changed from: protected */
    public abstract void N(Bundle bundle);

    public void O(Bundle bundle, int i10) {
        J(i10);
        N(bundle);
    }

    /* access modifiers changed from: protected */
    public abstract void P(byte[] bArr);

    public void Q(byte[] bArr, int i10) {
        J(i10);
        P(bArr);
    }

    /* access modifiers changed from: protected */
    public abstract void R(CharSequence charSequence);

    public void S(CharSequence charSequence, int i10) {
        J(i10);
        R(charSequence);
    }

    /* access modifiers changed from: protected */
    public abstract void V(float f10);

    public void W(float f10, int i10) {
        J(i10);
        V(f10);
    }

    /* access modifiers changed from: protected */
    public abstract void X(int i10);

    public void Y(int i10, int i11) {
        J(i11);
        X(i10);
    }

    public <T> void Z(List<T> list, int i10) {
        U(list, i10);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a0(long j10);

    /* access modifiers changed from: protected */
    public abstract a b();

    public void b0(long j10, int i10) {
        J(i10);
        a0(j10);
    }

    /* access modifiers changed from: protected */
    public abstract void c0(Parcelable parcelable);

    public void d0(Parcelable parcelable, int i10) {
        J(i10);
        c0(parcelable);
    }

    public <T> void f0(Set<T> set, int i10) {
        U(set, i10);
    }

    public boolean g() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract void g0(String str);

    /* access modifiers changed from: protected */
    public abstract boolean h();

    public void h0(String str, int i10) {
        J(i10);
        g0(str);
    }

    public boolean i(boolean z10, int i10) {
        if (!q(i10)) {
            return z10;
        }
        return h();
    }

    /* access modifiers changed from: protected */
    public abstract void i0(IBinder iBinder);

    /* access modifiers changed from: protected */
    public abstract Bundle j();

    public void j0(IBinder iBinder, int i10) {
        J(i10);
        i0(iBinder);
    }

    public Bundle k(Bundle bundle, int i10) {
        if (!q(i10)) {
            return bundle;
        }
        return j();
    }

    /* access modifiers changed from: protected */
    public <T extends b> void k0(T t10, a aVar) {
        try {
            f(t10.getClass()).invoke((Object) null, new Object[]{t10, aVar});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
        }
    }

    /* access modifiers changed from: protected */
    public abstract byte[] l();

    /* access modifiers changed from: protected */
    public void l0(b bVar) {
        if (bVar == null) {
            g0((String) null);
            return;
        }
        n0(bVar);
        a b10 = b();
        k0(bVar, b10);
        b10.a();
    }

    public byte[] m(byte[] bArr, int i10) {
        if (!q(i10)) {
            return bArr;
        }
        return l();
    }

    public void m0(b bVar, int i10) {
        J(i10);
        l0(bVar);
    }

    /* access modifiers changed from: protected */
    public abstract CharSequence n();

    public CharSequence o(CharSequence charSequence, int i10) {
        if (!q(i10)) {
            return charSequence;
        }
        return n();
    }

    /* access modifiers changed from: protected */
    public abstract boolean q(int i10);

    /* access modifiers changed from: protected */
    public abstract float r();

    public float s(float f10, int i10) {
        if (!q(i10)) {
            return f10;
        }
        return r();
    }

    /* access modifiers changed from: protected */
    public <T extends b> T t(String str, a aVar) {
        try {
            return (b) d(str).invoke((Object) null, new Object[]{aVar});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
        }
    }

    /* access modifiers changed from: protected */
    public abstract int u();

    public int v(int i10, int i11) {
        if (!q(i11)) {
            return i10;
        }
        return u();
    }

    public <T> List<T> w(List<T> list, int i10) {
        if (!q(i10)) {
            return list;
        }
        return (List) p(new ArrayList());
    }

    /* access modifiers changed from: protected */
    public abstract long x();

    public long y(long j10, int i10) {
        if (!q(i10)) {
            return j10;
        }
        return x();
    }

    /* access modifiers changed from: protected */
    public abstract <T extends Parcelable> T z();
}
