package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList */
public class j0 extends c<String> implements k0, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private static final j0 f27108c;

    /* renamed from: d  reason: collision with root package name */
    public static final k0 f27109d;

    /* renamed from: b  reason: collision with root package name */
    private final List<Object> f27110b;

    static {
        j0 j0Var = new j0();
        f27108c = j0Var;
        j0Var.i();
        f27109d = j0Var;
    }

    public j0() {
        this(10);
    }

    private static String e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof i) {
            return ((i) obj).N();
        }
        return d0.j((byte[]) obj);
    }

    public void a(i iVar) {
        b();
        this.f27110b.add(iVar);
        this.modCount++;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: c */
    public void add(int i10, String str) {
        b();
        this.f27110b.add(i10, str);
        this.modCount++;
    }

    public void clear() {
        b();
        this.f27110b.clear();
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public String get(int i10) {
        Object obj = this.f27110b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String N = iVar.N();
            if (iVar.A()) {
                this.f27110b.set(i10, N);
            }
            return N;
        }
        byte[] bArr = (byte[]) obj;
        String j10 = d0.j(bArr);
        if (d0.g(bArr)) {
            this.f27110b.set(i10, j10);
        }
        return j10;
    }

    /* renamed from: g */
    public j0 d(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f27110b);
            return new j0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public String remove(int i10) {
        b();
        Object remove = this.f27110b.remove(i10);
        this.modCount++;
        return e(remove);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public List<?> l() {
        return Collections.unmodifiableList(this.f27110b);
    }

    /* renamed from: m */
    public String set(int i10, String str) {
        b();
        return e(this.f27110b.set(i10, str));
    }

    public k0 r() {
        return t() ? new y1(this) : this;
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public Object s(int i10) {
        return this.f27110b.get(i10);
    }

    public int size() {
        return this.f27110b.size();
    }

    public /* bridge */ /* synthetic */ boolean t() {
        return super.t();
    }

    public j0(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public boolean addAll(int i10, Collection<? extends String> collection) {
        b();
        if (collection instanceof k0) {
            collection = ((k0) collection).l();
        }
        boolean addAll = this.f27110b.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private j0(ArrayList<Object> arrayList) {
        this.f27110b = arrayList;
    }
}
