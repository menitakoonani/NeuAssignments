/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserApplication;

/**
 *
 * @author Menita Koonani
 */
public class CheckingAccount {
    
    private String accNumber;
    private String creationDate;
    private String debtAmt;
    private String creditAmt;
    private boolean isActive;

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getDebtAmt() {
        return debtAmt;
    }

    public void setDebtAmt(String debtAmt) {
        this.debtAmt = debtAmt;
    }

    public String getCreditAmt() {
        return creditAmt;
    }

    public void setCreditAmt(String creditAmt) {
        this.creditAmt = creditAmt;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
}
