package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.i;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.savedstate.a;
import b1.c;
import b1.d;
import kotlin.jvm.internal.m;

/* compiled from: ComponentDialog.kt */
public class h extends Dialog implements p, n, d {

    /* renamed from: a  reason: collision with root package name */
    private r f704a;

    /* renamed from: b  reason: collision with root package name */
    private final c f705b = c.f5364d.a(this);

    /* renamed from: c  reason: collision with root package name */
    private final OnBackPressedDispatcher f706c = new OnBackPressedDispatcher(new g(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Context context, int i10) {
        super(context, i10);
        m.e(context, "context");
    }

    private final r b() {
        r rVar = this.f704a;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(this);
        this.f704a = rVar2;
        return rVar2;
    }

    /* access modifiers changed from: private */
    public static final void c(h hVar) {
        m.e(hVar, "this$0");
        super.onBackPressed();
    }

    public i getLifecycle() {
        return b();
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f706c;
    }

    public a getSavedStateRegistry() {
        return this.f705b.b();
    }

    public void onBackPressed() {
        this.f706c.e();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f706c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            m.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.f(onBackInvokedDispatcher);
        }
        this.f705b.d(bundle);
        b().i(i.a.ON_CREATE);
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        m.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f705b.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        b().i(i.a.ON_RESUME);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        b().i(i.a.ON_DESTROY);
        this.f704a = null;
        super.onStop();
    }
}
