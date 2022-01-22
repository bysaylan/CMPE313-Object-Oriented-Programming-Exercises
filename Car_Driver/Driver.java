
package Car_Driver;


public class Driver {
    private String fullname;
    private int born;
    private int age=0;
    private String licenceType;
    
    public void setFullname(String fullname){
        this.fullname=fullname;
    }
        public String getFullname() {
            return this.fullname;
            
        }

    public int getBorn() {
        return born;
    }

    
    public void setBorn(int born) {
        this.born = born;
    }

   
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
    public String getLicenceType() {
        return licenceType;
    }

   
    public void setLicenceType(String licenceType) {
        this.licenceType = licenceType;
    }
    }
    

