package com.google.protobuf;

import com.google.protobuf.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ExtensionRegistryLite */
public class q {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f27176b = true;

    /* renamed from: c  reason: collision with root package name */
    private static volatile q f27177c;

    /* renamed from: d  reason: collision with root package name */
    static final q f27178d = new q(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, z.e<?, ?>> f27179a;

    /* compiled from: ExtensionRegistryLite */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f27180a;

        /* renamed from: b  reason: collision with root package name */
        private final int f27181b;

        a(Object obj, int i10) {
            this.f27180a = obj;
            this.f27181b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f27180a == aVar.f27180a && this.f27181b == aVar.f27181b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f27180a) * 65535) + this.f27181b;
        }
    }

    q() {
        this.f27179a = new HashMap();
    }

    public static q b() {
        q qVar = f27177c;
        if (qVar == null) {
            synchronized (q.class) {
                qVar = f27177c;
                if (qVar == null) {
                    if (f27176b) {
                        qVar = p.a();
                    } else {
                        qVar = f27178d;
                    }
                    f27177c = qVar;
                }
            }
        }
        return qVar;
    }

    public <ContainingType extends v0> z.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return this.f27179a.get(new a(containingtype, i10));
    }

    q(boolean z10) {
        this.f27179a = Collections.emptyMap();
    }
}
