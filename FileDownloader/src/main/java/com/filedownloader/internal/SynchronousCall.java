package com.filedownloader.internal;

import com.filedownloader.Response;
import com.filedownloader.request.DownloadRequest;

public class SynchronousCall {

    public final DownloadRequest request;

    public SynchronousCall(DownloadRequest request) {
        this.request = request;
    }

    public Response execute() {
        DownloadTask downloadTask = DownloadTask.create(request);
        return downloadTask.run();
    }
}