import java.util.Scanner;

public class Navigation {
    // True hvis systemet kører og false hvis det er slukket
    private boolean RunStatus;
    private Scanner SC;
    private School School;

    public Navigation(School school){
        this.RunStatus = true;
        this.SC = new Scanner(System.in);
        this.School = school;


        this.welcomeMessage();
        // Viser valgmuligheder
        this.showFrontPage();

        // Så længe RunStatus er true
        while(this.isRunStatus()){
            switch (this.SC.nextLine()){
                case "1":
                    // Viser alle eksisterende kurser
                    this.listCourses();
                    this.showFrontPage();

                    break;
                case "2":
                    // Opretter et kursus
                    this.createCourse();
                    this.showFrontPage();

                    break;
                case "3":

                    break;
                case "9":
                    this.exit();

                    break;
                default:
                    System.out.println("Det valgte tal repræsentere ikke en valgmulighed. Prøv igen.");
                    this.showFrontPage();

                    break;
            }

        }
    }

    public void createCourse(){
        System.out.println("Skriv navn på kursus:");
        this.School.createCourse(SC.nextLine());
        System.out.println("Kursus oprettet.");
    }
    public void deleteCourse(int courseID){

    }
    public void listCourses(){
        System.out.println("ID : NAVN");
        for(int i = 0; i < this.School.getCourses().size(); i++){
            Course course = this.School.getCourses().get(i);

            System.out.println(course.getID() + " : " + course.getName());
        }
    }

    public void welcomeMessage(){
        System.out.println("Welcome to the administrative system for " + this.School.getName() + "\n");
    }
    public void showFrontPage(){
        System.out.println("Vælg en af følgende valgmuligheder ved at skrive tallet for valgmuligheden og tryk enter");
        System.out.println("1. Vis kurser");
        System.out.println("2. Opret kursus");
        System.out.println("3. Slet kursus");
    }

    public void exit(){
        System.out.println("Afslutter programmet");
        this.RunStatus = false;
    }

    public boolean isRunStatus() {
        return RunStatus;
    }

    public void setRunStatus(boolean runStatus) {
        RunStatus = runStatus;
    }

    public Scanner getS() {
        return SC;
    }

    public void setS(Scanner s) {
        SC = s;
    }

    public School getSchool() {
        return School;
    }

    public void setSchool(School school) {
        School = school;
    }
}
