package androidx.media2.common;

import i1.b;

public class VideoSize implements b {

    /* renamed from: a  reason: collision with root package name */
    int f4170a;

    /* renamed from: b  reason: collision with root package name */
    int f4171b;

    VideoSize() {
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSize)) {
            return false;
        }
        VideoSize videoSize = (VideoSize) obj;
        if (this.f4170a == videoSize.f4170a && this.f4171b == videoSize.f4171b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f4171b;
        int i11 = this.f4170a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f4170a + "x" + this.f4171b;
    }
}
