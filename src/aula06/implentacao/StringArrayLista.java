package aula06.implentacao;

public class StringArrayLista  extends ArrayLista {

    public void add(String str) {
        super.add(str);
    }

    @Override
    public String get(int idx) {
        return (String) super.get(idx);
    }

    public void remove(int idx) {
        super.remove(idx);
    }
}