package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{

    public DVD(String name, String discType, int storageCapacity, String contents){
        super(name, discType, storageCapacity, contents);
    }

    @Override
    public void spinDisc(){
        System.out.println("Make some popcorn!");
    }
    @Override
    public void readData(){
        System.out.println("This disc is playing a movie.");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
