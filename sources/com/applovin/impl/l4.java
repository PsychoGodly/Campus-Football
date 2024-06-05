package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.f4;
import com.applovin.impl.g4;
import com.applovin.impl.h4;
import com.applovin.impl.j4;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class l4 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final k f9155a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9156b;

    /* renamed from: c  reason: collision with root package name */
    private List f9157c;

    /* renamed from: d  reason: collision with root package name */
    private String f9158d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public h4 f9159e;

    /* renamed from: f  reason: collision with root package name */
    private f4.c f9160f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public f4.b f9161g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public h4 f9162h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public Dialog f9163i;

    /* renamed from: j  reason: collision with root package name */
    private final p f9164j = new a();

    class a extends p {
        a() {
        }

        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if (!(activity instanceof AppLovinWebViewActivity) && l4.this.f9162h != null) {
                if (l4.this.f9163i != null) {
                    l4 l4Var = l4.this;
                    if (!r.a(l4Var.a(l4Var.f9163i))) {
                        l4.this.f9163i.dismiss();
                    }
                    Dialog unused = l4.this.f9163i = null;
                }
                h4 a10 = l4.this.f9162h;
                h4 unused2 = l4.this.f9162h = null;
                l4 l4Var2 = l4.this;
                l4Var2.a(l4Var2.f9159e, a10, activity);
            }
        }
    }

    class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j4 f9166a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h4 f9167b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f9168c;

        b(j4 j4Var, h4 h4Var, Activity activity) {
            this.f9166a = j4Var;
            this.f9167b = h4Var;
            this.f9168c = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            h4 unused = l4.this.f9162h = null;
            Dialog unused2 = l4.this.f9163i = null;
            h4 a10 = l4.this.a(this.f9166a.a());
            if (a10 == null) {
                l4.this.b("Destination state for TOS/PP alert is null");
                return;
            }
            l4.this.a(this.f9167b, a10, this.f9168c);
            if (a10.c() != h4.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    class c extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Uri f9170a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f9171b;

        c(Uri uri, Activity activity) {
            this.f9170a = uri;
            this.f9171b = activity;
        }

        public void onClick(View view) {
            zp.a(this.f9170a, this.f9171b, l4.this.f9155a);
        }
    }

    class d extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Uri f9173a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f9174b;

        d(Uri uri, Activity activity) {
            this.f9173a = uri;
            this.f9174b = activity;
        }

        public void onClick(View view) {
            zp.a(this.f9173a, this.f9174b, l4.this.f9155a);
        }
    }

    class e implements CmpServiceImpl.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h4 f9176a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f9177b;

        e(h4 h4Var, Activity activity) {
            this.f9176a = h4Var;
            this.f9177b = activity;
        }

        public void a(AppLovinCmpError appLovinCmpError) {
            l4.this.a(this.f9176a, this.f9177b, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    class f implements CmpServiceImpl.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h4 f9179a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f9180b;

        f(h4 h4Var, Activity activity) {
            this.f9179a = h4Var;
            this.f9180b = activity;
        }

        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError == null && l4.this.f9161g != null) {
                l4.this.f9161g.a(true);
            }
            l4.this.b(this.f9179a, this.f9180b);
        }
    }

    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h4 f9182a;

        g(h4 h4Var) {
            this.f9182a = h4Var;
        }

        public void run() {
            l4 l4Var = l4.this;
            l4Var.a(l4Var.f9159e, this.f9182a, l4.this.f9155a.p0());
        }
    }

    public l4(k kVar) {
        this.f9155a = kVar;
        this.f9156b = ((Integer) kVar.a(oj.f10438w6)).intValue();
    }

    public void c() {
        f4.b bVar;
        this.f9157c = null;
        this.f9159e = null;
        this.f9155a.e().b(this.f9164j);
        f4.c cVar = this.f9160f;
        if (!(cVar == null || (bVar = this.f9161g) == null)) {
            cVar.a(bVar);
        }
        this.f9160f = null;
        this.f9161g = null;
    }

    /* access modifiers changed from: private */
    public void b(String str) {
        o6.a(str, new Object[0]);
        this.f9155a.B().a(o.b.CONSENT_FLOW_ERROR, str, (Map) CollectionUtils.hashMap("details", "Last started states: " + this.f9158d + "\nLast successful state: " + this.f9159e));
        f4.b bVar = this.f9161g;
        if (bVar != null) {
            bVar.a(new d4(d4.f7116f, str));
        }
        c();
    }

    private h4 a() {
        List<h4> list = this.f9157c;
        if (list == null) {
            return null;
        }
        for (h4 h4Var : list) {
            if (h4Var.d()) {
                return h4Var;
            }
        }
        return null;
    }

    private void c(h4 h4Var, Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new zy(this, h4Var, activity));
    }

    public boolean b() {
        return this.f9157c != null;
    }

    /* access modifiers changed from: private */
    public Activity a(Dialog dialog) {
        Context context = dialog.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public void b(h4 h4Var, Activity activity) {
        a(h4Var, activity, (Boolean) null);
    }

    /* access modifiers changed from: private */
    public h4 a(String str) {
        List<h4> list = this.f9157c;
        if (list == null) {
            return null;
        }
        for (h4 h4Var : list) {
            if (str.equalsIgnoreCase(h4Var.b())) {
                return h4Var;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AlertDialog alertDialog, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", (String) null, (String) null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.f9156b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(h4 h4Var, Activity activity) {
        if (h4Var == null) {
            b("Consent flow state is null");
            return;
        }
        this.f9155a.L();
        if (t.a()) {
            t L = this.f9155a.L();
            L.a("AppLovinSdk", "Transitioning to state: " + h4Var);
        }
        boolean z10 = false;
        if (h4Var.c() == h4.b.ALERT) {
            if (r.a(activity)) {
                a(h4Var);
                return;
            }
            i4 i4Var = (i4) h4Var;
            this.f9162h = i4Var;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            for (j4 j4Var : i4Var.e()) {
                b bVar = new b(j4Var, h4Var, activity);
                if (j4Var.c() == j4.a.POSITIVE) {
                    builder.setPositiveButton(j4Var.d(), bVar);
                } else if (j4Var.c() == j4.a.NEGATIVE) {
                    builder.setNegativeButton(j4Var.d(), bVar);
                } else {
                    builder.setNeutralButton(j4Var.d(), bVar);
                }
            }
            String g10 = i4Var.g();
            SpannableString spannableString = null;
            if (StringUtils.isValidString(g10)) {
                spannableString = new SpannableString(g10);
                String a10 = k.a(R.string.applovin_terms_of_service_text);
                String a11 = k.a(R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(g10, Arrays.asList(new String[]{a10, a11}))) {
                    Uri i10 = this.f9155a.t().i();
                    if (i10 != null) {
                        StringUtils.addLinks(spannableString, Pattern.compile(a10), new c(i10, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(a11), new d(this.f9155a.t().h(), activity), true);
                }
            }
            AlertDialog create = builder.setTitle(spannableString).setMessage(i4Var.f()).create();
            create.setOnShowListener(new yy(this, create));
            this.f9163i = create;
            create.show();
        } else if (h4Var.c() == h4.b.EVENT) {
            k4 k4Var = (k4) h4Var;
            String f10 = k4Var.f();
            Map e10 = k4Var.e();
            if (e10 == null) {
                e10 = new HashMap(1);
            }
            e10.put("flow_type", this.f9155a.t().e().b());
            this.f9155a.C().trackEvent(f10, e10);
            b((h4) k4Var, activity);
        } else if (h4Var.c() == h4.b.HAS_USER_CONSENT) {
            a(true);
            b(h4Var, activity);
        } else if (h4Var.c() == h4.b.CMP_LOAD) {
            if (r.a(activity)) {
                a(h4Var);
            } else {
                this.f9155a.n().loadCmp(activity, new e(h4Var, activity));
            }
        } else if (h4Var.c() == h4.b.CMP_SHOW) {
            if (r.a(activity)) {
                a(h4Var);
                return;
            }
            this.f9155a.C().trackEvent("cf_start");
            this.f9155a.n().showCmp(activity, new f(h4Var, activity));
        } else if (h4Var.c() == h4.b.DECISION) {
            h4.a a12 = h4Var.a();
            if (a12 == h4.a.IS_AL_GDPR) {
                AppLovinSdkConfiguration.ConsentFlowUserGeography f11 = this.f9155a.t().f();
                AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                boolean z11 = f11 == consentFlowUserGeography && zp.c(this.f9155a);
                if (this.f9155a.q().getConsentFlowUserGeography() == consentFlowUserGeography || z11) {
                    z10 = true;
                }
                a(h4Var, activity, Boolean.valueOf(z10));
                return;
            }
            b("Invalid consent flow decision type: " + a12);
        } else if (h4Var.c() == h4.b.TERMS_FLOW) {
            List a13 = e4.a(this.f9155a);
            if (a13 == null || a13.size() <= 0) {
                c();
                return;
            }
            this.f9155a.C().trackEvent("cf_start");
            this.f9157c = a13;
            a(h4Var, a(), activity);
        } else if (h4Var.c() == h4.b.REINIT) {
            c();
        } else {
            b("Invalid consent flow destination state: " + h4Var);
        }
    }

    public void a(boolean z10) {
        if (this.f9155a.t().e() != g4.a.TERMS) {
            y3.b(z10, k.k());
        }
    }

    public void a(List list, Activity activity, f4.c cVar) {
        if (this.f9157c != null) {
            this.f9155a.L();
            if (t.a()) {
                t L = this.f9155a.L();
                L.a("AppLovinSdk", "Unable to start states: " + list);
            }
            this.f9155a.L();
            if (t.a()) {
                t L2 = this.f9155a.L();
                L2.a("AppLovinSdk", "Consent flow already in progress for states: " + this.f9157c);
            }
            cVar.a(new f4.b(new d4(d4.f7115e, "Consent flow is already in progress.")));
            return;
        }
        this.f9157c = list;
        this.f9158d = String.valueOf(list);
        this.f9160f = cVar;
        this.f9161g = new f4.b();
        k.a((Context) activity).a(this.f9164j);
        a((h4) null, a(), activity);
    }

    /* access modifiers changed from: private */
    public void a(h4 h4Var, Activity activity, Boolean bool) {
        a(h4Var, a(h4Var.a(bool)), activity);
    }

    /* access modifiers changed from: private */
    public void a(h4 h4Var, h4 h4Var2, Activity activity) {
        this.f9159e = h4Var;
        c(h4Var2, activity);
    }

    private void a(h4 h4Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new g(h4Var), TimeUnit.SECONDS.toMillis(1));
    }
}
