package g0;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.m;

/* compiled from: DataStoreFile.kt */
public final class a {
    public static final File a(Context context, String str) {
        m.e(context, "<this>");
        m.e(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), m.m("datastore/", str));
    }
}
