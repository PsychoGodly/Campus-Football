package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import c.a;
import c.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CustomTabsClient */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f1895a;

    /* renamed from: b  reason: collision with root package name */
    private final ComponentName f1896b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f1897c;

    /* compiled from: CustomTabsClient */
    class a extends a.C0101a {

        /* renamed from: a  reason: collision with root package name */
        private Handler f1898a = new Handler(Looper.getMainLooper());

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f1899b;

        /* renamed from: androidx.browser.customtabs.c$a$a  reason: collision with other inner class name */
        /* compiled from: CustomTabsClient */
        class C0018a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f1901a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bundle f1902b;

            C0018a(int i10, Bundle bundle) {
                this.f1901a = i10;
                this.f1902b = bundle;
            }

            public void run() {
                a.this.f1899b.onNavigationEvent(this.f1901a, this.f1902b);
            }
        }

        /* compiled from: CustomTabsClient */
        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f1904a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bundle f1905b;

            b(String str, Bundle bundle) {
                this.f1904a = str;
                this.f1905b = bundle;
            }

            public void run() {
                a.this.f1899b.extraCallback(this.f1904a, this.f1905b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$a$c  reason: collision with other inner class name */
        /* compiled from: CustomTabsClient */
        class C0019c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Bundle f1907a;

            C0019c(Bundle bundle) {
                this.f1907a = bundle;
            }

            public void run() {
                a.this.f1899b.onMessageChannelReady(this.f1907a);
            }
        }

        /* compiled from: CustomTabsClient */
        class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f1909a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bundle f1910b;

            d(String str, Bundle bundle) {
                this.f1909a = str;
                this.f1910b = bundle;
            }

            public void run() {
                a.this.f1899b.onPostMessage(this.f1909a, this.f1910b);
            }
        }

        /* compiled from: CustomTabsClient */
        class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f1912a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Uri f1913b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f1914c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Bundle f1915d;

            e(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f1912a = i10;
                this.f1913b = uri;
                this.f1914c = z10;
                this.f1915d = bundle;
            }

            public void run() {
                a.this.f1899b.onRelationshipValidationResult(this.f1912a, this.f1913b, this.f1914c, this.f1915d);
            }
        }

        /* compiled from: CustomTabsClient */
        class f implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f1917a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f1918b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Bundle f1919c;

            f(int i10, int i11, Bundle bundle) {
                this.f1917a = i10;
                this.f1918b = i11;
                this.f1919c = bundle;
            }

            public void run() {
                a.this.f1899b.onActivityResized(this.f1917a, this.f1918b, this.f1919c);
            }
        }

        a(b bVar) {
            this.f1899b = bVar;
        }

        public void C0(int i10, int i11, Bundle bundle) throws RemoteException {
            if (this.f1899b != null) {
                this.f1898a.post(new f(i10, i11, bundle));
            }
        }

        public void P0(String str, Bundle bundle) throws RemoteException {
            if (this.f1899b != null) {
                this.f1898a.post(new b(str, bundle));
            }
        }

        public void X0(int i10, Bundle bundle) {
            if (this.f1899b != null) {
                this.f1898a.post(new C0018a(i10, bundle));
            }
        }

        public Bundle b0(String str, Bundle bundle) throws RemoteException {
            b bVar = this.f1899b;
            if (bVar == null) {
                return null;
            }
            return bVar.extraCallbackWithResult(str, bundle);
        }

        public void i1(String str, Bundle bundle) throws RemoteException {
            if (this.f1899b != null) {
                this.f1898a.post(new d(str, bundle));
            }
        }

        public void m1(Bundle bundle) throws RemoteException {
            if (this.f1899b != null) {
                this.f1898a.post(new C0019c(bundle));
            }
        }

        public void q1(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException {
            if (this.f1899b != null) {
                this.f1898a.post(new e(i10, uri, z10, bundle));
            }
        }
    }

    c(b bVar, ComponentName componentName, Context context) {
        this.f1895a = bVar;
        this.f1896b = componentName;
        this.f1897c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    private a.C0101a b(b bVar) {
        return new a(bVar);
    }

    public static String c(Context context, List<String> list) {
        return d(context, list, false);
    }

    public static String d(Context context, List<String> list, boolean z10) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z10 && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String next : arrayList) {
            intent2.setPackage(next);
            if (packageManager.resolveService(intent2, 0) != null) {
                return next;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    private i f(b bVar, PendingIntent pendingIntent) {
        boolean z10;
        a.C0101a b10 = b(bVar);
        if (pendingIntent != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                z10 = this.f1895a.c(b10, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        } else {
            z10 = this.f1895a.Y(b10);
        }
        if (!z10) {
            return null;
        }
        return new i(this.f1895a, b10, this.f1896b, pendingIntent);
    }

    public i e(b bVar) {
        return f(bVar, (PendingIntent) null);
    }

    public boolean g(long j10) {
        try {
            return this.f1895a.o0(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
