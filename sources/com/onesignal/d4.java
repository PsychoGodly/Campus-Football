package com.onesignal;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.k3;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import y6.f;
import y6.n;

/* compiled from: PushRegistratorFCM */
class d4 extends c4 {

    /* renamed from: f  reason: collision with root package name */
    private f f27649f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f27650g;

    /* renamed from: h  reason: collision with root package name */
    private final a f27651h;

    /* compiled from: PushRegistratorFCM */
    static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f27652a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final String f27653b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final String f27654c;

        a() {
            this((String) null, (String) null, (String) null);
        }

        a(String str, String str2, String str3) {
            this.f27652a = str == null ? "onesignal-shared-public" : str;
            this.f27653b = str2 == null ? "1:754795614042:android:c682b8144a8dd52bc1ad63" : str2;
            this.f27654c = str3 == null ? new String(Base64.decode("QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV", 0)) : str3;
        }
    }

    d4(Context context, a aVar) {
        this.f27650g = context;
        if (aVar == null) {
            this.f27651h = new a();
        } else {
            this.f27651h = aVar;
        }
    }

    @Deprecated
    private String l(String str) throws IOException {
        Class<String> cls = String.class;
        Class<FirebaseInstanceId> cls2 = FirebaseInstanceId.class;
        try {
            int i10 = FirebaseInstanceId.f26596m;
            Object invoke = cls2.getMethod("getInstance", new Class[]{f.class}).invoke((Object) null, new Object[]{this.f27649f});
            return (String) invoke.getClass().getMethod("getToken", new Class[]{cls, cls}).invoke(invoke, new Object[]{str, "FCM"});
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new Error("Reflection error on FirebaseInstanceId.getInstance(firebaseApp).getToken(senderId, FirebaseMessaging.INSTANCE_ID_SCOPE)", e10);
        }
    }

    private String m() throws Exception {
        Task u10 = ((FirebaseMessaging) this.f27649f.k(FirebaseMessaging.class)).u();
        try {
            return (String) Tasks.await(u10);
        } catch (ExecutionException unused) {
            throw u10.getException();
        }
    }

    private void n(String str) {
        if (this.f27649f == null) {
            this.f27649f = f.w(this.f27650g, new n.b().f(str).c(this.f27651h.f27653b).b(this.f27651h.f27654c).g(this.f27651h.f27652a).a(), "ONESIGNAL_SDK_FCM_APP_NAME");
        }
    }

    /* access modifiers changed from: package-private */
    public String f() {
        return "FCM";
    }

    /* access modifiers changed from: package-private */
    public String g(String str) throws Exception {
        n(str);
        try {
            return m();
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
            k3.a(k3.r0.INFO, "FirebaseMessaging.getToken not found, attempting to use FirebaseInstanceId.getToken");
            return l(str);
        }
    }
}
