package com.selfLearning.designPatterns.StructuralPatterns.AdapterDesignPattern.Client;


import com.selfLearning.designPatterns.StructuralPatterns.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import com.selfLearning.designPatterns.StructuralPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import com.selfLearning.designPatterns.StructuralPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String args[]){

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
