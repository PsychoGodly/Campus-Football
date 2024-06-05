package io.flutter.embedding.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import io.flutter.embedding.android.k;

final class FlutterSplashView extends FrameLayout {

    /* renamed from: k  reason: collision with root package name */
    private static String f33364k = "FlutterSplashView";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public x f33365a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public k f33366b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public View f33367c;

    /* renamed from: d  reason: collision with root package name */
    Bundle f33368d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public String f33369f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public String f33370g;

    /* renamed from: h  reason: collision with root package name */
    private final k.f f33371h;

    /* renamed from: i  reason: collision with root package name */
    private final jc.b f33372i;

    /* renamed from: j  reason: collision with root package name */
    private final Runnable f33373j;

    @Keep
    public static class SavedState extends View.BaseSavedState {
        public static Parcelable.Creator<SavedState> CREATOR = new a();
        /* access modifiers changed from: private */
        public String previousCompletedSplashIsolate;
        /* access modifiers changed from: private */
        public Bundle splashScreenState;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.previousCompletedSplashIsolate);
            parcel.writeBundle(this.splashScreenState);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.previousCompletedSplashIsolate = parcel.readString();
            this.splashScreenState = parcel.readBundle(getClass().getClassLoader());
        }
    }

    class a implements k.f {
        a() {
        }

        public void a() {
        }

        public void b(io.flutter.embedding.engine.a aVar) {
            FlutterSplashView.this.f33366b.A(this);
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.g(flutterSplashView.f33366b, FlutterSplashView.this.f33365a);
        }
    }

    class b implements jc.b {
        b() {
        }

        public void b() {
        }

        public void d() {
            if (FlutterSplashView.this.f33365a != null) {
                FlutterSplashView.this.k();
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.removeView(flutterSplashView.f33367c);
            FlutterSplashView flutterSplashView2 = FlutterSplashView.this;
            String unused = flutterSplashView2.f33370g = flutterSplashView2.f33369f;
        }
    }

    public FlutterSplashView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    private boolean h() {
        k kVar = this.f33366b;
        if (kVar == null) {
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterView is set.");
        } else if (kVar.x()) {
            return this.f33366b.getAttachedFlutterEngine().j().m() != null && this.f33366b.getAttachedFlutterEngine().j().m().equals(this.f33370g);
        } else {
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
    }

    private boolean i() {
        k kVar = this.f33366b;
        return kVar != null && kVar.x() && !this.f33366b.v() && !h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f33365a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean j() {
        /*
            r1 = this;
            io.flutter.embedding.android.k r0 = r1.f33366b
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.x()
            if (r0 == 0) goto L_0x001c
            io.flutter.embedding.android.x r0 = r1.f33365a
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x001c
            boolean r0 = r1.l()
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.FlutterSplashView.j():boolean");
    }

    /* access modifiers changed from: private */
    public void k() {
        this.f33369f = this.f33366b.getAttachedFlutterEngine().j().m();
        String str = f33364k;
        xb.b.f(str, "Transitioning splash screen to a Flutter UI. Isolate: " + this.f33369f);
        this.f33365a.a(this.f33373j);
    }

    private boolean l() {
        k kVar = this.f33366b;
        if (kVar == null) {
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterView is set.");
        } else if (kVar.x()) {
            return this.f33366b.v() && !h();
        } else {
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
    }

    public void g(k kVar, x xVar) {
        k kVar2 = this.f33366b;
        if (kVar2 != null) {
            kVar2.B(this.f33372i);
            removeView(this.f33366b);
        }
        View view = this.f33367c;
        if (view != null) {
            removeView(view);
        }
        this.f33366b = kVar;
        addView(kVar);
        this.f33365a = xVar;
        if (xVar == null) {
            return;
        }
        if (i()) {
            xb.b.f(f33364k, "Showing splash screen UI.");
            View c10 = xVar.c(getContext(), this.f33368d);
            this.f33367c = c10;
            addView(c10);
            kVar.m(this.f33372i);
        } else if (j()) {
            xb.b.f(f33364k, "Showing an immediate splash transition to Flutter due to previously interrupted transition.");
            View c11 = xVar.c(getContext(), this.f33368d);
            this.f33367c = c11;
            addView(c11);
            k();
        } else if (!kVar.x()) {
            xb.b.f(f33364k, "FlutterView is not yet attached to a FlutterEngine. Showing nothing until a FlutterEngine is attached.");
            kVar.l(this.f33371h);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f33370g = savedState.previousCompletedSplashIsolate;
        this.f33368d = savedState.splashScreenState;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        String unused = savedState.previousCompletedSplashIsolate = this.f33370g;
        x xVar = this.f33365a;
        Bundle unused2 = savedState.splashScreenState = xVar != null ? xVar.d() : null;
        return savedState;
    }

    public FlutterSplashView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f33371h = new a();
        this.f33372i = new b();
        this.f33373j = new c();
        setSaveEnabled(true);
    }
}
