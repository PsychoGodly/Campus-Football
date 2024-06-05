package androidx.media2.session;

import androidx.versionedparcelable.a;

public final class SessionCommandParcelizer {
    public static SessionCommand read(a aVar) {
        SessionCommand sessionCommand = new SessionCommand();
        sessionCommand.f4232a = aVar.v(sessionCommand.f4232a, 1);
        sessionCommand.f4233b = aVar.E(sessionCommand.f4233b, 2);
        sessionCommand.f4234c = aVar.k(sessionCommand.f4234c, 3);
        return sessionCommand;
    }

    public static void write(SessionCommand sessionCommand, a aVar) {
        aVar.K(false, false);
        aVar.Y(sessionCommand.f4232a, 1);
        aVar.h0(sessionCommand.f4233b, 2);
        aVar.O(sessionCommand.f4234c, 3);
    }
}
