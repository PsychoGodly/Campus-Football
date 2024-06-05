package com.onesignal;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.applovin.mediation.MaxReward;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: OSNotificationDataController */
class z1 extends s0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final r3 f28468a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final v1 f28469b;

    /* compiled from: OSNotificationDataController */
    class a extends k {
        a() {
        }

        public void run() {
            super.run();
            z1.this.f28468a.n("notification", "created_time < ?", new String[]{String.valueOf((k3.N0().b() / 1000) - 604800)});
        }
    }

    /* compiled from: OSNotificationDataController */
    class b extends k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f28471a;

        b(WeakReference weakReference) {
            this.f28471a = weakReference;
        }

        public void run() {
            super.run();
            Context context = (Context) this.f28471a.get();
            if (context != null) {
                NotificationManager i10 = s3.i(context);
                Cursor j10 = z1.this.f28468a.j("notification", new String[]{"android_notification_id"}, "dismissed = 0 AND opened = 0", (String[]) null, (String) null, (String) null, (String) null);
                if (j10.moveToFirst()) {
                    do {
                        i10.cancel(j10.getInt(j10.getColumnIndex("android_notification_id")));
                    } while (j10.moveToNext());
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", 1);
                z1.this.f28468a.h("notification", contentValues, "opened = 0", (String[]) null);
                l.d(0, context);
                j10.close();
            }
        }
    }

    /* compiled from: OSNotificationDataController */
    class c extends k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f28473a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f28474b;

        c(WeakReference weakReference, int i10) {
            this.f28473a = weakReference;
            this.f28474b = i10;
        }

        public void run() {
            super.run();
            Context context = (Context) this.f28473a.get();
            if (context != null) {
                String str = "android_notification_id = " + this.f28474b + " AND " + "opened" + " = 0 AND " + "dismissed" + " = 0";
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", 1);
                if (z1.this.f28468a.h("notification", contentValues, str, (String[]) null) > 0) {
                    r0.e(context, z1.this.f28468a, this.f28474b);
                }
                l.c(z1.this.f28468a, context);
                s3.i(context).cancel(this.f28474b);
            }
        }
    }

    /* compiled from: OSNotificationDataController */
    class d extends k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f28476a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f28477b;

        d(String str, e eVar) {
            this.f28476a = str;
            this.f28477b = eVar;
        }

        public void run() {
            super.run();
            boolean z10 = true;
            String[] strArr = {this.f28476a};
            Cursor j10 = z1.this.f28468a.j("notification", new String[]{"notification_id"}, "notification_id = ?", strArr, (String) null, (String) null, (String) null);
            boolean moveToFirst = j10.moveToFirst();
            j10.close();
            if (moveToFirst) {
                v1 f10 = z1.this.f28469b;
                f10.d("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + this.f28476a);
            } else {
                z10 = false;
            }
            this.f28477b.a(z10);
        }
    }

    /* compiled from: OSNotificationDataController */
    interface e {
        void a(boolean z10);
    }

    public z1(r3 r3Var, v1 v1Var) {
        this.f28468a = r3Var;
        this.f28469b = v1Var;
    }

    private void g() {
        d(new a(), "OS_NOTIFICATIONS_THREAD");
    }

    private void j(String str, e eVar) {
        if (str == null || MaxReward.DEFAULT_LABEL.equals(str)) {
            eVar.a(false);
        } else if (!OSNotificationWorkManager.a(str)) {
            this.f28469b.d("Notification notValidOrDuplicated with id duplicated");
            eVar.a(true);
        } else {
            d(new d(str, eVar), "OS_NOTIFICATIONS_THREAD");
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        g();
    }

    /* access modifiers changed from: package-private */
    public void i(WeakReference<Context> weakReference) {
        d(new b(weakReference), "OS_NOTIFICATIONS_THREAD");
    }

    /* access modifiers changed from: package-private */
    public void k(JSONObject jSONObject, e eVar) {
        String b10 = a2.b(jSONObject);
        if (b10 == null) {
            this.f28469b.d("Notification notValidOrDuplicated with id null");
            eVar.a(true);
            return;
        }
        j(b10, eVar);
    }

    /* access modifiers changed from: package-private */
    public void l(int i10, WeakReference<Context> weakReference) {
        d(new c(weakReference, i10), "OS_NOTIFICATIONS_THREAD");
    }
}
