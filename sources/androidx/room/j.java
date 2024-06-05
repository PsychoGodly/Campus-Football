package androidx.room;

import a1.a;
import a1.d;
import android.content.Context;
import android.util.Log;
import c1.b;
import c1.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* compiled from: SQLiteCopyOpenHelper */
class j implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4779a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4780b;

    /* renamed from: c  reason: collision with root package name */
    private final File f4781c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4782d;

    /* renamed from: f  reason: collision with root package name */
    private final c f4783f;

    /* renamed from: g  reason: collision with root package name */
    private a f4784g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4785h;

    j(Context context, String str, File file, int i10, c cVar) {
        this.f4779a = context;
        this.f4780b = str;
        this.f4781c = file;
        this.f4782d = i10;
        this.f4783f = cVar;
    }

    private void h(File file) throws IOException {
        ReadableByteChannel readableByteChannel;
        if (this.f4780b != null) {
            readableByteChannel = Channels.newChannel(this.f4779a.getAssets().open(this.f4780b));
        } else if (this.f4781c != null) {
            readableByteChannel = new FileInputStream(this.f4781c).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f4779a.getCacheDir());
        createTempFile.deleteOnExit();
        d.a(readableByteChannel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        } else if (!createTempFile.renameTo(file)) {
            throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        }
    }

    private void j() {
        String databaseName = getDatabaseName();
        File databasePath = this.f4779a.getDatabasePath(databaseName);
        a aVar = this.f4784g;
        a aVar2 = new a(databaseName, this.f4779a.getFilesDir(), aVar == null || aVar.f4684j);
        try {
            aVar2.b();
            if (!databasePath.exists()) {
                h(databasePath);
                aVar2.c();
            } else if (this.f4784g == null) {
                aVar2.c();
            } else {
                try {
                    int c10 = a1.c.c(databasePath);
                    int i10 = this.f4782d;
                    if (c10 == i10) {
                        aVar2.c();
                    } else if (this.f4784g.a(c10, i10)) {
                        aVar2.c();
                    } else {
                        if (this.f4779a.deleteDatabase(databaseName)) {
                            try {
                                h(databasePath);
                            } catch (IOException e10) {
                                Log.w("ROOM", "Unable to copy database file.", e10);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar2.c();
                    }
                } catch (IOException e11) {
                    Log.w("ROOM", "Unable to read database version.", e11);
                    aVar2.c();
                }
            }
        } catch (IOException e12) {
            throw new RuntimeException("Unable to copy database file.", e12);
        } catch (Throwable th) {
            aVar2.c();
            throw th;
        }
    }

    public synchronized b U() {
        if (!this.f4785h) {
            j();
            this.f4785h = true;
        }
        return this.f4783f.U();
    }

    public synchronized void close() {
        this.f4783f.close();
        this.f4785h = false;
    }

    public String getDatabaseName() {
        return this.f4783f.getDatabaseName();
    }

    /* access modifiers changed from: package-private */
    public void i(a aVar) {
        this.f4784g = aVar;
    }

    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f4783f.setWriteAheadLoggingEnabled(z10);
    }
}
