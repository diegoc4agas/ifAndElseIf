public class Project {
    public static void main(String[] args) {
        String [][] professores = new String[][]
                {{"Leonora", "Geografia", "24"}, {"Didico", "Informática", "30"}, {"Neneco", "Anatomia", "27"}, {"Cah", "Psicóloga", "27"}};
        for(String[] professor : professores){
            if(Integer.parseInt(professor[2]) > 25){
                System.out.println(professor[0]+" é um professor(a) de " +professor[1]+ " experiente!");
            } else {
                System.out.println(professor[0]+" é um professor(a) de " +professor[1]+ " iniciante!");
            }
        }
    }
}
