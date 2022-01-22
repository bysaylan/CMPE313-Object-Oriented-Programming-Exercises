
package LoginWithPass;


public class ConnectionBetweenLoginAndProfile {
    
    String databaseUsername = "admin";
    String databasePassword = "1234";
    
    String username,password; // these i get from the user
    
     ConnectionBetweenLoginAndProfile(String u, String pwd){
     
         this.username = u;
         this.password = pwd;
     }
     
     public void Connection(){
     
         if ((this.username.equals(databaseUsername)) && (this.password.equals(databasePassword)))
         {
             // login successfully done
             
             ProfileForm form = new ProfileForm(username);
             form.setTitle("Welcome " + username);
             form.profileText.setText("Hey "+ username+ " Welcome!");
             form.button.setText("Sign out");
         }
         else
         {
             //failed connection
             ProfileForm form = new ProfileForm("");
             form.setTitle("Error, login failed");
             form.profileText.setText("Username and Password do not match");
             form.button.setText("Go Back");
         }
     
     }
}
