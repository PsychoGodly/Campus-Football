package k4;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.PriorityQueue;

/* compiled from: PriorityTaskManager */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f19681a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final PriorityQueue<Integer> f19682b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c  reason: collision with root package name */
    private int f19683c = RecyclerView.UNDEFINED_DURATION;

    public void a(int i10) {
        synchronized (this.f19681a) {
            this.f19682b.add(Integer.valueOf(i10));
            this.f19683c = Math.max(this.f19683c, i10);
        }
    }

    public void b(int i10) {
        synchronized (this.f19681a) {
            this.f19682b.remove(Integer.valueOf(i10));
            this.f19683c = this.f19682b.isEmpty() ? RecyclerView.UNDEFINED_DURATION : ((Integer) n0.j(this.f19682b.peek())).intValue();
            this.f19681a.notifyAll();
        }
    }
}
