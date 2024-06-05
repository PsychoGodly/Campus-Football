package d7;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.q;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.a0;
import java.util.Locale;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class z0 implements com.google.firebase.auth.z0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f28664a;

    /* renamed from: b  reason: collision with root package name */
    private final String f28665b;

    /* renamed from: c  reason: collision with root package name */
    private final int f28666c;

    /* renamed from: d  reason: collision with root package name */
    private final int f28667d;

    /* renamed from: e  reason: collision with root package name */
    private final long f28668e;

    /* renamed from: f  reason: collision with root package name */
    private String f28669f;

    /* renamed from: g  reason: collision with root package name */
    private FirebaseAuth f28670g;

    public z0(String str, String str2, int i10, int i11, long j10, String str3, FirebaseAuth firebaseAuth) {
        q.h(str3, "sessionInfo cannot be empty.");
        q.l(firebaseAuth, "firebaseAuth cannot be null.");
        this.f28664a = q.h(str, "sharedSecretKey cannot be empty. This is required to generate QR code URL.");
        this.f28665b = q.h(str2, "hashAlgorithm cannot be empty.");
        this.f28666c = i10;
        this.f28667d = i11;
        this.f28668e = j10;
        this.f28669f = str3;
        this.f28670g = firebaseAuth;
    }

    private final void j(String str) {
        this.f28670g.l().m().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
    }

    public final String a() {
        return this.f28665b;
    }

    public final int b() {
        return this.f28666c;
    }

    public final String c(String str, String str2) {
        q.h(str, "accountName cannot be empty.");
        q.h(str2, "issuer cannot be empty.");
        return String.format((Locale) null, "otpauth://totp/%s:%s?secret=%s&issuer=%s&algorithm=%s&digits=%d", new Object[]{str2, str, this.f28664a, str2, this.f28665b, Integer.valueOf(this.f28666c)});
    }

    public final String d() {
        return c(q.h(((a0) q.l(this.f28670g.m(), "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA.")).getEmail(), "Email cannot be empty, since verified email is required to use MFA."), this.f28670g.l().q());
    }

    public final String e() {
        return this.f28669f;
    }

    public final long f() {
        return this.f28668e;
    }

    public final int g() {
        return this.f28667d;
    }

    public final void h(String str) {
        q.h(str, "qrCodeUrl cannot be empty.");
        try {
            j(str);
        } catch (ActivityNotFoundException unused) {
            j("https://play.google.com/store/search?q=otpauth&c=apps");
        }
    }

    public final String i() {
        return this.f28664a;
    }
}
