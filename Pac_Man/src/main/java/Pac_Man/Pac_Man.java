package Pac_Man;
        
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pac_Man {
    @SuppressWarnings("empty-statement")
    public static void main (String[]args){
        Scanner sn = new Scanner (System.in);
        Scanner entrada = new Scanner (System.in);
        boolean salir = false;
        {
            System.out.println("PACMAN -  IPC1  - 2022");
            System.out.println("----------------------");
            System.out.println("1.       INICIAR JUEGO");
            System.out.println("2. TABLA DE POSICIONES");
            System.out.println("3.               SALIR");
            System.out.println(" INGRESE UNA OPCIÓN...\n");
            
            try {
   
                int opcion = sn.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("INGRESE SU NOMBRE");
                    String nombre = entrada.nextLine();
                    System.out.println("INGRESE EL TAMAÑO DEL TABLERO\n"
                            + "CUÁNTAS FILAS DESEA");
                    int nfilas = entrada.nextInt();
                    System.out.println("CUÁNTAS COLUMNAS DESEA");
                    int ncolumnas = entrada.nextInt();
                    int cuarentapc = (int) ((nfilas*ncolumnas)*0.4);
                    int veintepc = (int) ((nfilas*ncolumnas)*0.2);
                    System.out.println("INGRESE CANTIDAD DE COMIDA DESEADA (0-"+cuarentapc+")");
                    int ncomida = entrada.nextInt();                    
                    System.out.println("INGRESE CANTIDAD DE PAREDES (0-"+veintepc+")");
                    int nparedes = entrada.nextInt();
                    System.out.println("INGRESE CANTIDAD DE TRAMPAS (0-"+veintepc+")");
                    int ntrampas = entrada.nextInt();
                    System.out.println("ELIJA UNO DE LOS ÍCONOS PARA JUGAR\n"
                            + "1. ®\n"
                            + "2. «\n"
                            + "3. »\n"
                            + "4. ╬\n"
                            + "5. ¤\n"
                            + "6. ▓\n"
                            + "7. ■\n"
                            + "8. §\n"
                            + "9. ƒ\n"
                            + "10. ¢\n"
                            + "INGRESE EL ÍCONO DESEADO"); 
                    int icono = entrada.nextInt();
                    switch (icono){
                        case 1:
                            System.out.println(nombre+"\n"
                                    + "-------------------------\n");
                            String tablero[][] = new String [nfilas][ncolumnas];
                            for (int i=0; i<=ncomida*0.25;i++){
                                tablero[i+=1][0]= "@"; 
                            }
                            for (int i=0; i<=ncomida*0.25;i++){
                                tablero[0][i]= "@"; 
                            }
                            for (int i=0; i<=ncomida*0.25;i++){
                                tablero[i][1]= "?"; 
                            }
                            for (int i=0; i<=ncomida*0.25;i++){
                                tablero[2][i]= "?"; 
                            }
                            for (int i=0; i<=nparedes*0.50;i++){
                                tablero[i][3]= "#:"; 
                            }
                            for (int i=0; i<=nparedes*0.50;i++){
                                tablero[3][i]= "#"; 
                            }
                            for (int i=0; i<=ntrampas*0.50;i++){
                                tablero[i][2]= "X"; 
                            }
                            for (int i=0; i<=ntrampas*0.50;i++){
                                tablero[4][i]= "X"; 
                            }
                            for (int i=0;i<nfilas;i++){
                           for (int j=0;j<ncolumnas;j++){
                               System.out.print(tablero[i][j]);
                           }
                                System.out.println("");
                    }
                        break;
                        case 2:
                            
                        
                    }
                    break;

                    case 2:
                    System.out.println("TABLA DE POSICIONES");
                    break;
                    case 3:
                    salir=true;
                    break;
                default: 
                    System.out.println("LAS OPCIONES VALIDAS SON DEL 1 AL 3");
            }
    }catch (InputMismatchException e){
        System.out.println("ESTE MENÚ SOLO FUNCIONA CON NUMEROS");
        sn.next();
    }
}System.out.println("FIN DEL JUEGO\n"
        + "LO SIENTO PERO NO SE NADA DE JAVA T-T");
    }
}