public class Wilder {

    // *** attributes *** //
    private String firstname;
    private boolean aware;

    // *** constructors *** //
    public Wilder(String firstname) {
        this.firstname = firstname;
        this.aware = false;
    }

    public Wilder(String name, boolean aware) {
        this.firstname = name;
        this.aware = false;
    }

    // *** instance method *** //
    public String whoAmI() {

        String nameSentance = "Je m'appelle " + this.getFirstame();

        if (this.getFirstame() != "Jean-Claude" && this.aware != true ) {
            return nameSentance + " et je ne suis pas aware.";
        } else {
            return nameSentance + " et je suis aware, et 1 + 1 ça fait 11, et ça c'est grand.";
        }
    }
    
    // *** getters *** //
    public String getFirstame() {
        return this.firstname;
    }
    
    public boolean isAware() {
        return this.aware;
    }
    
    // *** setters *** //
        public void setFirstame(String firstname) {
        this.firstname = firstname;
    }
    
    public void setAware(boolean aware) {
        this.aware = aware;
    }
}
