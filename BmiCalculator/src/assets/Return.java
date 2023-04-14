/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assets;

/**
 *
 * @author Aluno
 */
public class Return {
    private double bmiResult;
    private boolean bmiStatus;
    private double idealWeight;

    public Return() {
    }

    
    public Return(double bmiResult, boolean bmiStatus, double idealWeight) {
        this.bmiResult = bmiResult;
        this.bmiStatus = bmiStatus;
        this.idealWeight = idealWeight;
    }

    public double getBmiResult() {
        return bmiResult;
    }

    public void setBmiResult(double bmiResult) {
        this.bmiResult = bmiResult;
    }

    public boolean isBmiStatus() {
        return bmiStatus;
    }

    public void setBmiStatus(boolean bmiStatus) {
        this.bmiStatus = bmiStatus;
    }

    public double getIdealWeight() {
        return idealWeight;
    }

    public void setIdealWeight(double idealWeight) {
        this.idealWeight = idealWeight;
    }
    
    
    
}
