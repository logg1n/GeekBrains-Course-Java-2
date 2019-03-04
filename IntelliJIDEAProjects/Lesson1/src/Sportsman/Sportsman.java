package Sportsman;

import IAction.*;

public abstract class Sportsman implements RunI, JumpI, SwimI{
    private int distRun ;
    private int distJump ;
    private int distSwim ;
    private String slipUp = "";
    private boolean distCheck;

    public boolean getDistCheck() {
        return distCheck;
    }

    public void setDistCheck(boolean distCheck) {
        this.distCheck = distCheck;
    }


    public Sportsman(int distRun, int distJump, int distSwim) {
        this.distRun = distRun;
        this.distJump = distJump;
        this.distSwim = distSwim;
    }

    @Override
    public boolean run(int size) {
        return distRun >= size ? true : false;
    }
    @Override
    public boolean jump(int size) {
        return distJump >= size ? true : false;
    }
    @Override
    public boolean swim(int size) {
        return distSwim >= size ? true : false;
    }

    public void setSlipUp(String slipUp) {
        this.slipUp = slipUp;
    }

    public String getSlipUp() {
        return slipUp;
    }
}
