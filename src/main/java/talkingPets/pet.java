package talkingPets;

public class pet {
    private String name;
    private String type;


    pet(String name,String type){
        {
            this.name = name;
            this.type = type;

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static String speak(String pt){
        String talks = "";
    if(pt == "dog" ||pt == "Dog" ){
        talks = "woof";
    }
    if(pt == "cat" || pt == "cat" ){
        talks = "meow";

    }
    if(pt == "bird" ||pt == "Bird" ){
            talks = "chirp";

    }
    return talks;
    }

    @Override
    public String toString() {
        return "The "+ type + " named " + name  ;
    }
}
