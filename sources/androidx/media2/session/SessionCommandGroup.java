package androidx.media2.session;

import androidx.core.util.c;
import i1.b;
import java.util.HashSet;
import java.util.Set;

public final class SessionCommandGroup implements b {

    /* renamed from: a  reason: collision with root package name */
    Set<SessionCommand> f4235a = new HashSet();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionCommandGroup)) {
            return false;
        }
        SessionCommandGroup sessionCommandGroup = (SessionCommandGroup) obj;
        Set<SessionCommand> set = this.f4235a;
        if (set != null) {
            return set.equals(sessionCommandGroup.f4235a);
        }
        if (sessionCommandGroup.f4235a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return c.c(this.f4235a);
    }
}
