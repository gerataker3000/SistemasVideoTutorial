public class IfCondicionales {
    public static void main(String[] args) {
        int calificacion = 92;
        if(calificacion >=70 && calificacion <= 80){
            System.out.println("Regular");
        }else if(calificacion >=81 && calificacion <=90){
            System.out.println("Buena");
        } else if (calificacion >=91 && calificacion <=100) {
            System.out.println("Excelente");
        }else{
            System.out.println("Ustedes pueden");
        }
    }
}
