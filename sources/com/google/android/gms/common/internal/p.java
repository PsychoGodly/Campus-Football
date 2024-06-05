package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class p {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f15463a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final Object f15464b;

        /* synthetic */ a(Object obj, x0 x0Var) {
            q.k(obj);
            this.f15464b = obj;
        }

        public a a(String str, Object obj) {
            List list = this.f15463a;
            q.k(str);
            String valueOf = String.valueOf(obj);
            list.add(str + "=" + valueOf);
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f15464b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f15463a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f15463a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, (x0) null);
    }
}
