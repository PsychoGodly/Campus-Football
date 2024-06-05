package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import com.applovin.impl.sdk.ad.b;
import com.applovin.sdk.AppLovinSdkUtils;

public class vg {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f12741a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12742b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12743c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12744d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f12745e;

    public vg(Activity activity) {
        this.f12741a = activity;
        int c10 = zp.c((Context) activity);
        this.f12743c = c10;
        boolean isTablet = AppLovinSdkUtils.isTablet(activity);
        this.f12744d = isTablet;
        this.f12742b = a(c10, isTablet);
        this.f12745e = isTablet && 2 == a((Context) activity);
    }

    private int a(int i10, boolean z10) {
        if (!z10 || !this.f12745e) {
            if (i10 == 0) {
                return 1;
            }
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 9;
            }
            return i10 == 3 ? 8 : -1;
        } else if (i10 == 0) {
            return 0;
        } else {
            if (i10 == 1) {
                return 9;
            }
            if (i10 == 2) {
                return 8;
            }
            return i10 == 3 ? 1 : -1;
        }
    }

    private static int a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) {
            return 2;
        }
        return 1;
    }

    public void a(b bVar) {
        int i10;
        if (!bVar.C0() || (i10 = this.f12742b) == -1) {
            a(bVar.d0());
        } else {
            a(i10);
        }
    }

    private void a(b.c cVar) {
        int i10 = 1;
        if (cVar == b.c.ACTIVITY_PORTRAIT) {
            if (!this.f12744d || !this.f12745e) {
                int i11 = this.f12743c;
                if (i11 == 0 || i11 == 2) {
                    if (i11 != 0) {
                        i10 = 9;
                    }
                    a(i10);
                    return;
                }
                a(1);
                return;
            }
            int i12 = this.f12743c;
            if (i12 != 1 && i12 != 3) {
                a(1);
            } else if (i12 == 1) {
                a(9);
            } else {
                a(1);
            }
        } else if (cVar == b.c.ACTIVITY_LANDSCAPE) {
            int i13 = 8;
            if (!this.f12744d || !this.f12745e) {
                int i14 = this.f12743c;
                if (i14 == 1 || i14 == 3) {
                    if (i14 == 1) {
                        i13 = 0;
                    }
                    a(i13);
                    return;
                }
                a(0);
                return;
            }
            int i15 = this.f12743c;
            if (i15 == 0 || i15 == 2) {
                if (i15 != 2) {
                    i13 = 0;
                }
                a(i13);
                return;
            }
            a(0);
        }
    }

    private void a(int i10) {
        try {
            this.f12741a.setRequestedOrientation(i10);
        } catch (Throwable unused) {
        }
    }
}
