package androidx.media2.session;

import androidx.media2.session.SessionToken;
import androidx.versionedparcelable.a;

public final class SessionTokenParcelizer {
    public static SessionToken read(a aVar) {
        SessionToken sessionToken = new SessionToken();
        sessionToken.f4241a = (SessionToken.SessionTokenImpl) aVar.I(sessionToken.f4241a, 1);
        return sessionToken;
    }

    public static void write(SessionToken sessionToken, a aVar) {
        aVar.K(false, false);
        aVar.m0(sessionToken.f4241a, 1);
    }
}
