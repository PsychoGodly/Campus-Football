package ja;

import kotlin.jvm.internal.h;

/* compiled from: OSInfluenceType.kt */
public enum c {
    DIRECT,
    INDIRECT,
    UNATTRIBUTED,
    DISABLED;
    

    /* renamed from: a  reason: collision with root package name */
    public static final a f29109a = null;

    /* compiled from: OSInfluenceType.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a(String str) {
            c cVar = null;
            if (str != null) {
                c[] values = c.values();
                int length = values.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    c cVar2 = values[length];
                    if (o.l(cVar2.name(), str, true)) {
                        cVar = cVar2;
                        break;
                    }
                }
            }
            return cVar == null ? c.UNATTRIBUTED : cVar;
        }
    }

    static {
        f29109a = new a((h) null);
    }

    public final boolean c() {
        return d() || f();
    }

    public final boolean d() {
        return this == DIRECT;
    }

    public final boolean e() {
        return this == DISABLED;
    }

    public final boolean f() {
        return this == INDIRECT;
    }

    public final boolean g() {
        return this == UNATTRIBUTED;
    }
}
