package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.work.impl.utils.futures.c;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import w6.f;

public abstract class ListenableWorker {
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        public static final class C0090a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final e f5089a;

            public C0090a() {
                this(e.f5166c);
            }

            public e e() {
                return this.f5089a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0090a.class != obj.getClass()) {
                    return false;
                }
                return this.f5089a.equals(((C0090a) obj).f5089a);
            }

            public int hashCode() {
                return (C0090a.class.getName().hashCode() * 31) + this.f5089a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f5089a + '}';
            }

            public C0090a(e eVar) {
                this.f5089a = eVar;
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final e f5090a;

            public c() {
                this(e.f5166c);
            }

            public e e() {
                return this.f5090a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f5090a.equals(((c) obj).f5090a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f5090a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f5090a + '}';
            }

            public c(e eVar) {
                this.f5090a = eVar;
            }
        }

        a() {
        }

        public static a a() {
            return new C0090a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(e eVar) {
            return new c(eVar);
        }
    }

    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.mAppContext = context;
            this.mWorkerParams = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    public f<h> getForegroundInfoAsync() {
        c t10 = c.t();
        t10.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return t10;
    }

    public final UUID getId() {
        return this.mWorkerParams.c();
    }

    public final e getInputData() {
        return this.mWorkerParams.d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.g();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.h();
    }

    public t1.a getTaskExecutor() {
        return this.mWorkerParams.i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.k();
    }

    public b0 getWorkerFactory() {
        return this.mWorkerParams.l();
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final f<Void> setForegroundAsync(h hVar) {
        this.mRunInForeground = true;
        return this.mWorkerParams.b().a(getApplicationContext(), getId(), hVar);
    }

    public f<Void> setProgressAsync(e eVar) {
        return this.mWorkerParams.f().a(getApplicationContext(), getId(), eVar);
    }

    public void setRunInForeground(boolean z10) {
        this.mRunInForeground = z10;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract f<a> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
