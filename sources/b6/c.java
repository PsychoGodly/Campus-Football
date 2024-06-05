package b6;

import android.os.Build;

/* compiled from: CircularRevealHelper */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f24266a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            f24266a = 2;
        } else if (i10 >= 18) {
            f24266a = 1;
        } else {
            f24266a = 0;
        }
    }
}
