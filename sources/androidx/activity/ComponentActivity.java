package androidx.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.i;
import androidx.core.app.q;
import androidx.core.view.k;
import androidx.lifecycle.b0;
import androidx.lifecycle.e0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i;
import androidx.lifecycle.l0;
import androidx.lifecycle.m;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r;
import androidx.lifecycle.r0;
import com.unity3d.services.UnityAdsConstants;
import g.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import sd.w;

public class ComponentActivity extends androidx.core.app.g implements p0, androidx.lifecycle.h, b1.d, n, androidx.activity.result.d, k {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final f.a mContextAwareHelper;
    private l0.b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final j mFullyDrawnReporter;
    private final r mLifecycleRegistry;
    private final k mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<androidx.core.util.a<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a<i>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a<q>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a<Integer>> mOnTrimMemoryListeners;
    final f mReportFullyDrawnExecutor;
    final b1.c mSavedStateRegistryController;
    private o0 mViewModelStore;

    class a implements Runnable {
        a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    class b extends ActivityResultRegistry {

        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f665a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a.C0190a f666b;

            a(int i10, a.C0190a aVar) {
                this.f665a = i10;
                this.f666b = aVar;
            }

            public void run() {
                b.this.c(this.f665a, this.f666b.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        class C0010b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f668a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f669b;

            C0010b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f668a = i10;
                this.f669b = sendIntentException;
            }

            public void run() {
                b.this.b(this.f668a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f669b));
            }
        }

        b() {
        }

