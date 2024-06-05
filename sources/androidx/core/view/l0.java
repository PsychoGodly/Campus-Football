package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.collection.g;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: WindowInsetsControllerCompat */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final e f3233a;

    /* compiled from: WindowInsetsControllerCompat */
    private static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        protected final Window f3234a;

        /* renamed from: b  reason: collision with root package name */
        private final View f3235b;

        a(Window window, View view) {
            this.f3234a = window;
            this.f3235b = view;
        }

        /* access modifiers changed from: protected */
        public void c(int i10) {
            View decorView = this.f3234a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void d(int i10) {
            this.f3234a.addFlags(i10);
        }

        /* access modifiers changed from: protected */
        public void e(int i10) {
            View decorView = this.f3234a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void f(int i10) {
            this.f3234a.clearFlags(i10);
        }
    }

    /* compiled from: WindowInsetsControllerCompat */
    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        public void b(boolean z10) {
            if (z10) {
                f(67108864);
                d(RecyclerView.UNDEFINED_DURATION);
                c(8192);
                return;
            }
            e(8192);
        }
    }

    /* compiled from: WindowInsetsControllerCompat */
    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        public void a(boolean z10) {
            if (z10) {
                f(134217728);
                d(RecyclerView.UNDEFINED_DURATION);
                c(16);
                return;
            }
            e(16);
        }
    }

    /* compiled from: WindowInsetsControllerCompat */
    private static class e {
        e() {
        }

        public void a(boolean z10) {
        }

        public void b(boolean z10) {
        }
    }

    public l0(Window window, View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f3233a = new d(window, this);
        } else if (i10 >= 26) {
            this.f3233a = new c(window, view);
        } else if (i10 >= 23) {
            this.f3233a = new b(window, view);
        } else if (i10 >= 20) {
            this.f3233a = new a(window, view);
        } else {
            this.f3233a = new e();
        }
    }

    public void a(boolean z10) {
        this.f3233a.a(z10);
    }

    public void b(boolean z10) {
        this.f3233a.b(z10);
    }

    /* compiled from: WindowInsetsControllerCompat */
    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final l0 f3236a;

        /* renamed from: b  reason: collision with root package name */
        final WindowInsetsController f3237b;

        /* renamed from: c  reason: collision with root package name */
        private final g<Object, WindowInsetsController.OnControllableInsetsChangedListener> f3238c;

        /* renamed from: d  reason: collision with root package name */
        protected Window f3239d;

        d(Window window, l0 l0Var) {
            this(window.getInsetsController(), l0Var);
            this.f3239d = window;
        }

        public void a(boolean z10) {
            if (z10) {
                if (this.f3239d != null) {
                    c(16);
                }
                this.f3237b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f3239d != null) {
                d(16);
            }
            this.f3237b.setSystemBarsAppearance(0, 16);
        }

        public void b(boolean z10) {
            if (z10) {
                if (this.f3239d != null) {
                    c(8192);
                }
                this.f3237b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f3239d != null) {
                d(8192);
            }
            this.f3237b.setSystemBarsAppearance(0, 8);
        }

        /* access modifiers changed from: protected */
        public void c(int i10) {
            View decorView = this.f3239d.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void d(int i10) {
            View decorView = this.f3239d.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, l0 l0Var) {
            this.f3238c = new g<>();
            this.f3237b = windowInsetsController;
            this.f3236a = l0Var;
        }
    }
}
