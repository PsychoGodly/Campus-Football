package androidx.window.embedding;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import androidx.window.core.ExperimentalWindowApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

@ExperimentalWindowApi
/* compiled from: SplitRule.kt */
public class SplitRule extends EmbeddingRule {
    private final int layoutDirection;
    private final int minSmallestWidth;
    private final int minWidth;
    private final float splitRatio;

    /* compiled from: SplitRule.kt */
    public static final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        public final Rect getBounds(WindowMetrics windowMetrics) {
            m.e(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            m.d(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: SplitRule.kt */
    public @interface LayoutDir {
    }

    public SplitRule() {
        this(0, 0, 0.0f, 0, 15, (h) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SplitRule(int i10, int i11, float f10, int i12, int i13, h hVar) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0.5f : f10, (i13 & 8) != 0 ? 3 : i12);
    }

    public final boolean checkParentMetrics(WindowMetrics windowMetrics) {
        m.e(windowMetrics, "parentMetrics");
        if (Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        Rect bounds = Api30Impl.INSTANCE.getBounds(windowMetrics);
        boolean z10 = this.minWidth == 0 || bounds.width() >= this.minWidth;
        boolean z11 = this.minSmallestWidth == 0 || Math.min(bounds.width(), bounds.height()) >= this.minSmallestWidth;
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitRule)) {
            return false;
        }
        SplitRule splitRule = (SplitRule) obj;
        if (this.minWidth != splitRule.minWidth || this.minSmallestWidth != splitRule.minSmallestWidth) {
            return false;
        }
        return ((this.splitRatio > splitRule.splitRatio ? 1 : (this.splitRatio == splitRule.splitRatio ? 0 : -1)) == 0) && this.layoutDirection == splitRule.layoutDirection;
    }

    public final int getLayoutDirection() {
        return this.layoutDirection;
    }

    public final int getMinSmallestWidth() {
        return this.minSmallestWidth;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public int hashCode() {
        return (((((this.minWidth * 31) + this.minSmallestWidth) * 31) + Float.floatToIntBits(this.splitRatio)) * 31) + this.layoutDirection;
    }

    public SplitRule(int i10, int i11, float f10, int i12) {
        this.minWidth = i10;
        this.minSmallestWidth = i11;
        this.splitRatio = f10;
        this.layoutDirection = i12;
    }
}
