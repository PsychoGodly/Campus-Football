package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList */
public class y1 extends AbstractList<String> implements k0, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final k0 f27294a;

    /* compiled from: UnmodifiableLazyStringList */
    class a implements ListIterator<String> {

        /* renamed from: a  reason: collision with root package name */
        ListIterator<String> f27295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f27296b;

        a(int i10) {
            this.f27296b = i10;
            this.f27295a = y1.this.f27294a.listIterator(i10);
        }

        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public String next() {
            return this.f27295a.next();
        }

        /* renamed from: c */
        public String previous() {
            return this.f27295a.previous();
        }

        /* renamed from: d */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f27295a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f27295a.hasPrevious();
        }

        public int nextIndex() {
            return this.f27295a.nextIndex();
        }

        public int previousIndex() {
            return this.f27295a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList */
    class b implements Iterator<String> {

        /* renamed from: a  reason: collision with root package name */
        Iterator<String> f27298a;

        b() {
            this.f27298a = y1.this.f27294a.iterator();
        }

        /* renamed from: a */
        public String next() {
            return this.f27298a.next();
        }

        public boolean hasNext() {
            return this.f27298a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public y1(k0 k0Var) {
        this.f27294a = k0Var;
    }

    public void a(i iVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public String get(int i10) {
        return (String) this.f27294a.get(i10);
    }

    public Iterator<String> iterator() {
        return new b();
    }

    public List<?> l() {
        return this.f27294a.l();
    }

    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    public k0 r() {
        return this;
    }

    public Object s(int i10) {
        return this.f27294a.s(i10);
    }

    public int size() {
        return this.f27294a.size();
    }
}
