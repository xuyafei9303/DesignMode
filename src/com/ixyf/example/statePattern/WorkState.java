package com.ixyf.example.statePattern;

public class WorkState extends AbstractState{
    @Override
    public void action(Context context) {
        System.out.println("state change to work state");
        System.out.println("work state actions is meeting,design,coding...");
    }
}
