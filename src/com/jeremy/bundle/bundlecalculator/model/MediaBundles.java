package com.jeremy.bundle.bundlecalculator.model;
import java.util.ArrayList;

public class MediaBundles {
    MediaType mediaType = new MediaType();
    ArrayList<String> newMedias = null;

    public ArrayList<String> getMediaTypeList() {
        newMedias = new ArrayList<>();
        mediaType.readAndWriteCharToFile();
        newMedias = mediaType.getArrayList();
        return newMedias;
    }
}


