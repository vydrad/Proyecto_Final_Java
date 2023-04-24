/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajopracticointegradorgrupo7;

/**
 *
 * @author david
 */

//// PROGRAMA DESARROLLADO POR DAVID THOMAS VYDRA EN SOLITARIO
////PROFE NO USÉ HERENCIA, PERO SÍ COMPOSICION POR FALTA DE TIEMPO, PUEDO CAMBIARLO SI USTED PRECISA
public class TrabajoPracticoIntegradorGRUPO7 {

    public static void main(String[] args) {
          ManipularCSV Archivo=new  ManipularCSV();
          String Ruta1="C:\\Users\\david\\Documents\\NetBeansProjects\\TrabajoPracticoIntegradorGRUPO7\\Resultados.txt";
          Archivo.leerArchivo(Ruta1);
          String Ruta2="C:\\Users\\david\\Documents\\NetBeansProjects\\TrabajoPracticoIntegradorGRUPO7\\Pronosticos.txt";
           ManipularCSV Archivo2=new  ManipularCSV();
           Archivo2.leerArchivo(Ruta2);
    
           int CantidadResultados;
           int CantidadPronosticos;
           CantidadResultados=Archivo.ContarArchivo(Ruta1);
           CantidadPronosticos=Archivo2.ContarArchivo(Ruta2);
          //// System.out.println("CANTResu "+CantidadResultados);
          //// System.out.println("CANTProno "+CantidadPronosticos);
           
           Partido[] Partidos=new Partido[CantidadResultados];
           Partido[] PartidosPasados=new Partido[CantidadResultados];
           Partido[] PartidosOrdenados=new Partido[CantidadResultados];
           Pronostico[] Pronosticos=new Pronostico[CantidadPronosticos];
           Pronostico[] PronosticosPasados=new Pronostico[CantidadPronosticos];
           Pronostico[] PronosticosOrdenados=new Pronostico[CantidadPronosticos];
           
        PartidosPasados=Archivo.SacarPartidos(Ruta1, Partidos);///TODOS LOS PARTIDOS PASADOS

     PartidosOrdenados=OrdenarPartidosxRonda(PartidosPasados); ///ORDENADOS POR RONDA
         /*   for(Partido d: PartidosOrdenados){
               System.out.println("Partidos,ORDENADOS:"+d);}*/
        PronosticosPasados=Archivo2.SacarPronosticos(Ruta2,Pronosticos);
          
    PronosticosOrdenados=OrdenarPronosticoNombre(PronosticosPasados);//ORDENADOR POR NOMBRE
           /// HASTA ACA TENGO TODOS LOS DATOS DE LOS REGISTROS PASADOS CORRECTAMENTE
      /*   for(Pronostico b: PronosticosOrdenados){
               System.out.println("Pronosticos,ORDENADOS"+b);
           }*/
        int CantidadRondas;
        CantidadRondas=ContarRondas(PartidosOrdenados);
        
      /////  System.out.println("CANTIDAD RONDASDEVUELTAS:"+CantidadRondas);

          int CantidadPersonas=ContarPersonas(PronosticosOrdenados);
          ///STRING CON LAS PERSONAS SIN Repetir Al tamaño justo :v
    
          String[] Personaas=new String[CantidadPersonas];
          Personaas=DevolverPersonas(PronosticosOrdenados,CantidadPersonas);
          
        /*  for(String asd:Personaas){
              System.out.println("miravo"+asd);
          }*/
          
           Personas[] Perper=new Personas[CantidadPersonas];
          Personas[] PersonasReales=new Personas[CantidadPersonas];
         PersonasReales=DevolverPersonasReales(Perper,Personaas);

          /// CON ESTE STRING DESPUES COMPARO EL NOMBRE Y LAS RONDAS
    /*      for(Personas p: PersonasReales){
              System.out.println("p"+p);
          }*/

       Resultado(PartidosOrdenados,PronosticosOrdenados,CantidadRondas,PersonasReales);
      

          
       
      /// PRIMERO BUSCO LAS RONDAS Y COMPARO LOS PAISES QUE SE ENCUENTRA EN PRIMERA RONDA
      /// A LOS PAISES DEL PRONOSTICO, Y LOS QUE SON IGUALES, LOS MUESTRO Y GUARDO EL NOMBRE
      /// PARA SABER QUE APOSTÓ Y SI GANÓ O NO
      
      
      // DESPUES TENGO QUE AGREGAR LOS GOLES TOTALES A EQUIPO
      
      // Y PUNTOS TOTALES A PERSONAS Y LISTO GGWP
      
      
    }
    
