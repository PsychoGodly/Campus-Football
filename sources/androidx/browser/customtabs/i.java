package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.widget.RemoteViews;
import c.b;
import c.c;
import java.util.List;

/* compiled from: CustomTabsSession */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1942a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final b f1943b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a f1944c;

    /* renamed from: d  reason: collision with root package name */
    private final ComponentName f1945d;

    /* renamed from: e  reason: collision with root package name */
    private final PendingIntent f1946e;

    /* compiled from: CustomTabsSession */
    class a extends c.a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f1947a = new Handler(Looper.getMainLooper());

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f1948b;

        a(j jVar) {
            this.f1948b = jVar;
        }

        public void onGreatestScrollPercentageIncreased(int i10, Bundle bundle) {
            this.f1947a.post(new f(this.f1948b, i10, bundle));
        }

        public void onSessionEnded(boolean z10, Bundle bundle) {
            this.f1947a.post(new g(this.f1948b, z10, bundle));
        }

        public void onVerticalScrollEvent(boolean z10, Bundle bundle) {
            this.f1947a.post(new h(this.f1948b, z10, bundle));
        }
    }

    i(b bVar, c.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f1943b = bVar;
        this.f1944c = aVar;
        this.f1945d = componentName;
        this.f1946e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f1946e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    private c.a c(j jVar) {
        return new a(jVar);
    }

    private Bundle d(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f1946e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public IBinder e() {
        return this.f1944c.asBinder();
    }

    /* access modifiers changed from: package-private */
    public ComponentName f() {
        return this.f1945d;
    }

    /* access modifiers changed from: package-private */
    public PendingIntent g() {
        return this.f1946e;
    }

    public boolean h(Bundle bundle) throws RemoteException {
        try {
            return this.f1943b.u0(this.f1944c, bundle);
        } catch (SecurityException e10) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
        }
    }

    public boolean i(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f1943b.b1(this.f1944c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int j(String str, Bundle bundle) {
        int d12;
        Bundle b10 = b(bundle);
        synchronized (this.f1942a) {
            try {
                d12 = this.f1943b.d1(this.f1944c, str, b10);
            } catch (RemoteException unused) {
                return -2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d12;
    }

    public boolean k(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle d10 = d(uri2);
            if (d10 == null) {
                return this.f1943b.r0(this.f1944c, uri);
            }
            bundle.putAll(d10);
            return this.f1943b.s1(this.f1944c, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean l(Bitmap bitmap, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
        bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
        a(bundle);
        try {
            return this.f1943b.t(this.f1944c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean m(j jVar, Bundle bundle) throws RemoteException {
        try {
            return this.f1943b.k1(this.f1944c, c(jVar).asBinder(), bundle);
        } catch (SecurityException e10) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
        }
    }

    public boolean n(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
        bundle.putIntArray("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", pendingIntent);
        a(bundle);
        try {
            return this.f1943b.t(this.f1944c, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean o(int i10, Uri uri, Bundle bundle) {
        if (i10 >= 1 && i10 <= 2) {
            try {
                return this.f1943b.I(this.f1944c, i10, uri, b(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
