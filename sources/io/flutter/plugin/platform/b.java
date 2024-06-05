package io.flutter.plugin.platform;

import android.content.Context;
import android.view.MotionEvent;
import io.flutter.embedding.android.g;

/* compiled from: PlatformOverlayView */
public class b extends g {

    /* renamed from: h  reason: collision with root package name */
    private a f33693h;

    public b(Context context, int i10, int i11, a aVar) {
        super(context, i10, i11, g.b.overlay);
        this.f33693h = aVar;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.f33693h;
        if (aVar == null || !aVar.a(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }
}
