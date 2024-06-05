package androidx.window.embedding;

import android.content.Intent;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Set f5076a;

    public /* synthetic */ f(Set set) {
        this.f5076a = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m3translateIntentPredicates$lambda8(this.f5076a, (Intent) obj);
    }
}
