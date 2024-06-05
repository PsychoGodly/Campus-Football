package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

/* compiled from: ActivityOptionsCompat */
public class c {

    /* compiled from: ActivityOptionsCompat */
    private static class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private final ActivityOptions f2678a;

        a(ActivityOptions activityOptions) {
            this.f2678a = activityOptions;
        }

        public Bundle b() {
            return this.f2678a.toBundle();
        }
    }

    /* compiled from: ActivityOptionsCompat */
    static class b {
        static ActivityOptions a(Context context, int i10, int i11) {
            return ActivityOptions.makeCustomAnimation(context, i10, i11);
        }

        static ActivityOptions b(View view, int i10, int i11, int i12, int i13) {
            return ActivityOptions.makeScaleUpAnimation(view, i10, i11, i12, i13);
        }

        static ActivityOptions c(View view, Bitmap bitmap, int i10, int i11) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i10, i11);
        }
    }

    protected c() {
    }

    public static c a(Context context, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new a(b.a(context, i10, i11));
        }
        return new c();
    }

    public Bundle b() {
        return null;
    }
}