        public <I, O> void f(int i10, g.a<I, O> aVar, I i11, androidx.core.app.c cVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0190a<O> b10 = aVar.b(componentActivity, i11);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new a(i10, b10));
                return;
            }
            Intent a10 = aVar.a(componentActivity, i11);
            Bundle bundle = null;
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else if (cVar != null) {
                bundle = cVar.b();
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.g(componentActivity, stringArrayExtra, i10);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                androidx.activity.result.e eVar = (androidx.activity.result.e) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    androidx.core.app.b.l(componentActivity, eVar.g(), i10, eVar.c(), eVar.d(), eVar.e(), 0, bundle2);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new C0010b(i10, e10));
                }
            } else {
                androidx.core.app.b.k(componentActivity, a10, i10, bundle2);
            }
        }
    }

    static class c {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    static class d {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    static final class e {

        /* renamed from: a  reason: collision with root package name */
        Object f671a;

        /* renamed from: b  reason: collision with root package name */
        o0 f672b;

        e() {
        }
    }

    private interface f extends Executor {
        void i0(View view);

        void j();
    }

    class g implements f, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final long f673a = (SystemClock.uptimeMillis() + UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);

        /* renamed from: b  reason: collision with root package name */
        Runnable f674b;

        /* renamed from: c  reason: collision with root package name */
        boolean f675c = false;

        g() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b() {
            Runnable runnable = this.f674b;
            if (runnable != null) {
                runnable.run();
                this.f674b = null;
            }
        }

        public void execute(Runnable runnable) {
            this.f674b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f675c) {
                decorView.postOnAnimation(new f(this));
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        public void i0(View view) {
            if (!this.f675c) {
                this.f675c = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }

        public void j() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        public void onDraw() {
            Runnable runnable = this.f674b;
            if (runnable != null) {
                runnable.run();
                this.f674b = null;
                if (ComponentActivity.this.mFullyDrawnReporter.c()) {
                    this.f675c = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                }
            } else if (SystemClock.uptimeMillis() > this.f673a) {
                this.f675c = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    static class h implements f {

        /* renamed from: a  reason: collision with root package name */
        final Handler f677a = a();

        h() {
        }

        private Handler a() {
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                myLooper = Looper.getMainLooper();
            }
            return new Handler(myLooper);
        }

        public void execute(Runnable runnable) {
            this.f677a.postAtFrontOfQueue(runnable);
        }

        public void i0(View view) {
        }

        public void j() {
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new f.a();
        this.mMenuHostHelper = new k(new e(this));
        this.mLifecycleRegistry = new r(this);
        b1.c a10 = b1.c.a(this);
        this.mSavedStateRegistryController = a10;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        f createFullyDrawnExecutor = createFullyDrawnExecutor();
        this.mReportFullyDrawnExecutor = createFullyDrawnExecutor;
        this.mFullyDrawnReporter = new j(createFullyDrawnExecutor, new d(this));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 19) {
                getLifecycle().a(new m() {
                    public void onStateChanged(p pVar, i.a aVar) {
                        if (aVar == i.a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                c.a(peekDecorView);
                            }
                        }
                    }
                });
            }
            getLifecycle().a(new m() {
                public void onStateChanged(p pVar, i.a aVar) {
                    if (aVar == i.a.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().a();
                        }
                        ComponentActivity.this.mReportFullyDrawnExecutor.j();
                    }
                }
            });
            getLifecycle().a(new m() {
                public void onStateChanged(p pVar, i.a aVar) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().d(this);
                }
            });
            a10.c();
            e0.c(this);
            if (19 <= i10 && i10 <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().h(ACTIVITY_RESULT_TAG, new b(this));
            addOnContextAvailableListener(new c(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private f createFullyDrawnExecutor() {
        if (Build.VERSION.SDK_INT < 16) {
            return new h();
        }
        return new g();
    }

    private void initViewTreeOwners() {
        q0.a(getWindow().getDecorView(), this);
        r0.a(getWindow().getDecorView(), this);
        b1.e.a(getWindow().getDecorView(), this);
        q.a(getWindow().getDecorView(), this);
        p.a(getWindow().getDecorView(), this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ w lambda$new$0() {
        reportFullyDrawn();
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$new$1() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.h(bundle);
        return bundle;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(Context context) {
        Bundle b10 = getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (b10 != null) {
            this.mActivityResultRegistry.g(b10);
        }
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.i0(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(androidx.core.view.m mVar) {
        this.mMenuHostHelper.c(mVar);
    }

    public final void addOnConfigurationChangedListener(androidx.core.util.a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(f.b bVar) {
        this.mContextAwareHelper.a(bVar);
    }

    public final void addOnMultiWindowModeChangedListener(androidx.core.util.a<androidx.core.app.i> aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(androidx.core.util.a<Intent> aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    public final void addOnPictureInPictureModeChangedListener(androidx.core.util.a<q> aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnTrimMemoryListener(androidx.core.util.a<Integer> aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.mViewModelStore = eVar.f672b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new o0();
            }
        }
    }

    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public p0.a getDefaultViewModelCreationExtras() {
        p0.d dVar = new p0.d();
        if (getApplication() != null) {
            dVar.c(l0.a.f3949h, getApplication());
        }
        dVar.c(e0.f3907a, this);
        dVar.c(e0.f3908b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            dVar.c(e0.f3909c, getIntent().getExtras());
        }
        return dVar;
    }

    public l0.b getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new h0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    public j getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        e eVar = (e) getLastNonConfigurationInstance();
        if (eVar != null) {
            return eVar.f671a;
        }
        return null;
    }

    public androidx.lifecycle.i getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    public o0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.mActivityResultRegistry.b(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.e();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<androidx.core.util.a<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.d(bundle);
        this.mContextAwareHelper.c(this);
        super.onCreate(bundle);
        b0.e(this);
        if (androidx.core.os.a.d()) {
            this.mOnBackPressedDispatcher.f(d.a(this));
        }
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.mMenuHostHelper.h(menu, getMenuInflater());
        return true;
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.mMenuHostHelper.j(menuItem);
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean z10) {
        if (!this.mDispatchingOnMultiWindowModeChanged) {
            Iterator<androidx.core.util.a<androidx.core.app.i>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.i(z10));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<androidx.core.util.a<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i10, Menu menu) {
        this.mMenuHostHelper.i(menu);
        super.onPanelClosed(i10, menu);
    }

    public void onPictureInPictureModeChanged(boolean z10) {
        if (!this.mDispatchingOnPictureInPictureModeChanged) {
            Iterator<androidx.core.util.a<q>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new q(z10));
            }
        }
    }

    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.mMenuHostHelper.k(menu);
        return true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.b(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        o0 o0Var = this.mViewModelStore;
        if (o0Var == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            o0Var = eVar.f672b;
        }
        if (o0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f671a = onRetainCustomNonConfigurationInstance;
        eVar2.f672b = o0Var;
        return eVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.i lifecycle = getLifecycle();
        if (lifecycle instanceof r) {
            ((r) lifecycle).o(i.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
    }

    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<androidx.core.util.a<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.d();
    }

    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(g.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.b<O> bVar) {
        return activityResultRegistry.i("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, bVar);
    }

    public void removeMenuProvider(androidx.core.view.m mVar) {
        this.mMenuHostHelper.l(mVar);
    }

    public final void removeOnConfigurationChangedListener(androidx.core.util.a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(f.b bVar) {
        this.mContextAwareHelper.e(bVar);
    }

    public final void removeOnMultiWindowModeChangedListener(androidx.core.util.a<androidx.core.app.i> aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(androidx.core.util.a<Intent> aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(androidx.core.util.a<q> aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnTrimMemoryListener(androidx.core.util.a<Integer> aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    public void reportFullyDrawn() {
        try {
            if (g1.a.h()) {
                g1.a.c("reportFullyDrawn() for ComponentActivity");
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 > 19) {
                super.reportFullyDrawn();
            } else if (i10 == 19 && androidx.core.content.a.checkSelfPermission(this, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                super.reportFullyDrawn();
            }
            this.mFullyDrawnReporter.b();
        } finally {
            g1.a.f();
        }
    }

    public void setContentView(int i10) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.i0(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    public void addMenuProvider(androidx.core.view.m mVar, p pVar) {
        this.mMenuHostHelper.d(mVar, pVar);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public void addMenuProvider(androidx.core.view.m mVar, p pVar, i.b bVar) {
        this.mMenuHostHelper.e(mVar, pVar, bVar);
    }

    /* JADX INFO: finally extract failed */
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<androidx.core.util.a<androidx.core.app.i>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.i(z10, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<androidx.core.util.a<q>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new q(z10, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(g.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, bVar);
    }

    public void setContentView(View view) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.i0(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.i0(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i10) {
        this();
        this.mContentLayoutId = i10;
    }
}
