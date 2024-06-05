package td;

import com.google.android.gms.common.api.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* compiled from: ArrayDeque.kt */
public final class h<E> extends e<E> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f38614d = new a((kotlin.jvm.internal.h) null);

    /* renamed from: f  reason: collision with root package name */
    private static final Object[] f38615f = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    private int f38616a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f38617b = f38615f;

    /* renamed from: c  reason: collision with root package name */
    private int f38618c;

    /* compiled from: ArrayDeque.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final int a(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 <= 0) {
                return i12;
            }
            if (i11 > 2147483639) {
                return a.e.API_PRIORITY_OTHER;
            }
            return 2147483639;
        }
    }

    private final void f(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f38617b.length;
        while (i10 < length && it.hasNext()) {
            this.f38617b[i10] = it.next();
            i10++;
        }
        int i11 = this.f38616a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f38617b[i12] = it.next();
        }
        this.f38618c = size() + collection.size();
    }

    private final void g(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f38617b;
        l.c(objArr2, objArr, 0, this.f38616a, objArr2.length);
        Object[] objArr3 = this.f38617b;
        int length = objArr3.length;
        int i11 = this.f38616a;
        l.c(objArr3, objArr, length - i11, 0, i11);
        this.f38616a = 0;
        this.f38617b = objArr;
    }

    private final int h(int i10) {
        return i10 == 0 ? m.n(this.f38617b) : i10 - 1;
    }

    private final void m(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f38617b;
            if (i10 > objArr.length) {
                if (objArr == f38615f) {
                    this.f38617b = new Object[i.a(i10, 10)];
                } else {
                    g(f38614d.a(objArr.length, i10));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    private final int n(int i10) {
        if (i10 == m.n(this.f38617b)) {
            return 0;
        }
        return i10 + 1;
    }

    private final int o(int i10) {
        return i10 < 0 ? i10 + this.f38617b.length : i10;
    }

    private final int p(int i10) {
        Object[] objArr = this.f38617b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public boolean add(E e10) {
        addLast(e10);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        m.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m(size() + collection.size());
        f(p(this.f38616a + size()), collection);
        return true;
    }

    public final void addFirst(E e10) {
        m(size() + 1);
        int h10 = h(this.f38616a);
        this.f38616a = h10;
        this.f38617b[h10] = e10;
        this.f38618c = size() + 1;
    }

    public final void addLast(E e10) {
        m(size() + 1);
        this.f38617b[p(this.f38616a + size())] = e10;
        this.f38618c = size() + 1;
    }

    public int b() {
        return this.f38618c;
    }

    public void clear() {
        int p10 = p(this.f38616a + size());
        int i10 = this.f38616a;
        if (i10 < p10) {
            l.f(this.f38617b, null, i10, p10);
        } else if (!isEmpty()) {
            Object[] objArr = this.f38617b;
            l.f(objArr, null, this.f38616a, objArr.length);
            l.f(this.f38617b, null, 0, p10);
        }
        this.f38616a = 0;
        this.f38618c = 0;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public E e(int i10) {
        c.f38602a.a(i10, size());
        if (i10 == q.e(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        int p10 = p(this.f38616a + i10);
        E e10 = this.f38617b[p10];
        if (i10 < (size() >> 1)) {
            int i11 = this.f38616a;
            if (p10 >= i11) {
                Object[] objArr = this.f38617b;
                l.c(objArr, objArr, i11 + 1, i11, p10);
            } else {
                Object[] objArr2 = this.f38617b;
                l.c(objArr2, objArr2, 1, 0, p10);
                Object[] objArr3 = this.f38617b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f38616a;
                l.c(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f38617b;
            int i13 = this.f38616a;
            objArr4[i13] = null;
            this.f38616a = n(i13);
        } else {
            int p11 = p(this.f38616a + q.e(this));
            if (p10 <= p11) {
                Object[] objArr5 = this.f38617b;
                l.c(objArr5, objArr5, p10, p10 + 1, p11 + 1);
            } else {
                Object[] objArr6 = this.f38617b;
                l.c(objArr6, objArr6, p10, p10 + 1, objArr6.length);
                Object[] objArr7 = this.f38617b;
                objArr7[objArr7.length - 1] = objArr7[0];
                l.c(objArr7, objArr7, 0, 1, p11 + 1);
            }
            this.f38617b[p11] = null;
        }
        this.f38618c = size() - 1;
        return e10;
    }

    public E get(int i10) {
        c.f38602a.a(i10, size());
        return this.f38617b[p(this.f38616a + i10)];
    }

    public int indexOf(Object obj) {
        int i10;
        int p10 = p(this.f38616a + size());
        int i11 = this.f38616a;
        if (i11 < p10) {
            while (i11 < p10) {
                if (m.a(obj, this.f38617b[i11])) {
                    i10 = this.f38616a;
                } else {
                    i11++;
                }
            }
            return -1;
        } else if (i11 < p10) {
            return -1;
        } else {
            int length = this.f38617b.length;
            while (true) {
                if (i11 >= length) {
                    int i12 = 0;
                    while (i12 < p10) {
                        if (m.a(obj, this.f38617b[i12])) {
                            i11 = i12 + this.f38617b.length;
                            i10 = this.f38616a;
                        } else {
                            i12++;
                        }
                    }
                    return -1;
                } else if (m.a(obj, this.f38617b[i11])) {
                    i10 = this.f38616a;
                    break;
                } else {
                    i11++;
                }
            }
        }
        return i11 - i10;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int lastIndexOf(Object obj) {
        int i10;
        int i11;
        int p10 = p(this.f38616a + size());
        int i12 = this.f38616a;
        if (i12 < p10) {
            i10 = p10 - 1;
            if (i12 <= i10) {
                while (!m.a(obj, this.f38617b[i10])) {
                    if (i10 != i12) {
                        i10--;
                    }
                }
                i11 = this.f38616a;
            }
            return -1;
        }
        if (i12 > p10) {
            int i13 = p10 - 1;
            while (true) {
                if (-1 >= i13) {
                    int n10 = m.n(this.f38617b);
                    int i14 = this.f38616a;
                    if (i14 <= n10) {
                        while (!m.a(obj, this.f38617b[i10])) {
                            if (i10 != i14) {
                                n10 = i10 - 1;
                            }
                        }
                        i11 = this.f38616a;
                    }
                } else if (m.a(obj, this.f38617b[i13])) {
                    i10 = i13 + this.f38617b.length;
                    i11 = this.f38616a;
                    break;
                } else {
                    i13--;
                }
            }
        }
        return -1;
        return i10 - i11;
    }

    public final E q() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.m.e(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0096
            java.lang.Object[] r0 = r11.f38617b
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0096
        L_0x0019:
            int r0 = r11.f38616a
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.p(r0)
            int r3 = r11.f38616a
            r4 = 0
            if (r3 >= r0) goto L_0x0049
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0043
            java.lang.Object[] r6 = r11.f38617b
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x003f
            java.lang.Object[] r7 = r11.f38617b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0040
        L_0x003f:
            r1 = 1
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0043:
            java.lang.Object[] r12 = r11.f38617b
            td.l.f(r12, r4, r5, r0)
            goto L_0x008b
        L_0x0049:
            java.lang.Object[] r5 = r11.f38617b
            int r5 = r5.length
            r6 = r3
            r7 = 0
        L_0x004e:
            if (r3 >= r5) goto L_0x0069
            java.lang.Object[] r8 = r11.f38617b
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0065
            java.lang.Object[] r8 = r11.f38617b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x0069:
            int r3 = r11.p(r6)
            r5 = r3
        L_0x006e:
            if (r1 >= r0) goto L_0x008a
            java.lang.Object[] r3 = r11.f38617b
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0086
            java.lang.Object[] r3 = r11.f38617b
            r3[r5] = r6
            int r5 = r11.n(r5)
            goto L_0x0087
        L_0x0086:
            r7 = 1
        L_0x0087:
            int r1 = r1 + 1
            goto L_0x006e
        L_0x008a:
            r1 = r7
        L_0x008b:
            if (r1 == 0) goto L_0x0096
            int r12 = r11.f38616a
            int r5 = r5 - r12
            int r12 = r11.o(r5)
            r11.f38618c = r12
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: td.h.removeAll(java.util.Collection):boolean");
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            E[] eArr = this.f38617b;
            int i10 = this.f38616a;
            E e10 = eArr[i10];
            eArr[i10] = null;
            this.f38616a = n(i10);
            this.f38618c = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        if (!isEmpty()) {
            int p10 = p(this.f38616a + q.e(this));
            E[] eArr = this.f38617b;
            E e10 = eArr[p10];
            eArr[p10] = null;
            this.f38618c = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.m.e(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0093
            java.lang.Object[] r0 = r11.f38617b
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0093
        L_0x0019:
            int r0 = r11.f38616a
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.p(r0)
            int r3 = r11.f38616a
            r4 = 0
            if (r3 >= r0) goto L_0x0048
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0042
            java.lang.Object[] r6 = r11.f38617b
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x003e
            java.lang.Object[] r7 = r11.f38617b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0042:
            java.lang.Object[] r12 = r11.f38617b
            td.l.f(r12, r4, r5, r0)
            goto L_0x0088
        L_0x0048:
            java.lang.Object[] r5 = r11.f38617b
            int r5 = r5.length
            r6 = r3
            r7 = 0
        L_0x004d:
            if (r3 >= r5) goto L_0x0067
            java.lang.Object[] r8 = r11.f38617b
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0063
            java.lang.Object[] r8 = r11.f38617b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0064
        L_0x0063:
            r7 = 1
        L_0x0064:
            int r3 = r3 + 1
            goto L_0x004d
        L_0x0067:
            int r3 = r11.p(r6)
            r5 = r3
        L_0x006c:
            if (r1 >= r0) goto L_0x0087
            java.lang.Object[] r3 = r11.f38617b
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            if (r3 == 0) goto L_0x0083
            java.lang.Object[] r3 = r11.f38617b
            r3[r5] = r6
            int r5 = r11.n(r5)
            goto L_0x0084
        L_0x0083:
            r7 = 1
        L_0x0084:
            int r1 = r1 + 1
            goto L_0x006c
        L_0x0087:
            r1 = r7
        L_0x0088:
            if (r1 == 0) goto L_0x0093
            int r12 = r11.f38616a
            int r5 = r5 - r12
            int r12 = r11.o(r5)
            r11.f38618c = r12
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: td.h.retainAll(java.util.Collection):boolean");
    }

    public E set(int i10, E e10) {
        c.f38602a.a(i10, size());
        int p10 = p(this.f38616a + i10);
        E[] eArr = this.f38617b;
        E e11 = eArr[p10];
        eArr[p10] = e10;
        return e11;
    }

    public <T> T[] toArray(T[] tArr) {
        m.e(tArr, "array");
        if (tArr.length < size()) {
            tArr = j.a(tArr, size());
        }
        int p10 = p(this.f38616a + size());
        int i10 = this.f38616a;
        if (i10 < p10) {
            Object[] unused = l.d(this.f38617b, tArr, 0, i10, p10, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f38617b;
            l.c(objArr, tArr, 0, this.f38616a, objArr.length);
            Object[] objArr2 = this.f38617b;
            l.c(objArr2, tArr, objArr2.length - this.f38616a, 0, p10);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    public void add(int i10, E e10) {
        c.f38602a.b(i10, size());
        if (i10 == size()) {
            addLast(e10);
        } else if (i10 == 0) {
            addFirst(e10);
        } else {
            m(size() + 1);
            int p10 = p(this.f38616a + i10);
            if (i10 < ((size() + 1) >> 1)) {
                int h10 = h(p10);
                int h11 = h(this.f38616a);
                int i11 = this.f38616a;
                if (h10 >= i11) {
                    Object[] objArr = this.f38617b;
                    objArr[h11] = objArr[i11];
                    l.c(objArr, objArr, i11, i11 + 1, h10 + 1);
                } else {
                    Object[] objArr2 = this.f38617b;
                    l.c(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                    Object[] objArr3 = this.f38617b;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    l.c(objArr3, objArr3, 0, 1, h10 + 1);
                }
                this.f38617b[h10] = e10;
                this.f38616a = h11;
            } else {
                int p11 = p(this.f38616a + size());
                if (p10 < p11) {
                    Object[] objArr4 = this.f38617b;
                    l.c(objArr4, objArr4, p10 + 1, p10, p11);
                } else {
                    Object[] objArr5 = this.f38617b;
                    l.c(objArr5, objArr5, 1, 0, p11);
                    Object[] objArr6 = this.f38617b;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    l.c(objArr6, objArr6, p10 + 1, p10, objArr6.length - 1);
                }
                this.f38617b[p10] = e10;
            }
            this.f38618c = size() + 1;
        }
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        m.e(collection, "elements");
        c.f38602a.b(i10, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(collection);
        }
        m(size() + collection.size());
        int p10 = p(this.f38616a + size());
        int p11 = p(this.f38616a + i10);
        int size = collection.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f38616a;
            int i12 = i11 - size;
            if (p11 < i11) {
                Object[] objArr = this.f38617b;
                l.c(objArr, objArr, i12, i11, objArr.length);
                if (size >= p11) {
                    Object[] objArr2 = this.f38617b;
                    l.c(objArr2, objArr2, objArr2.length - size, 0, p11);
                } else {
                    Object[] objArr3 = this.f38617b;
                    l.c(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f38617b;
                    l.c(objArr4, objArr4, 0, size, p11);
                }
            } else if (i12 >= 0) {
                Object[] objArr5 = this.f38617b;
                l.c(objArr5, objArr5, i12, i11, p11);
            } else {
                Object[] objArr6 = this.f38617b;
                i12 += objArr6.length;
                int i13 = p11 - i11;
                int length = objArr6.length - i12;
                if (length >= i13) {
                    l.c(objArr6, objArr6, i12, i11, p11);
                } else {
                    l.c(objArr6, objArr6, i12, i11, i11 + length);
                    Object[] objArr7 = this.f38617b;
                    l.c(objArr7, objArr7, 0, this.f38616a + length, p11);
                }
            }
            this.f38616a = i12;
            f(o(p11 - size), collection);
        } else {
            int i14 = p11 + size;
            if (p11 < p10) {
                int i15 = size + p10;
                Object[] objArr8 = this.f38617b;
                if (i15 <= objArr8.length) {
                    l.c(objArr8, objArr8, i14, p11, p10);
                } else if (i14 >= objArr8.length) {
                    l.c(objArr8, objArr8, i14 - objArr8.length, p11, p10);
                } else {
                    int length2 = p10 - (i15 - objArr8.length);
                    l.c(objArr8, objArr8, 0, length2, p10);
                    Object[] objArr9 = this.f38617b;
                    l.c(objArr9, objArr9, i14, p11, length2);
                }
            } else {
                Object[] objArr10 = this.f38617b;
                l.c(objArr10, objArr10, size, 0, p10);
                Object[] objArr11 = this.f38617b;
                if (i14 >= objArr11.length) {
                    l.c(objArr11, objArr11, i14 - objArr11.length, p11, objArr11.length);
                } else {
                    l.c(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f38617b;
                    l.c(objArr12, objArr12, i14, p11, objArr12.length - size);
                }
            }
            f(p11, collection);
        }
        return true;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
