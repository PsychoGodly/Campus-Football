package p;

import android.os.Bundle;

/* compiled from: TrustedWebActivityDisplayMode */
public interface a {

    /* renamed from: p.a$a  reason: collision with other inner class name */
    /* compiled from: TrustedWebActivityDisplayMode */
    public static class C0219a implements a {
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
            return bundle;
        }
    }

    /* compiled from: TrustedWebActivityDisplayMode */
    public static class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f21086a;

        /* renamed from: b  reason: collision with root package name */
        private final int f21087b;

        public b(boolean z10, int i10) {
            this.f21086a = z10;
            this.f21087b = i10;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
            bundle.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.f21086a);
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", this.f21087b);
            return bundle;
        }
    }

    Bundle a();
}
