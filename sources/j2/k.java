package j2;

import b2.i;
import b2.o;
import com.google.auto.value.AutoValue;

@AutoValue
/* compiled from: PersistedEvent */
public abstract class k {
    public static k a(long j10, o oVar, i iVar) {
        return new b(j10, oVar, iVar);
    }

    public abstract i b();

    public abstract long c();

    public abstract o d();
}
