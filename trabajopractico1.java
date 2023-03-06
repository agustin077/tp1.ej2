class TP1 {
    public static void main(String[] args) {
        /*pueden cambiar estas variables para ir probando*/
        float ingreso = 700000;
        int superficie = 20;
        int energia = 4000;

        if ( (ingreso <= 748382.07) &&
           ( superficie <= 30) &&
           (energia <= 3330) ) {
            System.out.println("Categoría A");

        }
           
        else if((ingreso <= 1112459.83) &&
           (superficie <= 45) &&
           (energia <= 5000) ) {
           System.out.println("Categoría B");
        }
        else if ((ingreso <= 1557443.75)&&
            (superficie <= 60) &&
            (energia <= 6700)) {
            System.out.println("Categoria C");


        }

        else if ((ingreso <= 1934273.04) &&
               (superficie <= 85) &&
               (energia <= 10000) ) {
               System.out.println("Categoría D");
            
        }
        else if ((ingreso <= 2277684.56) &&
              (superficie <= 110) &&
              (energia <= 13000) ) {
              System.out.println("Categoría E");
            
        }
    }    
}