abstract class Bank {
    abstract int getRateOfInterest();
}
class Kaspi extends Bank{
    int getRateOfInterest(){
        return 12;
    }
}

class Halyk extends Bank{
        int getRateOfInterest(){
            return 10;
        }
    }

class testBank{
    public static void main(String[] args) {
        Bank b;
        b = new Kaspi();
        System.out.println("Deposit Kaspi is: "+b.getRateOfInterest()+" %");

        b = new Halyk();
        System.out.println("Deposit Halyk is: "+b.getRateOfInterest()+" %");
            }
        }


