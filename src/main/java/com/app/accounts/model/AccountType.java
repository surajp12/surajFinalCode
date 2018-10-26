
package com.app.accounts.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AccountType {

    @JsonProperty("ESOP")
    ESOP("ESOP"),
    @JsonProperty("GUARDIAN")
    GUARDIAN("GUARDIAN"),
    @JsonProperty("HOMEEQUITYLOAN")
    HOMEEQUITYLOAN("HOMEEQUITYLOAN"),
    @JsonProperty("HOMELINEOFCREDIT")
    HOMELINEOFCREDIT("HOMELINEOFCREDIT"),
    @JsonProperty("INSITUTIONALTRUST")
    INSITUTIONALTRUST("INSITUTIONALTRUST"),
    @JsonProperty("INSTALLMENT")
    INSTALLMENT("INSTALLMENT"),
    @JsonProperty("IRA")
    IRA("IRA"),
    @JsonProperty("KEOGH")
    KEOGH("KEOGH"),
    @JsonProperty("LINEOFCREDIT")
    LINEOFCREDIT("LINEOFCREDIT"),
    @JsonProperty("LOAN")
    LOAN("LOAN"),
    @JsonProperty("MILATARYLOAN")
    MILATARYLOAN("MILATARYLOAN"),
    @JsonProperty("MONEYMARKET")
    MONEYMARKET("MONEYMARKET"),
    @JsonProperty("MORTGAGE")
    MORTGAGE("MORTGAGE"),
    @JsonProperty("PERSONALLOAN")
    PERSONALLOAN("PERSONALLOAN"),
    @JsonProperty("ROLLOVER")
    ROLLOVER("ROLLOVER"),
    @JsonProperty("ROTH")
    ROTH("ROTH"),
    @JsonProperty("SARSEP")
    SARSEP("SARSEP"),
    @JsonProperty("SAVINGS")
    SAVINGS("SAVINGS"),
    @JsonProperty("SMBLOAN")
    SMBLOAN("SMBLOAN"),
    @JsonProperty("STUDENTLOAN")
    STUDENTLOAN("STUDENTLOAN"),
    @JsonProperty("TAXABLE")
    TAXABLE("TAXABLE"),
    @JsonProperty("TDA")
    TDA("TDA"),
    @JsonProperty("TRUST")
    TRUST("TRUST"),
    @JsonProperty("UGMA")
    UGMA("UGMA"),
    @JsonProperty("UTMA")
    UTMA("UTMA"),
   @JsonProperty("401A")
   _401_A("401A"),
    @JsonProperty("401K")
    _401_K("401K"),
    @JsonProperty("403B")
    _403_B("403B"),
    @JsonProperty("529")
    _529("529"),
    @JsonProperty("AUTOLOAN")
    AUTOLOAN("AUTOLOAN"),
    @JsonProperty("CD")
    CD("CD"),
    @JsonProperty("CHARGE")
    CHARGE("CHARGE"),
    @JsonProperty("CHECKING")
    CHECKING("CHECKING"),
    @JsonProperty("COMMERCIALLINEOFCREDIT")
    COMMERCIALLINEOFCREDIT("COMMERCIALLINEOFCREDIT"),
    @JsonProperty("COMMERCIALLOAN")
    COMMERCIALLOAN("COMMERCIALLOAN"),
    @JsonProperty("COVERDELL")
    COVERDELL("COVERDELL"),
    @JsonProperty("CREDITCARD")
    CREDITCARD("CREDITCARD"),
    @JsonProperty("ESCROW")
    ESCROW("ESCROW");
    private final String value;
    private final static Map<String, AccountType> VALUE_CACHE = new HashMap<String, AccountType>();

    static {
        for (AccountType c: values()) {
            VALUE_CACHE.put(c.value, c);
        }
    }

    private AccountType(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }

    public static AccountType fromValue(String value) {
        return VALUE_CACHE.get(value);
    }

    @Override
    public String toString() {
        return this.value;
    }

}
