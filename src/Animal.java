public interface Animal {
    void wolk();
    void run();
    default  String eat(){
        return "Animal eat";
    }

    static  String sllep(){
        return "Animal sllep";
    }
}
