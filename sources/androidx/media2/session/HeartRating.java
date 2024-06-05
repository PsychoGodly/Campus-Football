package androidx.media2.session;

import androidx.core.util.c;
import androidx.media2.common.Rating;

public final class HeartRating implements Rating {

    /* renamed from: a  reason: collision with root package name */
    boolean f4202a = false;

    /* renamed from: b  reason: collision with root package name */
    boolean f4203b;

    public boolean equals(Object obj) {
        if (!(obj instanceof HeartRating)) {
            return false;
        }
        HeartRating heartRating = (HeartRating) obj;
        if (this.f4203b == heartRating.f4203b && this.f4202a == heartRating.f4202a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return c.b(Boolean.valueOf(this.f4202a), Boolean.valueOf(this.f4203b));
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HeartRating: ");
        if (this.f4202a) {
            str = "hasHeart=" + this.f4203b;
        } else {
            str = "unrated";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
