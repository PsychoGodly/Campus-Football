package c1;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* compiled from: SupportSQLiteDatabase */
public interface b extends Closeable {
    void O();

    void Q(String str, Object[] objArr) throws SQLException;

    Cursor V(String str);

    void a0();

    Cursor f0(e eVar, CancellationSignal cancellationSignal);

    boolean isOpen();

    void k();

    List<Pair<String, String>> o();

    String o0();

    boolean q0();

    void s(String str) throws SQLException;

    Cursor s0(e eVar);

    f x(String str);
}
