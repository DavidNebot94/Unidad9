
package aplicacion09.pkg14;

import java.util.Comparator;

public class ComparaEdadesNombres implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        int res = ((Futbolista) o1).edad - ((Futbolista) o2).edad;
        if (res == 0) {
            res = ((Futbolista) o1).nombre.compareTo(((Futbolista) o2).nombre);
        }
        return res;
    }
}

