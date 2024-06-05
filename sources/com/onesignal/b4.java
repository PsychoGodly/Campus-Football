package com.onesignal;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.onesignal.a4;
import com.onesignal.k3;

/* compiled from: PushRegistratorADM */
public class b4 implements a4 {

    /* renamed from: a  reason: collision with root package name */
    private static a4.a f27573a = null;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static boolean f27574b = false;

    /* compiled from: PushRegistratorADM */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27575a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a4.a f27576b;

        a(Context context, a4.a aVar) {
            this.f27575a = context;
            this.f27576b = aVar;
        }

        public void run() {
            ADM adm = new ADM(this.f27575a);
            String registrationId = adm.getRegistrationId();
            if (registrationId == null) {
                adm.startRegister();
            } else {
                k3.r0 r0Var = k3.r0.DEBUG;
                k3.a(r0Var, "ADM Already registered with ID:" + registrationId);
                this.f27576b.a(registrationId, 1);
            }
            try {
                Thread.sleep(30000);
            } catch (InterruptedException unused) {
            }
            if (!b4.f27574b) {
                k3.a(k3.r0.ERROR, "com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.");
                b4.c((String) null);
            }
        }
    }

    public static void c(String str) {
        a4.a aVar = f27573a;
        if (aVar != null) {
            f27574b = true;
            aVar.a(str, 1);
        }
    }

    public void a(Context context, String str, a4.a aVar) {
        f27573a = aVar;
        new Thread(new a(context, aVar)).start();
    }
}
