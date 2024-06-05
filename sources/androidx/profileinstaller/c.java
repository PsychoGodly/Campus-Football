package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: DeviceProfileWriter */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f4269a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f4270b;

    /* renamed from: c  reason: collision with root package name */
    private final i.c f4271c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f4272d;

    /* renamed from: e  reason: collision with root package name */
    private final File f4273e;

    /* renamed from: f  reason: collision with root package name */
    private final String f4274f;

    /* renamed from: g  reason: collision with root package name */
    private final String f4275g;

    /* renamed from: h  reason: collision with root package name */
    private final String f4276h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f4277i = false;

    /* renamed from: j  reason: collision with root package name */
    private d[] f4278j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f4279k;

    public c(AssetManager assetManager, Executor executor, i.c cVar, String str, String str2, String str3, File file) {
        this.f4269a = assetManager;
        this.f4270b = executor;
        this.f4271c = cVar;
        this.f4274f = str;
        this.f4275g = str2;
        this.f4276h = str3;
        this.f4273e = file;
        this.f4272d = d();
    }

    private c b(d[] dVarArr, byte[] bArr) {
        InputStream h10;
        try {
            h10 = h(this.f4269a, this.f4276h);
            if (h10 != null) {
                this.f4278j = n.q(h10, n.o(h10, n.f4308b), bArr, dVarArr);
                h10.close();
                return this;
            }
            if (h10 != null) {
                h10.close();
            }
            return null;
        } catch (FileNotFoundException e10) {
            this.f4271c.b(9, e10);
        } catch (IOException e11) {
            this.f4271c.b(7, e11);
        } catch (IllegalStateException e12) {
            this.f4278j = null;
            this.f4271c.b(8, e12);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private void c() {
        if (!this.f4277i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 || i10 > 33) {
            return null;
        }
        switch (i10) {
            case 24:
            case 25:
                return p.f4323e;
            case 26:
                return p.f4322d;
            case 27:
                return p.f4321c;
            case 28:
            case 29:
            case 30:
                return p.f4320b;
            case 31:
            case 32:
            case 33:
                return p.f4319a;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.f4275g);
        } catch (FileNotFoundException e10) {
            this.f4271c.b(6, e10);
            return null;
        } catch (IOException e11) {
            this.f4271c.b(7, e11);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(int i10, Object obj) {
        this.f4271c.b(i10, obj);
    }

    private InputStream h(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f4271c.a(5, (Object) null);
            return null;
        }
    }

    private d[] j(InputStream inputStream) {
        try {
            d[] w10 = n.w(inputStream, n.o(inputStream, n.f4307a), this.f4274f);
            try {
                inputStream.close();
                return w10;
            } catch (IOException e10) {
                this.f4271c.b(7, e10);
                return w10;
            }
        } catch (IOException e11) {
            this.f4271c.b(7, e11);
            inputStream.close();
            return null;
        } catch (IllegalStateException e12) {
            this.f4271c.b(8, e12);
            try {
                inputStream.close();
            } catch (IOException e13) {
                this.f4271c.b(7, e13);
            }
            return null;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e14) {
                this.f4271c.b(7, e14);
            }
            throw th;
        }
    }

    private static boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 || i10 > 33) {
            return false;
        }
        if (!(i10 == 24 || i10 == 25)) {
            switch (i10) {
                case 31:
                case 32:
                case 33:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private void l(int i10, Object obj) {
        this.f4270b.execute(new b(this, i10, obj));
    }

    public boolean e() {
        if (this.f4272d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        } else if (!this.f4273e.canWrite()) {
            l(4, (Object) null);
            return false;
        } else {
            this.f4277i = true;
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r0 = b(r0, r2.f4272d);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.profileinstaller.c i() {
        /*
            r2 = this;
            r2.c()
            byte[] r0 = r2.f4272d
            if (r0 != 0) goto L_0x0008
            return r2
        L_0x0008:
            android.content.res.AssetManager r0 = r2.f4269a
            java.io.InputStream r0 = r2.f(r0)
            if (r0 == 0) goto L_0x0016
            androidx.profileinstaller.d[] r0 = r2.j(r0)
            r2.f4278j = r0
        L_0x0016:
            androidx.profileinstaller.d[] r0 = r2.f4278j
            if (r0 == 0) goto L_0x0029
            boolean r1 = k()
            if (r1 == 0) goto L_0x0029
            byte[] r1 = r2.f4272d
            androidx.profileinstaller.c r0 = r2.b(r0, r1)
            if (r0 == 0) goto L_0x0029
            return r0
        L_0x0029:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.c.i():androidx.profileinstaller.c");
    }

    public c m() {
        ByteArrayOutputStream byteArrayOutputStream;
        d[] dVarArr = this.f4278j;
        byte[] bArr = this.f4272d;
        if (!(dVarArr == null || bArr == null)) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                n.E(byteArrayOutputStream, bArr);
                if (!n.B(byteArrayOutputStream, bArr, dVarArr)) {
                    this.f4271c.b(5, (Object) null);
                    this.f4278j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f4279k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f4278j = null;
            } catch (IOException e10) {
                this.f4271c.b(7, e10);
            } catch (IllegalStateException e11) {
                this.f4271c.b(8, e11);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return this;
        throw th;
    }

    public boolean n() {
        FileOutputStream fileOutputStream;
        byte[] bArr = this.f4279k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                fileOutputStream = new FileOutputStream(this.f4273e);
                e.l(byteArrayInputStream, fileOutputStream);
                l(1, (Object) null);
                fileOutputStream.close();
                byteArrayInputStream.close();
                this.f4279k = null;
                this.f4278j = null;
                return true;
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e10) {
            l(6, e10);
            this.f4279k = null;
            this.f4278j = null;
            return false;
        } catch (IOException e11) {
            try {
                l(7, e11);
                this.f4279k = null;
                this.f4278j = null;
                return false;
            } catch (Throwable th2) {
                this.f4279k = null;
                this.f4278j = null;
                throw th2;
            }
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
        throw th;
    }
}
