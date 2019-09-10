public class Student {
   private int ID;
   private String Firstname;
   private String Lastname;
   private String Phonenumber;
   private String Email;

   public Student(int ID, String firstname, String lastname, String phonenumber, String email) {
      this.ID = ID;
      this.Firstname = firstname;
      this.Lastname = lastname;
      this.Phonenumber = phonenumber;
      this.Email = email;
   }


   public int getID() {
      return ID;
   }

   public void setID(int ID) {
      this.ID = ID;
   }

   public String getFirstname() {
      return Firstname;
   }

   public void setFirstname(String firstname) {
      Firstname = firstname;
   }

   public String getLastname() {
      return Lastname;
   }

   public void setLastname(String lastname) {
      Lastname = lastname;
   }

   public String getPhonenumber() {
      return Phonenumber;
   }

   public void setPhonenumber(String phonenumber) {
      Phonenumber = phonenumber;
   }

   public String getEmail() {
      return Email;
   }

   public void setEmail(String email) {
      Email = email;
   }

}
