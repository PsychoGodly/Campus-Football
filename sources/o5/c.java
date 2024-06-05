package o5;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f21084b = new c();

    /* renamed from: a  reason: collision with root package name */
    private b f21085a = null;

    public static b a(Context context) {
        return f21084b.b(context);
    }

    public final synchronized b b(Context context) {
        if (this.f21085a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f21085a = new b(context);
        }
        return this.f21085a;
    }
}
