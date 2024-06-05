package e1;

import android.content.Context;
import java.util.List;

/* compiled from: Initializer */
public interface a<T> {
    T create(Context context);

    List<Class<? extends a<?>>> dependencies();
}
