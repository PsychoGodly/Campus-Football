package vc;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import lc.j;
import lc.k;
import lc.s;

/* compiled from: UserMessagingPlatformManager */
public class d implements k.c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f39137a;

    /* renamed from: b  reason: collision with root package name */
    private final k f39138b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f39139c;

    /* renamed from: d  reason: collision with root package name */
    private ConsentInformation f39140d;

    /* renamed from: f  reason: collision with root package name */
    private Activity f39141f;

    /* compiled from: UserMessagingPlatformManager */
    class a implements ConsentInformation.OnConsentInfoUpdateSuccessListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.d f39142a;

        a(k.d dVar) {
            this.f39142a = dVar;
        }

        public void onConsentInfoUpdateSuccess() {
            this.f39142a.success((Object) null);
        }
    }

    /* compiled from: UserMessagingPlatformManager */
    class b implements ConsentInformation.OnConsentInfoUpdateFailureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.d f39144a;

        b(k.d dVar) {
            this.f39144a = dVar;
        }

        public void onConsentInfoUpdateFailure(FormError formError) {
            this.f39144a.error(Integer.toString(formError.getErrorCode()), formError.getMessage(), (Object) null);
        }
    }

    /* compiled from: UserMessagingPlatformManager */
    class c implements UserMessagingPlatform.OnConsentFormLoadSuccessListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.d f39146a;

        c(k.d dVar) {
            this.f39146a = dVar;
        }

        public void onConsentFormLoadSuccess(ConsentForm consentForm) {
            d.this.f39137a.s(consentForm);
            this.f39146a.success(consentForm);
        }
    }

    /* renamed from: vc.d$d  reason: collision with other inner class name */
    /* compiled from: UserMessagingPlatformManager */
    class C0455d implements UserMessagingPlatform.OnConsentFormLoadFailureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.d f39148a;

        C0455d(k.d dVar) {
            this.f39148a = dVar;
        }

        public void onConsentFormLoadFailure(FormError formError) {
            this.f39148a.error(Integer.toString(formError.getErrorCode()), formError.getMessage(), (Object) null);
        }
    }

    /* compiled from: UserMessagingPlatformManager */
    class e implements ConsentForm.OnConsentFormDismissedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.d f39150a;

        e(k.d dVar) {
            this.f39150a = dVar;
        }

        public void onConsentFormDismissed(FormError formError) {
            if (formError != null) {
                this.f39150a.error(Integer.toString(formError.getErrorCode()), formError.getMessage(), (Object) null);
            } else {
                this.f39150a.success((Object) null);
            }
        }
    }

    public d(lc.c cVar, Context context) {
        c cVar2 = new c();
        this.f39137a = cVar2;
        k kVar = new k(cVar, "plugins.flutter.io/google_mobile_ads/ump", new s(cVar2));
        this.f39138b = kVar;
        kVar.e(this);
        this.f39139c = context;
    }

    private ConsentInformation b() {
        ConsentInformation consentInformation = this.f39140d;
        if (consentInformation != null) {
            return consentInformation;
        }
        ConsentInformation consentInformation2 = UserMessagingPlatform.getConsentInformation(this.f39139c);
        this.f39140d = consentInformation2;
        return consentInformation2;
    }

    public void c(Activity activity) {
        this.f39141f = activity;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        ConsentRequestParameters consentRequestParameters;
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2068759970:
                if (str.equals("ConsentInformation#reset")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1310145901:
                if (str.equals("ConsentInformation#requestConsentInfoUpdate")) {
                    c10 = 1;
                    break;
                }
                break;
            case -971145086:
                if (str.equals("ConsentForm#show")) {
                    c10 = 2;
                    break;
                }
                break;
            case -878979462:
                if (str.equals("ConsentForm#dispose")) {
                    c10 = 3;
                    break;
                }
                break;
            case -585732218:
                if (str.equals("ConsentInformation#isConsentFormAvailable")) {
                    c10 = 4;
                    break;
                }
                break;
            case -497439839:
                if (str.equals("UserMessagingPlatform#loadConsentForm")) {
                    c10 = 5;
                    break;
                }
                break;
            case 665104519:
                if (str.equals("ConsentInformation#getConsentStatus")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                b().reset();
                dVar.success((Object) null);
                return;
            case 1:
                if (this.f39141f == null) {
                    dVar.error("0", "ConsentInformation#requestConsentInfoUpdate called before plugin has been registered to an activity.", (Object) null);
                    return;
                }
                b bVar = (b) jVar.a("params");
                if (bVar == null) {
                    consentRequestParameters = new ConsentRequestParameters.Builder().build();
                } else {
                    consentRequestParameters = bVar.a(this.f39141f);
                }
                b().requestConsentInfoUpdate(this.f39141f, consentRequestParameters, new a(dVar), new b(dVar));
                return;
            case 2:
                ConsentForm consentForm = (ConsentForm) jVar.a("consentForm");
                if (consentForm == null) {
                    dVar.error("0", "ConsentForm#show", (Object) null);
                    return;
                } else {
                    consentForm.show(this.f39141f, new e(dVar));
                    return;
                }
            case 3:
                ConsentForm consentForm2 = (ConsentForm) jVar.a("consentForm");
                if (consentForm2 == null) {
                    Log.w("0", "Called dispose on ad that has been freed");
                } else {
                    this.f39137a.r(consentForm2);
                }
                dVar.success((Object) null);
                return;
            case 4:
                dVar.success(Boolean.valueOf(b().isConsentFormAvailable()));
                return;
            case 5:
                UserMessagingPlatform.loadConsentForm(this.f39139c, new c(dVar), new C0455d(dVar));
                return;
            case 6:
                dVar.success(Integer.valueOf(b().getConsentStatus()));
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
