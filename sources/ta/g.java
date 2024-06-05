package ta;

import java.util.Objects;

/* compiled from: MediaControl */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f22769a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22770b;

    /* renamed from: c  reason: collision with root package name */
    public final long f22771c;

    /* renamed from: d  reason: collision with root package name */
    public final e f22772d;

    public g(String str, String str2, long j10, e eVar) {
        this.f22769a = str;
        this.f22770b = str2;
        this.f22771c = j10;
        this.f22772d = eVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f22769a.equals(gVar.f22769a) || !this.f22770b.equals(gVar.f22770b) || this.f22771c != gVar.f22771c || !Objects.equals(this.f22772d, gVar.f22772d)) {
            return false;
        }
        return true;
    }
}
