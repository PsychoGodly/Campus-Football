package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.d;
import androidx.browser.customtabs.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p.a;

/* compiled from: TrustedWebActivityIntentBuilder */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f21090a;

    /* renamed from: b  reason: collision with root package name */
    private final d.b f21091b = new d.b();

    /* renamed from: c  reason: collision with root package name */
    private List<String> f21092c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f21093d;

    /* renamed from: e  reason: collision with root package name */
    private a f21094e = new a.C0219a();

    /* renamed from: f  reason: collision with root package name */
    private int f21095f = 0;

    public c(Uri uri) {
        this.f21090a = uri;
    }

    public b a(i iVar) {
        Objects.requireNonNull(iVar, "CustomTabsSession is required for launching a TWA");
        this.f21091b.j(iVar);
        Intent intent = this.f21091b.b().f1921a;
        intent.setData(this.f21090a);
        intent.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
        if (this.f21092c != null) {
            intent.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", new ArrayList(this.f21092c));
        }
        Bundle bundle = this.f21093d;
        if (bundle != null) {
            intent.putExtra("androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS", bundle);
        }
        List emptyList = Collections.emptyList();
        intent.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", this.f21094e.a());
        intent.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", this.f21095f);
        return new b(intent, emptyList);
    }

    public c b(List<String> list) {
        this.f21092c = list;
        return this;
    }

    public c c(androidx.browser.customtabs.a aVar) {
        this.f21091b.f(aVar);
        return this;
    }

    public c d(a aVar) {
        this.f21094e = aVar;
        return this;
    }

    public c e(int i10) {
        this.f21095f = i10;
        return this;
    }
}
