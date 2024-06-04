 class Cars {
    String carName ;
    int modelNumber ;
    int year ;
    
    public  void printInfo(){
        System.out.println(this.carName);
        System.out.println(this.modelNumber);
        System.out.println(this.year);
    }
    Cars (String carName , int modelNumber , int year){
        this.carName = carName ;
        this.modelNumber = modelNumber ;
        this.year = year ;

    }
}









public class ClassQuestion {
    public static void main(String[] args) {
        Cars obj = new Cars("bolero" , 2200 , 1997);
        obj.printInfo();
    }
}
