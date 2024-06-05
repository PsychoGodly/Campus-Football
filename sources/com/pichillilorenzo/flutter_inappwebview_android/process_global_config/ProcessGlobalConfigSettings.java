package com.pichillilorenzo.flutter_inappwebview_android.process_global_config;

import android.content.Context;
import androidx.webkit.ProcessGlobalConfig;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import j1.s;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ProcessGlobalConfigSettings implements ISettings<ProcessGlobalConfig> {
    public static final String LOG_TAG = "ProcessGlobalConfigSettings";
    public String dataDirectorySuffix;
    public DirectoryBasePaths directoryBasePaths;

    static class DirectoryBasePaths implements ISettings<Object> {
        public static final String LOG_TAG = "ProcessGlobalConfigSettings";
        public String cacheDirectoryBasePath;
        public String dataDirectoryBasePath;

        DirectoryBasePaths() {
        }

        public Map<String, Object> getRealSettings(Object obj) {
            return toMap();
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("cacheDirectoryBasePath", this.cacheDirectoryBasePath);
            hashMap.put("dataDirectoryBasePath", this.dataDirectoryBasePath);
            return hashMap;
        }

        public DirectoryBasePaths parse(Map<String, Object> map) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (value != null) {
                    str.hashCode();
                    if (str.equals("dataDirectoryBasePath")) {
                        this.dataDirectoryBasePath = (String) value;
                    } else if (str.equals("cacheDirectoryBasePath")) {
                        this.cacheDirectoryBasePath = (String) value;
                    }
                }
            }
            return this;
        }
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("dataDirectorySuffix", this.dataDirectorySuffix);
        return hashMap;
    }

    public ProcessGlobalConfig toProcessGlobalConfig(Context context) {
        ProcessGlobalConfig processGlobalConfig = new ProcessGlobalConfig();
        if (this.dataDirectorySuffix != null && s.b(context, "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX")) {
            processGlobalConfig.b(context, this.dataDirectorySuffix);
        }
        if (this.directoryBasePaths != null && s.b(context, "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS")) {
            processGlobalConfig.c(context, new File(this.directoryBasePaths.dataDirectoryBasePath), new File(this.directoryBasePaths.cacheDirectoryBasePath));
        }
        return processGlobalConfig;
    }

    public Map<String, Object> getRealSettings(ProcessGlobalConfig processGlobalConfig) {
        return toMap();
    }

    public ProcessGlobalConfigSettings parse(Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value != null) {
                str.hashCode();
                if (str.equals("dataDirectorySuffix")) {
                    this.dataDirectorySuffix = (String) value;
                } else if (str.equals("directoryBasePaths")) {
                    this.directoryBasePaths = new DirectoryBasePaths().parse((Map) value);
                }
            }
        }
        return this;
    }
}
