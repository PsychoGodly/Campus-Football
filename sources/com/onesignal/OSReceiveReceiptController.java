package com.onesignal;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.e;
import androidx.work.g;
import androidx.work.q;
import androidx.work.r;
import androidx.work.z;
import com.onesignal.k3;
import com.onesignal.v3;
import java.util.concurrent.TimeUnit;

class OSReceiveReceiptController {

    /* renamed from: d  reason: collision with root package name */
    private static OSReceiveReceiptController f27506d;

    /* renamed from: a  reason: collision with root package name */
    private int f27507a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f27508b = 25;

    /* renamed from: c  reason: collision with root package name */
    private final o2 f27509c = k3.A0();

    public static class ReceiveReceiptWorker extends Worker {

        class a extends v3.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f27510a;

            a(String str) {
                this.f27510a = str;
            }

            /* access modifiers changed from: package-private */
            public void a(int i10, String str, Throwable th) {
                k3.r0 r0Var = k3.r0.ERROR;
                k3.a(r0Var, "Receive receipt failed with statusCode: " + i10 + " response: " + str);
            }

            /* access modifiers changed from: package-private */
            public void b(String str) {
                k3.r0 r0Var = k3.r0.DEBUG;
                k3.a(r0Var, "Receive receipt sent for notificationID: " + this.f27510a);
            }
        }

        public ReceiveReceiptWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        /* access modifiers changed from: package-private */
        public void a(String str) {
            String str2 = k3.f27916h;
            String F0 = (str2 == null || str2.isEmpty()) ? k3.F0() : k3.f27916h;
            String R0 = k3.R0();
            Integer num = null;
            n2 n2Var = new n2();
            try {
                num = Integer.valueOf(new OSUtils().e());
            } catch (NullPointerException e10) {
                e10.printStackTrace();
            }
            Integer num2 = num;
            k3.r0 r0Var = k3.r0.DEBUG;
            k3.a(r0Var, "ReceiveReceiptWorker: Device Type is: " + num2);
            n2Var.a(F0, R0, num2, str, new a(str));
        }

        public ListenableWorker.a doWork() {
            a(getInputData().l("os_notification_id"));
            return ListenableWorker.a.c();
        }
    }

    private OSReceiveReceiptController() {
    }

    public static synchronized OSReceiveReceiptController c() {
        OSReceiveReceiptController oSReceiveReceiptController;
        synchronized (OSReceiveReceiptController.class) {
            if (f27506d == null) {
                f27506d = new OSReceiveReceiptController();
            }
            oSReceiveReceiptController = f27506d;
        }
        return oSReceiveReceiptController;
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, String str) {
        if (!this.f27509c.k()) {
            k3.a(k3.r0.DEBUG, "sendReceiveReceipt disabled");
            return;
        }
        int j10 = OSUtils.j(this.f27507a, this.f27508b);
        e a10 = new e.a().h("os_notification_id", str).a();
        c b10 = b();
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.a(r0Var, "OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + str + " and delay: " + j10 + " seconds");
        z a11 = j3.a(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_receive_receipt");
        a11.e(sb2.toString(), g.KEEP, (r) ((r.a) ((r.a) ((r.a) new r.a(ReceiveReceiptWorker.class).f(b10)).g((long) j10, TimeUnit.SECONDS)).h(a10)).b());
    }

    /* access modifiers changed from: package-private */
    public c b() {
        return new c.a().b(q.CONNECTED).a();
    }
}
