package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

@ExperimentalWindowApi
/* compiled from: ActivityStack.kt */
public final class ActivityStack {
    private final List<Activity> activities;
    private final boolean isEmpty;

    public ActivityStack(List<? extends Activity> list, boolean z10) {
        m.e(list, "activities");
        this.activities = list;
        this.isEmpty = z10;
    }

    public final boolean contains(Activity activity) {
        m.e(activity, "activity");
        return this.activities.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityStack)) {
            return false;
        }
        ActivityStack activityStack = (ActivityStack) obj;
        if (m.a(this.activities, activityStack.activities) || this.isEmpty == activityStack.isEmpty) {
            return false;
        }
        return true;
    }

    public final List<Activity> getActivities$window_release() {
        return this.activities;
    }

    public int hashCode() {
        return ((this.isEmpty ? 1 : 0) * true) + this.activities.hashCode();
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ActivityStack{");
        sb2.append(m.m("activities=", getActivities$window_release()));
        sb2.append("isEmpty=" + this.isEmpty + '}');
        String sb3 = sb2.toString();
        m.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActivityStack(List list, boolean z10, int i10, h hVar) {
        this(list, (i10 & 2) != 0 ? false : z10);
    }
}
