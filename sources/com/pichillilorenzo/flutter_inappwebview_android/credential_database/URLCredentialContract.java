package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

import android.provider.BaseColumns;

public class URLCredentialContract {

    public static class FeedEntry implements BaseColumns {
        public static final String COLUMN_NAME_PASSWORD = "password";
        public static final String COLUMN_NAME_PROTECTION_SPACE_ID = "protection_space_id";
        public static final String COLUMN_NAME_USERNAME = "username";
        public static final String TABLE_NAME = "credential";
    }

    private URLCredentialContract() {
    }
}
