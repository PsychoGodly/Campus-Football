package bd;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* compiled from: HandlerCompat */
public final class a {
    public static Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        return new Handler(looper);
    }
}
