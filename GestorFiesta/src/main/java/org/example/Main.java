package org.example;

public class Main {
    public static void main(String[] args) {



        //en el main llamo a mis clases
        //en el main creo los objetos de mis clases
        // en el main vreo un instancia de mi clase
        //en el main le saco copia a mis clases y creo objetos

        int numeroHijos =18;
        int numerohijosconotra=1;


        Invitado objetoDeClaseInvitado=new Invitado();
        Invitado objeto2= new Invitado(33,true,"Juan",10000);
        String genero;
        if(objeto2.sexo==true){
            genero="Hombre";
        }
        else{
            genero="Mujer";
        }

                //obtener el valor de os atributos
        System.out.println(objetoDeClaseInvitado.nombre+"\n");
        System.out.println("Nombre: "+objeto2.nombre+"\n"+"Edad: "+ objeto2.edad + "\n"+ "Genero: "+genero+"\n"+"Valor Entrada: "+objeto2.valorEntrada);





    }



}