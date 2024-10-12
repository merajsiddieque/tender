package User;

public abstract class user {
    private String username;
    private String user_id;
    public void set_us_name(String x){
       this.username = x;
    }
    public String get_us_name(){
        return username;
    }
    public void set_us_id(String x){
        this.user_id = x;
     }
     public String get_us_id(){
         return user_id;
     }
      public void login(){};
      public void logout(){};
}
