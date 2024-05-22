package exercises.oop.javaShop;

public class Main {

        public static void main(String[] args) {


            Product product1 = new Product(5, "Mastrolindo", "Sgrassatore", 5.99);

            System.out.println(product1);


            String product1Code = product1.getCode();
            System.out.println("Codice del prodotto: " + product1Code);

            //prezzo base
            double product1basePrice = product1.getPrice();
            System.out.println("Prezzo base: " + product1basePrice);

            // prezzo comprensivo di iva
            double product1vatPrice = product1.getVatPrice();
            System.out.println("Prezzo comprensivo del " + product1.getVat() + "% di iva: " + product1vatPrice );


            String product1Name = product1.getName();
            System.out.println("Nome del prodotto: " + product1Name);

            Product product2 = new Product(22, "Amuchina", "Igienizzante", 3.49);

            System.out.println(product2);


            String product2Code = product2.getCode();
            System.out.println("Codice del prodotto: " + product2Code);

            //prezzo base
            double product2basePrice = product2.getPrice();
            System.out.println("Prezzo base: " + product2basePrice);

            //prezzo comprensivo di iva
            double product2vatPrice = product2.getVatPrice();
            System.out.println("Prezzo comprensivo del " + product2.getVat() + "% di iva: " + product2vatPrice );

            //nome esteso
            String product2Name = product2.getName();
            System.out.println("Nome del prodotto: " + product2Name);
        }
    }
