package a8;

import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-iid-interop@@17.1.0 */
public interface a {

    /* renamed from: a8.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.firebase:firebase-iid-interop@@17.1.0 */
    public interface C0255a {
        void a(String str);
    }

    void a(String str, String str2) throws IOException;

    void b(C0255a aVar);

    Task<String> c();

    String getToken();
}
