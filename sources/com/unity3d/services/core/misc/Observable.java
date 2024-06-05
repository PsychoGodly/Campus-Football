package com.unity3d.services.core.misc;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable<T> {
    private final List<IObserver<T>> _observers = new ArrayList();

    /* access modifiers changed from: protected */
    public synchronized void notifyObservers(T t10) {
        for (IObserver<T> updated : this._observers) {
            updated.updated(t10);
        }
    }

    public synchronized void registerObserver(IObserver<T> iObserver) {
        if (!this._observers.contains(iObserver)) {
            this._observers.add(iObserver);
        }
    }

    public synchronized void unregisterObserver(IObserver<T> iObserver) {
        if (this._observers.contains(iObserver)) {
            this._observers.remove(iObserver);
        }
    }
}
