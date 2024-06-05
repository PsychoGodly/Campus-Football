package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k1.i;

/* compiled from: WorkManager */
public abstract class z {
    protected z() {
    }

    public static z g(Context context) {
        return i.m(context);
    }

    public static void h(Context context, b bVar) {
        i.h(context, bVar);
    }

    public abstract s a(String str);

    public abstract s b(UUID uuid);

    public final s c(a0 a0Var) {
        return d(Collections.singletonList(a0Var));
    }

    public abstract s d(List<? extends a0> list);

    public s e(String str, g gVar, r rVar) {
        return f(str, gVar, Collections.singletonList(rVar));
    }

    public abstract s f(String str, g gVar, List<r> list);
}
