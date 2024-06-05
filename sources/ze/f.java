package ze;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: DisplayUtils */
public class f {
    public static int a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay.getWidth() == defaultDisplay.getHeight()) {
            return 3;
        }
        return defaultDisplay.getWidth() < defaultDisplay.getHeight() ? 1 : 2;
    }
}
