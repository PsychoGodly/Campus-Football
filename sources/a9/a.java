package a9;

/* compiled from: MathUtils */
public final class a {
    public static float a(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        return (float) Math.sqrt((double) ((f14 * f14) + (f15 * f15)));
    }

    public static float b(int i10, int i11, int i12, int i13) {
        int i14 = i10 - i12;
        int i15 = i11 - i13;
        return (float) Math.sqrt((double) ((i14 * i14) + (i15 * i15)));
    }

    public static int c(float f10) {
        return (int) (f10 + (f10 < 0.0f ? -0.5f : 0.5f));
    }

    public static int d(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }
}
