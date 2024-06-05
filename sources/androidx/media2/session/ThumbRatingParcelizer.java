package androidx.media2.session;

import androidx.versionedparcelable.a;

public final class ThumbRatingParcelizer {
    public static ThumbRating read(a aVar) {
        ThumbRating thumbRating = new ThumbRating();
        thumbRating.f4258a = aVar.i(thumbRating.f4258a, 1);
        thumbRating.f4259b = aVar.i(thumbRating.f4259b, 2);
        return thumbRating;
    }

    public static void write(ThumbRating thumbRating, a aVar) {
        aVar.K(false, false);
        aVar.M(thumbRating.f4258a, 1);
        aVar.M(thumbRating.f4259b, 2);
    }
}
