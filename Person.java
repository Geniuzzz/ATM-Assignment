class Person {
    private int noOfEyes;
    private int noOfEars;
    private int noOfMouth;    
    public String name;
    public int age;
    public char gender;
    private boolean isAdult;

//THE CONSTRUCTOR THAT ACCEPT A VALUE OF NAME
public Person(String name){
    this.name = name;
}
public Person(String name,char gender,int age){
    this.name = name;
    this.gender = gender;
    this.age = age;
}