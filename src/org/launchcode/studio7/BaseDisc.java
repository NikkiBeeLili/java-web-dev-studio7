package org.launchcode.studio7;

public abstract class BaseDisc {
    private String name;
    private String discType;
    private int storageCapacity;
    private String contents;

    public BaseDisc (String name, String discType, int storageCapacity, String contents){
        this.name = name;
        this.discType = discType;
        this.storageCapacity = storageCapacity;
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
