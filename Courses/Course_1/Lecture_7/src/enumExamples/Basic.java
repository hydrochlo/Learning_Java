package enumExamples;

public class Basic {
    enum Week{
        // These are enum constants
        // public, static and final
        Sunday, Monday, Tuesday, Wednesday, Thursday, Saturday, Friday;
        // Since its final you can create child enums
        // type is Week

        // This is not public or protected, only private or default
        // Why???
        // We don't want to create new objects
        // this is not the enum concept, that's the reason
        Week() {
            System.out.println("Constructor called for " + this);
        }

        // internally:
        // public static final week Monday = new Week();
    }

    enum Month implements A{
        January, February, March;

        @Override
        public void hello(){
            System.out.println("Hello");
        }

        Month() {
            System.out.println("constructing....");
        }
    }

    static void main(String[] args) {
        Week w;
        w = Week.Friday;
        for(Week day: Week.values()){
            System.out.println(day);
        }

        System.out.println(w);
        System.out.println(w.ordinal());
    }

}
