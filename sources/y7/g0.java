package y7;

import android.os.Handler;
import android.os.Looper;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.q;
import com.google.firebase.firestore.z;
import com.google.protobuf.i;
import dd.j1;
import dd.k1;
import dd.l1;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedSet;
import q6.a;

/* compiled from: Util */
public class g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Random f31380a = new SecureRandom();

    /* renamed from: b  reason: collision with root package name */
    private static final Continuation<Void, Void> f31381b = b0.f39385a;

    public static String A(i iVar) {
        int size = iVar.size();
        StringBuilder sb2 = new StringBuilder(size * 2);
        for (int i10 = 0; i10 < size; i10++) {
            byte f10 = iVar.f(i10) & 255;
            sb2.append(Character.forDigit(f10 >>> 4, 16));
            sb2.append(Character.forDigit(f10 & Ascii.SI, 16));
        }
        return sb2.toString();
    }

    public static String B(Object obj) {
        return obj == null ? "null" : obj.getClass().getName();
    }

    public static Continuation<Void, Void> C() {
        return f31381b;
    }

    private static <T> T e(Iterator<T> it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static List<Object> f(int i10, Object obj, Object obj2, Object... objArr) {
        if (objArr.length % 2 != 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            arrayList.add(obj2);
            Collections.addAll(arrayList, objArr);
            int i11 = 0;
            while (i11 < arrayList.size()) {
                Object obj3 = arrayList.get(i11);
                if ((obj3 instanceof String) || (obj3 instanceof q)) {
                    i11 += 2;
                } else {
                    throw new IllegalArgumentException("Excepted field name at argument position " + (i11 + i10 + 1) + " but got " + obj3 + " in call to update.  The arguments to update should alternate between field names and values");
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Missing value in call to update().  There must be an even number of arguments that alternate between field names and values");
    }

    public static <T extends Comparable<T>> Comparator<T> g() {
        return f0.f39395a;
    }

    public static int h(boolean z10, boolean z11) {
        if (z10 == z11) {
            return 0;
        }
        return z10 ? 1 : -1;
    }

    public static int i(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        for (int i10 = 0; i10 < min; i10++) {
            byte b10 = bArr[i10] & 255;
            byte b11 = bArr2[i10] & 255;
            if (b10 < b11) {
                return -1;
            }
            if (b10 > b11) {
                return 1;
            }
        }
        return l(bArr.length, bArr2.length);
    }

    public static int j(i iVar, i iVar2) {
        int min = Math.min(iVar.size(), iVar2.size());
        for (int i10 = 0; i10 < min; i10++) {
            byte f10 = iVar.f(i10) & 255;
            byte f11 = iVar2.f(i10) & 255;
            if (f10 < f11) {
                return -1;
            }
            if (f10 > f11) {
                return 1;
            }
        }
        return l(iVar.size(), iVar2.size());
    }

    public static int k(double d10, double d11) {
        return a.c(d10, d11);
    }

    public static int l(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int m(long j10, long j11) {
        return a.a(j10, j11);
    }

    public static int n(double d10, long j10) {
        return a.b(d10, j10);
    }

    private static Exception o(Exception exc) {
        if (exc instanceof k1) {
            return t(((k1) exc).a());
        }
        return exc instanceof l1 ? t(((l1) exc).a()) : exc;
    }

    public static void p(RuntimeException runtimeException) {
        new Handler(Looper.getMainLooper()).post(new c0(runtimeException));
    }

    public static <T> void q(Collection<T> collection, Collection<T> collection2, Comparator<T> comparator, n<T> nVar, n<T> nVar2) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, comparator);
        ArrayList arrayList2 = new ArrayList(collection2);
        Collections.sort(arrayList2, comparator);
        r(arrayList.iterator(), arrayList2.iterator(), comparator, nVar, nVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r0 != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r4 > 0) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> void r(java.util.Iterator<T> r5, java.util.Iterator<T> r6, java.util.Comparator<? super T> r7, y7.n<T> r8, y7.n<T> r9) {
        /*
            java.lang.Object r0 = e(r5)
            java.lang.Object r1 = e(r6)
        L_0x0008:
            if (r0 != 0) goto L_0x000e
            if (r1 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            return
        L_0x000e:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x001e
            if (r1 == 0) goto L_0x001e
            int r4 = r7.compare(r0, r1)
            if (r4 >= 0) goto L_0x001b
            goto L_0x0023
        L_0x001b:
            if (r4 <= 0) goto L_0x0022
            goto L_0x0021
        L_0x001e:
            if (r0 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r2 = 1
        L_0x0022:
            r3 = 0
        L_0x0023:
            if (r2 == 0) goto L_0x002d
            r8.accept(r1)
            java.lang.Object r1 = e(r6)
            goto L_0x0008
        L_0x002d:
            if (r3 == 0) goto L_0x0037
            r9.accept(r0)
            java.lang.Object r0 = e(r5)
            goto L_0x0008
        L_0x0037:
            java.lang.Object r0 = e(r5)
            java.lang.Object r1 = e(r6)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.g0.r(java.util.Iterator, java.util.Iterator, java.util.Comparator, y7.n, y7.n):void");
    }

    public static <T extends Comparable<T>> void s(SortedSet<T> sortedSet, SortedSet<T> sortedSet2, n<T> nVar, n<T> nVar2) {
        r(sortedSet.iterator(), sortedSet2.iterator(), sortedSet.comparator() != null ? sortedSet.comparator() : e0.f39393a, nVar, nVar2);
    }

    public static z t(j1 j1Var) {
        k1 c10 = j1Var.c();
        return new z(c10.getMessage(), z.a.c(j1Var.m().d()), c10);
    }

    public static <K, V> Map<K, V> u(Map<K, V> map, int i10, Comparator<V> comparator) {
        if (map.size() <= i10) {
            return map;
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new d0(comparator));
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            hashMap.put(((Map.Entry) arrayList.get(i11)).getKey(), ((Map.Entry) arrayList.get(i11)).getValue());
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void v(RuntimeException runtimeException) {
        throw runtimeException;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void y(Task task) throws Exception {
        if (task.isSuccessful()) {
            return (Void) task.getResult();
        }
        Exception o10 = o(task.getException());
        if (o10 instanceof z) {
            throw o10;
        }
        throw new z(o10.getMessage(), z.a.UNKNOWN, o10);
    }

    public static StringBuilder z(CharSequence charSequence, int i10, CharSequence charSequence2) {
        StringBuilder sb2 = new StringBuilder();
        if (i10 != 0) {
            sb2.append(charSequence);
            for (int i11 = 1; i11 < i10; i11++) {
                sb2.append(charSequence2);
                sb2.append(charSequence);
            }
        }
        return sb2;
    }
}
