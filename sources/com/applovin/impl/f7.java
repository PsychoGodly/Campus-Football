package com.applovin.impl;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

public final class f7 extends Surface {

    /* renamed from: d  reason: collision with root package name */
    private static int f7637d;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f7638f;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7639a;

    /* renamed from: b  reason: collision with root package name */
    private final b f7640b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7641c;

    private f7(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f7640b = bVar;
        this.f7639a = z10;
    }

    private static int a(Context context) {
        if (z9.a(context)) {
            return z9.c() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (f7.class) {
            z10 = true;
            if (!f7638f) {
                f7637d = a(context);
                f7638f = true;
            }
            if (f7637d == 0) {
                z10 = false;
            }
        }
        return z10;
    }

    public void release() {
        super.release();
        synchronized (this.f7640b) {
            if (!this.f7641c) {
                this.f7640b.a();
                this.f7641c = true;
            }
        }
    }

    public static f7 a(Context context, boolean z10) {
        int i10 = 0;
        a1.b(!z10 || b(context));
        b bVar = new b();
        if (z10) {
            i10 = f7637d;
        }
        return bVar.a(i10);
    }

    private static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private l7 f7642a;

        /* renamed from: b  reason: collision with root package name */
        private Handler f7643b;

        /* renamed from: c  reason: collision with root package name */
        private Error f7644c;

        /* renamed from: d  reason: collision with root package name */
        private RuntimeException f7645d;

        /* renamed from: f  reason: collision with root package name */
        private f7 f7646f;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        private void b(int i10) {
            a1.a((Object) this.f7642a);
            this.f7642a.a(i10);
            this.f7646f = new f7(this, this.f7642a.c(), i10 != 0);
        }

        public f7 a(int i10) {
            boolean z10;
            start();
            this.f7643b = new Handler(getLooper(), this);
            this.f7642a = new l7(this.f7643b);
            synchronized (this) {
                z10 = false;
                this.f7643b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f7646f == null && this.f7645d == null && this.f7644c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f7645d;
            if (runtimeException == null) {
                Error error = this.f7644c;
                if (error == null) {
                    return (f7) a1.a((Object) this.f7646f);
                }
                throw error;
            }
            throw runtimeException;
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    kc.a("DummySurface", "Failed to initialize dummy surface", e10);
                    this.f7645d = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    try {
                        kc.a("DummySurface", "Failed to initialize dummy surface", e11);
                        this.f7644c = e11;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i10 != 2) {
                return true;
            } else {
                try {
                    b();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }

        private void b() {
            a1.a((Object) this.f7642a);
            this.f7642a.d();
        }

        public void a() {
            a1.a((Object) this.f7643b);
            this.f7643b.sendEmptyMessage(2);
        }
    }
}
