package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.core.util.c;
import androidx.media2.session.SessionToken;
import androidx.versionedparcelable.CustomVersionedParcelable;
import i1.b;

final class SessionTokenImplLegacy extends CustomVersionedParcelable implements SessionToken.SessionTokenImpl {

    /* renamed from: a  reason: collision with root package name */
    private MediaSessionCompat.Token f4249a;

    /* renamed from: b  reason: collision with root package name */
    Bundle f4250b;

    /* renamed from: c  reason: collision with root package name */
    int f4251c;

    /* renamed from: d  reason: collision with root package name */
    int f4252d;

    /* renamed from: e  reason: collision with root package name */
    ComponentName f4253e;

    /* renamed from: f  reason: collision with root package name */
    String f4254f;

    /* renamed from: g  reason: collision with root package name */
    Bundle f4255g;

    SessionTokenImplLegacy() {
    }

    public void c() {
        this.f4249a = MediaSessionCompat.Token.a(this.f4250b);
    }

    public void d(boolean z10) {
        MediaSessionCompat.Token token = this.f4249a;
        if (token != null) {
            synchronized (token) {
                b e10 = this.f4249a.e();
                this.f4249a.i((b) null);
                this.f4250b = this.f4249a.j();
                this.f4249a.i(e10);
            }
            return;
        }
        this.f4250b = null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionTokenImplLegacy)) {
            return false;
        }
        SessionTokenImplLegacy sessionTokenImplLegacy = (SessionTokenImplLegacy) obj;
        int i10 = this.f4252d;
        if (i10 != sessionTokenImplLegacy.f4252d) {
            return false;
        }
        if (i10 == 100) {
            return c.a(this.f4249a, sessionTokenImplLegacy.f4249a);
        }
        if (i10 != 101) {
            return false;
        }
        return c.a(this.f4253e, sessionTokenImplLegacy.f4253e);
    }

    public int hashCode() {
        return c.b(Integer.valueOf(this.f4252d), this.f4253e, this.f4249a);
    }

    public String toString() {
        return "SessionToken {legacyToken=" + this.f4249a + "}";
    }
}
