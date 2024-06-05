package qe;

import android.os.Looper;
import java.util.List;
import kotlin.jvm.internal.h;
import pe.o2;
import ue.z;

/* compiled from: HandlerDispatcher.kt */
public final class a implements z {
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public o2 b(List<? extends z> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new d(f.a(mainLooper, true), (String) null, 2, (h) null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int c() {
        return 1073741823;
    }
}