    public static Personas[] Resultado(Partido[] partido, Pronostico[] pronos,int CantRondas,Personas[] persona){
        String Ganador=new String();
        System.out.println("------------------TABLA GENERAL-----------------");
        for(int i=0;i<CantRondas;i++){
             System.out.println("----------------RESULTADOS RONDA"+(i+1)+"------------");
            for(int a=0;a<partido.length;a++){ ///LEYENDO LOS PARTIDOS QUE ESTEN EN 1RA RONDA
                if(partido[a].getNroRonda().getNroRonda()==i+1){  /// SI los Partidos SON del Numero de Ronda I
         
                  //   System.out.println("partido pos:"+a+" ES"+partido[a]);

                    /// QUE LOS COMPA
                    for(int b=0;b<pronos.length;b++){
                        ///MUESTRA CADA PARTIDO DE LA RONDA 8 VECES
                         /// System.out.println("LOS PARTIDOS DE LA RONDA"+(i+1)+" SON "+partido[a]+"EL GANADOR ES Ganador");
                        ///    System.out.println("LOS PRONOSTICOS DE LA RONDA"+(i+1)+" SON "+pronos[b]);
                        if(partido[a].getEquipo1().getNombre().equals(pronos[b].getEquipo1().getNombre())&&///SI PARTIDO1 ES IGUAL A EQUIPO1 EN EL PRONOSTICO
                           partido[a].getEquipo2().getNombre().equals(pronos[b].getEquipo2().getNombre())){//Y EL PARTIDO2 ES IGUAL AL PARTIDO 2
                           
                         /*     System.out.println("ESTOS PARTIDOS COINCIDEN LOS NOMBRES DE LOS EQUIPOS!!!!!!!!!!!!!!!!!");
                              System.out.println("PARTIDO[A]:"+a+" "+partido[a]);
                            System.out.println("PRONOSTICO[B]:"+b+" "+pronos[b]);
                            System.out.println("----------------");*/

/// si son iguales 
                            /// SACO EL NOMBRE Y COMPARO SI GANO O NO 
                          if(partido[a].getGoles1()>partido[a].getGoles2()){ //SI EL Equipo1 metio mas goles
                                Ganador=partido[a].getEquipo1().getNombre();///partido[a].getEquipo1().toString();

                            }
                            else if(partido[a].getGoles1()==partido[a].getGoles2()){
                                Ganador="EMPATE";
                                }
                            else{Ganador=partido[a].getEquipo2().getNombre();}
                            
                         ///   System.out.println("LOS PARTIDOS DE LA RONDA"+(i+1)+" SON "+partido[a]+"EL GANADOR ES"+Ganador);
                            //System.out.println("EL GANADOR EN LA RONDA"+(i+1)+" ES:"+Ganador);
                                                                                  ///COMPARANDO EL GANADOR EN EL PARTIDO
                                                                                  // CON EL Ganador de Pronostico
                                if(Ganador.equals(pronos[b].getGanador())){/// SI EL PRONOSTICO LE ACERTO 
                                
                                   /* System.out.println("PronosticoPARTIDO:"+Ganador);
                                    System.out.println("PronosticoPERSONA"+pronos[b].getGanador());*/
                                   System.out.println(pronos[b].getNombre()+" HA GANADO 1 PUNTOS EN RONDA:"+ (i+1));
                                    
                                    String Auxa=pronos[b].getNombre();
                                    int auxi=0;
                                    Personas Perso=new Personas(Auxa,3);
                                     for(int l=0;l<persona.length;l++){
                                        if (persona[l].getNombre().equals(pronos[b].getNombre())){
     
                                            persona[l].setPuntotTot(persona[l].getPuntotTot()+1);
                                        }
                                    
                                    }
                                }

                        } ///IF QUE COMPARA LOS NOMBRES DE LOS EQUIPOS DE LOS PARTIDOS EN LOS PRONOSTICOS
                       /* else{System.out.println("ESTOS PARTIDOS NO COINCIDEN LOS NOMBRES DE LOS EQUIPOS");
                              System.out.println("PARTIDO[A]"+partido[a]);
                            System.out.println("PRONOSTICO[B]"+pronos[b]);}*/
                        
                        
            }///FOR RECORRER PRONOSTICOS
          
        }/// IF QUE PREGUNTA EN QUE RONDA ESTAN

    }///FOR DE LOS PARTIDOS
            
             ///System.out.println("NOMBRE DEL GANADOR EN PRONO"+(i+1)+" ES:"+pronos[b].getGanador());
           

            System.out.println("---------------FIN DE LA RONDA"+(i+1)+"----------------");
            System.out.println("--------------------------------------------------");
         
             
        }/// FOR DE LAS RONDAS
            /// 
      System.out.println("---------------TABLA FINAL DE PUNTAJES----------------");
         for(Personas exdi:persona){
         System.out.println(exdi);
         }
        System.out.println("-------------------------------------------------------");
        
        return persona;
    }
    
    
    
