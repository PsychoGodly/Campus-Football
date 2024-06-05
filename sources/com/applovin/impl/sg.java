package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

public class sg implements Set, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f12111a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final HashSet f12112b = new HashSet();

    /* renamed from: a */
    public boolean add(Comparable comparable) {
        if (contains(comparable)) {
            return false;
        }
        if (isEmpty() || comparable.compareTo(a()) > 0) {
            this.f12111a.add(comparable);
        } else {
            this.f12111a.add(b(comparable), comparable);
        }
        return this.f12112b.add(comparable);
    }

    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    return z10;
                }
                if (add((Comparable) it.next()) || z10) {
                    z10 = true;
                }
            }
        }
    }

    public int b(Comparable comparable) {
        int binarySearch = Collections.binarySearch(this.f12111a, comparable);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable a10 = a(binarySearch);
        while (binarySearch >= 0 && a10 == a(binarySearch)) {
            binarySearch--;
        }
        return binarySearch + 1;
    }

    public int c(Comparable comparable) {
        int binarySearch = Collections.binarySearch(this.f12111a, comparable);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable a10 = a(binarySearch);
        while (binarySearch < size() && a10 == a(binarySearch)) {
            binarySearch++;
        }
        return binarySearch;
    }

    public void clear() {
        this.f12111a.clear();
        this.f12112b.clear();
    }

    public boolean contains(Object obj) {
        return this.f12112b.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return this.f12112b.containsAll(collection);
    }

    public int d(Comparable comparable) {
        if (comparable == null || !contains(comparable)) {
            return -1;
        }
        return b(comparable);
    }

    public boolean isEmpty() {
        return this.f12111a.isEmpty();
    }

    public Iterator iterator() {
        return this.f12111a.iterator();
    }

    public boolean remove(Object obj) {
        int d10 = d((Comparable) obj);
        if (d10 == -1) {
            return false;
        }
        this.f12111a.remove(d10);
        return this.f12112b.remove(obj);
    }

    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    return false;
                }
                Object next = it.next();
                if (z10 || remove(next)) {
                    z10 = true;
                }
            }
        }
    }

    public boolean retainAll(Collection collection) {
        boolean z10 = false;
        for (int size = size() - 1; size >= 0; size--) {
            Comparable comparable = (Comparable) this.f12111a.get(size);
            if (!collection.contains(comparable)) {
                this.f12111a.remove(size);
                this.f12112b.remove(comparable);
                z10 = true;
            }
        }
        return z10;
    }

    public int size() {
        return this.f12111a.size();
    }

    public Object[] toArray() {
        return this.f12111a.toArray();
    }

    public Object[] toArray(Object[] objArr) {
        return this.f12111a.toArray(objArr);
    }

    public Comparable b(int i10) {
        Comparable comparable = (Comparable) this.f12111a.remove(i10);
        this.f12112b.remove(comparable);
        return comparable;
    }

    public Comparable a(int i10) {
        return (Comparable) this.f12111a.get(i10);
    }

    public Comparable a() {
        return (Comparable) this.f12111a.get(size() - 1);
    }

    public void a(int i10, Comparable comparable) {
        this.f12112b.remove((Comparable) this.f12111a.get(i10));
        this.f12111a.set(i10, comparable);
        this.f12112b.add(comparable);
    }
}
