
package Car_Driver;


public class Cars {
    private String driver;
    private String model;
    private double horsepower;
    private boolean type = false;
    
    public void setDriver(String driver){
        this.driver = driver;
    }
    public String getDriver(){
       return this.driver;
  
    }

    public String getModel() {
        return model;
    }
   
    public void setModel(String model) {
        this.model = model;
    }

  
    public double getHorsepower() {
        return horsepower;
    }

  
    public void setHorsepower(double horsepower) {
        this.horsepower = horsepower;
    }

  
    public boolean getType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }
}

