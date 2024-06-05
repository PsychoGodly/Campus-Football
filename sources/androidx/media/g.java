package androidx.media;

import android.media.session.MediaSessionManager;

/* compiled from: MediaSessionManagerImplApi28 */
final class g extends h {

    /* renamed from: d  reason: collision with root package name */
    final MediaSessionManager.RemoteUserInfo f4130d;

    g(String str, int i10, int i11) {
        super(str, i10, i11);
        this.f4130d = new MediaSessionManager.RemoteUserInfo(str, i10, i11);
    }

    static String a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getPackageName();
    }

    g(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        this.f4130d = remoteUserInfo;
    }
}
