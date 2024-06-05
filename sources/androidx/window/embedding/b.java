package androidx.window.embedding;

import android.util.Pair;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EmbeddingAdapter f5070a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Set f5071b;

    public /* synthetic */ b(EmbeddingAdapter embeddingAdapter, Set set) {
        this.f5070a = embeddingAdapter;
        this.f5071b = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m0translateActivityIntentPredicates$lambda3(this.f5070a, this.f5071b, (Pair) obj);
    }
}
