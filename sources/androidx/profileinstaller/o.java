package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.concurrent.futures.d;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* compiled from: ProfileVerifier */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final d<c> f4309a = d.u();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f4310b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static c f4311c = null;

    /* compiled from: ProfileVerifier */
    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0));
        }
    }

    /* compiled from: ProfileVerifier */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f4312a;

        /* renamed from: b  reason: collision with root package name */
        final int f4313b;

        /* renamed from: c  reason: collision with root package name */
        final long f4314c;

        /* renamed from: d  reason: collision with root package name */
        final long f4315d;

        b(int i10, int i11, long j10, long j11) {
            this.f4312a = i10;
            this.f4313b = i11;
            this.f4314c = j10;
            this.f4315d = j11;
        }

        static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        public void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f4312a);
                dataOutputStream.writeInt(this.f4313b);
                dataOutputStream.writeLong(this.f4314c);
                dataOutputStream.writeLong(this.f4315d);
                dataOutputStream.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f4313b == bVar.f4313b && this.f4314c == bVar.f4314c && this.f4312a == bVar.f4312a && this.f4315d == bVar.f4315d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f4313b), Long.valueOf(this.f4314c), Integer.valueOf(this.f4312a), Long.valueOf(this.f4315d)});
        }
    }

    /* compiled from: ProfileVerifier */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final int f4316a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f4317b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f4318c;

        c(int i10, boolean z10, boolean z11) {
            this.f4316a = i10;
            this.f4318c = z11;
            this.f4317b = z10;
        }
    }

    private static long a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return a.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i10, boolean z10, boolean z11) {
        c cVar = new c(i10, z10, z11);
        f4311c = cVar;
        f4309a.q(cVar);
        return f4311c;
    }

    static c c(Context context, boolean z10) {
        b bVar;
        c cVar;
        if (!z10 && (cVar = f4311c) != null) {
            return cVar;
        }
        synchronized (f4310b) {
            if (!z10) {
                c cVar2 = f4311c;
                if (cVar2 != null) {
                    return cVar2;
                }
            }
            int i10 = Build.VERSION.SDK_INT;
            int i11 = 0;
            if (i10 >= 28) {
                if (i10 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z11 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z12 = file2.exists() && length2 > 0;
                    try {
                        long a10 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        b bVar2 = null;
                        if (file3.exists()) {
                            try {
                                bVar2 = b.a(file3);
                            } catch (IOException unused) {
                                return b(131072, z11, z12);
                            }
                        }
                        if (bVar2 != null && bVar2.f4314c == a10) {
                            int i12 = bVar2.f4313b;
                            if (i12 != 2) {
                                i11 = i12;
                                if (z10 && z12 && i11 != 1) {
                                    i11 = 2;
                                }
                                if (bVar2 != null && bVar2.f4313b == 2 && i11 == 1 && length < bVar2.f4315d) {
                                    i11 = 3;
                                }
                                bVar = new b(1, i11, a10, length2);
                                if (bVar2 == null || !bVar2.equals(bVar)) {
                                    bVar.b(file3);
                                }
                                c b10 = b(i11, z11, z12);
                                return b10;
                            }
                        }
                        if (z11) {
                            i11 = 1;
                        } else if (z12) {
                            i11 = 2;
                        }
                        i11 = 2;
                        i11 = 3;
                        bVar = new b(1, i11, a10, length2);
                        try {
                            bVar.b(file3);
                        } catch (IOException unused2) {
                            i11 = 196608;
                        }
                        c b102 = b(i11, z11, z12);
                        return b102;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        return b(65536, z11, z12);
                    }
                }
            }
            c b11 = b(262144, false, false);
            return b11;
        }
    }
}
