package zc;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.d;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.Collections;
import java.util.Map;
import zc.a;

/* compiled from: UrlLauncher */
final class i implements a.c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f39540a;

    /* renamed from: b  reason: collision with root package name */
    private final a f39541b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f39542c;

    /* compiled from: UrlLauncher */
    interface a {
        String a(Intent intent);
    }

    i(Context context, a aVar) {
        this.f39540a = context;
        this.f39541b = aVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0008 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean g(java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0008:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r2)
            r0.hashCode()
            r2 = -1
            int r3 = r0.hashCode()
            r4 = 1
            switch(r3) {
                case -1423461112: goto L_0x004a;
                case -1229727188: goto L_0x003f;
                case 785670158: goto L_0x0034;
                case 802785917: goto L_0x0029;
                default: goto L_0x0027;
            }
        L_0x0027:
            r1 = -1
            goto L_0x0053
        L_0x0029:
            java.lang.String r1 = "accept-language"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0032
            goto L_0x0027
        L_0x0032:
            r1 = 3
            goto L_0x0053
        L_0x0034:
            java.lang.String r1 = "content-type"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003d
            goto L_0x0027
        L_0x003d:
            r1 = 2
            goto L_0x0053
        L_0x003f:
            java.lang.String r1 = "content-language"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0048
            goto L_0x0027
        L_0x0048:
            r1 = 1
            goto L_0x0053
        L_0x004a:
            java.lang.String r3 = "accept"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0053
            goto L_0x0027
        L_0x0053:
            switch(r1) {
                case 0: goto L_0x0008;
                case 1: goto L_0x0008;
                case 2: goto L_0x0008;
                case 3: goto L_0x0008;
                default: goto L_0x0056;
            }
        L_0x0056:
            return r4
        L_0x0057:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.i.g(java.util.Map):boolean");
    }

    private void h() {
        if (this.f39542c == null) {
            throw new a.b("NO_ACTIVITY", "Launching a URL requires a foreground activity.", (Object) null);
        }
    }

    private static Bundle i(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String next : map.keySet()) {
            bundle.putString(next, map.get(next));
        }
        return bundle;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String j(Context context, Intent intent) {
        ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
        if (resolveActivity == null) {
            return null;
        }
        return resolveActivity.toShortString();
    }

    private static boolean k(Context context, Uri uri, Bundle bundle, a.C0470a aVar) {
        d b10 = new d.b().m(aVar.b().booleanValue()).b();
        b10.f1921a.putExtra("com.android.browser.headers", bundle);
        try {
            b10.b(context, uri);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public Boolean a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        String a10 = this.f39541b.a(intent);
        if (a10 == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(a10));
    }

    public Boolean b() {
        return Boolean.valueOf(c.c(this.f39540a, Collections.emptyList()) != null);
    }

    public void c() {
        this.f39540a.sendBroadcast(new Intent("close action"));
    }

    public Boolean d(String str, Map<String, String> map) {
        h();
        try {
            this.f39542c.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", i(map)));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    public Boolean e(String str, Boolean bool, a.e eVar, a.C0470a aVar) {
        h();
        Bundle i10 = i(eVar.d());
        if (bool.booleanValue() && !g(eVar.d())) {
            if (k(this.f39542c, Uri.parse(str), i10, aVar)) {
                return Boolean.TRUE;
            }
        }
        try {
            this.f39542c.startActivity(WebViewActivity.a(this.f39542c, str, eVar.c().booleanValue(), eVar.b().booleanValue(), i10));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    /* access modifiers changed from: package-private */
    public void l(Activity activity) {
        this.f39542c = activity;
    }

    i(Context context) {
        this(context, new h(context));
    }
}