        public static Personas[] DevolverPersonasReales(Personas[] perso,String[] personasstr){ // devuelve un String[]Con los Nombres ya Filtrados
       
       String Personasa= new String();
        int Contador=0;
        for(int e=0;e<perso.length;e++){
        Personas persona=new Personas(personasstr[e],0);
        perso[e]=persona;
        }
       /* for(Personas aaa:perso){
         System.out.println("aaaa"+aaa);
        }*/
        

        return perso;
        }
    
    
    
    
    
    
    
    
    
    public static Partido[] OrdenarPartidosxRonda(Partido[] partido){
   /*     Ronda Nroronda=new Ronda(0,0,0);
        Equipo Equipo1=new Equipo("nada",0);
        Equipo Equipo2=new Equipo("nada",0);*/

      /*  Partido Aux=new Partido(Nroronda,Equipo1,Equipo2,0,0);
        Aux=partido[0];*/
        Partido[] copia=new Partido[partido.length];
        
        for(int f=0;f<partido.length;f++){
            copia[f]=partido[f];
        }

        for(int i=0; i<partido.length-1;i++){
            for(int j=0; j<partido.length-1;j++){
                if(copia[j].getNroRonda().getNroRonda()>partido[j+1].getNroRonda().getNroRonda()){
                copia[j]=partido[j];
                partido[j]=partido[j+1];
                partido[j+1]=copia[j];
                }      
            }     
        }
/*
        for(Partido b: Aux2){
        System.out.println("a:"+b);
        } */
        
    /*    for(Partido qq: copia){
            System.out.println("COPIA:"+qq);
        }
        for(Partido ll:partido ){
            System.out.println("partido:"+ll);
        }
*/
        return partido;
    }
    
    public static Pronostico[] OrdenarPronosticoNombre(Pronostico[] pronos){
        
        Equipo Equipo1=new Equipo("nada",0);
        Equipo Equipo2=new Equipo("nada",0);
        Pronostico Aux=new Pronostico("nadie",Equipo1,Equipo2,"NADIEGANO");///pronos[0];
        /////System.out.println("pronos.lenght"+pronos.length);
        for(int i=0;i<pronos.length-1;i++){
            
            for(int j=0;j<pronos.length-1;j++){
                if(pronos[j].getNombre().compareTo(pronos[j+1].getNombre())>0){
                   Aux=pronos[j];
                    pronos[j]=pronos[j+1];
                    pronos[j+1]=Aux;
                }
            }
        }
        return pronos;
        
    }
    
    public static int ContarPersonas(Pronostico[] prono){//filtra las que se repiten y devuelve el numero real de personas
        
        int Contador=1;
        String Aux=new String();
        Aux=prono[0].getNombre();
        for(int i=1;i<prono.length;i++){
            
            if(!Aux.equals(prono[i].getNombre())){
                Aux=prono[i].getNombre();
                Contador++;
            }
        }
       ///// System.out.println("Contador personas vale:"+Contador);
        return Contador;
}
    
    
    public static String[] DevolverPersonas(Pronostico[] prono,int tam){ // devuelve un String[]Con los Nombres ya Filtrados
        
        String[]Personas= new String[tam];
        int Contador=0;
        Personas[0]=prono[0].getNombre();
        
        for(int i=1;i<prono.length;i++){
            if(!Personas[Contador].equals(prono[i].getNombre())){
                Contador++;
                Personas[Contador]=prono[i].getNombre(); 
            }
        }

        return Personas;
 
}
    
    public static int ContarRondas(Partido[] partido){
       Ronda Nroronda=new Ronda(0,0,0);
        Equipo Equipo1=new Equipo("nada",0);
        Equipo Equipo2=new Equipo("nada",0);

      /*  Partido Aux=new Partido(Nroronda,Equipo1,Equipo2,0,0);
        Aux=partido[0];*/
        Partido copia=new Partido(Nroronda,Equipo1,Equipo2,0,0);
        
        //int Aux=0;
        copia=partido[0];
        int cont=1;
        for (int i=1;i<partido.length;i++){
            if(copia.getNroRonda().getNroRonda()!=partido[i].getNroRonda().getNroRonda()){
                copia=partido[i];
                cont++;
            }
        }
       // System.out.println("CONTADORDERONDAS:"+cont);
        return cont;
        
    }    
    
    
}