package io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: MotionEventTracker */
public final class u {

    /* renamed from: c  reason: collision with root package name */
    private static u f33522c;

    /* renamed from: a  reason: collision with root package name */
    private final LongSparseArray<MotionEvent> f33523a = new LongSparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final PriorityQueue<Long> f33524b = new PriorityQueue<>();

    /* compiled from: MotionEventTracker */
    public static class a {

        /* renamed from: b  reason: collision with root package name */
        private static final AtomicLong f33525b = new AtomicLong(0);
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final long f33526a;

        private a(long j10) {
            this.f33526a = j10;
        }

        public static a b() {
            return c(f33525b.incrementAndGet());
        }

        public static a c(long j10) {
            return new a(j10);
        }

        public long d() {
            return this.f33526a;
        }
    }

    private u() {
    }

    public static u a() {
        if (f33522c == null) {
            f33522c = new u();
        }
        return f33522c;
    }

    public MotionEvent b(a aVar) {
        while (!this.f33524b.isEmpty() && this.f33524b.peek().longValue() < aVar.f33526a) {
            this.f33523a.remove(this.f33524b.poll().longValue());
        }
        if (!this.f33524b.isEmpty() && this.f33524b.peek().longValue() == aVar.f33526a) {
            this.f33524b.poll();
        }
        MotionEvent motionEvent = this.f33523a.get(aVar.f33526a);
        this.f33523a.remove(aVar.f33526a);
        return motionEvent;
    }

    public a c(MotionEvent motionEvent) {
        a b10 = a.b();
        this.f33523a.put(b10.f33526a, MotionEvent.obtain(motionEvent));
        this.f33524b.add(Long.valueOf(b10.f33526a));
        return b10;
    }
}
