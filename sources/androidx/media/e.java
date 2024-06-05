package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: MediaSessionManager */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    f f4129a;

    public e(String str, int i10, int i11) {
        Objects.requireNonNull(str, "package shouldn't be null");
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f4129a = new g(str, i10, i11);
        } else {
            this.f4129a = new h(str, i10, i11);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f4129a.equals(((e) obj).f4129a);
    }

    public int hashCode() {
        return this.f4129a.hashCode();
    }

    public e(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String a10 = g.a(remoteUserInfo);
        Objects.requireNonNull(a10, "package shouldn't be null");
        if (!TextUtils.isEmpty(a10)) {
            this.f4129a = new g(remoteUserInfo);
            return;
        }
        throw new IllegalArgumentException("packageName should be nonempty");
    }
}
