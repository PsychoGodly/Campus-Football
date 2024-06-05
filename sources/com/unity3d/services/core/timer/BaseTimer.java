package com.unity3d.services.core.timer;

import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.lifecycle.IAppActiveListener;
import com.unity3d.services.core.lifecycle.LifecycleCache;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class BaseTimer implements IBaseTimer {
    final Integer _delayMs;
    /* access modifiers changed from: private */
    public final AtomicBoolean _hasPaused;
    private final AtomicBoolean _isRunning;
    private final LifecycleCache _lifecycleCache;
    Integer _remainingDurationMs;
    private ScheduledFuture<?> _task;
    private ITimerListener _timerListener;
    private ScheduledExecutorService _timerService;
    final Integer _totalDurationMs;

    public BaseTimer(Integer num, ITimerListener iTimerListener, LifecycleCache lifecycleCache) {
        this._delayMs = 1000;
        this._isRunning = new AtomicBoolean(false);
        this._hasPaused = new AtomicBoolean(false);
        this._totalDurationMs = num;
        this._remainingDurationMs = num;
        this._timerListener = iTimerListener;
        this._lifecycleCache = lifecycleCache;
        addLifecycleListener();
    }

    private void addLifecycleListener() {
        LifecycleCache lifecycleCache = this._lifecycleCache;
        if (lifecycleCache != null) {
            lifecycleCache.addActiveListener(new IAppActiveListener() {
                public void onAppStateChanged(boolean z10) {
                    if (z10) {
                        if (BaseTimer.this._hasPaused.get()) {
                            BaseTimer.this._hasPaused.getAndSet(false);
                            BaseTimer.this.resume();
                        }
                    } else if (BaseTimer.this.isRunning()) {
                        BaseTimer.this.pause();
                        BaseTimer.this._hasPaused.getAndSet(true);
                    }
                }
            });
        }
    }

    private void notifyListeners() {
        ITimerListener iTimerListener = this._timerListener;
        if (iTimerListener != null) {
            iTimerListener.onTimerFinished();
        }
    }

    private void schedule() {
        try {
            this._task = this._timerService.scheduleAtFixedRate(new Runnable() {
                public void run() {
                    BaseTimer baseTimer = BaseTimer.this;
                    baseTimer._remainingDurationMs = Integer.valueOf(baseTimer._remainingDurationMs.intValue() - BaseTimer.this._delayMs.intValue());
                    BaseTimer.this.onStep();
                }
            }, (long) this._delayMs.intValue(), (long) this._delayMs.intValue(), TimeUnit.MILLISECONDS);
        } catch (IllegalArgumentException | IllegalStateException | NullPointerException | RejectedExecutionException e10) {
            DeviceLog.debug("ERROR: IntervalTimer failed to start due to exception " + e10.getLocalizedMessage());
        }
    }

    public boolean isRunning() {
        return this._isRunning.get();
    }

    public void kill() {
        stop();
        this._timerListener = null;
    }

    public void onStep() {
        if (this._remainingDurationMs.intValue() <= 0) {
            notifyListeners();
            kill();
        }
    }

    public boolean pause() {
        ScheduledFuture<?> scheduledFuture = this._task;
        boolean z10 = true;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            z10 = false;
        } else {
            this._task.cancel(true);
            this._task = null;
        }
        this._isRunning.getAndSet(false);
        return z10;
    }

    public void restart(ScheduledExecutorService scheduledExecutorService) {
        ScheduledExecutorService scheduledExecutorService2 = this._timerService;
        if (scheduledExecutorService2 == null || scheduledExecutorService2.isShutdown()) {
            this._timerService = scheduledExecutorService;
        }
        this._remainingDurationMs = this._totalDurationMs;
        schedule();
        this._isRunning.getAndSet(true);
    }

    public boolean resume() {
        boolean z10;
        ScheduledExecutorService scheduledExecutorService = this._timerService;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            z10 = false;
        } else {
            z10 = true;
            schedule();
        }
        this._isRunning.getAndSet(z10);
        return z10;
    }

    public void start(ScheduledExecutorService scheduledExecutorService) {
        if (this._isRunning.compareAndSet(false, true)) {
            this._timerService = scheduledExecutorService;
            schedule();
        }
    }

    public void stop() {
        ScheduledExecutorService scheduledExecutorService = this._timerService;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this._timerService.shutdown();
            this._timerService = null;
        }
        this._isRunning.getAndSet(false);
    }

    public BaseTimer(Integer num, ITimerListener iTimerListener) {
        this(num, iTimerListener, CachedLifecycle.getLifecycleListener());
    }
}
