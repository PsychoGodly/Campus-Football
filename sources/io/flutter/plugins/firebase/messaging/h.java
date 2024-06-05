package io.flutter.plugins.firebase.messaging;

import android.app.Activity;
import androidx.core.app.b;
import java.util.ArrayList;
import lc.p;

/* compiled from: FlutterFirebasePermissionManager */
class h implements p {

    /* renamed from: a  reason: collision with root package name */
    private final int f33892a = 240;

    /* renamed from: b  reason: collision with root package name */
    private a f33893b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f33894c = false;

    @FunctionalInterface
    /* compiled from: FlutterFirebasePermissionManager */
    interface a {
        void a(int i10);
    }

    h() {
    }

    public void a(Activity activity, a aVar, a aVar2) {
        if (this.f33894c) {
            aVar2.onError("A request for permissions is already running, please wait for it to finish before doing another request.");
        } else if (activity == null) {
            aVar2.onError("Unable to detect current Android Activity.");
        } else {
            this.f33893b = aVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.POST_NOTIFICATIONS");
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (!this.f33894c) {
                b.g(activity, strArr, 240);
                this.f33894c = true;
            }
        }
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        a aVar;
        int i11 = 0;
        if (!this.f33894c || i10 != 240 || (aVar = this.f33893b) == null) {
            return false;
        }
        this.f33894c = false;
        if (iArr.length > 0 && iArr[0] == 0) {
            i11 = 1;
        }
        aVar.a(i11);
        return true;
    }
}
