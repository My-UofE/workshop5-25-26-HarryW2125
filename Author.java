class Author {
    //declares attributes
    private String name;
    private String email;
    private char gender;

    //constructor
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    //get and set methods
    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public String getName(){
        return this.name;
    }

    public char getGender(){
        return this.gender;
    }

    @Override
    public String toString(){
        return String.format("Author[name=%s,email=%s,gender=%c]",this.name,this.email,this.gender);
    }


}