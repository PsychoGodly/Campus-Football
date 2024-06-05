package androidx.window.embedding;

import android.util.Pair;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EmbeddingAdapter f5072a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Set f5073b;

    public /* synthetic */ c(EmbeddingAdapter embeddingAdapter, Set set) {
        this.f5072a = embeddingAdapter;
        this.f5073b = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m1translateActivityPairPredicates$lambda1(this.f5072a, this.f5073b, (Pair) obj);
    }
}
