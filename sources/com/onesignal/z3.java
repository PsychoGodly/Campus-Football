package com.onesignal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.DeadSystemException;
import android.util.AndroidException;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: PackageInfoHelper.kt */
public final class z3 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f28487a = new a((h) null);

    /* compiled from: PackageInfoHelper.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final y a(Context context, String str, int i10) {
            m.e(context, "appContext");
            m.e(str, HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
            try {
                return new y(true, context.getPackageManager().getPackageInfo(str, i10));
            } catch (PackageManager.NameNotFoundException unused) {
                return new y(true, (PackageInfo) null);
            } catch (AndroidException e10) {
                if (e10 instanceof DeadSystemException) {
                    return new y(false, (PackageInfo) null);
                }
                throw e10;
            }
        }
    }
}
