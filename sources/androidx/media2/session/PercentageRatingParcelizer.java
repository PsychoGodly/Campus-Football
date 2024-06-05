package androidx.media2.session;

import androidx.versionedparcelable.a;

public final class PercentageRatingParcelizer {
    public static PercentageRating read(a aVar) {
        PercentageRating percentageRating = new PercentageRating();
        percentageRating.f4226a = aVar.s(percentageRating.f4226a, 1);
        return percentageRating;
    }

    public static void write(PercentageRating percentageRating, a aVar) {
        aVar.K(false, false);
        aVar.W(percentageRating.f4226a, 1);
    }
}
