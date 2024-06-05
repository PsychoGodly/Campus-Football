package androidx.media2.session;

import android.content.ComponentName;
import androidx.versionedparcelable.a;

public final class SessionTokenImplLegacyParcelizer {
    public static SessionTokenImplLegacy read(a aVar) {
        SessionTokenImplLegacy sessionTokenImplLegacy = new SessionTokenImplLegacy();
        sessionTokenImplLegacy.f4250b = aVar.k(sessionTokenImplLegacy.f4250b, 1);
        sessionTokenImplLegacy.f4251c = aVar.v(sessionTokenImplLegacy.f4251c, 2);
        sessionTokenImplLegacy.f4252d = aVar.v(sessionTokenImplLegacy.f4252d, 3);
        sessionTokenImplLegacy.f4253e = (ComponentName) aVar.A(sessionTokenImplLegacy.f4253e, 4);
        sessionTokenImplLegacy.f4254f = aVar.E(sessionTokenImplLegacy.f4254f, 5);
        sessionTokenImplLegacy.f4255g = aVar.k(sessionTokenImplLegacy.f4255g, 6);
        sessionTokenImplLegacy.c();
        return sessionTokenImplLegacy;
    }

    public static void write(SessionTokenImplLegacy sessionTokenImplLegacy, a aVar) {
        aVar.K(false, false);
        sessionTokenImplLegacy.d(aVar.g());
        aVar.O(sessionTokenImplLegacy.f4250b, 1);
        aVar.Y(sessionTokenImplLegacy.f4251c, 2);
        aVar.Y(sessionTokenImplLegacy.f4252d, 3);
        aVar.d0(sessionTokenImplLegacy.f4253e, 4);
        aVar.h0(sessionTokenImplLegacy.f4254f, 5);
        aVar.O(sessionTokenImplLegacy.f4255g, 6);
    }
}
