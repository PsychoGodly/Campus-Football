package com.google.firebase.firestore;

import java.util.ArrayList;
import java.util.List;
import r7.m;
import r7.x1;
import u7.i;
import u7.n;

/* compiled from: DocumentChange */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final b f26462a;

    /* renamed from: b  reason: collision with root package name */
    private final w0 f26463b;

    /* renamed from: c  reason: collision with root package name */
    private final int f26464c;

    /* renamed from: d  reason: collision with root package name */
    private final int f26465d;

    /* compiled from: DocumentChange */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f26466a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                r7.m$a[] r0 = r7.m.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26466a = r0
                r7.m$a r1 = r7.m.a.ADDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26466a     // Catch:{ NoSuchFieldError -> 0x001d }
                r7.m$a r1 = r7.m.a.METADATA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26466a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r7.m$a r1 = r7.m.a.MODIFIED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26466a     // Catch:{ NoSuchFieldError -> 0x0033 }
                r7.m$a r1 = r7.m.a.REMOVED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.h.a.<clinit>():void");
        }
    }

    /* compiled from: DocumentChange */
    public enum b {
        ADDED,
        MODIFIED,
        REMOVED
    }

    h(w0 w0Var, b bVar, int i10, int i11) {
        this.f26462a = bVar;
        this.f26463b = w0Var;
        this.f26464c = i10;
        this.f26465d = i11;
    }

    static List<h> a(FirebaseFirestore firebaseFirestore, o0 o0Var, x1 x1Var) {
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        if (x1Var.g().isEmpty()) {
            i iVar = null;
            int i12 = 0;
            for (m next : x1Var.d()) {
                i b10 = next.b();
                w0 h10 = w0.h(firebaseFirestore, b10, x1Var.k(), x1Var.f().contains(b10.getKey()));
                y7.b.d(next.c() == m.a.ADDED, "Invalid added event for first snapshot", new Object[0]);
                y7.b.d(iVar == null || x1Var.h().c().compare(iVar, b10) < 0, "Got added events in wrong order", new Object[0]);
                arrayList.add(new h(h10, b.ADDED, -1, i12));
                iVar = b10;
                i12++;
            }
        } else {
            n g10 = x1Var.g();
            for (m next2 : x1Var.d()) {
                if (o0Var != o0.EXCLUDE || next2.c() != m.a.METADATA) {
                    i b11 = next2.b();
                    w0 h11 = w0.h(firebaseFirestore, b11, x1Var.k(), x1Var.f().contains(b11.getKey()));
                    b f10 = f(next2);
                    if (f10 != b.ADDED) {
                        i10 = g10.m(b11.getKey());
                        y7.b.d(i10 >= 0, "Index for document not found", new Object[0]);
                        g10 = g10.o(b11.getKey());
                    } else {
                        i10 = -1;
                    }
                    if (f10 != b.REMOVED) {
                        g10 = g10.c(b11);
                        i11 = g10.m(b11.getKey());
                        y7.b.d(i11 >= 0, "Index for document not found", new Object[0]);
                    } else {
                        i11 = -1;
                    }
                    arrayList.add(new h(h11, f10, i10, i11));
                }
            }
        }
        return arrayList;
    }

    private static b f(m mVar) {
        int i10 = a.f26466a[mVar.c().ordinal()];
        if (i10 == 1) {
            return b.ADDED;
        }
        if (i10 == 2 || i10 == 3) {
            return b.MODIFIED;
        }
        if (i10 == 4) {
            return b.REMOVED;
        }
        throw new IllegalArgumentException("Unknown view change type: " + mVar.c());
    }

    public w0 b() {
        return this.f26463b;
    }

    public int c() {
        return this.f26465d;
    }

    public int d() {
        return this.f26464c;
    }

    public b e() {
        return this.f26462a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f26462a.equals(hVar.f26462a) || !this.f26463b.equals(hVar.f26463b) || this.f26464c != hVar.f26464c || this.f26465d != hVar.f26465d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.f26462a.hashCode() * 31) + this.f26463b.hashCode()) * 31) + this.f26464c) * 31) + this.f26465d;
    }
}
