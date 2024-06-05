package ya;

import android.app.Activity;
import android.content.Context;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import dc.a;
import ec.c;
import kotlin.jvm.internal.m;
import lc.j;
import lc.k;

/* compiled from: UserMessagingPlatformPlugin.kt */
public final class f implements a, ec.a, k.c {

    /* renamed from: a  reason: collision with root package name */
    private k f24023a;

    /* renamed from: b  reason: collision with root package name */
    private Context f24024b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f24025c;

    private final ConsentInformation f() {
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(this.f24024b);
        m.b(consentInformation);
        return consentInformation;
    }

    private final void g(k.d dVar, FormError formError) {
        dVar.error(g.h(formError.getErrorCode()), formError.getMessage(), (Object) null);
    }

    private final void h(Object obj, k.d dVar) {
        Context context = this.f24024b;
        m.b(context);
        f().requestConsentInfoUpdate(this.f24025c, g.d(obj, context), new c(this, dVar), new b(this, dVar));
    }

    /* access modifiers changed from: private */
    public static final void i(f fVar, k.d dVar) {
        m.e(fVar, "this$0");
        m.e(dVar, "$result");
        fVar.l(dVar);
    }

    /* access modifiers changed from: private */
    public static final void j(f fVar, k.d dVar, FormError formError) {
        m.e(fVar, "this$0");
        m.e(dVar, "$result");
        m.d(formError, "it");
        fVar.g(dVar, formError);
    }

    private final void k(k.d dVar) {
        f().reset();
        dVar.success((Object) null);
    }

    private final void l(k.d dVar) {
        dVar.success(g.g(f()));
    }

    private final void m(k.d dVar) {
        UserMessagingPlatform.loadConsentForm(this.f24024b, new e(this, dVar), new d(this, dVar));
    }

    /* access modifiers changed from: private */
    public static final void n(f fVar, k.d dVar, ConsentForm consentForm) {
        m.e(fVar, "this$0");
        m.e(dVar, "$result");
        consentForm.show(fVar.f24025c, new a(fVar, dVar));
    }

    /* access modifiers changed from: private */
    public static final void o(f fVar, k.d dVar, FormError formError) {
        m.e(fVar, "this$0");
        m.e(dVar, "$result");
        if (formError == null) {
            fVar.l(dVar);
            return;
        }
        m.d(formError, "it");
        fVar.g(dVar, formError);
    }

    /* access modifiers changed from: private */
    public static final void p(f fVar, k.d dVar, FormError formError) {
        m.e(fVar, "this$0");
        m.e(dVar, "$result");
        m.d(formError, "it");
        fVar.g(dVar, formError);
    }

    public void onAttachedToActivity(c cVar) {
        m.e(cVar, "binding");
        this.f24025c = cVar.getActivity();
    }

    public void onAttachedToEngine(a.b bVar) {
        m.e(bVar, "flutterPluginBinding");
        k kVar = new k(bVar.b(), "com.terwesten.gabriel/user_messaging_platform");
        this.f24023a = kVar;
        kVar.e(this);
        this.f24024b = bVar.a();
    }

    public void onDetachedFromActivity() {
        this.f24025c = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(a.b bVar) {
        m.e(bVar, "binding");
        k kVar = this.f24023a;
        if (kVar == null) {
            m.t("channel");
            kVar = null;
        }
        kVar.e((k.c) null);
        this.f24024b = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        m.e(jVar, "call");
        m.e(dVar, "result");
        String str = jVar.f36116a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1606455294:
                    if (str.equals("requestConsentInfoUpdate")) {
                        h(jVar.f36117b, dVar);
                        return;
                    }
                    break;
                case -676761831:
                    if (str.equals("resetConsentInfo")) {
                        k(dVar);
                        return;
                    }
                    break;
                case 39755969:
                    if (str.equals("showConsentForm")) {
                        m(dVar);
                        return;
                    }
                    break;
                case 1522418354:
                    if (str.equals("getConsentInfo")) {
                        l(dVar);
                        return;
                    }
                    break;
            }
        }
        dVar.notImplemented();
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        m.e(cVar, "binding");
    }
}
