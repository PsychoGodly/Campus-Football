package x2;

import java.util.List;

/* compiled from: MotionPhotoDescription */
final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f23606a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f23607b;

    /* compiled from: MotionPhotoDescription */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f23608a;

        /* renamed from: b  reason: collision with root package name */
        public final String f23609b;

        /* renamed from: c  reason: collision with root package name */
        public final long f23610c;

        /* renamed from: d  reason: collision with root package name */
        public final long f23611d;

        public a(String str, String str2, long j10, long j11) {
            this.f23608a = str;
            this.f23609b = str2;
            this.f23610c = j10;
            this.f23611d = j11;
        }
    }

    public b(long j10, List<a> list) {
        this.f23606a = j10;
        this.f23607b = list;
    }

    public l3.b a(long j10) {
        long j11;
        if (this.f23607b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f23607b.size() - 1; size >= 0; size--) {
            a aVar = this.f23607b.get(size);
            boolean equals = "video/mp4".equals(aVar.f23608a) | z10;
            if (size == 0) {
                j11 = j12 - aVar.f23611d;
                j12 = 0;
            } else {
                long j17 = j12;
                j12 -= aVar.f23610c;
                j11 = j17;
            }
            if (!equals || j12 == j11) {
                z10 = equals;
            } else {
                j16 = j11 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j11;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new l3.b(j13, j14, this.f23606a, j15, j16);
    }
}
