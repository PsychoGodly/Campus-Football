package h5;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class m0 {
    static int a(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        int i11 = 0;
        while (i11 < 6) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            } else if (i13 == i10) {
                return i12;
            } else {
                i11++;
            }
        }
        return 1;
    }
}
