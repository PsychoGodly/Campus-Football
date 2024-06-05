package android.support.v4.media;

import android.media.Rating;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final int f523a;

    /* renamed from: b  reason: collision with root package name */
    private final float f524b;

    /* renamed from: c  reason: collision with root package name */
    private Object f525c;

    class a implements Parcelable.Creator<RatingCompat> {
        a() {
        }

        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    }

    private static class b {
        static float a(Rating rating) {
            return rating.getPercentRating();
        }

        static int b(Rating rating) {
            return rating.getRatingStyle();
        }

        static float c(Rating rating) {
            return rating.getStarRating();
        }

        static boolean d(Rating rating) {
            return rating.hasHeart();
        }

        static boolean e(Rating rating) {
            return rating.isRated();
        }

        static boolean f(Rating rating) {
            return rating.isThumbUp();
        }

        static Rating g(boolean z10) {
            return Rating.newHeartRating(z10);
        }

        static Rating h(float f10) {
            return Rating.newPercentageRating(f10);
        }

        static Rating i(int i10, float f10) {
            return Rating.newStarRating(i10, f10);
        }

        static Rating j(boolean z10) {
            return Rating.newThumbRating(z10);
        }

        static Rating k(int i10) {
            return Rating.newUnratedRating(i10);
        }
    }

    RatingCompat(int i10, float f10) {
        this.f523a = i10;
        this.f524b = f10;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null && Build.VERSION.SDK_INT >= 19) {
            Rating rating = (Rating) obj;
            int b10 = b.b(rating);
            if (b.e(rating)) {
                switch (b10) {
                    case 1:
                        ratingCompat = k(b.d(rating));
                        break;
                    case 2:
                        ratingCompat = n(b.f(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = m(b10, b.c(rating));
                        break;
                    case 6:
                        ratingCompat = l(b.a(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = p(b10);
            }
            ratingCompat.f525c = obj;
        }
        return ratingCompat;
    }

    public static RatingCompat k(boolean z10) {
        return new RatingCompat(1, z10 ? 1.0f : 0.0f);
    }

    public static RatingCompat l(float f10) {
        if (f10 >= 0.0f && f10 <= 100.0f) {
            return new RatingCompat(6, f10);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat m(int i10, float f10) {
        float f11;
        if (i10 == 3) {
            f11 = 3.0f;
        } else if (i10 == 4) {
            f11 = 4.0f;
        } else if (i10 != 5) {
            Log.e("Rating", "Invalid rating style (" + i10 + ") for a star rating");
            return null;
        } else {
            f11 = 5.0f;
        }
        if (f10 >= 0.0f && f10 <= f11) {
            return new RatingCompat(i10, f10);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat n(boolean z10) {
        return new RatingCompat(2, z10 ? 1.0f : 0.0f);
    }

    public static RatingCompat p(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i10, -1.0f);
            default:
                return null;
        }
    }

    public float c() {
        if (this.f523a != 6 || !i()) {
            return -1.0f;
        }
        return this.f524b;
    }

    public Object d() {
        if (this.f525c == null && Build.VERSION.SDK_INT >= 19) {
            if (i()) {
                int i10 = this.f523a;
                switch (i10) {
                    case 1:
                        this.f525c = b.g(h());
                        break;
                    case 2:
                        this.f525c = b.j(j());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f525c = b.i(i10, g());
                        break;
                    case 6:
                        this.f525c = b.h(c());
                        break;
                    default:
                        return null;
                }
            } else {
                this.f525c = b.k(this.f523a);
            }
        }
        return this.f525c;
    }

    public int describeContents() {
        return this.f523a;
    }

    public int e() {
        return this.f523a;
    }

    public float g() {
        int i10 = this.f523a;
        if ((i10 == 3 || i10 == 4 || i10 == 5) && i()) {
            return this.f524b;
        }
        return -1.0f;
    }

    public boolean h() {
        if (this.f523a == 1 && this.f524b == 1.0f) {
            return true;
        }
        return false;
    }

    public boolean i() {
        return this.f524b >= 0.0f;
    }

    public boolean j() {
        if (this.f523a == 2 && this.f524b == 1.0f) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Rating:style=");
        sb2.append(this.f523a);
        sb2.append(" rating=");
        float f10 = this.f524b;
        sb2.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f523a);
        parcel.writeFloat(this.f524b);
    }
}
