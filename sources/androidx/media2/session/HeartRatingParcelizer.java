package androidx.media2.session;

import androidx.versionedparcelable.a;

public final class HeartRatingParcelizer {
    public static HeartRating read(a aVar) {
        HeartRating heartRating = new HeartRating();
        heartRating.f4202a = aVar.i(heartRating.f4202a, 1);
        heartRating.f4203b = aVar.i(heartRating.f4203b, 2);
        return heartRating;
    }

    public static void write(HeartRating heartRating, a aVar) {
        aVar.K(false, false);
        aVar.M(heartRating.f4202a, 1);
        aVar.M(heartRating.f4203b, 2);
    }
}
