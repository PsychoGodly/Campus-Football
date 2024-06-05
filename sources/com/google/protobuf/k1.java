package com.google.protobuf;

/* compiled from: RawMessageInfo */
final class k1 implements t0 {

    /* renamed from: a  reason: collision with root package name */
    private final v0 f27119a;

    /* renamed from: b  reason: collision with root package name */
    private final String f27120b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f27121c;

    /* renamed from: d  reason: collision with root package name */
    private final int f27122d;

    k1(v0 v0Var, String str, Object[] objArr) {
        this.f27119a = v0Var;
        this.f27120b = str;
        this.f27121c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f27122d = charAt;
            return;
        }
        char c10 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                c10 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            } else {
                this.f27122d = c10 | (charAt2 << i10);
                return;
            }
        }
    }

    public boolean a() {
        return (this.f27122d & 2) == 2;
    }

    public v0 b() {
        return this.f27119a;
    }

    public h1 c() {
        return (this.f27122d & 1) == 1 ? h1.PROTO2 : h1.PROTO3;
    }

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return this.f27121c;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.f27120b;
    }
}
