package io.flutter.embedding.android;

import android.app.Activity;
import androidx.core.util.a;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;

/* compiled from: WindowInfoRepositoryCallbackAdapterWrapper */
public class z {

    /* renamed from: a  reason: collision with root package name */
    final WindowInfoTrackerCallbackAdapter f33534a;

    public z(WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.f33534a = windowInfoTrackerCallbackAdapter;
    }

    public void a(Activity activity, Executor executor, a<WindowLayoutInfo> aVar) {
        this.f33534a.addWindowLayoutInfoListener(activity, executor, aVar);
    }

    public void b(a<WindowLayoutInfo> aVar) {
        this.f33534a.removeWindowLayoutInfoListener(aVar);
    }
}
