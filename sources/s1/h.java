package s1;

import androidx.work.WorkerParameters;
import k1.i;

/* compiled from: StartWorkRunnable */
public class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private i f22309a;

    /* renamed from: b  reason: collision with root package name */
    private String f22310b;

    /* renamed from: c  reason: collision with root package name */
    private WorkerParameters.a f22311c;

    public h(i iVar, String str, WorkerParameters.a aVar) {
        this.f22309a = iVar;
        this.f22310b = str;
        this.f22311c = aVar;
    }

    public void run() {
        this.f22309a.o().k(this.f22310b, this.f22311c);
    }
}
