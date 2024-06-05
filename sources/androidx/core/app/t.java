package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder */
public final class t implements Iterable<Intent> {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Intent> f2835a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final Context f2836b;

    /* compiled from: TaskStackBuilder */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private t(Context context) {
        this.f2836b = context;
    }

    public static t f(Context context) {
        return new t(context);
    }

    public t b(Intent intent) {
        this.f2835a.add(intent);
        return this;
    }

    public t c(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = j.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f2836b.getPackageManager());
            }
            e(component);
            b(supportParentActivityIntent);
        }
        return this;
    }

    public t e(ComponentName componentName) {
        int size = this.f2835a.size();
        try {
            Intent b10 = j.b(this.f2836b, componentName);
            while (b10 != null) {
                this.f2835a.add(size, b10);
                b10 = j.b(this.f2836b, b10.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public void g() {
        h((Bundle) null);
    }

    public void h(Bundle bundle) {
        if (!this.f2835a.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f2835a.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!androidx.core.content.a.startActivities(this.f2836b, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f2836b.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f2835a.iterator();
    }
}
