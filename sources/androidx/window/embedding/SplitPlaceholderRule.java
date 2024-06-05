package androidx.window.embedding;

import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

@ExperimentalWindowApi
/* compiled from: SplitPlaceholderRule.kt */
public final class SplitPlaceholderRule extends SplitRule {
    private final Set<ActivityFilter> filters;
    private final Intent placeholderIntent;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SplitPlaceholderRule(Set set, Intent intent, int i10, int i11, float f10, int i12, int i13, h hVar) {
        this(set, intent, (i13 & 4) != 0 ? 0 : i10, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? 0.5f : f10, (i13 & 32) != 0 ? 3 : i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPlaceholderRule) || !super.equals(obj) || !super.equals(obj)) {
            return false;
        }
        SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) obj;
        return m.a(this.filters, splitPlaceholderRule.filters) && m.a(this.placeholderIntent, splitPlaceholderRule.placeholderIntent);
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public final Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    public int hashCode() {
        return (((super.hashCode() * 31) + this.filters.hashCode()) * 31) + this.placeholderIntent.hashCode();
    }

    public final SplitPlaceholderRule plus$window_release(ActivityFilter activityFilter) {
        m.e(activityFilter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(activityFilter);
        return new SplitPlaceholderRule(y.P(linkedHashSet), this.placeholderIntent, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitPlaceholderRule(Set<ActivityFilter> set, Intent intent, int i10, int i11, float f10, int i12) {
        super(i10, i11, f10, i12);
        m.e(set, "filters");
        m.e(intent, "placeholderIntent");
        this.placeholderIntent = intent;
        this.filters = y.P(set);
    }
}
