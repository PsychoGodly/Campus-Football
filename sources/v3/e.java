package v3;

import j4.j0;
import java.util.List;
import o3.b;
import o3.c;

/* compiled from: FilteringHlsPlaylistParserFactory */
public final class e implements k {

    /* renamed from: a  reason: collision with root package name */
    private final k f23212a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f23213b;

    public e(k kVar, List<c> list) {
        this.f23212a = kVar;
        this.f23213b = list;
    }

    public j0.a<i> a(h hVar, g gVar) {
        return new b(this.f23212a.a(hVar, gVar), this.f23213b);
    }

    public j0.a<i> b() {
        return new b(this.f23212a.b(), this.f23213b);
    }
}
