package k9;

import v8.f;
import z8.a;

/* compiled from: AbstractExpandedDecoder */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private final a f29150a;

    /* renamed from: b  reason: collision with root package name */
    private final s f29151b;

    j(a aVar) {
        this.f29150a = aVar;
        this.f29151b = new s(aVar);
    }

    public static j a(a aVar) {
        if (aVar.c(1)) {
            return new g(aVar);
        }
        if (!aVar.c(2)) {
            return new k(aVar);
        }
        int g10 = s.g(aVar, 1, 4);
        if (g10 == 4) {
            return new a(aVar);
        }
        if (g10 == 5) {
            return new b(aVar);
        }
        int g11 = s.g(aVar, 1, 5);
        if (g11 == 12) {
            return new c(aVar);
        }
        if (g11 == 13) {
            return new d(aVar);
        }
        switch (s.g(aVar, 1, 7)) {
            case 56:
                return new e(aVar, "310", "11");
            case 57:
                return new e(aVar, "320", "11");
            case 58:
                return new e(aVar, "310", "13");
            case 59:
                return new e(aVar, "320", "13");
            case 60:
                return new e(aVar, "310", "15");
            case 61:
                return new e(aVar, "320", "15");
            case 62:
                return new e(aVar, "310", "17");
            case 63:
                return new e(aVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: " + aVar);
        }
    }

    /* access modifiers changed from: protected */
    public final s b() {
        return this.f29151b;
    }

    /* access modifiers changed from: protected */
    public final a c() {
        return this.f29150a;
    }

    public abstract String d() throws v8.j, f;
}
