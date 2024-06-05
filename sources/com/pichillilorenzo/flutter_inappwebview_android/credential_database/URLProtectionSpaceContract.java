package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

import android.provider.BaseColumns;

public class URLProtectionSpaceContract {

    public static class FeedEntry implements BaseColumns {
        public static final String COLUMN_NAME_HOST = "host";
        public static final String COLUMN_NAME_PORT = "port";
        public static final String COLUMN_NAME_PROTOCOL = "protocol";
        public static final String COLUMN_NAME_REALM = "realm";
        public static final String TABLE_NAME = "protection_space";
    }

    private URLProtectionSpaceContract() {
    }
}
