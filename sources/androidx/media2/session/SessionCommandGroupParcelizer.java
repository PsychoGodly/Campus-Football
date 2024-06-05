package androidx.media2.session;

import androidx.versionedparcelable.a;

public final class SessionCommandGroupParcelizer {
    public static SessionCommandGroup read(a aVar) {
        SessionCommandGroup sessionCommandGroup = new SessionCommandGroup();
        sessionCommandGroup.f4235a = aVar.C(sessionCommandGroup.f4235a, 1);
        return sessionCommandGroup;
    }

    public static void write(SessionCommandGroup sessionCommandGroup, a aVar) {
        aVar.K(false, false);
        aVar.f0(sessionCommandGroup.f4235a, 1);
    }
}
