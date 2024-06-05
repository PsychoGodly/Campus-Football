package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Handler;
import androidx.core.content.a;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import m5.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class y extends u6 {

    /* renamed from: c  reason: collision with root package name */
    private long f25255c;

    /* renamed from: d  reason: collision with root package name */
    private String f25256d;

    /* renamed from: e  reason: collision with root package name */
    private AccountManager f25257e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f25258f;

    /* renamed from: g  reason: collision with root package name */
    private long f25259g;

    y(w5 w5Var) {
        super(w5Var);
    }

    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* access modifiers changed from: protected */
    public final boolean n() {
        Calendar instance = Calendar.getInstance();
        this.f25255c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f25256d = lowerCase + "-" + lowerCase2;
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long p() {
        i();
        return this.f25259g;
    }

    public final long q() {
        j();
        return this.f25255c;
    }

    public final String r() {
        j();
        return this.f25256d;
    }

    /* access modifiers changed from: package-private */
    public final void s() {
        i();
        this.f25258f = null;
        this.f25259g = 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean t() {
        i();
        long a10 = zzb().a();
        if (a10 - this.f25259g > 86400000) {
            this.f25258f = null;
        }
        Boolean bool = this.f25258f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (a.checkSelfPermission(zza(), "android.permission.GET_ACCOUNTS") != 0) {
            zzj().I().a("Permission error checking for dasher/unicorn accounts");
            this.f25259g = a10;
            this.f25258f = Boolean.FALSE;
            return false;
        }
        if (this.f25257e == null) {
            this.f25257e = AccountManager.get(zza());
        }
        try {
            Account[] result = this.f25257e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
            if (result == null || result.length <= 0) {
                Account[] result2 = this.f25257e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f25258f = Boolean.TRUE;
                    this.f25259g = a10;
                    return true;
                }
                this.f25259g = a10;
                this.f25258f = Boolean.FALSE;
                return false;
            }
            this.f25258f = Boolean.TRUE;
            this.f25259g = a10;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e10) {
            zzj().D().b("Exception checking account types", e10);
        }
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
