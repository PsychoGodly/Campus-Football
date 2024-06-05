package androidx.media2.session;

import android.content.ComponentName;
import androidx.versionedparcelable.a;

public final class SessionTokenImplBaseParcelizer {
    public static SessionTokenImplBase read(a aVar) {
        SessionTokenImplBase sessionTokenImplBase = new SessionTokenImplBase();
        sessionTokenImplBase.f4242a = aVar.v(sessionTokenImplBase.f4242a, 1);
        sessionTokenImplBase.f4243b = aVar.v(sessionTokenImplBase.f4243b, 2);
        sessionTokenImplBase.f4244c = aVar.E(sessionTokenImplBase.f4244c, 3);
        sessionTokenImplBase.f4245d = aVar.E(sessionTokenImplBase.f4245d, 4);
        sessionTokenImplBase.f4246e = aVar.G(sessionTokenImplBase.f4246e, 5);
        sessionTokenImplBase.f4247f = (ComponentName) aVar.A(sessionTokenImplBase.f4247f, 6);
        sessionTokenImplBase.f4248g = aVar.k(sessionTokenImplBase.f4248g, 7);
        return sessionTokenImplBase;
    }

    public static void write(SessionTokenImplBase sessionTokenImplBase, a aVar) {
        aVar.K(false, false);
        aVar.Y(sessionTokenImplBase.f4242a, 1);
        aVar.Y(sessionTokenImplBase.f4243b, 2);
        aVar.h0(sessionTokenImplBase.f4244c, 3);
        aVar.h0(sessionTokenImplBase.f4245d, 4);
        aVar.j0(sessionTokenImplBase.f4246e, 5);
        aVar.d0(sessionTokenImplBase.f4247f, 6);
        aVar.O(sessionTokenImplBase.f4248g, 7);
    }
}
