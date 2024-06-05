package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2667a = (IconCompat) aVar.I(remoteActionCompat.f2667a, 1);
        remoteActionCompat.f2668b = aVar.o(remoteActionCompat.f2668b, 2);
        remoteActionCompat.f2669c = aVar.o(remoteActionCompat.f2669c, 3);
        remoteActionCompat.f2670d = (PendingIntent) aVar.A(remoteActionCompat.f2670d, 4);
        remoteActionCompat.f2671e = aVar.i(remoteActionCompat.f2671e, 5);
        remoteActionCompat.f2672f = aVar.i(remoteActionCompat.f2672f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.K(false, false);
        aVar.m0(remoteActionCompat.f2667a, 1);
        aVar.S(remoteActionCompat.f2668b, 2);
        aVar.S(remoteActionCompat.f2669c, 3);
        aVar.d0(remoteActionCompat.f2670d, 4);
        aVar.M(remoteActionCompat.f2671e, 5);
        aVar.M(remoteActionCompat.f2672f, 6);
    }
}
