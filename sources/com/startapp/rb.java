package com.startapp;

import android.os.AsyncTask;

/* compiled from: Sta */
public abstract class rb extends AsyncTask<Object, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    public a f16366a;

    /* renamed from: b  reason: collision with root package name */
    public final b f16367b;

    /* compiled from: Sta */
    public interface a {
    }

    /* compiled from: Sta */
    public interface b {
    }

    public rb(b bVar) {
        this.f16367b = bVar;
    }

    /* renamed from: a */
    public void onPostExecute(String str) {
        a aVar = this.f16366a;
        if (aVar != null) {
            xb xbVar = (xb) aVar;
            xbVar.f17544c = null;
            rb poll = xbVar.f17543b.poll();
            xbVar.f17544c = poll;
            if (poll != null) {
                poll.executeOnExecutor(xbVar.f17542a, new Object[0]);
            }
        }
    }
}
