package androidx.media2.session;

import i1.b;

public final class SessionToken implements b {

    /* renamed from: a  reason: collision with root package name */
    SessionTokenImpl f4241a;

    interface SessionTokenImpl extends b {
    }

    SessionToken() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionToken)) {
            return false;
        }
        return this.f4241a.equals(((SessionToken) obj).f4241a);
    }

    public int hashCode() {
        return this.f4241a.hashCode();
    }

    public String toString() {
        return this.f4241a.toString();
    }
}
