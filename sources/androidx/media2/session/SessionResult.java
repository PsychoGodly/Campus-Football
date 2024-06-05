package androidx.media2.session;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.media2.common.MediaItem;
import androidx.versionedparcelable.CustomVersionedParcelable;

public class SessionResult extends CustomVersionedParcelable {

    /* renamed from: a  reason: collision with root package name */
    int f4236a;

    /* renamed from: b  reason: collision with root package name */
    long f4237b;

    /* renamed from: c  reason: collision with root package name */
    Bundle f4238c;

    /* renamed from: d  reason: collision with root package name */
    MediaItem f4239d;

    /* renamed from: e  reason: collision with root package name */
    MediaItem f4240e;

    public SessionResult(int i10, Bundle bundle) {
        this(i10, bundle, (MediaItem) null, SystemClock.elapsedRealtime());
    }

    public void c() {
        this.f4239d = this.f4240e;
    }

    public void d(boolean z10) {
        MediaItem mediaItem = this.f4239d;
        if (mediaItem != null) {
            synchronized (mediaItem) {
                if (this.f4240e == null) {
                    this.f4240e = b.c(this.f4239d);
                }
            }
        }
    }

    SessionResult() {
    }

    SessionResult(int i10, Bundle bundle, MediaItem mediaItem, long j10) {
        this.f4236a = i10;
        this.f4238c = bundle;
        this.f4239d = mediaItem;
        this.f4237b = j10;
    }
}
