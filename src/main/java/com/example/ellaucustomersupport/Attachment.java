package com.example.ellaucustomersupport;

public class Attachment {
    private String name;
    private byte[] contents;

    // Constructor
    public Attachment() {
        // Default constructor
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getContents() {
        return contents;
    }

    public void setContents(byte[] contents) {
        this.contents = contents;
    }
}
