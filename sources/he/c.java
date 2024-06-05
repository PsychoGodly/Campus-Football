package he;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;

/* compiled from: MathJVM.kt */
class c extends b {
    public static int a(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        } else if (d10 > 2.147483647E9d) {
            return a.e.API_PRIORITY_OTHER;
        } else {
            if (d10 < -2.147483648E9d) {
                return RecyclerView.UNDEFINED_DURATION;
            }
            return (int) Math.round(d10);
        }
    }

    public static int b(float f10) {
        if (!Float.isNaN(f10)) {
            return Math.round(f10);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
