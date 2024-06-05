package y7;

import android.os.AsyncTask;
import androidx.profileinstaller.g;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.Executor;

/* compiled from: Executors */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f31399a = TaskExecutors.MAIN_THREAD;

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f31400b = g.f4296a;

    /* renamed from: c  reason: collision with root package name */
    public static final Executor f31401c = new a0(4, AsyncTask.THREAD_POOL_EXECUTOR);
}
