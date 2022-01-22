
    public class Bus extends Vehicle {
        private long kms;
        private boolean isGas=true;
        
        public Bus (String model, String type){
            super(type,model);
        }
        public void setKms (long kms){
            this.kms= kms;
        }
        public long getKms(){
            return kms;
        }
        
        public void setGas(boolean gas){
            isGas= gas;
        }
        
        public boolean getGas(){
            return isGas;
           
        }
        
        public void move (String road1, String road2){
            System.out.println("\n\nThis bus is working beetwen: " + road1 + " to " + road2);
}
}
