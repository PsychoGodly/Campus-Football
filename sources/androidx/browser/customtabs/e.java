package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import c.b;

/* compiled from: CustomTabsServiceConnection */
public abstract class e implements ServiceConnection {
    private Context mApplicationContext;

    /* compiled from: CustomTabsServiceConnection */
    class a extends c {
        a(b bVar, ComponentName componentName, Context context) {
            super(bVar, componentName, context);
        }
    }

    /* access modifiers changed from: package-private */
    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, c cVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.mApplicationContext != null) {
            onCustomTabsServiceConnected(componentName, new a(b.a.M0(iBinder), componentName, this.mApplicationContext));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }

    /* access modifiers changed from: package-private */
    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
