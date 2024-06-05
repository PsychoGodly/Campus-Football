package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.view.View;
import io.flutter.plugin.platform.e;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.g;
import lc.r;

/* compiled from: FlutterViewFactory */
class m extends g {

    /* renamed from: a  reason: collision with root package name */
    private final d4 f34308a;

    /* compiled from: FlutterViewFactory */
    class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f34309a;

        a(Object obj) {
            this.f34309a = obj;
        }

        public void dispose() {
        }

        public View getView() {
            return (View) this.f34309a;
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

    m(d4 d4Var) {
        super(r.f36128a);
        this.f34308a = d4Var;
    }

    public f create(Context context, int i10, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            Object i11 = this.f34308a.i((long) num.intValue());
            if (i11 instanceof f) {
                return (f) i11;
            }
            if (i11 instanceof View) {
                return new a(i11);
            }
            throw new IllegalStateException("Unable to find a PlatformView or View instance: " + obj + ", " + i11);
        }
        throw new IllegalStateException("An identifier is required to retrieve a View instance.");
    }
}
