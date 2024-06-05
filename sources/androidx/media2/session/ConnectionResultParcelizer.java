package androidx.media2.session;

import android.app.PendingIntent;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.ParcelImplListSlice;
import androidx.media2.common.SessionPlayer$TrackInfo;
import androidx.media2.common.VideoSize;
import androidx.versionedparcelable.a;

public final class ConnectionResultParcelizer {
    public static ConnectionResult read(a aVar) {
        ConnectionResult connectionResult = new ConnectionResult();
        connectionResult.f4176a = aVar.v(connectionResult.f4176a, 0);
        connectionResult.f4178c = aVar.G(connectionResult.f4178c, 1);
        connectionResult.f4188m = aVar.v(connectionResult.f4188m, 10);
        connectionResult.f4189n = aVar.v(connectionResult.f4189n, 11);
        connectionResult.f4190o = (ParcelImplListSlice) aVar.A(connectionResult.f4190o, 12);
        connectionResult.f4191p = (SessionCommandGroup) aVar.I(connectionResult.f4191p, 13);
        connectionResult.f4192q = aVar.v(connectionResult.f4192q, 14);
        connectionResult.f4193r = aVar.v(connectionResult.f4193r, 15);
        connectionResult.f4194s = aVar.v(connectionResult.f4194s, 16);
        connectionResult.f4195t = aVar.k(connectionResult.f4195t, 17);
        connectionResult.f4196u = (VideoSize) aVar.I(connectionResult.f4196u, 18);
        connectionResult.f4197v = aVar.w(connectionResult.f4197v, 19);
        connectionResult.f4179d = (PendingIntent) aVar.A(connectionResult.f4179d, 2);
        connectionResult.f4198w = (SessionPlayer$TrackInfo) aVar.I(connectionResult.f4198w, 20);
        connectionResult.f4199x = (SessionPlayer$TrackInfo) aVar.I(connectionResult.f4199x, 21);
        connectionResult.f4200y = (SessionPlayer$TrackInfo) aVar.I(connectionResult.f4200y, 23);
        connectionResult.f4201z = (SessionPlayer$TrackInfo) aVar.I(connectionResult.f4201z, 24);
        connectionResult.A = (MediaMetadata) aVar.I(connectionResult.A, 25);
        connectionResult.B = aVar.v(connectionResult.B, 26);
        connectionResult.f4180e = aVar.v(connectionResult.f4180e, 3);
        connectionResult.f4182g = (MediaItem) aVar.I(connectionResult.f4182g, 4);
        connectionResult.f4183h = aVar.y(connectionResult.f4183h, 5);
        connectionResult.f4184i = aVar.y(connectionResult.f4184i, 6);
        connectionResult.f4185j = aVar.s(connectionResult.f4185j, 7);
        connectionResult.f4186k = aVar.y(connectionResult.f4186k, 8);
        connectionResult.f4187l = (MediaController$PlaybackInfo) aVar.I(connectionResult.f4187l, 9);
        connectionResult.c();
        return connectionResult;
    }

    public static void write(ConnectionResult connectionResult, a aVar) {
        aVar.K(false, false);
        connectionResult.d(aVar.g());
        aVar.Y(connectionResult.f4176a, 0);
        aVar.j0(connectionResult.f4178c, 1);
        aVar.Y(connectionResult.f4188m, 10);
        aVar.Y(connectionResult.f4189n, 11);
        aVar.d0(connectionResult.f4190o, 12);
        aVar.m0(connectionResult.f4191p, 13);
        aVar.Y(connectionResult.f4192q, 14);
        aVar.Y(connectionResult.f4193r, 15);
        aVar.Y(connectionResult.f4194s, 16);
        aVar.O(connectionResult.f4195t, 17);
        aVar.m0(connectionResult.f4196u, 18);
        aVar.Z(connectionResult.f4197v, 19);
        aVar.d0(connectionResult.f4179d, 2);
        aVar.m0(connectionResult.f4198w, 20);
        aVar.m0(connectionResult.f4199x, 21);
        aVar.m0(connectionResult.f4200y, 23);
        aVar.m0(connectionResult.f4201z, 24);
        aVar.m0(connectionResult.A, 25);
        aVar.Y(connectionResult.B, 26);
        aVar.Y(connectionResult.f4180e, 3);
        aVar.m0(connectionResult.f4182g, 4);
        aVar.b0(connectionResult.f4183h, 5);
        aVar.b0(connectionResult.f4184i, 6);
        aVar.W(connectionResult.f4185j, 7);
        aVar.b0(connectionResult.f4186k, 8);
        aVar.m0(connectionResult.f4187l, 9);
    }
}
