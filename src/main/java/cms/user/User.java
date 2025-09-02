package cms.user;

public abstract class User {
    protected int id;
    protected String nome;
    protected String email;
    protected String password;


    protected User(int id, String nome, String email, String password) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

   
    public int  getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }

    
    public boolean checkPassword(String candidate) {
        return password != null && password.equals(candidate);
    }  

    public static void main(String[] args) {
        User u1 = new AdminUser(1, "Alice", "alice@example.com", "abc123");
        User u2 = new EditorUser(2, "Bruno", "bruno@example.com", "abc456");
        User u3 = new GuestUser(3, "Carla", "carla@example.com", "abc789");

        boolean ok1 = u1.checkPassword("abc123"); 
        boolean ok2 = u2.checkPassword("wrong");   
        boolean ok3 = u3.checkPassword("abc789"); 

        System.out.println("ok1: " + ok1); 
        System.out.println("ok2: " + ok2); 
        System.out.println("ok3: " + ok3); 

        System.out.println(u1.getNome()); 
        System.out.println(u3.getNome()); 
    }
}