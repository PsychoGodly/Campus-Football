package androidx.media2.common;

import android.media.MediaFormat;
import android.os.Bundle;
import androidx.versionedparcelable.CustomVersionedParcelable;

public class SessionPlayer$TrackInfo extends CustomVersionedParcelable {

    /* renamed from: a  reason: collision with root package name */
    int f4161a;

    /* renamed from: b  reason: collision with root package name */
    int f4162b;

    /* renamed from: c  reason: collision with root package name */
    MediaFormat f4163c;

    /* renamed from: d  reason: collision with root package name */
    boolean f4164d;

    /* renamed from: e  reason: collision with root package name */
    Bundle f4165e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f4166f = new Object();

    SessionPlayer$TrackInfo() {
    }

    private static void e(String str, MediaFormat mediaFormat, Bundle bundle) {
        if (mediaFormat.containsKey(str)) {
            bundle.putInt(str, mediaFormat.getInteger(str));
        }
    }

    private static void f(String str, MediaFormat mediaFormat, Bundle bundle) {
        if (mediaFormat.containsKey(str)) {
            bundle.putString(str, mediaFormat.getString(str));
        }
    }

    private static void g(String str, MediaFormat mediaFormat, Bundle bundle) {
        if (bundle.containsKey(str)) {
            mediaFormat.setInteger(str, bundle.getInt(str));
        }
    }

    private static void h(String str, MediaFormat mediaFormat, Bundle bundle) {
        if (bundle.containsKey(str)) {
            mediaFormat.setString(str, bundle.getString(str));
        }
    }

    public void c() {
        Bundle bundle = this.f4165e;
        if (bundle != null && !bundle.getBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_FORMAT_NULL")) {
            MediaFormat mediaFormat = new MediaFormat();
            this.f4163c = mediaFormat;
            h("language", mediaFormat, this.f4165e);
            h("mime", this.f4163c, this.f4165e);
            g("is-forced-subtitle", this.f4163c, this.f4165e);
            g("is-autoselect", this.f4163c, this.f4165e);
            g("is-default", this.f4163c, this.f4165e);
        }
        Bundle bundle2 = this.f4165e;
        if (bundle2 == null || !bundle2.containsKey("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE")) {
            boolean z10 = true;
            if (this.f4162b == 1) {
                z10 = false;
            }
            this.f4164d = z10;
            return;
        }
        this.f4164d = this.f4165e.getBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE");
    }

    public void d(boolean z10) {
        synchronized (this.f4166f) {
            Bundle bundle = new Bundle();
            this.f4165e = bundle;
            bundle.putBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_FORMAT_NULL", this.f4163c == null);
            MediaFormat mediaFormat = this.f4163c;
            if (mediaFormat != null) {
                f("language", mediaFormat, this.f4165e);
                f("mime", this.f4163c, this.f4165e);
                e("is-forced-subtitle", this.f4163c, this.f4165e);
                e("is-autoselect", this.f4163c, this.f4165e);
                e("is-default", this.f4163c, this.f4165e);
            }
            this.f4165e.putBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE", this.f4164d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SessionPlayer$TrackInfo) && this.f4161a == ((SessionPlayer$TrackInfo) obj).f4161a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f4161a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getName());
        sb2.append('#');
        sb2.append(this.f4161a);
        sb2.append('{');
        int i10 = this.f4162b;
        if (i10 == 1) {
            sb2.append("VIDEO");
        } else if (i10 == 2) {
            sb2.append("AUDIO");
        } else if (i10 == 4) {
            sb2.append("SUBTITLE");
        } else if (i10 != 5) {
            sb2.append("UNKNOWN");
        } else {
            sb2.append("METADATA");
        }
        sb2.append(", ");
        sb2.append(this.f4163c);
        sb2.append(", isSelectable=");
        sb2.append(this.f4164d);
        sb2.append("}");
        return sb2.toString();
    }
}
