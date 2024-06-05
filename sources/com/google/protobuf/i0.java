package com.google.protobuf;

/* compiled from: LazyFieldLite */
public class i0 {

    /* renamed from: e  reason: collision with root package name */
    private static final q f27051e = q.b();

    /* renamed from: a  reason: collision with root package name */
    private i f27052a;

    /* renamed from: b  reason: collision with root package name */
    private q f27053b;

    /* renamed from: c  reason: collision with root package name */
    protected volatile v0 f27054c;

    /* renamed from: d  reason: collision with root package name */
    private volatile i f27055d;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.f27054c = r4;
        r3.f27055d = com.google.protobuf.i.f27039b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.google.protobuf.v0 r4) {
        /*
            r3 = this;
            com.google.protobuf.v0 r0 = r3.f27054c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            com.google.protobuf.v0 r0 = r3.f27054c     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x000c:
            com.google.protobuf.i r0 = r3.f27052a     // Catch:{ e0 -> 0x002c }
            if (r0 == 0) goto L_0x0025
            com.google.protobuf.f1 r0 = r4.k()     // Catch:{ e0 -> 0x002c }
            com.google.protobuf.i r1 = r3.f27052a     // Catch:{ e0 -> 0x002c }
            com.google.protobuf.q r2 = r3.f27053b     // Catch:{ e0 -> 0x002c }
            java.lang.Object r0 = r0.a(r1, r2)     // Catch:{ e0 -> 0x002c }
            com.google.protobuf.v0 r0 = (com.google.protobuf.v0) r0     // Catch:{ e0 -> 0x002c }
            r3.f27054c = r0     // Catch:{ e0 -> 0x002c }
            com.google.protobuf.i r0 = r3.f27052a     // Catch:{ e0 -> 0x002c }
            r3.f27055d = r0     // Catch:{ e0 -> 0x002c }
            goto L_0x0032
        L_0x0025:
            r3.f27054c = r4     // Catch:{ e0 -> 0x002c }
            com.google.protobuf.i r0 = com.google.protobuf.i.f27039b     // Catch:{ e0 -> 0x002c }
            r3.f27055d = r0     // Catch:{ e0 -> 0x002c }
            goto L_0x0032
        L_0x002c:
            r3.f27054c = r4     // Catch:{ all -> 0x0034 }
            com.google.protobuf.i r4 = com.google.protobuf.i.f27039b     // Catch:{ all -> 0x0034 }
            r3.f27055d = r4     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i0.a(com.google.protobuf.v0):void");
    }

    public int b() {
        if (this.f27055d != null) {
            return this.f27055d.size();
        }
        i iVar = this.f27052a;
        if (iVar != null) {
            return iVar.size();
        }
        if (this.f27054c != null) {
            return this.f27054c.f();
        }
        return 0;
    }

    public v0 c(v0 v0Var) {
        a(v0Var);
        return this.f27054c;
    }

    public v0 d(v0 v0Var) {
        v0 v0Var2 = this.f27054c;
        this.f27052a = null;
        this.f27055d = null;
        this.f27054c = v0Var;
        return v0Var2;
    }

    public i e() {
        if (this.f27055d != null) {
            return this.f27055d;
        }
        i iVar = this.f27052a;
        if (iVar != null) {
            return iVar;
        }
        synchronized (this) {
            if (this.f27055d != null) {
                i iVar2 = this.f27055d;
                return iVar2;
            }
            if (this.f27054c == null) {
                this.f27055d = i.f27039b;
            } else {
                this.f27055d = this.f27054c.e();
            }
            i iVar3 = this.f27055d;
            return iVar3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        v0 v0Var = this.f27054c;
        v0 v0Var2 = i0Var.f27054c;
        if (v0Var == null && v0Var2 == null) {
            return e().equals(i0Var.e());
        }
        if (v0Var != null && v0Var2 != null) {
            return v0Var.equals(v0Var2);
        }
        if (v0Var != null) {
            return v0Var.equals(i0Var.c(v0Var.a()));
        }
        return c(v0Var2.a()).equals(v0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
