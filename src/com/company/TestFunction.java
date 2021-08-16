package com.company;

public class TestFunction  implements InterfaceFake{

    public static void  inPort(){
        System.out.println("thu inport static");
    }

    @Override
    public boolean changeStatus() {
        return !status;
    }

}
