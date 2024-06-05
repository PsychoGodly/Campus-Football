package androidx.media2.session;

import androidx.core.util.c;
import androidx.media.AudioAttributesCompat;
import i1.b;

public final class MediaController$PlaybackInfo implements b {

    /* renamed from: a  reason: collision with root package name */
    int f4211a;

    /* renamed from: b  reason: collision with root package name */
    int f4212b;

    /* renamed from: c  reason: collision with root package name */
    int f4213c;

    /* renamed from: d  reason: collision with root package name */
    int f4214d;

    /* renamed from: e  reason: collision with root package name */
    AudioAttributesCompat f4215e;

    MediaController$PlaybackInfo() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MediaController$PlaybackInfo)) {
            return false;
        }
        MediaController$PlaybackInfo mediaController$PlaybackInfo = (MediaController$PlaybackInfo) obj;
        if (this.f4211a == mediaController$PlaybackInfo.f4211a && this.f4212b == mediaController$PlaybackInfo.f4212b && this.f4213c == mediaController$PlaybackInfo.f4213c && this.f4214d == mediaController$PlaybackInfo.f4214d && c.a(this.f4215e, mediaController$PlaybackInfo.f4215e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return c.b(Integer.valueOf(this.f4211a), Integer.valueOf(this.f4212b), Integer.valueOf(this.f4213c), Integer.valueOf(this.f4214d), this.f4215e);
    }
}
