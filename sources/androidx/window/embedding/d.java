package androidx.window.embedding;

import android.view.WindowMetrics;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplitRule f5074a;

    public /* synthetic */ d(SplitRule splitRule) {
        this.f5074a = splitRule;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m4translateParentMetricsPredicate$lambda4(this.f5074a, (WindowMetrics) obj);
    }
}
