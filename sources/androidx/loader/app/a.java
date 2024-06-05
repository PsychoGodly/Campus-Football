package androidx.loader.app;

import androidx.lifecycle.p;
import androidx.lifecycle.p0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager */
public abstract class a {
    public static <T extends p & p0> a b(T t10) {
        return new b(t10, ((p0) t10).getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
