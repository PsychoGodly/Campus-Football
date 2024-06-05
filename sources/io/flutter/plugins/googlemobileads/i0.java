package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.view.View;
import io.flutter.plugin.platform.e;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.g;
import java.util.Locale;
import lc.r;
import xb.b;

/* compiled from: GoogleMobileAdsViewFactory */
final class i0 extends g {

    /* renamed from: a  reason: collision with root package name */
    private final a f34011a;

    /* compiled from: GoogleMobileAdsViewFactory */
    class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f34012a;

        a(Context context) {
            this.f34012a = context;
        }

        public void dispose() {
        }

        public View getView() {
            return new View(this.f34012a);
        }

        public /* synthetic */ void onFlutterViewAttached(View view) {
            e.a(this, view);
        }

        public /* synthetic */ void onFlutterViewDetached() {
            e.b(this);
        }

        public /* synthetic */ void onInputConnectionLocked() {
            e.c(this);
        }

        public /* synthetic */ void onInputConnectionUnlocked() {
            e.d(this);
        }
    }

    public i0(a aVar) {
        super(r.f36128a);
        this.f34011a = aVar;
    }

    private static f a(Context context, int i10) {
        b.b(i0.class.getSimpleName(), String.format(Locale.getDefault(), "This ad may have not been loaded or has been disposed. Ad with the following id could not be found: %d.", new Object[]{Integer.valueOf(i10)}));
        return new a(context);
    }

    public f create(Context context, int i10, Object obj) {
        Integer num = (Integer) obj;
        e b10 = this.f34011a.b(num.intValue());
        if (b10 == null || b10.b() == null) {
            return a(context, num.intValue());
        }
        return b10.b();
    }
}
