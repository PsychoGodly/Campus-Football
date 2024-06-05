package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.m;

@ExperimentalWindowApi
/* compiled from: SplitInfo.kt */
public final class SplitInfo {
    private final ActivityStack primaryActivityStack;
    private final ActivityStack secondaryActivityStack;
    private final float splitRatio;

    public SplitInfo(ActivityStack activityStack, ActivityStack activityStack2, float f10) {
        m.e(activityStack, "primaryActivityStack");
        m.e(activityStack2, "secondaryActivityStack");
        this.primaryActivityStack = activityStack;
        this.secondaryActivityStack = activityStack2;
        this.splitRatio = f10;
    }

    public final boolean contains(Activity activity) {
        m.e(activity, "activity");
        return this.primaryActivityStack.contains(activity) || this.secondaryActivityStack.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitInfo)) {
            return false;
        }
        SplitInfo splitInfo = (SplitInfo) obj;
        if (!m.a(this.primaryActivityStack, splitInfo.primaryActivityStack) || !m.a(this.secondaryActivityStack, splitInfo.secondaryActivityStack)) {
            return false;
        }
        return (this.splitRatio > splitInfo.splitRatio ? 1 : (this.splitRatio == splitInfo.splitRatio ? 0 : -1)) == 0;
    }

    public final ActivityStack getPrimaryActivityStack() {
        return this.primaryActivityStack;
    }

    public final ActivityStack getSecondaryActivityStack() {
        return this.secondaryActivityStack;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public int hashCode() {
        return (((this.primaryActivityStack.hashCode() * 31) + this.secondaryActivityStack.hashCode()) * 31) + Float.floatToIntBits(this.splitRatio);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SplitInfo:{");
        sb2.append("primaryActivityStack=" + getPrimaryActivityStack() + ',');
        sb2.append("secondaryActivityStack=" + getSecondaryActivityStack() + ',');
        sb2.append("splitRatio=" + getSplitRatio() + '}');
        String sb3 = sb2.toString();
        m.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
