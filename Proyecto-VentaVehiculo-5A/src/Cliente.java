
public class Cliente {
    
    private String rs;
    private String rfc;
    private String email;
    
    public Cliente(String rs, String rfc, String email){
    this.rs = rs;
    this.rfc = rfc;
    this.email = email;
    }
    
    
                //get()
    public String getRs(){return this.rs;}
    public String getRfc(){return this.rfc;}
    public String getEmail(){return this.email;}
    
    
    
                //Set()
    public void setRs(String rs){this.rs = rs;}
    public void setRfc(String rfc){this.rfc = rfc;}
    public void setEmail(String email){this.email = email;}
    
    
    
    @Override
    public String toString(){return "Rs: "+ this.rs+"\n"
            + "RFC: "+ this.rfc + "\n" +
            "Email: "+ this.email +"\n";}
}
