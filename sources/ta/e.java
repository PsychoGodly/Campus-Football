package ta;

import java.util.Map;
import java.util.Objects;

/* compiled from: CustomMediaAction */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f22763a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<?, ?> f22764b;

    public e(String str, Map<?, ?> map) {
        this.f22763a = str;
        this.f22764b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f22763a.equals(eVar.f22763a) || !Objects.equals(this.f22764b, eVar.f22764b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f22763a, this.f22764b});
    }
}
