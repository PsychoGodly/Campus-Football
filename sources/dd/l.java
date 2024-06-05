package dd;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: Codec */
public interface l extends n, u {

    /* compiled from: Codec */
    public static final class a implements l {
        public String a() {
            return "gzip";
        }

        public InputStream b(InputStream inputStream) throws IOException {
            return new GZIPInputStream(inputStream);
        }

        public OutputStream c(OutputStream outputStream) throws IOException {
            return new GZIPOutputStream(outputStream);
        }
    }

    /* compiled from: Codec */
    public static final class b implements l {

        /* renamed from: a  reason: collision with root package name */
        public static final l f32286a = new b();

        private b() {
        }

        public String a() {
            return "identity";
        }

        public InputStream b(InputStream inputStream) {
            return inputStream;
        }

        public OutputStream c(OutputStream outputStream) {
            return outputStream;
        }
    }
}
