package androidx.media2.common;

import androidx.core.util.d;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class MediaItem extends CustomVersionedParcelable {

    /* renamed from: a  reason: collision with root package name */
    private final Object f4143a;

    /* renamed from: b  reason: collision with root package name */
    MediaMetadata f4144b;

    /* renamed from: c  reason: collision with root package name */
    long f4145c;

    /* renamed from: d  reason: collision with root package name */
    long f4146d;

    /* renamed from: e  reason: collision with root package name */
    private final List<d<Object, Executor>> f4147e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        MediaMetadata f4148a;

        /* renamed from: b  reason: collision with root package name */
        long f4149b = 0;

        /* renamed from: c  reason: collision with root package name */
        long f4150c = 576460752303423487L;

        public MediaItem a() {
            return new MediaItem(this);
        }

        public a b(long j10) {
            if (j10 < 0) {
                j10 = 576460752303423487L;
            }
            this.f4150c = j10;
            return this;
        }

        public a c(MediaMetadata mediaMetadata) {
            this.f4148a = mediaMetadata;
            return this;
        }

        public a d(long j10) {
            if (j10 < 0) {
                j10 = 0;
            }
            this.f4149b = j10;
            return this;
        }
    }

    MediaItem() {
        this.f4143a = new Object();
        this.f4145c = 0;
        this.f4146d = 576460752303423487L;
        this.f4147e = new ArrayList();
    }

    public void d(boolean z10) {
        if (getClass() == MediaItem.class) {
            super.d(z10);
            return;
        }
        throw new RuntimeException("MediaItem's subclasses shouldn't be parcelized.");
    }

    public long e() {
        return this.f4146d;
    }

    public String f() {
        String g10;
        synchronized (this.f4143a) {
            MediaMetadata mediaMetadata = this.f4144b;
            g10 = mediaMetadata != null ? mediaMetadata.g("android.media.metadata.MEDIA_ID") : null;
        }
        return g10;
    }

    public MediaMetadata g() {
        MediaMetadata mediaMetadata;
        synchronized (this.f4143a) {
            mediaMetadata = this.f4144b;
        }
        return mediaMetadata;
    }

    public long h() {
        return this.f4145c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        synchronized (this.f4143a) {
            sb2.append("{Media Id=");
            sb2.append(f());
            sb2.append(", mMetadata=");
            sb2.append(this.f4144b);
            sb2.append(", mStartPositionMs=");
            sb2.append(this.f4145c);
            sb2.append(", mEndPositionMs=");
            sb2.append(this.f4146d);
            sb2.append('}');
        }
        return sb2.toString();
    }

    MediaItem(a aVar) {
        this(aVar.f4148a, aVar.f4149b, aVar.f4150c);
    }

    MediaItem(MediaItem mediaItem) {
        this(mediaItem.f4144b, mediaItem.f4145c, mediaItem.f4146d);
    }

    MediaItem(MediaMetadata mediaMetadata, long j10, long j11) {
        this.f4143a = new Object();
        this.f4145c = 0;
        this.f4146d = 576460752303423487L;
        this.f4147e = new ArrayList();
        if (j10 <= j11) {
            if (mediaMetadata != null && mediaMetadata.e("android.media.metadata.DURATION")) {
                long f10 = mediaMetadata.f("android.media.metadata.DURATION");
                if (!(f10 == Long.MIN_VALUE || j11 == 576460752303423487L || j11 <= f10)) {
                    throw new IllegalStateException("endPositionMs shouldn't be greater than duration in the metdata, endPositionMs=" + j11 + ", durationMs=" + f10);
                }
            }
            this.f4144b = mediaMetadata;
            this.f4145c = j10;
            this.f4146d = j11;
            return;
        }
        throw new IllegalStateException("Illegal start/end position: " + j10 + " : " + j11);
    }
}
