package androidx.media2.session;

import androidx.core.util.c;
import androidx.media2.common.Rating;

public final class StarRating implements Rating {

    /* renamed from: a  reason: collision with root package name */
    int f4256a;

    /* renamed from: b  reason: collision with root package name */
    float f4257b;

    StarRating() {
    }

    public boolean c() {
        return this.f4257b >= 0.0f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating = (StarRating) obj;
        if (this.f4256a == starRating.f4256a && this.f4257b == starRating.f4257b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return c.b(Integer.valueOf(this.f4256a), Float.valueOf(this.f4257b));
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StarRating: maxStars=");
        sb2.append(this.f4256a);
        if (c()) {
            str = ", starRating=" + this.f4257b;
        } else {
            str = ", unrated";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
