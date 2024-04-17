
package oop.nailgun;

import oop.gun.Gun;

class NiailGun extends Gun{
    
    private char type;

    public NiailGun(char type, int ammoCount, int maxAmmo) {
        super(ammoCount, maxAmmo);
        this.type = type;
    }

    public char getType() {
        return type;
    }

    
    @Override
    public String shoot() {
       
        String returnResults= " ";
        
       //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
       if(getAmmoCount() <= 1){
           
           returnResults = "No nails left, must reload the nail gun";
       }
       else if(getAmmoCount() == 1){
           
           setAmmoCount(0);
           returnResults = "Shoot a nail";
       }
       
       return returnResults;
    }
}

