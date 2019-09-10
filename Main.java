public class Main{
    public static void main(String[] args){
        School kea = new School("KEA");

        kea.getStudents().put("1", new Student(1, "Philip", "Barkow", "23232949", "bla@bla.dk"));
        kea.getStudents().put("2", new Student(2, "Rasmus", "Høegbergh", "2233445566", "yo@bla.dk"));
        kea.getStudents().put("3", new Student(3, "Nikolaj", "Johnson", "22889988", "ya@bla.dk"));
        kea.getStudents().put("4", new Student(4, "Rasmus", "Rasser", "22334433", "Hey@bla.dk"));

        Navigation n = new Navigation(kea);
    }
}