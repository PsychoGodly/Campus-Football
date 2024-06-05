package y7;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/* compiled from: FileUtil */
public class s {

    /* compiled from: FileUtil */
    private static class a {
        public static void a(File file) throws IOException {
            try {
                Files.deleteIfExists(file.toPath());
            } catch (IOException e10) {
                throw new IOException("Failed to delete file " + file + ": " + e10);
            }
        }
    }

    /* compiled from: FileUtil */
    private static class b {
        public static void a(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException("Failed to delete file " + file);
            }
        }
    }

    public static void a(File file) throws IOException {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(file);
        } else {
            b.a(file);
        }
    }
}
