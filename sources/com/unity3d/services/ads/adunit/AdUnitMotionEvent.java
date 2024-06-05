package com.unity3d.services.ads.adunit;

public class AdUnitMotionEvent {
    private int _action;
    private int _deviceId;
    private long _eventTime;
    private boolean _isObscured;
    private float _pressure;
    private float _size;
    private int _source;
    private int _toolType;
    private float _x;
    private float _y;

    public AdUnitMotionEvent(int i10, boolean z10, int i11, int i12, int i13, float f10, float f11, long j10, float f12, float f13) {
        this._action = i10;
        this._isObscured = z10;
        this._toolType = i11;
        this._source = i12;
        this._deviceId = i13;
        this._x = f10;
        this._y = f11;
        this._eventTime = j10;
        this._pressure = f12;
        this._size = f13;
    }

    public int getAction() {
        return this._action;
    }

    public int getDeviceId() {
        return this._deviceId;
    }

    public long getEventTime() {
        return this._eventTime;
    }

    public float getPressure() {
        return this._pressure;
    }

    public float getSize() {
        return this._size;
    }

    public int getSource() {
        return this._source;
    }

    public int getToolType() {
        return this._toolType;
    }

    public float getX() {
        return this._x;
    }

    public float getY() {
        return this._y;
    }

    public boolean isObscured() {
        return this._isObscured;
    }
}
