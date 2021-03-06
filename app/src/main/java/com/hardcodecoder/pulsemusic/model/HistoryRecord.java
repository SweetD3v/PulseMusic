package com.hardcodecoder.pulsemusic.model;

public class HistoryRecord {

    private final String mTitle;
    private final String mAlbum;
    private final String mArtist;
    private final int mAlbumId;
    private final long mLastModified;
    private final short mPlayCount;

    public HistoryRecord(String title, String album, String artist, int albumId, short playCount, long lastModified) {
        mTitle = title;
        mAlbum = album;
        mArtist = artist;
        mAlbumId = albumId;
        mPlayCount = playCount;
        mLastModified = lastModified;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAlbum() {
        return mAlbum;
    }

    public String getArtist() {
        return mArtist;
    }

    public int getAlbumId() {
        return mAlbumId;
    }

    public long getLastModified() {
        return mLastModified;
    }

    public short getPlayCount() {
        return mPlayCount;
    }
}