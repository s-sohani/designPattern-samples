package com.designpattern.test.designpattern.designpattern.facade;

public class ComputerFacade {
    private Cpu cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public void start(){
        this.cpu.freeze();
        this.memory.load();
        this.cpu.jump(0);
        this.cpu.execute();
    }

}
