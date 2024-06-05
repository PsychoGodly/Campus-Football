package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

public abstract class eb extends ya implements Set {

    /* renamed from: b  reason: collision with root package name */
    private transient ab f7407b;

    eb() {
    }

    private static boolean a(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public static eb h() {
        return ki.f9016i;
    }

    public ab a() {
        ab abVar = this.f7407b;
        if (abVar != null) {
            return abVar;
        }
        ab f10 = f();
        this.f7407b = f10;
        return f10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eb) || !g() || !((eb) obj).g() || hashCode() == obj.hashCode()) {
            return nj.a((Set) this, obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public ab f() {
        return ab.a(toArray());
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return false;
    }

    public int hashCode() {
        return nj.a((Set) this);
    }

    public abstract qp iterator();

    static int a(int i10) {
        int max = Math.max(i10, 2);
        boolean z10 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "collection too large");
        return 1073741824;
    }

    private static eb a(int i10, Object... objArr) {
        if (i10 == 0) {
            return h();
        }
        if (i10 == 1) {
            return a(objArr[0]);
        }
        int a10 = a(i10);
        Object[] objArr2 = new Object[a10];
        int i11 = a10 - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object a11 = cg.a(objArr[i14], i14);
            int hashCode = a11.hashCode();
            int a12 = ia.a(hashCode);
            while (true) {
                int i15 = a12 & i11;
                Object obj = objArr2[i15];
                if (obj == null) {
                    objArr[i13] = a11;
                    objArr2[i15] = a11;
                    i12 += hashCode;
                    i13++;
                    break;
                } else if (obj.equals(a11)) {
                    break;
                } else {
                    a12++;
                }
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            return new ek(objArr[0], i12);
        }
        if (a(i13) < a10 / 2) {
            return a(i13, objArr);
        }
        if (a(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new ki(objArr, i12, objArr2, i11, i13);
    }

    public static eb a(Collection collection) {
        if ((collection instanceof eb) && !(collection instanceof SortedSet)) {
            eb ebVar = (eb) collection;
            if (!ebVar.e()) {
                return ebVar;
            }
        }
        Object[] array = collection.toArray();
        return a(array.length, array);
    }

    public static eb a(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return h();
        }
        if (length != 1) {
            return a(objArr.length, (Object[]) objArr.clone());
        }
        return a(objArr[0]);
    }

    public static eb a(Object obj, Object obj2) {
        return a(2, obj, obj2);
    }

    public static eb a(Object obj, Object obj2, Object obj3) {
        return a(3, obj, obj2, obj3);
    }

    public static eb a(Object obj) {
        return new ek(obj);
    }
}
