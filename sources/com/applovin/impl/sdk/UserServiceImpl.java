package com.applovin.impl.sdk;

import android.app.Activity;
import com.applovin.sdk.AppLovinUserService;

public class UserServiceImpl implements AppLovinUserService {

    /* renamed from: a  reason: collision with root package name */
    private final k f11471a;

    UserServiceImpl(k kVar) {
        this.f11471a = kVar;
    }

    public void preloadConsentDialog() {
        this.f11471a.s().g();
    }

    public void showConsentDialog(Activity activity, AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        this.f11471a.s().a(activity, onConsentDialogDismissListener);
    }

    public String toString() {
        return "UserService{}";
    }
}
