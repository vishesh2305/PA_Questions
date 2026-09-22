// 1603. Design Parking System
// https://leetcode.com/problems/design-parking-system/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-04-28 03:53:21
// Runtime:    7 ms (beats 100.00%)
// Memory:     47.2 MB (beats 9.30%)
// Topics:     Design, Simulation, Counting

class ParkingSystem {

    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        
        boolean result = false;
        if(carType == 1){
            if(big>=1){
            result = true;
            big--;
            }
        }else if(carType==2){
            if(medium >= 1){
            result = true;
            medium--;
            }
        }else{
            if(small >=1){
            result = true;
            small--;
            }
            
        }
return result;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
