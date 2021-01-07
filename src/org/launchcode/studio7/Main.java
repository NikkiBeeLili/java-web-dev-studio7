package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

         OpticalDisc cd1 = new CD( "My Chemical Romance", "Rock Music", 13000, "Three Cheers for Sweet Revenge" );
         OpticalDisc movie1 = new DVD("Night of the Living Dead", "Scary movie", 80000, "zombies" );
         OpticalDisc cd2 = new CD("Melanie Martinez", "alt pop", 13000, "CryBaby");
         OpticalDisc movie2 = new DVD("Get Him to the Greek", "comedy", 80000, "Russell Brand");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        cd1.spinDisc();
        //cd2.spinDisc();
        movie1.spinDisc();
        //movie2.spinDisc();
        cd2.readData();
        movie1.readData();

    }
}
