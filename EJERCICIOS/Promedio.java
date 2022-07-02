import java.util.Scanner;
public class Promedio{
    public static void main(String [] args) {
        String nombre;
        double calificacion, suma = 0, promedio = 0;
        int i = 1;
        Scanner in = new Scanner (System.in);
        System.out.println("Nombre del alumno");
                nombre= in.nextLine();
        while(i<6){
                            System.out.println("Ingresa la calificacion" + i + "de" + nombre );
calificacion=in.nextInt();
            if((calificacion<11)&&(calificacion>0)){
                i=i+1;
                suma=suma+calificacion;
                               promedio = suma/i; 
}

}


if(promedio>6){
    System.out.println("El promedio de " + nombre + " es de " + promedio + " Felicidades Aprobaste");
}
else{
    System.out.println("El promedio de " + nombre + " es de " + promedio + " Reprobaste, echale ganas");
}
    }
}

