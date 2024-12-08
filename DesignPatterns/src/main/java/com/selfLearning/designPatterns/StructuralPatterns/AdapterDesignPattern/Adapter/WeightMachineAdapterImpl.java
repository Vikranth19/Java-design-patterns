package com.selfLearning.designPatterns.StructuralPatterns.AdapterDesignPattern.Adapter;


import com.selfLearning.designPatterns.StructuralPatterns.AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {

        double weightInPound = weightMachine.getWeightInPound();

        //Convert it to KGs
        return weightInPound * .45;
    }
}
