package com.onesignal;

/* compiled from: BackgroundRunnable.kt */
public class k implements Runnable {
    public void run() {
        Thread.currentThread().setPriority(10);
    }
}
