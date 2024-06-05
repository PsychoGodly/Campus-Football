package androidx.media2.session;

import androidx.core.util.c;
import androidx.media2.common.Rating;

public final class ThumbRating implements Rating {

    /* renamed from: a  reason: collision with root package name */
    boolean f4258a = false;

    /* renamed from: b  reason: collision with root package name */
    boolean f4259b;

    public boolean equals(Object obj) {
        if (!(obj instanceof ThumbRating)) {
            return false;
        }
        ThumbRating thumbRating = (ThumbRating) obj;
        if (this.f4259b == thumbRating.f4259b && this.f4258a == thumbRating.f4258a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return c.b(Boolean.valueOf(this.f4258a), Boolean.valueOf(this.f4259b));
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ThumbRating: ");
        if (this.f4258a) {
            str = "isThumbUp=" + this.f4259b;
        } else {
            str = "unrated";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
