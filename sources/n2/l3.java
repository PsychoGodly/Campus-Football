package n2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import k4.n0;
import p3.s0;

/* compiled from: PlaylistTimeline */
final class l3 extends a {

    /* renamed from: j  reason: collision with root package name */
    private final int f20529j;

    /* renamed from: k  reason: collision with root package name */
    private final int f20530k;

    /* renamed from: l  reason: collision with root package name */
    private final int[] f20531l;

    /* renamed from: m  reason: collision with root package name */
    private final int[] f20532m;

    /* renamed from: n  reason: collision with root package name */
    private final c4[] f20533n;

    /* renamed from: o  reason: collision with root package name */
    private final Object[] f20534o;

    /* renamed from: p  reason: collision with root package name */
    private final HashMap<Object, Integer> f20535p = new HashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l3(Collection<? extends j2> collection, s0 s0Var) {
        super(false, s0Var);
        int i10 = 0;
        int size = collection.size();
        this.f20531l = new int[size];
        this.f20532m = new int[size];
        this.f20533n = new c4[size];
        this.f20534o = new Object[size];
        int i11 = 0;
        int i12 = 0;
        for (j2 j2Var : collection) {
            this.f20533n[i12] = j2Var.a();
            this.f20532m[i12] = i10;
            this.f20531l[i12] = i11;
            i10 += this.f20533n[i12].t();
            i11 += this.f20533n[i12].m();
            this.f20534o[i12] = j2Var.c();
            this.f20535p.put(this.f20534o[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f20529j = i10;
        this.f20530k = i11;
    }

    /* access modifiers changed from: protected */
    public Object B(int i10) {
        return this.f20534o[i10];
    }

    /* access modifiers changed from: protected */
    public int D(int i10) {
        return this.f20531l[i10];
    }

    /* access modifiers changed from: protected */
    public int E(int i10) {
        return this.f20532m[i10];
    }

    /* access modifiers changed from: protected */
    public c4 H(int i10) {
        return this.f20533n[i10];
    }

    /* access modifiers changed from: package-private */
    public List<c4> I() {
        return Arrays.asList(this.f20533n);
    }

    public int m() {
        return this.f20530k;
    }

    public int t() {
        return this.f20529j;
    }

    /* access modifiers changed from: protected */
    public int w(Object obj) {
        Integer num = this.f20535p.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    public int x(int i10) {
        return n0.h(this.f20531l, i10 + 1, false, false);
    }

    /* access modifiers changed from: protected */
    public int y(int i10) {
        return n0.h(this.f20532m, i10 + 1, false, false);
    }
}
