class Profile {
    public static void main(String[] args){
    String name;
    String profession;
    int noOfSiblings;
    int transport;

    name = "Oscar";
    profession = "developer";
    noOfSiblings = 3;
    transport = 260;

System.out.println(
    String.format("My name is %s and I am a %s. i have %d siblings and I spend %d naira daily on my transportation down here",name,profession,noOfSiblings,transport));
    //"My name is " + name + " and I am a " + profession + ". i have " + noOfSiblings + " siblings and I spend " + transport + " naira daily on my transportation down here");

     }
}