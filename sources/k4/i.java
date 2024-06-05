package k4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: CopyOnWriteMultiset */
public final class i<E> implements Iterable<E> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f19712a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Map<E, Integer> f19713b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Set<E> f19714c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private List<E> f19715d = Collections.emptyList();

    public void b(E e10) {
        synchronized (this.f19712a) {
            ArrayList arrayList = new ArrayList(this.f19715d);
            arrayList.add(e10);
            this.f19715d = Collections.unmodifiableList(arrayList);
            Integer num = this.f19713b.get(e10);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f19714c);
                hashSet.add(e10);
                this.f19714c = Collections.unmodifiableSet(hashSet);
            }
            Map<E, Integer> map = this.f19713b;
            int i10 = 1;
            if (num != null) {
                i10 = 1 + num.intValue();
            }
            map.put(e10, Integer.valueOf(i10));
        }
    }

    public int c(E e10) {
        int intValue;
        synchronized (this.f19712a) {
            intValue = this.f19713b.containsKey(e10) ? this.f19713b.get(e10).intValue() : 0;
        }
        return intValue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(E r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f19712a
            monitor-enter(r0)
            java.util.Map<E, java.lang.Integer> r1 = r4.f19713b     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return
        L_0x000f:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x004c }
            java.util.List<E> r3 = r4.f19715d     // Catch:{ all -> 0x004c }
            r2.<init>(r3)     // Catch:{ all -> 0x004c }
            r2.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x004c }
            r4.f19715d = r2     // Catch:{ all -> 0x004c }
            int r2 = r1.intValue()     // Catch:{ all -> 0x004c }
            r3 = 1
            if (r2 != r3) goto L_0x003c
            java.util.Map<E, java.lang.Integer> r1 = r4.f19713b     // Catch:{ all -> 0x004c }
            r1.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x004c }
            java.util.Set<E> r2 = r4.f19714c     // Catch:{ all -> 0x004c }
            r1.<init>(r2)     // Catch:{ all -> 0x004c }
            r1.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r1)     // Catch:{ all -> 0x004c }
            r4.f19714c = r5     // Catch:{ all -> 0x004c }
            goto L_0x004a
        L_0x003c:
            java.util.Map<E, java.lang.Integer> r2 = r4.f19713b     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            int r1 = r1 - r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x004c }
            r2.put(r5, r1)     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return
        L_0x004c:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.i.e(java.lang.Object):void");
    }

    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f19712a) {
            it = this.f19715d.iterator();
        }
        return it;
    }

    public Set<E> j() {
        Set<E> set;
        synchronized (this.f19712a) {
            set = this.f19714c;
        }
        return set;
    }
}
