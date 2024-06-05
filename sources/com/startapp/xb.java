package com.startapp;

import com.startapp.rb;
import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class xb implements rb.a {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f17542a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<rb> f17543b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    public rb f17544c = null;

    public void a(rb rbVar) {
        rbVar.f16366a = this;
        this.f17543b.add(rbVar);
        if (this.f17544c == null) {
            rb poll = this.f17543b.poll();
            this.f17544c = poll;
            if (poll != null) {
                poll.executeOnExecutor(this.f17542a, new Object[0]);
            }
        }
    }
}
