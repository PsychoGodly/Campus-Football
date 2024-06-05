package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public final class UploadDataProviders {

    static class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ File f36810a;

        a(File file) {
            this.f36810a = file;
        }

        public FileChannel getChannel() throws IOException {
            return new FileInputStream(this.f36810a).getChannel();
        }
    }

    static class b implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptor f36811a;

        b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f36811a = parcelFileDescriptor;
        }

        public FileChannel getChannel() throws IOException {
            if (this.f36811a.getStatSize() != -1) {
                return new ParcelFileDescriptor.AutoCloseInputStream(this.f36811a).getChannel();
            }
            this.f36811a.close();
            throw new IllegalArgumentException("Not a file: " + this.f36811a);
        }
    }

    private static final class c extends UploadDataProvider {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f36812a;

        /* synthetic */ c(ByteBuffer byteBuffer, a aVar) {
            this(byteBuffer);
        }

        public long getLength() {
            return (long) this.f36812a.limit();
        }

        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (byteBuffer.hasRemaining()) {
                if (byteBuffer.remaining() >= this.f36812a.remaining()) {
                    byteBuffer.put(this.f36812a);
                } else {
                    int limit = this.f36812a.limit();
                    ByteBuffer byteBuffer2 = this.f36812a;
                    byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
                    byteBuffer.put(this.f36812a);
                    this.f36812a.limit(limit);
                }
                uploadDataSink.onReadSucceeded(false);
                return;
            }
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }

        public void rewind(UploadDataSink uploadDataSink) {
            this.f36812a.position(0);
            uploadDataSink.onRewindSucceeded();
        }

        private c(ByteBuffer byteBuffer) {
            this.f36812a = byteBuffer;
        }
    }

    private interface d {
        FileChannel getChannel() throws IOException;
    }

    private static final class e extends UploadDataProvider {

        /* renamed from: a  reason: collision with root package name */
        private volatile FileChannel f36813a;

        /* renamed from: b  reason: collision with root package name */
        private final d f36814b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f36815c;

        /* synthetic */ e(d dVar, a aVar) {
            this(dVar);
        }

        private FileChannel h() throws IOException {
            if (this.f36813a == null) {
                synchronized (this.f36815c) {
                    if (this.f36813a == null) {
                        this.f36813a = this.f36814b.getChannel();
                    }
                }
            }
            return this.f36813a;
        }

        public void close() throws IOException {
            FileChannel fileChannel = this.f36813a;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        public long getLength() throws IOException {
            return h().size();
        }

        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasRemaining()) {
                FileChannel h10 = h();
                int i10 = 0;
                while (i10 == 0) {
                    int read = h10.read(byteBuffer);
                    if (read == -1) {
                        break;
                    }
                    i10 += read;
                }
                uploadDataSink.onReadSucceeded(false);
                return;
            }
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }

        public void rewind(UploadDataSink uploadDataSink) throws IOException {
            h().position(0);
            uploadDataSink.onRewindSucceeded();
        }

        private e(d dVar) {
            this.f36815c = new Object();
            this.f36814b = dVar;
        }
    }

    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new e(new a(file), (a) null);
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new e(new b(parcelFileDescriptor), (a) null);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new c(byteBuffer.slice(), (a) null);
    }

    public static UploadDataProvider create(byte[] bArr, int i10, int i11) {
        return new c(ByteBuffer.wrap(bArr, i10, i11).slice(), (a) null);
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
