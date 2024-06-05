package androidx.window.embedding;

import android.app.Activity;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Set f5075a;

    public /* synthetic */ e(Set set) {
        this.f5075a = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m2translateActivityPredicates$lambda6(this.f5075a, (Activity) obj);
    }
}
