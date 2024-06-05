package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.onesignal.a;
import java.util.HashMap;

public class PermissionsActivity extends Activity {

    /* renamed from: c  reason: collision with root package name */
    private static final String f27525c = "com.onesignal.PermissionsActivity";

    /* renamed from: d  reason: collision with root package name */
    private static boolean f27526d;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f27527f;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f27528g;

    /* renamed from: h  reason: collision with root package name */
    private static a.b f27529h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final HashMap<String, c> f27530i = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f27531a;

    /* renamed from: b  reason: collision with root package name */
    private String f27532b;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int[] f27533a;

        a(int[] iArr) {
            this.f27533a = iArr;
        }

        public void run() {
            int[] iArr = this.f27533a;
            boolean z10 = false;
            if (iArr.length > 0 && iArr[0] == 0) {
                z10 = true;
            }
            c cVar = (c) PermissionsActivity.f27530i.get(PermissionsActivity.this.f27531a);
            if (cVar == null) {
                throw new RuntimeException("Missing handler for permissionRequestType: " + PermissionsActivity.this.f27531a);
            } else if (z10) {
                cVar.a();
            } else {
                cVar.b(PermissionsActivity.this.h());
            }
        }
    }

    class b extends a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f27535a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f27536b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Class f27537c;

        b(String str, String str2, Class cls) {
            this.f27535a = str;
            this.f27536b = str2;
            this.f27537c = cls;
        }

        public void a(Activity activity) {
            Class<PermissionsActivity> cls = PermissionsActivity.class;
            if (!activity.getClass().equals(cls)) {
                Intent intent = new Intent(activity, cls);
                intent.setFlags(131072);
                intent.putExtra("INTENT_EXTRA_PERMISSION_TYPE", this.f27535a).putExtra("INTENT_EXTRA_ANDROID_PERMISSION_STRING", this.f27536b).putExtra("INTENT_EXTRA_CALLBACK_CLASS", this.f27537c.getName());
                activity.startActivity(intent);
                activity.overridePendingTransition(f4.onesignal_fade_in, f4.onesignal_fade_out);
            }
        }
    }

    interface c {
        void a();

        void b(boolean z10);
    }

    private void d(Bundle bundle) {
        if (Build.VERSION.SDK_INT < 23) {
            finish();
            overridePendingTransition(f4.onesignal_fade_in, f4.onesignal_fade_out);
            return;
        }
        g(bundle);
        this.f27531a = bundle.getString("INTENT_EXTRA_PERMISSION_TYPE");
        String string = bundle.getString("INTENT_EXTRA_ANDROID_PERMISSION_STRING");
        this.f27532b = string;
        f(string);
    }

    public static void e(String str, c cVar) {
        f27530i.put(str, cVar);
    }

    private void f(String str) {
        if (!f27526d) {
            f27526d = true;
            f27528g = !f.b(this, str);
            f.a(this, new String[]{str}, 2);
        }
    }

    private void g(Bundle bundle) {
        String string = bundle.getString("INTENT_EXTRA_CALLBACK_CLASS");
        try {
            Class.forName(string);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Could not find callback class for PermissionActivity: " + string);
        }
    }

    /* access modifiers changed from: private */
    public boolean h() {
        return f27527f && f27528g && !f.b(this, this.f27532b);
    }

    static void i(boolean z10, String str, String str2, Class<?> cls) {
        if (!f27526d) {
            f27527f = z10;
            f27529h = new b(str, str2, cls);
            a b10 = b.b();
            if (b10 != null) {
                b10.c(f27525c, f27529h);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k3.e1(this);
        d(getIntent().getExtras());
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d(intent.getExtras());
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        f27526d = false;
        if (i10 == 2) {
            new Handler().postDelayed(new a(iArr), 500);
        }
        a b10 = b.b();
        if (b10 != null) {
            b10.r(f27525c);
        }
        finish();
        overridePendingTransition(f4.onesignal_fade_in, f4.onesignal_fade_out);
    }
}
