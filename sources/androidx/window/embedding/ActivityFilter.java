package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.m;

@ExperimentalWindowApi
/* compiled from: ActivityFilter.kt */
public final class ActivityFilter {
    private final ComponentName componentName;
    private final String intentAction;

    public ActivityFilter(ComponentName componentName2, String str) {
        m.e(componentName2, "componentName");
        this.componentName = componentName2;
        this.intentAction = str;
        String packageName = componentName2.getPackageName();
        m.d(packageName, "componentName.packageName");
        String className = componentName2.getClassName();
        m.d(className, "componentName.className");
        boolean z10 = true;
        if (packageName.length() > 0) {
            if (className.length() > 0) {
                if (!p.u(packageName, "*", false, 2, (Object) null) || p.F(packageName, "*", 0, false, 6, (Object) null) == packageName.length() - 1) {
                    if (p.u(className, "*", false, 2, (Object) null) && p.F(className, "*", 0, false, 6, (Object) null) != className.length() - 1) {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
            }
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        throw new IllegalArgumentException("Package name must not be empty".toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityFilter)) {
            return false;
        }
        ActivityFilter activityFilter = (ActivityFilter) obj;
        return m.a(this.componentName, activityFilter.componentName) && m.a(this.intentAction, activityFilter.intentAction);
    }

    public final ComponentName getComponentName() {
        return this.componentName;
    }

    public final String getIntentAction() {
        return this.intentAction;
    }

    public int hashCode() {
        int hashCode = this.componentName.hashCode() * 31;
        String str = this.intentAction;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean matchesActivity(Activity activity) {
        m.e(activity, "activity");
        if (MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release(activity, this.componentName)) {
            String str = this.intentAction;
            if (str != null) {
                Intent intent = activity.getIntent();
                if (m.a(str, intent == null ? null : intent.getAction())) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean matchesIntent(Intent intent) {
        m.e(intent, "intent");
        if (!MatcherUtils.INSTANCE.areComponentsMatching$window_release(intent.getComponent(), this.componentName)) {
            return false;
        }
        String str = this.intentAction;
        if (str == null || m.a(str, intent.getAction())) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "ActivityFilter(componentName=" + this.componentName + ", intentAction=" + this.intentAction + ')';
    }
}
