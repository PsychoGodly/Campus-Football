package com.google.firebase.firestore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import r7.x1;
import u7.i;
import y7.x;

/* compiled from: QuerySnapshot */
public class x0 implements Iterable<w0> {

    /* renamed from: a  reason: collision with root package name */
    private final v0 f26556a;

    /* renamed from: b  reason: collision with root package name */
    private final x1 f26557b;

    /* renamed from: c  reason: collision with root package name */
    private final FirebaseFirestore f26558c;

    /* renamed from: d  reason: collision with root package name */
    private List<h> f26559d;

    /* renamed from: f  reason: collision with root package name */
    private o0 f26560f;

    /* renamed from: g  reason: collision with root package name */
    private final a1 f26561g;

    /* compiled from: QuerySnapshot */
    private class a implements Iterator<w0> {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<i> f26562a;

        a(Iterator<i> it) {
            this.f26562a = it;
        }

        /* renamed from: a */
        public w0 next() {
            return x0.this.c(this.f26562a.next());
        }

        public boolean hasNext() {
            return this.f26562a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
        }
    }

    x0(v0 v0Var, x1 x1Var, FirebaseFirestore firebaseFirestore) {
        this.f26556a = (v0) x.b(v0Var);
        this.f26557b = (x1) x.b(x1Var);
        this.f26558c = (FirebaseFirestore) x.b(firebaseFirestore);
        this.f26561g = new a1(x1Var.j(), x1Var.k());
    }

    /* access modifiers changed from: private */
    public w0 c(i iVar) {
        return w0.h(this.f26558c, iVar, this.f26557b.k(), this.f26557b.f().contains(iVar.getKey()));
    }

    public List<h> e() {
        return f(o0.EXCLUDE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (!this.f26558c.equals(x0Var.f26558c) || !this.f26556a.equals(x0Var.f26556a) || !this.f26557b.equals(x0Var.f26557b) || !this.f26561g.equals(x0Var.f26561g)) {
            return false;
        }
        return true;
    }

    public List<h> f(o0 o0Var) {
        if (!o0.INCLUDE.equals(o0Var) || !this.f26557b.b()) {
            if (this.f26559d == null || this.f26560f != o0Var) {
                this.f26559d = Collections.unmodifiableList(h.a(this.f26558c, o0Var, this.f26557b));
                this.f26560f = o0Var;
            }
            return this.f26559d;
        }
        throw new IllegalArgumentException("To include metadata changes with your document changes, you must also pass MetadataChanges.INCLUDE to addSnapshotListener().");
    }

    public List<n> g() {
        ArrayList arrayList = new ArrayList(this.f26557b.e().size());
        Iterator<i> it = this.f26557b.e().iterator();
        while (it.hasNext()) {
            arrayList.add(c(it.next()));
        }
        return arrayList;
    }

    public a1 h() {
        return this.f26561g;
    }

    public int hashCode() {
        return (((((this.f26558c.hashCode() * 31) + this.f26556a.hashCode()) * 31) + this.f26557b.hashCode()) * 31) + this.f26561g.hashCode();
    }

    public Iterator<w0> iterator() {
        return new a(this.f26557b.e().iterator());
    }
}
