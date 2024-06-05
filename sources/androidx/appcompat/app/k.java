package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.h;
import androidx.appcompat.view.b;
import androidx.core.view.f;
import h.a;

/* compiled from: AppCompatDialog */
public class k extends h implements e {

    /* renamed from: d  reason: collision with root package name */
    private g f930d;

    /* renamed from: f  reason: collision with root package name */
    private final f.a f931f = new j(this);

    public k(Context context, int i10) {
        super(context, e(context, i10));
        g d10 = d();
        d10.N(e(context, i10));
        d10.y((Bundle) null);
    }

    private static int e(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.f18190z, typedValue, true);
        return typedValue.resourceId;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d().e(view, layoutParams);
    }

    public g d() {
        if (this.f930d == null) {
            this.f930d = g.i(this, this);
        }
        return this.f930d;
    }

    public void dismiss() {
        super.dismiss();
        d().z();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return f.e(this.f931f, getWindow().getDecorView(), this, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public <T extends View> T findViewById(int i10) {
        return d().j(i10);
    }

    public boolean g(int i10) {
        return d().H(i10);
    }

    public void invalidateOptionsMenu() {
        d().u();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        d().t();
        super.onCreate(bundle);
        d().y(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        d().E();
    }

    public void onSupportActionModeFinished(b bVar) {
    }

    public void onSupportActionModeStarted(b bVar) {
    }

    public b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    public void setContentView(int i10) {
        d().I(i10);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().O(charSequence);
    }

    public void setContentView(View view) {
        d().J(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d().K(view, layoutParams);
    }

    public void setTitle(int i10) {
        super.setTitle(i10);
        d().O(getContext().getString(i10));
    }
}
