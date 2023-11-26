package interface_adapter.convert;

import interface_adapter.login.LoginState;

public class ConvertState {
    private String symbolB = "";
    private String symbolBError = null;
    private String currencyB = "";
    private String currencyBError = null;
    private String symbolA = "";
    private String symbolAError = null;
    private String currencyA = "";

    public ConvertState(ConvertState copy) {
        symbolB = copy.symbolB;
        symbolBError = copy.symbolBError;
        currencyB = copy.currencyB;
        currencyBError = copy.currencyBError;
        symbolA = copy.symbolA;
        symbolAError = copy.symbolAError;
        currencyA = copy.currencyA;
    }

    // Because of the previous copy constructor, the default constructor must be explicit.
    public ConvertState() {}

    public String getSymbolB() {
        return symbolB;
    }

    public String getSymbolBError() {
        return symbolBError;
    }

    public String getCurrencyB() {
        return currencyB;
    }

    public String getCurrencyBError() {
        return currencyBError;
    }

    public String getSymbolA() {
        return symbolA;
    }

    public String getSymbolAError() {
        return symbolAError;
    }
    public String getCurrencyA() {return currencyA;}

    public void setSymbolB(String symbolB) {
        this.symbolB = symbolB;
    }

    public void setSymbolBError(String symbolBError) {
        this.symbolBError = symbolBError;
    }

    public void setCurrencyB(String currencyB) {
        this.currencyB = currencyB;
    }

    public void setCurrencyBError(String currencyBError) {
        this.currencyBError = currencyBError;
    }

    public void setSymbolA(String symbolA) {
        this.symbolA = symbolA;
    }

    public void setSymbolAError(String symbolAError) {
        this.symbolAError = symbolAError;
    }

    public void setCurrencyA(String currencyA) {this.currencyA = currencyA;}
}
