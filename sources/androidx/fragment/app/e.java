package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.n;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.d;
import androidx.core.app.b;
import androidx.core.app.s;
import androidx.lifecycle.i;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.r;
import androidx.savedstate.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentActivity */
public class e extends ComponentActivity implements b.g, b.i {
    static final String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    final r mFragmentLifecycleRegistry = new r(this);
    final i mFragments = i.b(new c());
    boolean mResumed;
    boolean mStopped = true;

    /* compiled from: FragmentActivity */
    class a implements a.c {
        a() {
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            e.this.markFragmentsCreated();
            e.this.mFragmentLifecycleRegistry.i(i.a.ON_STOP);
            Parcelable x10 = e.this.mFragments.x();
            if (x10 != null) {
                bundle.putParcelable(e.FRAGMENTS_TAG, x10);
            }
            return bundle;
        }
    }

    /* compiled from: FragmentActivity */
    class b implements f.b {
        b() {
        }

        public void a(Context context) {
            e.this.mFragments.a((Fragment) null);
            Bundle b10 = e.this.getSavedStateRegistry().b(e.FRAGMENTS_TAG);
            if (b10 != null) {
                e.this.mFragments.w(b10.getParcelable(e.FRAGMENTS_TAG));
            }
        }
    }

    /* compiled from: FragmentActivity */
    class c extends k<e> implements p0, n, d, r {
        public c() {
            super(e.this);
        }

        public void a(n nVar, Fragment fragment) {
            e.this.onAttachFragment(fragment);
        }

        public View c(int i10) {
            return e.this.findViewById(i10);
        }

        public boolean d() {
            Window window = e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public ActivityResultRegistry getActivityResultRegistry() {
            return e.this.getActivityResultRegistry();
        }

        public i getLifecycle() {
            return e.this.mFragmentLifecycleRegistry;
        }

        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return e.this.getOnBackPressedDispatcher();
        }

        public o0 getViewModelStore() {
            return e.this.getViewModelStore();
        }

        public LayoutInflater i() {
            return e.this.getLayoutInflater().cloneInContext(e.this);
        }

        public boolean j(Fragment fragment) {
            return !e.this.isFinishing();
        }

        public void m() {
            e.this.supportInvalidateOptionsMenu();
        }

        /* renamed from: n */
        public e h() {
            return e.this;
        }
    }

    public e() {
        init();
    }

    private void init() {
        getSavedStateRegistry().h(FRAGMENTS_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private static boolean markState(n nVar, i.b bVar) {
        boolean z10 = false;
        for (Fragment next : nVar.s0()) {
            if (next != null) {
                if (next.x() != null) {
                    z10 |= markState(next.o(), bVar);
                }
                a0 a0Var = next.U;
                if (a0Var != null && a0Var.getLifecycle().b().c(i.b.STARTED)) {
                    next.U.f(bVar);
                    z10 = true;
                }
                if (next.T.b().c(i.b.STARTED)) {
                    next.T.o(bVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.v(view, str, context, attributeSet);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.t().W(str, fileDescriptor, printWriter, strArr);
    }

    public n getSupportFragmentManager() {
        return this.mFragments.t();
    }

    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    /* access modifiers changed from: package-private */
    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), i.b.CREATED));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.u();
        super.onActivityResult(i10, i11, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mFragments.u();
        super.onConfigurationChanged(configuration);
        this.mFragments.d(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.i(i.a.ON_CREATE);
        this.mFragments.f();
    }

    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0) {
            return super.onCreatePanelMenu(i10, menu) | this.mFragments.g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i10, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.h();
        this.mFragmentLifecycleRegistry.i(i.a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.i();
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.mFragments.k(menuItem);
        }
        if (i10 != 6) {
            return false;
        }
        return this.mFragments.e(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z10) {
        this.mFragments.j(z10);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        this.mFragments.u();
        super.onNewIntent(intent);
    }

    public void onPanelClosed(int i10, Menu menu) {
        if (i10 == 0) {
            this.mFragments.l(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m();
        this.mFragmentLifecycleRegistry.i(i.a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z10) {
        this.mFragments.n(z10);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.o(menu);
        }
        return super.onPreparePanel(i10, view, menu);
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.u();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.mFragments.u();
        super.onResume();
        this.mResumed = true;
        this.mFragments.s();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.i(i.a.ON_RESUME);
        this.mFragments.p();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        this.mFragments.u();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.s();
        this.mFragmentLifecycleRegistry.i(i.a.ON_START);
        this.mFragments.q();
    }

    public void onStateNotSaved() {
        this.mFragments.u();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.r();
        this.mFragmentLifecycleRegistry.i(i.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(s sVar) {
        androidx.core.app.b.h(this, sVar);
    }

    public void setExitSharedElementCallback(s sVar) {
        androidx.core.app.b.i(this, sVar);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10) {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            androidx.core.app.b.l(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            fragment.D1(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.b.c(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.b.e(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.b.m(this);
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            androidx.core.app.b.k(this, intent, -1, bundle);
        } else {
            fragment.C1(intent, i10, bundle);
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView((View) null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public e(int i10) {
        super(i10);
        init();
    }
}
