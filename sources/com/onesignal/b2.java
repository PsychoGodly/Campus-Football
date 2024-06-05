package com.onesignal;

import android.content.Context;
import android.net.Uri;
import java.security.SecureRandom;
import org.json.JSONObject;

/* compiled from: OSNotificationGenerationJob */
public class b2 {

    /* renamed from: a  reason: collision with root package name */
    private w1 f27561a;

    /* renamed from: b  reason: collision with root package name */
    private Context f27562b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f27563c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f27564d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f27565e;

    /* renamed from: f  reason: collision with root package name */
    private Long f27566f;

    /* renamed from: g  reason: collision with root package name */
    private CharSequence f27567g;

    /* renamed from: h  reason: collision with root package name */
    private CharSequence f27568h;

    /* renamed from: i  reason: collision with root package name */
    private Uri f27569i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f27570j;

    /* renamed from: k  reason: collision with root package name */
    private Integer f27571k;

    /* renamed from: l  reason: collision with root package name */
    private Uri f27572l;

    b2(Context context) {
        this.f27562b = context;
    }

    /* access modifiers changed from: package-private */
    public Integer a() {
        return Integer.valueOf(this.f27561a.f());
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return k3.v0(this.f27563c);
    }

    /* access modifiers changed from: package-private */
    public CharSequence c() {
        CharSequence charSequence = this.f27567g;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f27561a.i();
    }

    public Context d() {
        return this.f27562b;
    }

    public JSONObject e() {
        return this.f27563c;
    }

    public w1 f() {
        return this.f27561a;
    }

    public Uri g() {
        return this.f27572l;
    }

    public Integer h() {
        return this.f27570j;
    }

    public Uri i() {
        return this.f27569i;
    }

    public Long j() {
        return this.f27566f;
    }

    /* access modifiers changed from: package-private */
    public CharSequence k() {
        CharSequence charSequence = this.f27568h;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f27561a.C();
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f27561a.s() != null;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f27565e;
    }

    public boolean n() {
        return this.f27564d;
    }

    public void o(Context context) {
        this.f27562b = context;
    }

    /* access modifiers changed from: package-private */
    public void p(boolean z10) {
        this.f27565e = z10;
    }

    public void q(JSONObject jSONObject) {
        this.f27563c = jSONObject;
    }

    public void r(w1 w1Var) {
        if (w1Var != null && !w1Var.E()) {
            w1 w1Var2 = this.f27561a;
            if (w1Var2 == null || !w1Var2.E()) {
                w1Var.J(new SecureRandom().nextInt());
            } else {
                w1Var.J(this.f27561a.f());
            }
        }
        this.f27561a = w1Var;
    }

    public void s(Integer num) {
        this.f27571k = num;
    }

    public void t(Uri uri) {
        this.f27572l = uri;
    }

    public String toString() {
        return "OSNotificationGenerationJob{jsonPayload=" + this.f27563c + ", isRestoring=" + this.f27564d + ", isNotificationToDisplay=" + this.f27565e + ", shownTimeStamp=" + this.f27566f + ", overriddenBodyFromExtender=" + this.f27567g + ", overriddenTitleFromExtender=" + this.f27568h + ", overriddenSound=" + this.f27569i + ", overriddenFlags=" + this.f27570j + ", orgFlags=" + this.f27571k + ", orgSound=" + this.f27572l + ", notification=" + this.f27561a + '}';
    }

    public void u(CharSequence charSequence) {
        this.f27567g = charSequence;
    }

    public void v(Integer num) {
        this.f27570j = num;
    }

    public void w(Uri uri) {
        this.f27569i = uri;
    }

    public void x(CharSequence charSequence) {
        this.f27568h = charSequence;
    }

    public void y(boolean z10) {
        this.f27564d = z10;
    }

    public void z(Long l10) {
        this.f27566f = l10;
    }

    b2(Context context, JSONObject jSONObject) {
        this(context, new w1(jSONObject), jSONObject);
    }

    b2(Context context, w1 w1Var, JSONObject jSONObject) {
        this.f27562b = context;
        this.f27563c = jSONObject;
        r(w1Var);
    }
}
