package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: ImageDownload */
public class g0 implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final URL f26807a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Future<?> f26808b;

    /* renamed from: c  reason: collision with root package name */
    private Task<Bitmap> f26809c;

    private g0(URL url) {
        this.f26807a = url;
    }

    private byte[] j() throws IOException {
        URLConnection openConnection = this.f26807a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] d10 = b.d(b.b(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + d10.length + " bytes from " + this.f26807a);
                }
                if (d10.length <= 1048576) {
                    return d10;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public static g0 n(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new g0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(i());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public void A(ExecutorService executorService) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f26808b = executorService.submit(new f0(this, taskCompletionSource));
        this.f26809c = taskCompletionSource.getTask();
    }

    public void close() {
        this.f26808b.cancel(true);
    }

    public Bitmap i() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f26807a);
        }
        byte[] j10 = j();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(j10, 0, j10.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f26807a);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f26807a);
    }

    public Task<Bitmap> q() {
        return (Task) q.k(this.f26809c);
    }
}
