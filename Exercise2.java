import java.util.*;

public class Exercise2{
	private String nombre;
	private String apellido;
	private int edad;
	
	public Exercise2(){
		this.nombre="Juan";
		this.apellido= "Carlos";
		this.edad = 17;
	}
	
	public Exercise2(String nombre,String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = 8;
		
	}
	
	public Exercise2(String nombre,String apellido,int edad){
		this.nombre= nombre;
		this.apellido=apellido;
		this.edad=edad; 		
	}
	
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public String getApellido(){
		return apellido;
	}
	public void setApellido(String apellido){
		this.apellido=apellido;
	}
	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad){
		this.edad = edad;
}

  public String imprimirObjeto(){
	  return "Nombre :"+nombre+" ,Apellido: "+apellido+" ,Edad: "+edad; 
  }
  
  public static void separatedListOfNumber(int ...number){ // I am using varArgs. 
       
	   List<Integer> odds = new ArrayList<>();
	   List<Integer> even = new ArrayList<>();
	   
	  for(int i=0;i<number.length;i++){
		  if(number[i]%2==0){
			  odds.add(number[i]);
		  } else{
			  even.add(number[i]);
		  }
	  }
	  
	  System.out.println("List of odds: ");
	  for(int i:odds) {
		  System.out.print(" "+i);
	  }
	  System.out.println();
	  System.out.println("List of even: ");
	  for(int i: even){
		  System.out.print(" "+i);
	  }
  }
	  
	  public static void printPattern(){
		  for(int i=0;i<20;i++){
			  
		  }
  }
  
  public static void main(String args[]){
	  
	  Exercise2 obj = new Exercise2();
	   System.out.println();
	   System.out.println();
	   System.out.println("Printing the object using first constructor.\n");
	   System.out.println(obj.imprimirObjeto()+"\n");
	   
	   //Changing the values of the object with second constructor.
	   
	   obj = new Exercise2("Enrique","Patas");
	   System.out.println("Printing the object using second constructor.\n");
	   System.out.println(obj.imprimirObjeto()+"\n");
	   
	   //Changing the values of the object with third constructor.
	   obj = new Exercise2("Sofia","Anillas", 24);
	   System.out.println("Printing the object using third constructor.\n");
	   System.out.println(obj.imprimirObjeto()+"\n");
	   
	   //Changing the values of the object with setter.
	   obj.setNombre("Martina");
	   obj.setApellido("carlos");
	   obj.setEdad(18);
	   System.out.println("Printing the object using getter.\n");
	   System.out.println("Nombre: "+obj.getNombre()+" ,Apellido: "+obj.getApellido()+" ,Edad: "+obj.getEdad()+"\n");
	   
	   //sending a list of numbers to be separated in Odds and even.
	   Exercise2.separatedListOfNumber(2,5,8,1,81,23,45,6);
  }
}