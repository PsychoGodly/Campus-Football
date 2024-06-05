package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.q;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.j1;
import androidx.core.app.j;
import androidx.core.app.t;
import androidx.fragment.app.e;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import androidx.savedstate.a;

/* compiled from: AppCompatActivity */
public class d extends e implements e, t.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private g mDelegate;
    private Resources mResources;

    /* compiled from: AppCompatActivity */
    class a implements a.c {
        a() {
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            d.this.getDelegate().C(bundle);
            return bundle;
        }
    }

    /* compiled from: AppCompatActivity */
    class b implements f.b {
        b() {
        }

        public void a(Context context) {
            g delegate = d.this.getDelegate();
            delegate.t();
            delegate.y(d.this.getSavedStateRegistry().b(d.DELEGATE_TAG));
        }
    }

    public d() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().h(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void initViewTreeOwners() {
        q0.a(getWindow().getDecorView(), this);
        r0.a(getWindow().getDecorView(), this);
        b1.e.a(getWindow().getDecorView(), this);
        q.a(getWindow().getDecorView(), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean performMenuItemShortcut(android.view.KeyEvent r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x003e
            boolean r0 = r3.isCtrlPressed()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x003e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003e
            android.view.View r0 = r0.getDecorView()
            boolean r3 = r0.dispatchKeyShortcutEvent(r3)
            if (r3 == 0) goto L_0x003e
            r3 = 1
            return r3
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.d.performMenuItemShortcut(android.view.KeyEvent):boolean");
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().e(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().g(context));
    }

    public void closeOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.f()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.q(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i10) {
        return getDelegate().j(i10);
    }

    public g getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = g.h(this, this);
        }
        return this.mDelegate;
    }

    public b getDrawerToggleDelegate() {
        return getDelegate().n();
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().q();
    }

    public Resources getResources() {
        if (this.mResources == null && j1.c()) {
            this.mResources = new j1(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public a getSupportActionBar() {
        return getDelegate().s();
    }

    public Intent getSupportParentActivityIntent() {
        return j.a(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().u();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().x(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(t tVar) {
        tVar.c(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        getDelegate().z();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onLocalesChanged(androidx.core.os.j jVar) {
    }

    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.i() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    /* access modifiers changed from: protected */
    public void onNightModeChanged(int i10) {
    }

    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().A(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        getDelegate().B();
    }

    public void onPrepareSupportNavigateUpTaskStack(t tVar) {
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        getDelegate().D();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        getDelegate().E();
    }

    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            t f10 = t.f(this);
            onCreateSupportNavigateUpTaskStack(f10);
            onPrepareSupportNavigateUpTaskStack(f10);
            f10.g();
            try {
                androidx.core.app.b.b(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        getDelegate().O(charSequence);
    }

    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    public void openOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.r()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i10) {
        initViewTreeOwners();
        getDelegate().I(i10);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().M(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z10) {
    }

    public void setTheme(int i10) {
        super.setTheme(i10);
        getDelegate().N(i10);
    }

    public androidx.appcompat.view.b startSupportActionMode(b.a aVar) {
        return getDelegate().P(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().u();
    }

    public void supportNavigateUpTo(Intent intent) {
        j.e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().H(i10);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return j.f(this, intent);
    }

    public d(int i10) {
        super(i10);
        initDelegate();
    }

    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().J(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().K(view, layoutParams);
    }
}
