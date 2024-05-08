package Parcial;

public class Main {
    public static void main(String[] args) {
        //Instanciacion de objetos
        Athlete a1 = new Athlete(12345678, "Paula Geier", 1.67, 21, 62.32);
        Athlete a2 = new Athlete(21436578, "Rodrigo Zapata", 1.74, 19, 70);
        Athlete a3 = new Athlete(89652341, "Nazareno Fioretti", 1.68, 18, 68.556);
        Athlete a4 = new Athlete(78561234, "Mauro Garzia", 1.68, 21, 71.59);
        Athlete a5 = new Athlete(78894556, "Tomas Perez", 1.77, 20, 74.43);


        EquipoNacional en1 = new EquipoNacional("Celeste y blanco", "Argentina");

        Campus c1 = new Campus(1, "20/04/2024", "11:30");

        Facility f1 = new Facility("U19", "Patio", "Patio Juan", "Saltos");
        Facility f2 = new Facility("U20", "Pista", "Pista Malvinas", "Usar piernas");

        Proof p1 = new Proof(4, "Salto en alto");
        Proof p2 = new Proof(2, "Correr 100 metros");
        Proof p3 = new Proof(1, "Salto largo");
        Proof p4 = new Proof(9, "Correr 4500 metros");


        //añadiendo instalaciones a las Sedes
        c1.addFacility(f1);
        c1.addFacility(f2);

        //añadiendo atletas a Equipo nacional
        en1.addAtlhete(a1);
        en1.addAtlhete(a2);
        en1.addAtlhete(a3);
        en1.addAtlhete(a4);
        en1.addAtlhete(a5);

        //Añadiendo atletas a las pruebas
        p1.addParticipant(a1);
        p1.addParticipant(a2);
        p2.addParticipant(a2);
        p2.addParticipant(a3);
        p3.addParticipant(a3);
        p3.addParticipant(a4);
        p4.addParticipant(a4);
        p4.addParticipant(a5);

        //Añadiendo pruebas a las instalaciones
        f2.addProofs(p1);
        c1.getFacilities().get(1).addProofs(p4);
        f1.addProofs(p2);
        c1.getFacilities().get(0).addProofs(p3);


        System.out.println("El nombre del 3er participante de la prueba "+ c1.getFacilities().get(1).getPruebas().get(1).getTitle() + " es: " + c1.getFacilities().get(1).getPruebas().get(1).getParticipants().get(2).getName());

        System.out.println("El código de la 2da prueba es: " + c1.getFacilities().get(1).getPruebas().get(1).getCode());

        for (Athlete integrant: en1.getTeam()) {
            System.out.println(integrant.getName());
            System.out.println("Altura: " + integrant.getHeight());

            if (integrant.overweight(integrant.calcIMC())){
                System.out.println("Tiene sobrepeso");
            }else {
                System.out.println("No tiene sobrepeso");
            }
            System.out.println();
        }


    }
}
