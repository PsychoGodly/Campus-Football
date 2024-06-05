package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import org.json.JSONException;

public class ExperimentsReader {
    private IExperiments _localExperiments;
    private IExperiments _remoteExperiments;

    public synchronized IExperiments getCurrentlyActiveExperiments() {
        IExperiments iExperiments = this._remoteExperiments;
        if (iExperiments == null && this._localExperiments == null) {
            return new Experiments();
        } else if (iExperiments == null) {
            return this._localExperiments;
        } else {
            if (this._localExperiments == null) {
                this._localExperiments = new Experiments();
            }
            try {
                return new Experiments(Utilities.mergeJsonObjects(this._localExperiments.getNextSessionExperiments(), this._remoteExperiments.getCurrentSessionExperiments()));
            } catch (JSONException unused) {
                DeviceLog.error("Couldn't get active experiments, reverting to default experiments");
                return new Experiments();
            }
        }
    }

    public synchronized void updateLocalExperiments(IExperiments iExperiments) {
        this._localExperiments = iExperiments;
    }

    public synchronized void updateRemoteExperiments(IExperiments iExperiments) {
        this._remoteExperiments = iExperiments;
    }
}
