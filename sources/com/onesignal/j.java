package com.onesignal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.DeadSystemException;
import android.util.AndroidException;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: ApplicationInfoHelper.kt */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f27861a = new a((h) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static ApplicationInfo f27862b;

    /* compiled from: ApplicationInfoHelper.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final ApplicationInfo a(Context context) {
            m.e(context, "context");
            if (j.f27862b != null) {
                return j.f27862b;
            }
            try {
                j.f27862b = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                return j.f27862b;
            } catch (AndroidException e10) {
                if (e10 instanceof DeadSystemException) {
                    return null;
                }
                throw e10;
            }
        }
    }
}
