package g;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: ActivityResultContracts.kt */
public final class c extends a<Intent, androidx.activity.result.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18090a = new a((h) null);

    /* compiled from: ActivityResultContracts.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* renamed from: d */
    public Intent a(Context context, Intent intent) {
        m.e(context, "context");
        m.e(intent, "input");
        return intent;
    }

    /* renamed from: e */
    public androidx.activity.result.a c(int i10, Intent intent) {
        return new androidx.activity.result.a(i10, intent);
    }
}
