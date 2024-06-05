package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: InvalidationLiveDataContainer */
class d {

    /* renamed from: a  reason: collision with root package name */
    final Set<LiveData> f4692a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: b  reason: collision with root package name */
    private final h f4693b;

    d(h hVar) {
        this.f4693b = hVar;
    }
}
