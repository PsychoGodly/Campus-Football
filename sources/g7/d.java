package g7;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: ImmutableSortedMapIterator */
public class d<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<j<K, V>> f28906a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    private final boolean f28907b;

    d(h<K, V> hVar, K k10, Comparator<K> comparator, boolean z10) {
        int i10;
        this.f28907b = z10;
        while (!hVar.isEmpty()) {
            if (k10 != null) {
                i10 = z10 ? comparator.compare(k10, hVar.getKey()) : comparator.compare(hVar.getKey(), k10);
            } else {
                i10 = 1;
            }
            if (i10 < 0) {
                if (z10) {
                    hVar = hVar.a();
                } else {
                    hVar = hVar.f();
                }
            } else if (i10 == 0) {
                this.f28906a.push((j) hVar);
                return;
            } else {
                this.f28906a.push((j) hVar);
                if (z10) {
                    hVar = hVar.f();
                } else {
                    hVar = hVar.a();
                }
            }
        }
    }

    /* renamed from: a */
    public Map.Entry<K, V> next() {
        try {
            j pop = this.f28906a.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(pop.getKey(), pop.getValue());
            if (this.f28907b) {
                for (h a10 = pop.a(); !a10.isEmpty(); a10 = a10.f()) {
                    this.f28906a.push((j) a10);
                }
            } else {
                for (h f10 = pop.f(); !f10.isEmpty(); f10 = f10.a()) {
                    this.f28906a.push((j) f10);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        return this.f28906a.size() > 0;
    }

    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
