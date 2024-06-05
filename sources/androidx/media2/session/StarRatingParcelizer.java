package androidx.media2.session;

import androidx.versionedparcelable.a;

public final class StarRatingParcelizer {
    public static StarRating read(a aVar) {
        StarRating starRating = new StarRating();
        starRating.f4256a = aVar.v(starRating.f4256a, 1);
        starRating.f4257b = aVar.s(starRating.f4257b, 2);
        return starRating;
    }

    public static void write(StarRating starRating, a aVar) {
        aVar.K(false, false);
        aVar.Y(starRating.f4256a, 1);
        aVar.W(starRating.f4257b, 2);
    }
}
