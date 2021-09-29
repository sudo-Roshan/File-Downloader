package com.filedownloader;

public interface OnDownloadListener {
    void onDownloadComplete();

    void onError(Error error);
}