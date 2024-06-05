package j4;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: DataSource */
public interface l extends i {

    /* compiled from: DataSource */
    public interface a {
        l a();
    }

    void close() throws IOException;

    void e(p0 p0Var);

    long f(p pVar) throws IOException;

    Map<String, List<String>> k();

    Uri o();
}
