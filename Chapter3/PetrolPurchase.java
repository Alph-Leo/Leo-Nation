package Chapter3;

public class PetrolPurchase {
    private String nameOfLocation;
    private String nameOfPetrol;
    private int purchaseInLitres;
    private double pricePerLitre;
    private double percentageDiscount;
    private double netPurchaseAmount;


    public PetrolPurchase(String nameOfLocation, String nameOfPetrol, int purchaseInLitres, double pricePerLitre, double percentageDiscount) {
        this.nameOfLocation = nameOfLocation;
        this.nameOfPetrol = nameOfPetrol;

        this.purchaseInLitres = purchaseInLitres;

        this.pricePerLitre = pricePerLitre;
        pricePerLitre = purchaseInLitres * 70;

        this.percentageDiscount = percentageDiscount;
        percentageDiscount = (pricePerLitre /100) * 10;

        this.netPurchaseAmount = netPurchaseAmount;
        netPurchaseAmount = pricePerLitre - percentageDiscount;
    }
    public void setNameOfLocation(String name) {
        this.nameOfLocation = name;
    }
    public String getNameOfLocation() {
        return nameOfLocation;
    }
    public void setNameOfPetrol(String name) {
        this.nameOfPetrol = name;
    }
    public String getNameOfPetrol() {
        return nameOfPetrol;
    }
    public void setPurchaseInLitres(int amount) {
        this.purchaseInLitres = amount;
    }
    public int getPurchaseInLitres() {
        return purchaseInLitres;
    }
    public void setPricePerLitre(double price) {
        this.pricePerLitre = price;
        pricePerLitre = purchaseInLitres * 70;
    }
    public double getPricePerLitre() {
        return pricePerLitre;
    }
    public void setPercentageDiscount(double discount) {
        this.percentageDiscount = discount;
        percentageDiscount = (pricePerLitre / 100) * 10;
    }
    public double getPercentageDiscount() {
        return percentageDiscount;
    }
    public void setNetPurchaseAmount(double netAmount) {
        this.netPurchaseAmount = netAmount;
        netPurchaseAmount = pricePerLitre - percentageDiscount;
    }
    public double getNetPurchaseAmount() {
        return netPurchaseAmount;
    }
}
