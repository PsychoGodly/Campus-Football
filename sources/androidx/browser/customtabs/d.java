package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.browser.customtabs.a;
import androidx.core.app.c;
import androidx.core.app.f;
import java.util.ArrayList;

/* compiled from: CustomTabsIntent */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f1921a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f1922b;

    /* compiled from: CustomTabsIntent */
    private static class a {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    d(Intent intent, Bundle bundle) {
        this.f1921a = intent;
        this.f1922b = bundle;
    }

    public static int a() {
        return 5;
    }

    public static Intent c(Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        return intent;
    }

    public void b(Context context, Uri uri) {
        this.f1921a.setData(uri);
        androidx.core.content.a.startActivity(context, this.f1921a, this.f1922b);
    }

    /* compiled from: CustomTabsIntent */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Intent f1923a = new Intent("android.intent.action.VIEW");

        /* renamed from: b  reason: collision with root package name */
        private final a.C0017a f1924b = new a.C0017a();

        /* renamed from: c  reason: collision with root package name */
        private ArrayList<Bundle> f1925c;

        /* renamed from: d  reason: collision with root package name */
        private Bundle f1926d;

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<Bundle> f1927e;

        /* renamed from: f  reason: collision with root package name */
        private SparseArray<Bundle> f1928f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f1929g;

        /* renamed from: h  reason: collision with root package name */
        private int f1930h = 0;

        /* renamed from: i  reason: collision with root package name */
        private boolean f1931i = true;

        public b() {
        }

        private void e() {
            String a10 = a.a();
            if (!TextUtils.isEmpty(a10)) {
                Bundle bundleExtra = this.f1923a.hasExtra("com.android.browser.headers") ? this.f1923a.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", a10);
                    this.f1923a.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
        }

        private void k(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            f.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f1923a.putExtras(bundle);
        }

        public b a(String str, PendingIntent pendingIntent) {
            if (this.f1925c == null) {
                this.f1925c = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", str);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
            this.f1925c.add(bundle);
            return this;
        }

        public d b() {
            if (!this.f1923a.hasExtra("android.support.customtabs.extra.SESSION")) {
                k((IBinder) null, (PendingIntent) null);
            }
            ArrayList<Bundle> arrayList = this.f1925c;
            if (arrayList != null) {
                this.f1923a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f1927e;
            if (arrayList2 != null) {
                this.f1923a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1923a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1931i);
            this.f1923a.putExtras(this.f1924b.a().a());
            Bundle bundle = this.f1929g;
            if (bundle != null) {
                this.f1923a.putExtras(bundle);
            }
            if (this.f1928f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f1928f);
                this.f1923a.putExtras(bundle2);
            }
            this.f1923a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f1930h);
            if (Build.VERSION.SDK_INT >= 24) {
                e();
            }
            return new d(this.f1923a, this.f1926d);
        }

        public b c(Bitmap bitmap, String str, PendingIntent pendingIntent, boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.customtabs.customaction.ID", 0);
            bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
            bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
            this.f1923a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
            this.f1923a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", z10);
            return this;
        }

        public b d(int i10, a aVar) {
            if (i10 < 0 || i10 > 2 || i10 == 0) {
                throw new IllegalArgumentException("Invalid colorScheme: " + i10);
            }
            if (this.f1928f == null) {
                this.f1928f = new SparseArray<>();
            }
            this.f1928f.put(i10, aVar.a());
            return this;
        }

        public b f(a aVar) {
            this.f1929g = aVar.a();
            return this;
        }

        public b g(Context context, int i10, int i11) {
            this.f1923a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", c.a(context, i10, i11).b());
            return this;
        }

        public b h(boolean z10) {
            this.f1931i = z10;
            return this;
        }

        public b i(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
            this.f1923a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
            this.f1923a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
            this.f1923a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", pendingIntent);
            return this;
        }

        public b j(i iVar) {
            this.f1923a.setPackage(iVar.f().getPackageName());
            k(iVar.e(), iVar.g());
            return this;
        }

        public b l(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f1930h = i10;
            if (i10 == 1) {
                this.f1923a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (i10 == 2) {
                this.f1923a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                this.f1923a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
            return this;
        }

        public b m(boolean z10) {
            this.f1923a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z10 ? 1 : 0);
            return this;
        }

        public b n(Context context, int i10, int i11) {
            this.f1926d = c.a(context, i10, i11).b();
            return this;
        }

        public b o(boolean z10) {
            this.f1923a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z10);
            return this;
        }

        public b(i iVar) {
            if (iVar != null) {
                j(iVar);
            }
        }
    }
}
