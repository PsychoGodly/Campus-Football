package b2;

import java.util.Set;
import z1.b;
import z1.e;
import z1.f;
import z1.g;

/* compiled from: TransportFactoryImpl */
final class p implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f5438a;

    /* renamed from: b  reason: collision with root package name */
    private final o f5439b;

    /* renamed from: c  reason: collision with root package name */
    private final s f5440c;

    p(Set<b> set, o oVar, s sVar) {
        this.f5438a = set;
        this.f5439b = oVar;
        this.f5440c = sVar;
    }

    public <T> f<T> a(String str, Class<T> cls, b bVar, e<T, byte[]> eVar) {
        if (this.f5438a.contains(bVar)) {
            return new r(this.f5439b, str, bVar, eVar, this.f5440c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f5438a}));
    }
}
