package com.onesignal;

import org.json.JSONException;

/* compiled from: UserStatePush */
class r4 extends o4 {
    r4(String str, boolean z10) {
        super(str, z10);
    }

    private int B() {
        int d10 = i().d("subscribableStatus", 1);
        if (d10 < -2) {
            return d10;
        }
        if (!i().c("androidPermission", true)) {
            return 0;
        }
        return !i().c("userSubscribePref", true) ? -2 : 1;
    }

    /* access modifiers changed from: protected */
    public void a() {
        try {
            t("notification_types", Integer.valueOf(B()));
        } catch (JSONException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public o4 p(String str) {
        return new r4(str, false);
    }
}
