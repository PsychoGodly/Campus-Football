package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.q0;
import d7.d0;
import d7.g1;
import d7.o;
import y6.l;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class i2 implements OnCompleteListener<g1> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ p0 f26236a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f26237b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f26238c;

    i2(FirebaseAuth firebaseAuth, p0 p0Var, String str) {
        this.f26238c = firebaseAuth;
        this.f26236a = p0Var;
        this.f26237b = str;
    }

    public final void onComplete(Task<g1> task) {
        String str;
        String str2;
        if (!task.isSuccessful()) {
            String str3 = "Error while validating application identity: ";
            Exception exception = task.getException();
            if (exception != null) {
                str3 = str3 + exception.getMessage();
            }
            Log.e("FirebaseAuth", str3);
            if (exception == null || !d0.f(exception)) {
                Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                str2 = null;
                str = null;
            } else {
                FirebaseAuth.l0((l) exception, this.f26236a, this.f26237b);
                return;
            }
        } else {
            String c10 = task.getResult().c();
            str = task.getResult().a();
            str2 = c10;
        }
        long longValue = this.f26236a.h().longValue();
        q0.b a02 = this.f26238c.c0(this.f26236a.i(), this.f26236a.f());
        if (TextUtils.isEmpty(str2)) {
            a02 = this.f26238c.b0(this.f26236a, a02);
        }
        q0.b bVar = a02;
        o oVar = (o) q.k(this.f26236a.d());
        if (oVar.zzd()) {
            this.f26238c.f26151e.zza(oVar, (String) q.k(this.f26236a.i()), this.f26238c.f26155i, longValue, this.f26236a.e() != null, this.f26236a.l(), str2, str, this.f26238c.J0(), bVar, this.f26236a.j(), this.f26236a.a());
        } else {
            this.f26238c.f26151e.zza(oVar, (t0) q.k(this.f26236a.g()), this.f26238c.f26155i, longValue, this.f26236a.e() != null, this.f26236a.l(), str2, str, this.f26238c.J0(), bVar, this.f26236a.j(), this.f26236a.a());
        }
    }
}
