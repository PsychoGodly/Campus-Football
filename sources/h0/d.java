package h0;

import sd.w;

/* compiled from: DataMigration.kt */
public interface d<T> {
    Object cleanUp(xd.d<? super w> dVar);

    Object migrate(T t10, xd.d<? super T> dVar);

    Object shouldMigrate(T t10, xd.d<? super Boolean> dVar);
}
