package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.core.util.c;
import androidx.media2.session.SessionToken;

final class SessionTokenImplBase implements SessionToken.SessionTokenImpl {

    /* renamed from: a  reason: collision with root package name */
    int f4242a;

    /* renamed from: b  reason: collision with root package name */
    int f4243b;

    /* renamed from: c  reason: collision with root package name */
    String f4244c;

    /* renamed from: d  reason: collision with root package name */
    String f4245d;

    /* renamed from: e  reason: collision with root package name */
    IBinder f4246e;

    /* renamed from: f  reason: collision with root package name */
    ComponentName f4247f;

    /* renamed from: g  reason: collision with root package name */
    Bundle f4248g;

    SessionTokenImplBase() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionTokenImplBase)) {
            return false;
        }
        SessionTokenImplBase sessionTokenImplBase = (SessionTokenImplBase) obj;
        if (this.f4242a != sessionTokenImplBase.f4242a || !TextUtils.equals(this.f4244c, sessionTokenImplBase.f4244c) || !TextUtils.equals(this.f4245d, sessionTokenImplBase.f4245d) || this.f4243b != sessionTokenImplBase.f4243b || !c.a(this.f4246e, sessionTokenImplBase.f4246e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return c.b(Integer.valueOf(this.f4243b), Integer.valueOf(this.f4242a), this.f4244c, this.f4245d);
    }

    public String toString() {
        return "SessionToken {pkg=" + this.f4244c + " type=" + this.f4243b + " service=" + this.f4245d + " IMediaSession=" + this.f4246e + " extras=" + this.f4248g + "}";
    }
}
