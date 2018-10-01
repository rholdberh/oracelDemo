package demo.oracle;

import com.poiji.annotation.ExcelCellName;

public class TicketObject {


    @ExcelCellName("userFirstName")
    private String userFirstName;

    @ExcelCellName("userLastName")
    private String userLastName;

    @ExcelCellName("departuresFrom")
    private String departuresFrom;

    @ExcelCellName("departuresMonth")
    private String departuresMonth;

    @ExcelCellName("departuresDate")
    private String departuresDate;

    @ExcelCellName("arrivingTo")
    private String arrivingTo;

    @ExcelCellName("arrivingMonth")
    private String arrivingMonth;

    @ExcelCellName("arrivingDate")
    private String arrivingDate;

    @ExcelCellName("cardType")
    private String cardType;

    @ExcelCellName("cardNumber")
    private String cardNumber;

    @ExcelCellName("cardExpMonth")
    private String cardExpMonth;

    @ExcelCellName("cardExpYear")
    private String cardExpYear;

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getDeparturesFrom() {
        return departuresFrom;
    }

    public void setDeparturesFrom(String departuresFrom) {
        this.departuresFrom = departuresFrom;
    }

    public String getDeparturesMonth() {
        return departuresMonth;
    }

    public void setDeparturesMonth(String departuresMonth) {
        this.departuresMonth = departuresMonth;
    }

    public String getDeparturesDate() {
        return departuresDate;
    }

    public void setDeparturesDate(String departuresDate) {
        this.departuresDate = departuresDate;
    }

    public String getArrivingTo() {
        return arrivingTo;
    }

    public void setArrivingTo(String arrivingTo) {
        this.arrivingTo = arrivingTo;
    }

    public String getArrivingMonth() {
        return arrivingMonth;
    }

    public void setArrivingMonth(String arrivingMonth) {
        this.arrivingMonth = arrivingMonth;
    }

    public String getArrivingDate() {
        return arrivingDate;
    }

    public void setArrivingDate(String arrivingDate) {
        this.arrivingDate = arrivingDate;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpMonth() {
        return cardExpMonth;
    }

    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    public String getCardExpYear() {
        return cardExpYear;
    }

    public void setCardExpYear(String cardExpYear) {
        this.cardExpYear = cardExpYear;
    }
}