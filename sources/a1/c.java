package a1;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.room.h;
import c1.b;
import c1.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* compiled from: DBUtil */
public class c {
    /* JADX INFO: finally extract failed */
    public static void a(b bVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor V = bVar.V("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (V.moveToNext()) {
            try {
                arrayList.add(V.getString(0));
            } catch (Throwable th) {
                V.close();
                throw th;
            }
        }
        V.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.s("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor b(h hVar, e eVar, boolean z10, CancellationSignal cancellationSignal) {
        Cursor q10 = hVar.q(eVar, cancellationSignal);
        if (!z10 || !(q10 instanceof AbstractWindowedCursor)) {
            return q10;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) q10;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? b.a(abstractWindowedCursor) : q10;
    }

    public static int c(File file) throws IOException {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel = new FileInputStream(file).getChannel();
            fileChannel.tryLock(60, 4, true);
            fileChannel.position(60);
            if (fileChannel.read(allocate) == 4) {
                allocate.rewind();
                int i10 = allocate.getInt();
                fileChannel.close();
                return i10;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th;
        }
    }
}
