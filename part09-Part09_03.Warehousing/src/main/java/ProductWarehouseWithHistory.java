/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aolej
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory historyOb;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.setBalance(initialBalance);
        
        this.historyOb = new ChangeHistory();
        this.historyOb.add(initialBalance);
    }
    
    public String history() {
        return historyOb.toString();
    }
    
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.historyOb.add(getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        double result = super.takeFromWarehouse(amount);
        this.historyOb.add(getBalance());
        return result;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.historyOb.maxValue());
        System.out.println("Smallest amount of product: " + this.historyOb.minValue());
        System.out.println("Average: " + this.historyOb.average());
    }
}
