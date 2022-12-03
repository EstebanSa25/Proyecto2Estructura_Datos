package Proyecto;

import java.util.HashSet;
import java.util.LinkedList;



public class Clasecola {
    
    // Atributos
    private  final int MAXTAM = 10; // variable constante
    private  int frente;
    private  int ultimo;
    private int []cola;
    private int tamanio_actual=0;
    private LinkedList<Integer> datos = new LinkedList<Integer>();

    public int getTamanio_actual() {
        return tamanio_actual;
    }

    public void setTamanio_actual(int tamanio_actual) {
        this.tamanio_actual = tamanio_actual;
    }

    public int getFrente() {
        return frente;
    }

    public void setFrente(int frente) {
        this.frente = frente;
    }

    public int getUltimo() {
        return ultimo;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }
    
    
 public Clasecola()
 {
    frente = 0;
    ultimo = -1;
    cola = new int [MAXTAM];
    tamanio_actual=-1;
 }   
 
 public void insertar(int elemento,int contador)throws Exception{


     if (!Colallena(contador)){
         cola[contador] = elemento;
         this.setUltimo(ultimo++);
         datos.add(elemento);
    }else{
         throw new Exception("LA COLA ESA LLENA");
     }

 }

    
 
  public int eliminar(int _frente)throws Exception
 {
     if (!ColaVacia(_frente)){
         datos.remove(this.getFrente());
//         this.setFrente(_frente++);
         
       return cola[_frente];
    }else
      throw new Exception("LA COLA ESTA VACIA");
 }

  public void Borrartodo()
  {
     frente = 0;
     ultimo = -1;
  }
  
 public int frente(int _frente) throws Exception
  {
      if (!ColaVacia(_frente)) 
          return cola[_frente];
      else
     throw new Exception("LA COLA ESTA VACIA");
  }

  
  
 public boolean Colallena(int contador)
 {
   return contador == MAXTAM - 1;
 }
 
public boolean ColaVacia(int _frente)
 {
   return _frente > tamanio_actual && datos.size()==0;
 }
 
 

 
 public void MostrarContenido(){
     if(datos.size()==0){
         System.out.println("Esta cola no tiene elementos");
     }else
   System.out.println("Persona:"+datos);
    }
}