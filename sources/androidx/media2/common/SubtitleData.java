package androidx.media2.common;

import androidx.core.util.c;
import i1.b;
import java.util.Arrays;

public final class SubtitleData implements b {

    /* renamed from: a  reason: collision with root package name */
    long f4167a;

    /* renamed from: b  reason: collision with root package name */
    long f4168b;

    /* renamed from: c  reason: collision with root package name */
    byte[] f4169c;

    SubtitleData() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SubtitleData.class != obj.getClass()) {
            return false;
        }
        SubtitleData subtitleData = (SubtitleData) obj;
        if (this.f4167a == subtitleData.f4167a && this.f4168b == subtitleData.f4168b && Arrays.equals(this.f4169c, subtitleData.f4169c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return c.b(Long.valueOf(this.f4167a), Long.valueOf(this.f4168b), Integer.valueOf(Arrays.hashCode(this.f4169c)));
    }
}
