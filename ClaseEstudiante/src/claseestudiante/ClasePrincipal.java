package claseestudiante;

public class ClasePrincipal {
    public static void main(String[] args) {
        System.out.println(" ###### INFORMACIÓN ESTUDIANTES ######\n");
        ClaseEstudiante [] estudiantes = new ClaseEstudiante [5];
        estudiantes[1]= new ClaseEstudiante("Oswaldo","Núñez","1725890691");
        String [] e1 = {"M1","M2"};
        estudiantes[1].setMaterias(e1);
        estudiantes[2]= new ClaseEstudiante("Jacob","Salgado","1772890631");
        String [] e2 = {"M2","M3","M4"};
        estudiantes[2].setMaterias(e2);
        estudiantes[3]= new ClaseEstudiante("Clara","Guti","1721850671");
        String [] e3 = {"M2","M3","M4","M5"};
        estudiantes[3].setMaterias(e3);
        estudiantes[4]= new ClaseEstudiante("Elizabeth","Madrid","1795890692");
        String [] e4 = {"M3","M5"};
        estudiantes[4].setMaterias(e4);
        /*estudiantes[5]= new ClaseEstudiante("Dario","Gonzales","1724890697");
        String [] e5 = {"M1","M2","M3"};
        estudiantes[5].setMaterias(e5);*/
        for(int a=1; a<5; a++){
            
            System.out.println("     Estudiante "+a);
            System.out.println("Nombre completo: "+estudiantes[a].getNombre()+" "+estudiantes[a].getApellido());
            System.out.println("Cédula: "+estudiantes[a].getCedula()+"\nMaterias: ");
            String [] materiasEstudiante = estudiantes[a].getMaterias();
            for (int i=0; i< materiasEstudiante.length;i++){
                System.out.println(materiasEstudiante[i]);
            }  
        }
        System.out.println("\n ### Resumen Materias ### ");
        int m1=0, m2=0, m3=0, m4=0, m5=0;
        if (e1[0] == "M1" ){
            m1++;                
        }if (e1[1]=="M2"){
            m2++;
        }if (e2[0]=="M2"){
            m2++;   
        }if (e2[1]=="M3"){
            m3++;   
        }if (e2[2]=="M4"){
            m4++;   
        }if (e3[0]=="M2"){
            m2++;   
        }if (e3[1]=="M3"){
            m3++;   
        }if (e3[2]=="M4"){
            m4++;   
        }if (e3[3]=="M5"){
            m5++;   
        }if (e4[0]=="M3"){
            m3++;   
        }if (e4[1]=="M5"){
            m5++;   
        }
        System.out.println("M1 = "+m1);
        System.out.println("M2 = "+m2);
        System.out.println("M3 = "+m3);
        System.out.println("M4 = "+m4);
        System.out.println("M5 = "+m5);
        
    }
}
