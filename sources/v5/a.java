package v5;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.m0;
import com.google.android.gms.common.internal.o0;
import com.google.android.gms.common.internal.q;
import h5.b;
import u5.f;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class a extends g<g> implements f {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f30675f = 0;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f30676a = true;

    /* renamed from: b  reason: collision with root package name */
    private final d f30677b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f30678c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f30679d;

    public a(Context context, Looper looper, boolean z10, d dVar, Bundle bundle, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        super(context, looper, 44, dVar, bVar, cVar);
        this.f30677b = dVar;
        this.f30678c = bundle;
        this.f30679d = dVar.g();
    }

    public static Bundle e(d dVar) {
        dVar.f();
        Integer g10 = dVar.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.a());
        if (g10 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", g10.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    public final void a(f fVar) {
        q.l(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b10 = this.f30677b.b();
            ((g) getService()).B1(new j(1, new m0(b10, ((Integer) q.k(this.f30679d)).intValue(), c.DEFAULT_ACCOUNT.equals(b10.name) ? e5.a.a(getContext()).b() : null)), fVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.Q0(new l(1, new b(8, (PendingIntent) null), (o0) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    public final void b(j jVar, boolean z10) {
        try {
            ((g) getService()).A1(jVar, ((Integer) q.k(this.f30679d)).intValue(), z10);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void c() {
        try {
            ((g) getService()).M0(((Integer) q.k(this.f30679d)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    public final void d() {
        connect(new c.d());
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f30677b.d())) {
            this.f30678c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f30677b.d());
        }
        return this.f30678c;
    }

    public final int getMinApkVersion() {
        return h5.j.f18843a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public final boolean requiresSignIn() {
        return this.f30676a;
    }
}
