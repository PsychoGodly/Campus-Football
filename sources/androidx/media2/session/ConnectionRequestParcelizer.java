package androidx.media2.session;

import androidx.versionedparcelable.a;

public final class ConnectionRequestParcelizer {
    public static ConnectionRequest read(a aVar) {
        ConnectionRequest connectionRequest = new ConnectionRequest();
        connectionRequest.f4172a = aVar.v(connectionRequest.f4172a, 0);
        connectionRequest.f4173b = aVar.E(connectionRequest.f4173b, 1);
        connectionRequest.f4174c = aVar.v(connectionRequest.f4174c, 2);
        connectionRequest.f4175d = aVar.k(connectionRequest.f4175d, 3);
        return connectionRequest;
    }

    public static void write(ConnectionRequest connectionRequest, a aVar) {
        aVar.K(false, false);
        aVar.Y(connectionRequest.f4172a, 0);
        aVar.h0(connectionRequest.f4173b, 1);
        aVar.Y(connectionRequest.f4174c, 2);
        aVar.O(connectionRequest.f4175d, 3);
    }
}
