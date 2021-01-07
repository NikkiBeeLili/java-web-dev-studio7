package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{


    public CD (String name, String discType, int storageCapacity, String contents){
        super(name, discType, storageCapacity, contents);
    }
    @Override
    public void spinDisc(){
        System.out.println("The disc is playing.");

    }
    @Override
    public void readData(){
        System.out.println("This disc plays music.");

    }



    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
