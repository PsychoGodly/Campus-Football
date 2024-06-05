package ca;

import android.app.UiModeManager;
import android.content.Context;
import x9.g;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static UiModeManager f24312a;

    public static g a() {
        UiModeManager uiModeManager = f24312a;
        if (uiModeManager == null) {
            return g.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? g.OTHER : g.CTV : g.MOBILE;
    }

    public static void b(Context context) {
        if (context != null) {
            f24312a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
