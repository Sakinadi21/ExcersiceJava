package excersice2;

//create class with excersice2.dog
//name and breed attribute
//two instances of the excersice2.dog class
//set their attributes using the constructor and modify the attributes using the setter methods
//print the updated values
public class dog {
    private String name;
    private String breed;
    public dog(String name,String breed){
        this.name=name;
        this.breed=breed;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String name){
        this.breed=breed;
    }


}
