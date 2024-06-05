package w1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/* compiled from: AppSettingsManager */
final class a {

    @FunctionalInterface
    /* renamed from: w1.a$a  reason: collision with other inner class name */
    /* compiled from: AppSettingsManager */
    interface C0244a {
        void a(boolean z10);
    }

    a() {
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, C0244a aVar, b bVar) {
        if (context == null) {
            Log.d("permissions_handler", "Context cannot be null.");
            bVar.onError("PermissionHandler.AppSettingsManager", "Android context cannot be null.");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            context.startActivity(intent);
            aVar.a(true);
        } catch (Exception unused) {
            aVar.a(false);
        }
    }
}
