package androidx.media2.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.ParcelImplListSlice;
import androidx.media2.common.SessionPlayer$TrackInfo;
import androidx.media2.common.VideoSize;
import androidx.media2.session.a;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.List;

class ConnectionResult extends CustomVersionedParcelable {
    MediaMetadata A;
    int B;

    /* renamed from: a  reason: collision with root package name */
    int f4176a;

    /* renamed from: b  reason: collision with root package name */
    a f4177b;

    /* renamed from: c  reason: collision with root package name */
    IBinder f4178c;

    /* renamed from: d  reason: collision with root package name */
    PendingIntent f4179d;

    /* renamed from: e  reason: collision with root package name */
    int f4180e;

    /* renamed from: f  reason: collision with root package name */
    MediaItem f4181f;

    /* renamed from: g  reason: collision with root package name */
    MediaItem f4182g;

    /* renamed from: h  reason: collision with root package name */
    long f4183h;

    /* renamed from: i  reason: collision with root package name */
    long f4184i;

    /* renamed from: j  reason: collision with root package name */
    float f4185j;

    /* renamed from: k  reason: collision with root package name */
    long f4186k;

    /* renamed from: l  reason: collision with root package name */
    MediaController$PlaybackInfo f4187l;

    /* renamed from: m  reason: collision with root package name */
    int f4188m;

    /* renamed from: n  reason: collision with root package name */
    int f4189n;

    /* renamed from: o  reason: collision with root package name */
    ParcelImplListSlice f4190o;

    /* renamed from: p  reason: collision with root package name */
    SessionCommandGroup f4191p;

    /* renamed from: q  reason: collision with root package name */
    int f4192q;

    /* renamed from: r  reason: collision with root package name */
    int f4193r;

    /* renamed from: s  reason: collision with root package name */
    int f4194s;

    /* renamed from: t  reason: collision with root package name */
    Bundle f4195t;

    /* renamed from: u  reason: collision with root package name */
    VideoSize f4196u;

    /* renamed from: v  reason: collision with root package name */
    List<SessionPlayer$TrackInfo> f4197v;

    /* renamed from: w  reason: collision with root package name */
    SessionPlayer$TrackInfo f4198w;

    /* renamed from: x  reason: collision with root package name */
    SessionPlayer$TrackInfo f4199x;

    /* renamed from: y  reason: collision with root package name */
    SessionPlayer$TrackInfo f4200y;

    /* renamed from: z  reason: collision with root package name */
    SessionPlayer$TrackInfo f4201z;

    ConnectionResult() {
    }

    public void c() {
        this.f4177b = a.C0069a.M0(this.f4178c);
        this.f4181f = this.f4182g;
    }

    public void d(boolean z10) {
        synchronized (this.f4177b) {
            if (this.f4178c == null) {
                this.f4178c = (IBinder) this.f4177b;
                this.f4182g = b.c(this.f4181f);
            }
        }
    }
}
