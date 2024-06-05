package ne;

import fe.p;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ke.c;
import kotlin.jvm.internal.m;
import sd.n;

/* compiled from: Strings.kt */
final class d implements me.d<c> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f36518a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f36519b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f36520c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, n<Integer, Integer>> f36521d;

    /* compiled from: Strings.kt */
    public static final class a implements Iterator<c>, ge.a {

        /* renamed from: a  reason: collision with root package name */
        private int f36522a = -1;

        /* renamed from: b  reason: collision with root package name */
        private int f36523b;

        /* renamed from: c  reason: collision with root package name */
        private int f36524c;

        /* renamed from: d  reason: collision with root package name */
        private c f36525d;

        /* renamed from: f  reason: collision with root package name */
        private int f36526f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f36527g;

        a(d dVar) {
            this.f36527g = dVar;
            int e10 = i.e(dVar.f36519b, 0, dVar.f36518a.length());
            this.f36523b = e10;
            this.f36524c = e10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < ne.d.c(r6.f36527g)) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f36524c
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f36522a = r1
                r0 = 0
                r6.f36525d = r0
                goto L_0x009e
            L_0x000c:
                ne.d r0 = r6.f36527g
                int r0 = r0.f36520c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f36526f
                int r0 = r0 + r3
                r6.f36526f = r0
                ne.d r4 = r6.f36527g
                int r4 = r4.f36520c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f36524c
                ne.d r4 = r6.f36527g
                java.lang.CharSequence r4 = r4.f36518a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                ke.c r0 = new ke.c
                int r1 = r6.f36523b
                ne.d r4 = r6.f36527g
                java.lang.CharSequence r4 = r4.f36518a
                int r4 = ne.p.z(r4)
                r0.<init>(r1, r4)
                r6.f36525d = r0
                r6.f36524c = r2
                goto L_0x009c
            L_0x0047:
                ne.d r0 = r6.f36527g
                fe.p r0 = r0.f36521d
                ne.d r4 = r6.f36527g
                java.lang.CharSequence r4 = r4.f36518a
                int r5 = r6.f36524c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                sd.n r0 = (sd.n) r0
                if (r0 != 0) goto L_0x0077
                ke.c r0 = new ke.c
                int r1 = r6.f36523b
                ne.d r4 = r6.f36527g
                java.lang.CharSequence r4 = r4.f36518a
                int r4 = ne.p.z(r4)
                r0.<init>(r1, r4)
                r6.f36525d = r0
                r6.f36524c = r2
                goto L_0x009c
            L_0x0077:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f36523b
                ke.c r4 = ke.i.i(r4, r2)
                r6.f36525d = r4
                int r2 = r2 + r0
                r6.f36523b = r2
                if (r0 != 0) goto L_0x0099
                r1 = 1
            L_0x0099:
                int r2 = r2 + r1
                r6.f36524c = r2
            L_0x009c:
                r6.f36522a = r3
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ne.d.a.a():void");
        }

        /* renamed from: b */
        public c next() {
            if (this.f36522a == -1) {
                a();
            }
            if (this.f36522a != 0) {
                c cVar = this.f36525d;
                m.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f36525d = null;
                this.f36522a = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f36522a == -1) {
                a();
            }
            return this.f36522a == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(CharSequence charSequence, int i10, int i11, p<? super CharSequence, ? super Integer, n<Integer, Integer>> pVar) {
        m.e(charSequence, "input");
        m.e(pVar, "getNextMatch");
        this.f36518a = charSequence;
        this.f36519b = i10;
        this.f36520c = i11;
        this.f36521d = pVar;
    }

    public Iterator<c> iterator() {
        return new a(this);
    }
}
