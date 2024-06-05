package androidx.media2.session;

import androidx.core.util.c;
import androidx.media2.common.Rating;

public final class PercentageRating implements Rating {

    /* renamed from: a  reason: collision with root package name */
    float f4226a = -1.0f;

    public boolean c() {
        return this.f4226a != -1.0f;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof PercentageRating) && this.f4226a == ((PercentageRating) obj).f4226a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return c.b(Float.valueOf(this.f4226a));
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PercentageRating: ");
        if (c()) {
            str = "percentage=" + this.f4226a;
        } else {
            str = "unrated";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
