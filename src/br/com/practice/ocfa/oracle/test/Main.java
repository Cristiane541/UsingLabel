package br.com.practice.ocfa.oracle.test;

public class Main {

    public static void main(String[] args) {
	    String[][] groups = {{"Ally", "bob","charlie"}, {"Bob", "Alice", "Boone"}, {"Chad","dave", "Cristoe"}};

        FOUND_HER: for (int i = 0; i < groups.length; i++){
            for (String nomes: groups[i]) {
                if (nomes.equalsIgnoreCase("alice")){
                    System.out.println("Encontrei Alice");
                    continue FOUND_HER;
                }
            }
        }
    }
}
