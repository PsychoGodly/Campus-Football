package androidx.media2.session;

import androidx.media2.common.MediaItem;
import androidx.versionedparcelable.a;

public final class SessionResultParcelizer {
    public static SessionResult read(a aVar) {
        SessionResult sessionResult = new SessionResult();
        sessionResult.f4236a = aVar.v(sessionResult.f4236a, 1);
        sessionResult.f4237b = aVar.y(sessionResult.f4237b, 2);
        sessionResult.f4238c = aVar.k(sessionResult.f4238c, 3);
        sessionResult.f4240e = (MediaItem) aVar.I(sessionResult.f4240e, 4);
        sessionResult.c();
        return sessionResult;
    }

    public static void write(SessionResult sessionResult, a aVar) {
        aVar.K(false, false);
        sessionResult.d(aVar.g());
        aVar.Y(sessionResult.f4236a, 1);
        aVar.b0(sessionResult.f4237b, 2);
        aVar.O(sessionResult.f4238c, 3);
        aVar.m0(sessionResult.f4240e, 4);
    }
}
