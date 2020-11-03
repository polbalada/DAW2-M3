class Dau{
    private short punts;
    
    void tirada(){
        punts=(short)(Math.random()*(6-1+1)+1);
    }

    @Override
    public String toString() {
        return "Dau{" + "punts=" + punts + '}';
    }
}