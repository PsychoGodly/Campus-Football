package com.google.protobuf;

import com.google.protobuf.v;
import com.google.protobuf.v.b;
import java.io.IOException;
import java.util.Map;

/* compiled from: ExtensionSchema */
abstract class r<T extends v.b<T>> {
    r() {
    }

    /* access modifiers changed from: package-private */
    public abstract int a(Map.Entry<?, ?> entry);

    /* access modifiers changed from: package-private */
    public abstract Object b(q qVar, v0 v0Var, int i10);

    /* access modifiers changed from: package-private */
    public abstract v<T> c(Object obj);

    /* access modifiers changed from: package-private */
    public abstract v<T> d(Object obj);

    /* access modifiers changed from: package-private */
    public abstract boolean e(v0 v0Var);

    /* access modifiers changed from: package-private */
    public abstract void f(Object obj);

    /* access modifiers changed from: package-private */
    public abstract <UT, UB> UB g(Object obj, l1 l1Var, Object obj2, q qVar, v<T> vVar, UB ub2, v1<UT, UB> v1Var) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void h(l1 l1Var, Object obj, q qVar, v<T> vVar) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void i(i iVar, Object obj, q qVar, v<T> vVar) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void j(c2 c2Var, Map.Entry<?, ?> entry) throws IOException;
}
