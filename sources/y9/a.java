package y9;

public class a {
    public float a(int i10, int i11) {
        if (i11 <= 0 || i10 <= 0) {
            return 0.0f;
        }
        float f10 = ((float) i10) / ((float) i11);
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }
}
