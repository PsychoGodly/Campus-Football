package d7;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import androidx.browser.customtabs.d;
import com.google.android.gms.internal.p001firebaseauthapi.zzacj;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.GenericIdpActivity;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final /* synthetic */ class g0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ GenericIdpActivity f28556a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f28557b;

    public /* synthetic */ g0(GenericIdpActivity genericIdpActivity, String str) {
        this.f28556a = genericIdpActivity;
        this.f28557b = str;
    }

    public final void onComplete(Task task) {
        GenericIdpActivity genericIdpActivity = this.f28556a;
        String str = this.f28557b;
        boolean z10 = false;
        if (genericIdpActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
            List<ResolveInfo> queryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                z10 = true;
            }
            if (z10) {
                d b10 = new d.b().b();
                Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
                b10.b(genericIdpActivity, (Uri) task.getResult());
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
            intent.putExtra("com.android.browser.application_id", str);
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            genericIdpActivity.startActivity(intent);
            return;
        }
        Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
        zzacj.zzb(genericIdpActivity, str);
    }
}
