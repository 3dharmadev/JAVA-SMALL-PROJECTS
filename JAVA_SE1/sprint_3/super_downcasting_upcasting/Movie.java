package java111.sprint_3.super_downcasting_upcasting;

public class Movie {
    String name;
    Double duration;

    public Movie(String name,Double duration){
        this.name=name;
        this.duration  = duration;
    }

   @Override
    public String toString(){
        return this.name+"->"+duration;
   }
}
