public class ProjectClass {
    String name = "";
    String desc = "";

    public String elevatorPitch () {

    String l = name + ":" + desc;
    return l; 

    }
public ProjectClass() {}

public ProjectClass(String name) {
    this.name = name;
}

public ProjectClass(String name, String desc) {
    this.name = name;
    this.desc = desc;
}

public String getName (){
    return name; 
}

public void setName (String name){
    this.name = name ;

}

public String getdesc (){
    return desc; 
}

public void setdesc (String desc){
    this.desc = desc ;

}
    public String elevatorPitch(String name, String desc){
        
    }
}
