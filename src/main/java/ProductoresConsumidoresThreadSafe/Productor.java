package ProductoresConsumidoresThreadSafe;

public class Productor implements Runnable{
    Cola colaCompartida;
    public Productor(Cola cola){
        this.colaCompartida=cola;
    }
    public void run() {
        while (true){
            int num=(int)(Math. random()*10+1);
            while (colaCompartida.encolar(num)==false){

            } /*Fin del while*/

            System.out.println("Productor encoló el numero:"+num);
        } /*Fin del while externo*/
    } /*Fin de run()*/
} /*Fin de la clase*/