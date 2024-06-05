package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a.C0282a;
import com.google.protobuf.i;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: AbstractMessageLite */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0282a<MessageType, BuilderType>> implements v0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractMessageLite */
    public static abstract class C0282a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0282a<MessageType, BuilderType>> implements v0.a {
        protected static <T> void l(Iterable<T> iterable, List<? super T> list) {
            d0.a(iterable);
            if (iterable instanceof k0) {
                List<?> l10 = ((k0) iterable).l();
                k0 k0Var = (k0) list;
                int size = list.size();
                for (Object next : l10) {
                    if (next == null) {
                        String str = "Element at index " + (k0Var.size() - size) + " is null.";
                        for (int size2 = k0Var.size() - 1; size2 >= size; size2--) {
                            k0Var.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof i) {
                        k0Var.a((i) next);
                    } else {
                        k0Var.add((String) next);
                    }
                }
            } else if (iterable instanceof g1) {
                list.addAll((Collection) iterable);
            } else {
                m(iterable, list);
            }
        }

        private static <T> void m(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T next : iterable) {
                if (next == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(next);
            }
        }

        protected static u1 r(v0 v0Var) {
            return new u1(v0Var);
        }

        /* access modifiers changed from: protected */
        public abstract BuilderType o(MessageType messagetype);

        /* renamed from: p */
        public BuilderType q(v0 v0Var) {
            if (a().getClass().isInstance(v0Var)) {
                return o((a) v0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static <T> void h(Iterable<T> iterable, List<? super T> list) {
        C0282a.l(iterable, list);
    }

    private String n(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public void c(OutputStream outputStream) throws IOException {
        l f02 = l.f0(outputStream, l.J(f()));
        d(f02);
        f02.c0();
    }

    public i e() {
        try {
            i.h C = i.C(f());
            d(C.b());
            return C.a();
        } catch (IOException e10) {
            throw new RuntimeException(n("ByteString"), e10);
        }
    }

    public byte[] i() {
        try {
            byte[] bArr = new byte[f()];
            l g02 = l.g0(bArr);
            d(g02);
            g02.d();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(n("byte array"), e10);
        }
    }

    /* access modifiers changed from: package-private */
    public int l() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int m(n1 n1Var) {
        int l10 = l();
        if (l10 != -1) {
            return l10;
        }
        int h10 = n1Var.h(this);
        p(h10);
        return h10;
    }

    /* access modifiers changed from: package-private */
    public u1 o() {
        return new u1(this);
    }

    /* access modifiers changed from: package-private */
    public void p(int i10) {
        throw new UnsupportedOperationException();
    }
}
