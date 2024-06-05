package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

public abstract class r {

    class a extends p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f11089a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f11090b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f11091c;

        a(Class cls, b bVar, q qVar) {
            this.f11089a = cls;
            this.f11090b = bVar;
            this.f11091c = qVar;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.f11089a.isInstance(activity)) {
                this.f11090b.a(activity);
            }
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f11089a.isInstance(activity) && !activity.isChangingConfigurations()) {
                this.f11091c.b(this);
            }
        }
    }

    public interface b {
        void a(Activity activity);
    }

    public static Activity a(View view) {
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static void a(boolean z10, Activity activity) {
        if (!z10 || !x3.b()) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        WindowInsetsController insetsController = activity.getWindow().getInsetsController();
        if (insetsController != null) {
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsets.Type.systemBars());
            return;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    public static boolean a(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isChangingConfigurations() || (x3.d() && activity.isDestroyed());
    }

    public static void a(Context context, Class cls) {
        Intent intent = new Intent(context, cls);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static void a(Context context, Class cls, q qVar, b bVar) {
        qVar.a(new a(cls, bVar, qVar));
        a(context, cls);
    }
}
