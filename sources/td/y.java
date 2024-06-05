package td;

import com.applovin.mediation.MaxReward;
import fe.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.m;
import me.d;
import sd.n;
import sd.s;

/* compiled from: _Collections.kt */
class y extends x {

    /* compiled from: Sequences.kt */
    public static final class a implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterable f38641a;

        public a(Iterable iterable) {
            this.f38641a = iterable;
        }

        public Iterator<T> iterator() {
            return this.f38641a.iterator();
        }
    }

    public static <T extends Comparable<? super T>> T A(Iterable<? extends T> iterable) {
        m.e(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t10 = (Comparable) it.next();
        while (it.hasNext()) {
            T t11 = (Comparable) it.next();
            if (t10.compareTo(t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    public static <T> List<T> B(Iterable<? extends T> iterable, T t10) {
        m.e(iterable, "<this>");
        ArrayList arrayList = new ArrayList(r.j(iterable, 10));
        boolean z10 = false;
        for (Object next : iterable) {
            boolean z11 = true;
            if (!z10 && m.a(next, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static <T> List<T> C(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        m.e(collection, "<this>");
        m.e(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        boolean unused = v.k(arrayList2, iterable);
        return arrayList2;
    }

    public static <T> List<T> D(Collection<? extends T> collection, T t10) {
        m.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static <T> T E(Iterable<? extends T> iterable) {
        m.e(iterable, "<this>");
        if (iterable instanceof List) {
            return F((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T F(List<? extends T> list) {
        m.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static <T> T G(List<? extends T> list) {
        m.e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> List<T> H(Iterable<? extends T> iterable, int i10) {
        m.e(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return q.d();
        } else {
            if (iterable instanceof Collection) {
                if (i10 >= ((Collection) iterable).size()) {
                    return L(iterable);
                }
                if (i10 == 1) {
                    return p.b(r(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i10);
            for (Object add : iterable) {
                arrayList.add(add);
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return q.h(arrayList);
        }
    }

    public static byte[] I(Collection<Byte> collection) {
        m.e(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        int i10 = 0;
        for (Byte byteValue : collection) {
            bArr[i10] = byteValue.byteValue();
            i10++;
        }
        return bArr;
    }

    public static final <T, C extends Collection<? super T>> C J(Iterable<? extends T> iterable, C c10) {
        m.e(iterable, "<this>");
        m.e(c10, "destination");
        for (Object add : iterable) {
            c10.add(add);
        }
        return c10;
    }

    public static int[] K(Collection<Integer> collection) {
        m.e(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i10 = 0;
        for (Integer intValue : collection) {
            iArr[i10] = intValue.intValue();
            i10++;
        }
        return iArr;
    }

    public static <T> List<T> L(Iterable<? extends T> iterable) {
        m.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return q.h(M(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return q.d();
        }
        if (size != 1) {
            return N(collection);
        }
        return p.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<T> M(Iterable<? extends T> iterable) {
        m.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return N((Collection) iterable);
        }
        return (List) J(iterable, new ArrayList());
    }

    public static final <T> List<T> N(Collection<? extends T> collection) {
        m.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> Set<T> O(Iterable<? extends T> iterable) {
        m.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        return (Set) J(iterable, new LinkedHashSet());
    }

    public static <T> Set<T> P(Iterable<? extends T> iterable) {
        m.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return q0.c((Set) J(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return q0.b();
        }
        if (size != 1) {
            return (Set) J(iterable, new LinkedHashSet(j0.d(collection.size())));
        }
        return p0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static <T> List<List<T>> Q(Iterable<? extends T> iterable, int i10, int i11, boolean z10) {
        int c10;
        m.e(iterable, "<this>");
        s0.a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator<List<T>> b10 = s0.b(iterable.iterator(), i10, i11, z10, false);
            while (b10.hasNext()) {
                arrayList.add(b10.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (true) {
            if (!(i12 >= 0 && i12 < size) || ((c10 = i.c(i10, size - i12)) < i10 && !z10)) {
                return arrayList2;
            }
            ArrayList arrayList3 = new ArrayList(c10);
            for (int i13 = 0; i13 < c10; i13++) {
                arrayList3.add(list.get(i13 + i12));
            }
            arrayList2.add(arrayList3);
            i12 += i11;
        }
        return arrayList2;
    }

    public static <T, R> List<n<T, R>> R(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        m.e(iterable, "<this>");
        m.e(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(r.j(iterable, 10), r.j(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(s.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> d<T> n(Iterable<? extends T> iterable) {
        m.e(iterable, "<this>");
        return new a(iterable);
    }

    public static <T> List<T> o(Iterable<? extends T> iterable) {
        m.e(iterable, "<this>");
        return L(O(iterable));
    }

    public static <T> List<T> p(Iterable<? extends T> iterable) {
        m.e(iterable, "<this>");
        return (List) q(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C q(Iterable<? extends T> iterable, C c10) {
        m.e(iterable, "<this>");
        m.e(c10, "destination");
        for (Object next : iterable) {
            if (next != null) {
                c10.add(next);
            }
        }
        return c10;
    }

    public static final <T> T r(Iterable<? extends T> iterable) {
        m.e(iterable, "<this>");
        if (iterable instanceof List) {
            return s((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T s(List<? extends T> list) {
        m.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T t(Iterable<? extends T> iterable) {
        m.e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static <T> T u(List<? extends T> list) {
        m.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T, A extends Appendable> A v(Iterable<? extends T> iterable, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        m.e(iterable, "<this>");
        m.e(a10, "buffer");
        m.e(charSequence, "separator");
        m.e(charSequence2, "prefix");
        m.e(charSequence3, "postfix");
        m.e(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (Object next : iterable) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            g.a(a10, next, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static /* synthetic */ Appendable w(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        int i12 = i11 & 4;
        CharSequence charSequence5 = MaxReward.DEFAULT_LABEL;
        CharSequence charSequence6 = i12 != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return v(iterable, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    public static final <T> String x(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        m.e(iterable, "<this>");
        m.e(charSequence, "separator");
        m.e(charSequence2, "prefix");
        m.e(charSequence3, "postfix");
        m.e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) v(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        m.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String y(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        int i12 = i11 & 2;
        CharSequence charSequence5 = MaxReward.DEFAULT_LABEL;
        CharSequence charSequence6 = i12 != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i13 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return x(iterable, charSequence, charSequence6, charSequence5, i13, charSequence7, lVar);
    }

    public static <T> T z(List<? extends T> list) {
        m.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(q.e(list));
        }
        throw new NoSuchElementException("List is empty.");
    }
}
