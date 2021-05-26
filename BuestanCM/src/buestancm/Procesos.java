
package buestancm;

import java.util.ArrayList;
import java.util.Scanner;


public class Procesos {
    ArrayList lista=new ArrayList();
    public void IngresarValores(){
        Scanner n=new Scanner(System.in);
        System.out.println("INGRESO DE DATOS");
        System.out.println("Ingrese el la cantidad de numeros a depositar");
        int m=n.nextInt();
        for(int k=0;k<m;k++){
            System.out.print("ingrese el dato en la posicion["+k+"]:");
            int num=n.nextInt();
            lista.add(num);
        }
    }
    public void Seleccion(){
        ArrayList p=new ArrayList();
        for(int l=0;l<5;l=l+1){
            p.add(0);
        }
        ArrayList d=new ArrayList();
        for(int b=0;b<lista.size();b++){
            d.add("-");
        }
        int ite=0;
        int a=0;
        int o=0;
        while(a<lista.size()){
           int i=a;
           int j=a+1;
           while(j<lista.size()){
               int primero=(int)lista.get(i);
               int segundo=(int)lista.get(j);
               p.set(0, "i="+i);
               p.set(1, "j="+j);
               p.set(2, "A="+primero);
               p.set(3, "B="+segundo);
               p.set(4, "menor="+primero);
               if(primero>segundo){
                   p.set(4, "menor"+segundo);
                   if(j==a+1){
                       System.out.println(lista+""+p);
                   }
                   else{
                       System.out.println(d+""+p);
                   }
                   i=j;
                   j++;
                   o=i;
                }else if (primero<segundo){
                   if(j==a+1){
                       System.out.println(lista+""+p);
                   }
                   else{
                       System.out.println(d+""+p);
                   }
                   j++;
                } 
                ite++;
            }
            int laz=(int)lista.get(a);
            lista.set(a,lista.get(o));
            lista.set(o, laz);
        a++;
        o=a;
        }
        System.out.println(lista+"\n con: "+ite+" iteraciones");
    }
    public void inserccion(){
        ArrayList p=new ArrayList();
        for(int l=0;4>l;l=l+1){
            p.add(0);
        }
        int ite=0;
        int a=0;
        int i=a;
        int j=a+1;
        while(j<lista.size()){
            int primero=(int)lista.get(i);
            int segundo=(int)lista.get(j);
            p.set(0,"i="+i);
            p.set(1,"j="+j);
            p.set(2,"A="+primero);
            p.set(3,"B="+segundo);
            System.out.println(lista+""+p);
            ite++;
            int jb=j;
            int ib=i;
            if(primero>segundo){
                jb--;
                ib--;
                int aux=(int) lista.get(i);
                lista.set(i, segundo);
                lista.set(j, aux);
                if(i!=0){
                    while(ib>-1){
                        int prime=(int) lista.get(ib);
                        int secnd=(int) lista.get(jb);
                        p.set(0, "i="+ib);
                        p.set(1, "j="+jb);
                        p.set(2, "A="+prime);
                        p.set(3, "B="+secnd);
                        System.out.println(lista+""+p);
                        ite++;
                        if(prime>secnd){
                            int save=(int)lista.get(ib);
                            lista.set(ib,secnd);
                            lista.set(jb,save);
                            ib--;
                            jb--;
                        }else
                            ib=-1;
                    }   
                }
            i++;
            j++;   
            }
            else{
                j++;
                i++;
            }
            if(j==lista.size()){
              break;
           }
        }
        System.out.println(lista);
        System.out.println("Iteraciones: "+ite+"");
    } 
}
    
        

    

