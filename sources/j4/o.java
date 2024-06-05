package j4;

import java.io.IOException;

/* compiled from: DataSourceUtil */
public final class o {
    public static void a(l lVar) {
        if (lVar != null) {
            try {
                lVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
