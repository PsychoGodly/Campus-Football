package zc;

import android.app.Activity;
import android.util.Log;
import dc.a;
import ec.c;
import zc.a;

/* compiled from: UrlLauncherPlugin */
public final class j implements a, ec.a {

    /* renamed from: a  reason: collision with root package name */
    private i f39543a;

    public void onAttachedToActivity(c cVar) {
        i iVar = this.f39543a;
        if (iVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            iVar.l(cVar.getActivity());
        }
    }

    public void onAttachedToEngine(a.b bVar) {
        this.f39543a = new i(bVar.a());
        g.l(bVar.b(), this.f39543a);
    }

    public void onDetachedFromActivity() {
        i iVar = this.f39543a;
        if (iVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            iVar.l((Activity) null);
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        if (this.f39543a == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        g.l(bVar.b(), (a.c) null);
        this.f39543a = null;
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        onAttachedToActivity(cVar);
    }
}
